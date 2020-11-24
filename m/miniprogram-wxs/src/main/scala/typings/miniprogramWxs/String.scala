package typings.miniprogramWxs

import org.scalablytyped.runtime.NumberDictionary
import typings.miniprogramWxs.Intl.CollatorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait String
  extends /* index */ NumberDictionary[java.lang.String] {
  
  /**
    * Returns the character at the specified index.
    * @param pos The zero-based index of the desired character.
    */
  def charAt(pos: Double): java.lang.String = js.native
  
  /**
    * Returns the Unicode value of the character at the specified location.
    * @param index The zero-based index of the desired character. If there is no character at the specified index, NaN is returned.
    */
  def charCodeAt(index: Double): Double = js.native
  
  /**
    * Returns a string that contains the concatenation of two or more strings.
    * @param strings The strings to append to the end of the string.
    */
  def concat(strings: java.lang.String*): java.lang.String = js.native
  
  /**
    * Returns the position of the first occurrence of a substring.
    * @param searchString The substring to search for in the string
    * @param position The index at which to begin searching the String object. If omitted, search starts at the beginning of the string.
    */
  def indexOf(searchString: java.lang.String): Double = js.native
  def indexOf(searchString: java.lang.String, position: Double): Double = js.native
  
  /**
    * Returns the last occurrence of a substring in the string.
    * @param searchString The substring to search for.
    * @param position The index at which to begin searching. If omitted, the search begins at the end of the string.
    */
  def lastIndexOf(searchString: java.lang.String): Double = js.native
  def lastIndexOf(searchString: java.lang.String, position: Double): Double = js.native
  
  /** Returns the length of a String object. */
  val length: Double = js.native
  
  /**
    * Determines whether two strings are equivalent in the current locale.
    * @param that String to compare to target string
    */
  def localeCompare(that: java.lang.String): Double = js.native
  def localeCompare(that: java.lang.String, locales: js.UndefOr[scala.Nothing], options: CollatorOptions): Double = js.native
  def localeCompare(that: java.lang.String, locales: java.lang.String): Double = js.native
  def localeCompare(that: java.lang.String, locales: java.lang.String, options: CollatorOptions): Double = js.native
  def localeCompare(that: java.lang.String, locales: Array[java.lang.String]): Double = js.native
  def localeCompare(that: java.lang.String, locales: Array[java.lang.String], options: CollatorOptions): Double = js.native
  
  /**
    * Matches a string with a regular expression, and returns an array containing the results of that search.
    * @param regexp A variable name or string literal containing the regular expression pattern and flags.
    */
  def `match`(regexp: java.lang.String): RegExpMatchArray | Null = js.native
  def `match`(regexp: RegExp): RegExpMatchArray | Null = js.native
  
  /**
    * Replaces text in a string, using a regular expression or search string.
    * @param searchValue A string to search for.
    * @param replaceValue A string containing the text to replace for every successful match of searchValue in this string.
    */
  def replace(searchValue: java.lang.String, replaceValue: java.lang.String): java.lang.String = js.native
  /**
    * Replaces text in a string, using a regular expression or search string.
    * @param searchValue A string to search for.
    * @param replacer A function that returns the replacement text.
    */
  def replace(
    searchValue: java.lang.String,
    replacer: js.Function2[/* substring */ java.lang.String, /* repeated */ js.Any, java.lang.String]
  ): java.lang.String = js.native
  def replace(searchValue: RegExp, replaceValue: java.lang.String): java.lang.String = js.native
  def replace(
    searchValue: RegExp,
    replacer: js.Function2[/* substring */ java.lang.String, /* repeated */ js.Any, java.lang.String]
  ): java.lang.String = js.native
  
  /**
    * Finds the first substring match in a regular expression search.
    * @param regexp The regular expression pattern and applicable flags.
    */
  def search(regexp: java.lang.String): Double = js.native
  def search(regexp: RegExp): Double = js.native
  
  /**
    * Returns a section of a string.
    * @param start The index to the beginning of the specified portion of stringObj.
    * @param end The index to the end of the specified portion of stringObj. The substring includes the characters up to, but not including, the character indicated by end.
    * If this value is not specified, the substring continues to the end of stringObj.
    */
  def slice(): java.lang.String = js.native
  def slice(start: js.UndefOr[scala.Nothing], end: Double): java.lang.String = js.native
  def slice(start: Double): java.lang.String = js.native
  def slice(start: Double, end: Double): java.lang.String = js.native
  
  /**
    * Split a string into substrings using the specified separator and return them as an array.
    * @param separator A string that identifies character or characters to use in separating the string. If omitted, a single-element array containing the entire string is returned.
    * @param limit A value used to limit the number of elements returned in the array.
    */
  def split(separator: java.lang.String): Array[java.lang.String] = js.native
  def split(separator: java.lang.String, limit: Double): Array[java.lang.String] = js.native
  def split(separator: RegExp): Array[java.lang.String] = js.native
  def split(separator: RegExp, limit: Double): Array[java.lang.String] = js.native
  
  // IE extensions
  /**
    * Gets a substring beginning at the specified location and having the specified length.
    * @param from The starting position of the desired substring. The index of the first character in the string is zero.
    * @param length The number of characters to include in the returned substring.
    */
  def substr(from: Double): java.lang.String = js.native
  def substr(from: Double, length: Double): java.lang.String = js.native
  
  /**
    * Returns the substring at the specified location within a String object.
    * @param start The zero-based index number indicating the beginning of the substring.
    * @param end Zero-based index number indicating the end of the substring. The substring includes the characters up to, but not including, the character indicated by end.
    * If end is omitted, the characters from start through the end of the original string are returned.
    */
  def substring(start: Double): java.lang.String = js.native
  def substring(start: Double, end: Double): java.lang.String = js.native
  
  /** Converts all alphabetic characters to lowercase, taking into account the host environment's current locale. */
  def toLocaleLowerCase(): java.lang.String = js.native
  
  /** Returns a string where all alphabetic characters have been converted to uppercase, taking into account the host environment's current locale. */
  def toLocaleUpperCase(): java.lang.String = js.native
  
  /** Converts all the alphabetic characters in a string to lowercase. */
  def toLowerCase(): java.lang.String = js.native
  
  /** Converts all the alphabetic characters in a string to uppercase. */
  def toUpperCase(): java.lang.String = js.native
  
  /** Removes the leading and trailing white space and line terminator characters from a string. */
  def trim(): java.lang.String = js.native
}
