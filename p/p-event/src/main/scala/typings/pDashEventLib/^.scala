package typings
package pDashEventLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  val Array: ArrayConstructor = js.native
  val ArrayBuffer: ArrayBufferConstructor = js.native
  var Atomics: pDashEventLib.Atomics = js.native
  val BigInt: BigIntConstructor = js.native
  val BigInt64Array: BigInt64ArrayConstructor = js.native
  val BigUint64Array: BigUint64ArrayConstructor = js.native
  val Boolean: BooleanConstructor = js.native
  val DataView: DataViewConstructor = js.native
  val Date: DateConstructor = js.native
  val Error: ErrorConstructor = js.native
  val EvalError: EvalErrorConstructor = js.native
  val Float32Array: Float32ArrayConstructor = js.native
  val Float64Array: Float64ArrayConstructor = js.native
  val Function: FunctionConstructor = js.native
  val Infinity: scala.Double = js.native
  val Int16Array: Int16ArrayConstructor = js.native
  val Int32Array: Int32ArrayConstructor = js.native
  val Int8Array: Int8ArrayConstructor = js.native
  /**
    * An intrinsic object that provides functions to convert JavaScript values to and from the JavaScript Object Notation (JSON) format.
    */
  val JSON: pDashEventLib.JSON = js.native
  var Map: MapConstructor = js.native
  /** An intrinsic object that provides basic mathematics functionality and constants. */
  val Math: pDashEventLib.Math = js.native
  /////////////////////////////
  /// ECMAScript APIs
  /////////////////////////////
  val NaN: scala.Double = js.native
  /** An object that represents a number of any kind. All JavaScript numbers are 64-bit floating-point numbers. */
  val Number: NumberConstructor = js.native
  /**
    * Provides functionality common to all JavaScript objects.
    */
  val Object: ObjectConstructor = js.native
  var Promise: PromiseConstructor = js.native
  var Proxy: ProxyConstructor = js.native
  val RangeError: RangeErrorConstructor = js.native
  val ReferenceError: ReferenceErrorConstructor = js.native
  val RegExp: RegExpConstructor = js.native
  var Set: SetConstructor = js.native
  var SharedArrayBuffer: SharedArrayBufferConstructor = js.native
  /**
    * Allows manipulation and formatting of text strings and determination and location of substrings within strings.
    */
  val String: StringConstructor = js.native
  val SyntaxError: SyntaxErrorConstructor = js.native
  val TypeError: TypeErrorConstructor = js.native
  val URIError: URIErrorConstructor = js.native
  val Uint16Array: Uint16ArrayConstructor = js.native
  val Uint32Array: Uint32ArrayConstructor = js.native
  val Uint8Array: Uint8ArrayConstructor = js.native
  val Uint8ClampedArray: Uint8ClampedArrayConstructor = js.native
  var WeakMap: WeakMapConstructor = js.native
  var WeakSet: WeakSetConstructor = js.native
  /**
    * Gets the unencoded version of an encoded Uniform Resource Identifier (URI).
    * @param encodedURI A value representing an encoded URI.
    */
  def decodeURI(encodedURI: java.lang.String): java.lang.String = js.native
  /**
    * Gets the unencoded version of an encoded component of a Uniform Resource Identifier (URI).
    * @param encodedURIComponent A value representing an encoded URI component.
    */
  def decodeURIComponent(encodedURIComponent: java.lang.String): java.lang.String = js.native
  /**
    * Encodes a text string as a valid Uniform Resource Identifier (URI)
    * @param uri A value representing an encoded URI.
    */
  def encodeURI(uri: java.lang.String): java.lang.String = js.native
  /**
    * Encodes a text string as a valid component of a Uniform Resource Identifier (URI).
    * @param uriComponent A value representing an encoded URI component.
    */
  def encodeURIComponent(uriComponent: java.lang.String): java.lang.String = js.native
  /**
    * Computes a new string in which certain characters have been replaced by a hexadecimal escape sequence.
    * @param string A string value
    */
  def escape(string: java.lang.String): java.lang.String = js.native
  /**
    * Evaluates JavaScript code and executes it.
    * @param x A String value that contains valid JavaScript code.
    */
  def eval(x: java.lang.String): js.Any = js.native
  /**
    * Determines whether a supplied number is finite.
    * @param number Any numeric value.
    */
  def isFinite(number: scala.Double): scala.Boolean = js.native
  /**
    * Returns a Boolean value that indicates whether a value is the reserved value NaN (not a number).
    * @param number A numeric value.
    */
  def isNaN(number: scala.Double): scala.Boolean = js.native
  /**
    * Converts a string to a floating-point number.
    * @param string A string that contains a floating-point number.
    */
  def parseFloat(string: java.lang.String): scala.Double = js.native
  /**
    * Converts A string to an integer.
    * @param s A string to convert into a number.
    * @param radix A value between 2 and 36 that specifies the base of the number in numString.
    * If this argument is not supplied, strings with a prefix of '0x' are considered hexadecimal.
    * All other strings are considered decimal.
    */
  def parseInt(s: java.lang.String): scala.Double = js.native
  def parseInt(s: java.lang.String, radix: scala.Double): scala.Double = js.native
  /**
    * Computes a new string in which hexadecimal escape sequences are replaced with the character that it represents.
    * @param string A string value
    */
  def unescape(string: java.lang.String): java.lang.String = js.native
}

