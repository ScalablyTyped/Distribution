package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Extended String API.
  */
object string {
  
  @JSGlobal("pc.string")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * All ASCII letters.
    */
  @JSGlobal("pc.string.ASCII_LETTERS")
  @js.native
  val ASCII_LETTERS: String = js.native
  
  /**
    * All lowercase letters.
    */
  @JSGlobal("pc.string.ASCII_LOWERCASE")
  @js.native
  val ASCII_LOWERCASE: String = js.native
  
  /**
    * All uppercase letters.
    */
  @JSGlobal("pc.string.ASCII_UPPERCASE")
  @js.native
  val ASCII_UPPERCASE: String = js.native
  
  /**
    * Return a string with {n} replaced with the n-th argument.
    * @example
    * var s = pc.string.format("Hello {0}", "world");
    * console.log(s); // Prints "Hello world"
    * @param s - The string to format.
    * @param [arguments] - All other arguments are substituted into the string.
    * @returns The formatted string.
    */
  @scala.inline
  def format(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def format(s: String, arguments: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(s.asInstanceOf[js.Any], arguments.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Get the string for a given code point or set of code points. Polyfill for
    * [`fromCodePoint`]{@link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/fromCodePoint}.
    * @param args - The code points to convert to a string.
    * @returns The converted string.
    */
  @scala.inline
  def fromCodePoint(args: Double*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCodePoint")(args.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Get the code point number for a character in a string. Polyfill for
    * [`codePointAt`]{@link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/codePointAt}.
    * @param string - The string to get the code point from.
    * @param [i] - The index in the string.
    * @returns The code point value for the character in the string.
    */
  @scala.inline
  def getCodePoint(string: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getCodePoint")(string.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getCodePoint(string: String, i: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getCodePoint")(string.asInstanceOf[js.Any], i.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Gets an array of all code points in a string.
    * @param string - The string to get code points from.
    * @returns The code points in the string.
    */
  @scala.inline
  def getCodePoints(string: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCodePoints")(string.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  /**
    * Gets an array of all grapheme clusters (visible symbols) in a string. This is needed because
    * some symbols (such as emoji or accented characters) are actually made up of multiple character codes.
    * @param string - The string to break into symbols.
    * @returns The symbols in the string.
    */
  @scala.inline
  def getSymbols(string: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSymbols")(string.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  /**
    * Convert a string value to a boolean. In non-strict mode (the default), 'true' is converted to true, all other values
    * are converted to false. In strict mode, 'true' is converted to true, 'false' is converted to false, all other values will throw
    * an Exception.
    * @param s - The string to convert.
    * @param [strict] - In strict mode an Exception is thrown if s is not an accepted string value. Defaults to false.
    * @returns The converted value.
    */
  @scala.inline
  def toBool(s: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("toBool")(s.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def toBool(s: String, strict: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("toBool")(s.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
