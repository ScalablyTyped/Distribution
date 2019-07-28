package typings.miniprogramDashWxs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  var Date: DateConstructor = js.native
  var Error: ErrorConstructor = js.native
  var EvalError: EvalErrorConstructor = js.native
  var Infinity: Double = js.native
  /**
    * An intrinsic object that provides functions to convert JavaScript values to and from the JavaScript Object Notation (JSON) format.
    */
  var JSON: typings.miniprogramDashWxs.JSON = js.native
  /** An intrinsic object that provides basic mathematics functionality and constants. */
  var Math: typings.miniprogramDashWxs.Math = js.native
  /////////////////////////////
  /// ECMAScript APIs
  /////////////////////////////
  var NaN: Double = js.native
  /** An object that represents a number of any kind. All JavaScript numbers are 64-bit floating-point numbers. */
  var Number: NumberConstructor = js.native
  var RangeError: RangeErrorConstructor = js.native
  var ReferenceError: ReferenceErrorConstructor = js.native
  var SyntaxError: SyntaxErrorConstructor = js.native
  var TypeError: TypeErrorConstructor = js.native
  var URIError: URIErrorConstructor = js.native
  /**
    * 模块
    */
  val module: Module = js.native
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
  def encodeURIComponent(uriComponent: scala.Boolean): java.lang.String = js.native
  def encodeURIComponent(uriComponent: Double): java.lang.String = js.native
  /**
    * 返回一个当前时间的对象。
    */
  def getDate(): Date = js.native
  def getDate(value: java.lang.String): Date = js.native
  /**
    * 获取时间
    * @param value  时间
    * milliseconds: 从1970年1月1日00:00:00 UTC开始计算的毫秒数
    * datestring: 日期字符串，其格式为："month day, year hours:minutes:seconds"
    */
  def getDate(value: Double): Date = js.native
  def getDate(year: Double, month: Double): Date = js.native
  def getDate(year: Double, month: Double, date: Double): Date = js.native
  def getDate(year: Double, month: Double, date: Double, hours: Double): Date = js.native
  def getDate(year: Double, month: Double, date: Double, hours: Double, minutes: Double): Date = js.native
  def getDate(year: Double, month: Double, date: Double, hours: Double, minutes: Double, seconds: Double): Date = js.native
  def getDate(
    year: Double,
    month: Double,
    date: Double,
    hours: Double,
    minutes: Double,
    seconds: Double,
    ms: Double
  ): Date = js.native
  /**
    * 生成 regexp 对象需要使用 getRegExp函数。
    * @param pattern : 正则表达式的内容
    * @param flags ：修饰符`g`: global;`i`: ignoreCase; `m`: multiline
    */
  def getRegExp(pattern: java.lang.String): RegExp = js.native
  def getRegExp(pattern: java.lang.String, flags: java.lang.String): RegExp = js.native
  /**
    * Determines whether a supplied number is finite.
    * @param number Any numeric value.
    */
  def isFinite(number: Double): scala.Boolean = js.native
  /**
    * Returns a Boolean value that indicates whether a value is the reserved value NaN (not a number).
    * @param number A numeric value.
    */
  def isNaN(number: Double): scala.Boolean = js.native
  /**
    * Converts a string to a floating-point number.
    * @param string A string that contains a floating-point number.
    */
  def parseFloat(string: java.lang.String): Double = js.native
  /**
    * Converts A string to an integer.
    * @param s A string to convert into a number.
    * @param radix A value between 2 and 36 that specifies the base of the number in numString.
    * If this argument is not supplied, strings with a prefix of '0x' are considered hexadecimal.
    * All other strings are considered decimal.
    */
  def parseInt(s: java.lang.String): Double = js.native
  def parseInt(s: java.lang.String, radix: Double): Double = js.native
}

