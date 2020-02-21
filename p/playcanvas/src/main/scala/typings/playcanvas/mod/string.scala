package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @namespace
  * @name pc.string
  * @description Extended String API.
  */
@JSImport("playcanvas", "string")
@js.native
object string extends js.Object {
  /**
    * @constant
    * @type {string}
    * @name pc.string.ASCII_LETTERS
    * @description All ASCII letters.
    */
  val ASCII_LETTERS: String = js.native
  /**
    * @constant
    * @type {string}
    * @name pc.string.ASCII_LOWERCASE
    * @description All lowercase letters.
    */
  val ASCII_LOWERCASE: String = js.native
  /**
    * @constant
    * @type {string}
    * @name pc.string.ASCII_UPPERCASE
    * @description All uppercase letters.
    */
  val ASCII_UPPERCASE: String = js.native
  /**
    * @function
    * @name pc.string.format
    * @description Return a string with {n} replaced with the n-th argument.
    * @param {string} s - The string to format.
    * @param {object} [arguments] - All other arguments are substituted into the string.
    * @returns {string} The formatted string.
    * @example
    * var s = pc.string.format("Hello {0}", "world");
    * console.log(s); // Prints "Hello world"
    */
  def format(s: String): String = js.native
  def format(s: String, arguments: js.Any): String = js.native
  /**
    * @function
    * @name pc.string.fromCodePoint
    * @description Get the string for a given code point or set of code points. Polyfill for
    * [`fromCodePoint`]{@link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/fromCodePoint}.
    * @param {...number} args - The code points to convert to a string.
    * @returns {string} The converted string.
    */
  def fromCodePoint(args: Double*): String = js.native
  /**
    * @function
    * @name pc.string.getCodePoint
    * @description Get the code point number for a character in a string. Polyfill for
    * [`codePointAt`]{@link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/codePointAt}.
    * @param {string} string - The string to get the code point from.
    * @param {number} [i] - The index in the string.
    * @returns {number} The code point value for the character in the string.
    */
  def getCodePoint(string: String): Double = js.native
  def getCodePoint(string: String, i: Double): Double = js.native
  /**
    * @function
    * @name pc.string.getCodePoints
    * @description Gets an array of all code points in a string.
    * @param {string} string - The string to get code points from.
    * @returns {number[]} The code points in the string.
    */
  def getCodePoints(string: String): js.Array[Double] = js.native
  /**
    * @function
    * @name pc.string.getSymbols
    * @description Gets an array of all grapheme clusters (visible symbols) in a string. This is needed because
    * some symbols (such as emoji or accented characters) are actually made up of multiple character codes.
    * @param {string} string - The string to break into symbols.
    * @returns {string[]} The symbols in the string.
    * @see {@link https://mathiasbynens.be/notes/javascript-unicode Unicode strings in JavaScript}
    */
  def getSymbols(string: String): js.Array[String] = js.native
  /**
    * @function
    * @name pc.string.toBool
    * @description Convert a string value to a boolean. In non-strict mode (the default), 'true' is converted to true, all other values
    * are converted to false. In strict mode, 'true' is converted to true, 'false' is converted to false, all other values will throw
    * an Exception.
    * @param {string} s - The string to convert.
    * @param {boolean} [strict] - In strict mode an Exception is thrown if s is not an accepted string value. Defaults to false.
    * @returns {boolean} The converted value.
    */
  def toBool(s: String): Boolean = js.native
  def toBool(s: String, strict: Boolean): Boolean = js.native
}

