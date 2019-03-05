package typings
package pDashEventLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  val Array: pDashEventLib.ArrayConstructor = js.native
  val ArrayBuffer: pDashEventLib.ArrayBufferConstructor = js.native
  var Atomics: pDashEventLib.Atomics = js.native
  val BigInt: pDashEventLib.BigIntConstructor = js.native
  val BigInt64Array: pDashEventLib.BigInt64ArrayConstructor = js.native
  val BigUint64Array: pDashEventLib.BigUint64ArrayConstructor = js.native
  val Boolean: pDashEventLib.BooleanConstructor = js.native
  val DataView: pDashEventLib.DataViewConstructor = js.native
  val Date: pDashEventLib.DateConstructor = js.native
  val Error: pDashEventLib.ErrorConstructor = js.native
  val EvalError: pDashEventLib.EvalErrorConstructor = js.native
  val Float32Array: pDashEventLib.Float32ArrayConstructor = js.native
  val Float64Array: pDashEventLib.Float64ArrayConstructor = js.native
  val Function: pDashEventLib.FunctionConstructor = js.native
  val Infinity: scala.Double = js.native
  val Int16Array: pDashEventLib.Int16ArrayConstructor = js.native
  val Int32Array: pDashEventLib.Int32ArrayConstructor = js.native
  val Int8Array: pDashEventLib.Int8ArrayConstructor = js.native
  /**
    * An intrinsic object that provides functions to convert JavaScript values to and from the JavaScript Object Notation (JSON) format.
    */
  val JSON: pDashEventLib.JSON = js.native
  var Map: pDashEventLib.MapConstructor = js.native
  /** An intrinsic object that provides basic mathematics functionality and constants. */
  val Math: pDashEventLib.Math = js.native
  /////////////////////////////
  /// ECMAScript APIs
  /////////////////////////////
  val NaN: scala.Double = js.native
  /** An object that represents a number of any kind. All JavaScript numbers are 64-bit floating-point numbers. */
  val Number: pDashEventLib.NumberConstructor = js.native
  /**
    * Provides functionality common to all JavaScript objects.
    */
  val Object: pDashEventLib.ObjectConstructor = js.native
  var Promise: pDashEventLib.PromiseConstructor = js.native
  var Proxy: pDashEventLib.ProxyConstructor = js.native
  val RangeError: pDashEventLib.RangeErrorConstructor = js.native
  val ReferenceError: pDashEventLib.ReferenceErrorConstructor = js.native
  val RegExp: pDashEventLib.RegExpConstructor = js.native
  var Set: pDashEventLib.SetConstructor = js.native
  var SharedArrayBuffer: pDashEventLib.SharedArrayBufferConstructor = js.native
  /**
    * Allows manipulation and formatting of text strings and determination and location of substrings within strings.
    */
  val String: pDashEventLib.StringConstructor = js.native
  val SyntaxError: pDashEventLib.SyntaxErrorConstructor = js.native
  val TypeError: pDashEventLib.TypeErrorConstructor = js.native
  val URIError: pDashEventLib.URIErrorConstructor = js.native
  val Uint16Array: pDashEventLib.Uint16ArrayConstructor = js.native
  val Uint32Array: pDashEventLib.Uint32ArrayConstructor = js.native
  val Uint8Array: pDashEventLib.Uint8ArrayConstructor = js.native
  val Uint8ClampedArray: pDashEventLib.Uint8ClampedArrayConstructor = js.native
  var WeakMap: pDashEventLib.WeakMapConstructor = js.native
  var WeakSet: pDashEventLib.WeakSetConstructor = js.native
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

