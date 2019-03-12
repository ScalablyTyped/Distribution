package typings
package mochaLib.MochaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Mocha.utils")
@js.native
object utilsNs extends js.Object {
  /**
    * Return a new Thing that has the keys in sorted order. Recursive.
    *
    * If the Thing...
    * - has already been seen, return string `'[Circular]'`
    * - is `undefined`, return string `'[undefined]'`
    * - is `null`, return value `null`
    * - is some other primitive, return the value
    * - is not a primitive or an `Array`, `Object`, or `Function`, return the value of the Thing's `toString()` method
    * - is a non-empty `Array`, `Object`, or `Function`, return the result of calling this function again.
    * - is an empty `Array`, `Object`, or `Function`, returns `'[]'`, `'{}'`, or `'[Function]'` respectively.
    *
    * @see https://mochajs.org/api/module-utils.html#.canonicalize
    */
  def canonicalize(value: js.Any, stack: js.Array[_], typeHint: java.lang.String): js.Any = js.native
  /**
    * Strip the function definition from `str`, and re-indent for pre whitespace.
    *
    * @see https://mochajs.org/api/module-utils.html#.clean
    */
  def clean(str: java.lang.String): java.lang.String = js.native
  def getError(): stdLib.Error = js.native
  /**
    * Generate an undefined error if `err` is not defined.
    *
    * @see https://mochajs.org/api/module-utils.html#.getError
    */
  def getError(err: stdLib.Error): stdLib.Error = js.native
  /**
    * Highlight the given string of `js`.
    */
  def highlight(js_ : java.lang.String): java.lang.String = js.native
  /**
    * Lookup file names at the given `path`.
    *
    * @see https://mochajs.org/api/Mocha.utils.html#.exports.lookupFiles
    */
  def lookupFiles(filepath: java.lang.String): js.Array[java.lang.String] = js.native
  def lookupFiles(filepath: java.lang.String, extensions: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def lookupFiles(filepath: java.lang.String, extensions: js.Array[java.lang.String], recursive: scala.Boolean): js.Array[java.lang.String] = js.native
  /**
    * Compute a slug from the given `str`.
    *
    * @see https://mochajs.org/api/module-utils.html#.slug
    */
  def slug(str: java.lang.String): java.lang.String = js.native
  /**
    * When invoking this function you get a filter function that get the Error.stack as an
    * input, and return a prettify output. (i.e: strip Mocha and internal node functions from
    * stack trace).
    *
    * @see https://mochajs.org/api/module-utils.html#.stackTraceFilter
    */
  def stackTraceFilter(): js.Function1[/* stack */ java.lang.String, java.lang.String] = js.native
  /**
    * Stringify `value`. Different behavior depending on type of value:
    *
    * - If `value` is undefined or null, return `'[undefined]'` or `'[null]'`, respectively.
    * - If `value` is not an object, function or array, return result of `value.toString()` wrapped in double-quotes.
    * - If `value` is an *empty* object, function, or array, returns `'{}'`, `'[Function]'`, or `'[]'` respectively.
    * - If `value` has properties, call canonicalize} on it, then return result of `JSON.stringify()`
    *
    * @see https://mochajs.org/api/module-utils.html#.stringify
    */
  def stringify(value: js.Any): java.lang.String = js.native
  /**
    * Takes some variable and asks `Object.prototype.toString()` what it thinks it is.
    */
  def `type`(value: js.Any): java.lang.String = js.native
  /**
    * Generate an undefined error with a message warning the user.
    *
    * @see https://mochajs.org/api/module-utils.html#.undefinedError
    */
  def undefinedError(): stdLib.Error = js.native
}

