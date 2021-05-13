package com.yash.CompetitiveProgramming;

public class RecursionPractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java";
		System.out.println(sumOfDigits(55));
		System.out.println(power(2,3));
		System.out.println(GCD(48,18));
		System.out.println(convertToDecimal(13));
		System.out.println(reverse("java"));
		System.out.println(isPalindrome("awesome"));
		System.out.println(first("tttt"));
		System.out.println(capitalizeWord("i love you".split("\\s")));
	}
	
	//Capitalization
	public static String capitalizeWord(String str){
	    //   TODO
		return str.substring(0,1).toUpperCase() + str.substring(1);
	  }
	//checkforuppercase
	public static char first(String str) {
		if(str.length()==0) {
			return 'a';
		}
		if(str.charAt(0) != str.toUpperCase().charAt(0)) {
			return first(str.substring(1));
		}
		return str.charAt(0);
	}
	
	
	//isPalindrome
	public static boolean isPalindrome(String s)
    {   
        // TODO
		if(s.length()==1 || s.length()==0) {
			return true;
		}
        if(s.charAt(0) != s.charAt(s.length()-1)) {
        	return false;
        }else {
        	isPalindrome(s.substring(1, s.length()-1));
        }
        return true;
    }
	//string reverse
	 public static String reverse(String str)
	    {
	        // TODO
	        if(str.length() == 0){
	            return "";
	        }
	        return str.substring(str.length()-1) + reverse(str.substring(0, str.length()-1));
	    }
	//sum of digits in positive integer like 11,1234
	public static int sumOfDigits(int n) {
		if(n == 0 || n < 0) {
			return 0;
		}
		return n%10 + n/10;
	}
	//power of the number
	public static int power(int base,int exp) {
		if(exp == 0 || exp == 1 ) {
			return base;
		}
		
		return base * power(base , exp -1);
	}

	//GCD
	public static int GCD(int a, int b) {
		if(b==0) {
			return a;
		}
		return GCD(b,a%b);
	}
	//decimal to binary
	public static int convertToDecimal(int num) {
		if(num==0) {
			return num;
		}
		return num%2 + 10*convertToDecimal(num/2);
	}
}
