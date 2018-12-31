package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @namespace
  * @name pc.string
  * @description Extended String API
  */
@JSGlobal("pc.string")
@js.native
object stringNs extends js.Object {
  /**
    * @name pc.string.ASCII_LETTERS
    * @description All ASCII letters
    * @type String
    */
  val ASCII_LETTERS: /* abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ */ java.lang.String = js.native
  /**
    * @name pc.string.ASCII_LOWERCASE
    * @description All lowercase letters
    * @type String
    */
  val ASCII_LOWERCASE: /* abcdefghijklmnopqrstuvwxyz */ java.lang.String = js.native
  /**
    * @name pc.string.ASCII_UPPERCASE
    * @description All uppercase letters
    * @type String
    */
  val ASCII_UPPERCASE: /* ABCDEFGHIJKLMNOPQRSTUVWXYZ */ java.lang.String = js.native
  /**
    * @function
    * @name pc.string.format
    * @description Return a string with {n} replaced with the n-th argument
    * @param {String} s The string to format
    * @param {Object} [arguments] All other arguments are substituted into the string
    * @returns {String} The formatted string
    * @example
    * var s = pc.string.format("Hello {0}", "world");
    * console.log(s); // Prints "Hello world"
    */
  def format(s: java.lang.String): java.lang.String = js.native
  def format(s: java.lang.String, arguments: js.Any): java.lang.String = js.native
  /**
    * @function
    * @name pc.string.toBool
    * @description Convert a string value to a boolean. In non-strict mode (the default), 'true' is converted to true, all other values
    * are converted to false. In strict mode, 'true' is converted to true, 'false' is converted to false, all other values will throw
    * an Exception.
    * @param {String} s The string to convert
    * @param {Boolean} [strict] In strict mode an Exception is thrown if s is not an accepted string value. Defaults to false
    * @returns {Boolean} The converted value
    */
  def toBool(s: java.lang.String): scala.Boolean = js.native
  def toBool(s: java.lang.String, strict: scala.Boolean): scala.Boolean = js.native
}

