package typings.miniprogramWxs

import typings.miniprogramWxs.Intl.Collator
import typings.miniprogramWxs.Intl.CollatorOptions
import typings.miniprogramWxs.Intl.DateTimeFormat
import typings.miniprogramWxs.Intl.DateTimeFormatOptions
import typings.miniprogramWxs.Intl.NumberFormat
import typings.miniprogramWxs.Intl.NumberFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("Date")
  @js.native
  def Date: DateConstructor = js.native
  @scala.inline
  def Date_=(x: DateConstructor): Unit = js.Dynamic.global.updateDynamic("Date")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Error")
  @js.native
  class Error ()
    extends typings.miniprogramWxs.Error {
    def this(message: java.lang.String) = this()
  }
  @JSGlobal("Error")
  @js.native
  def Error: ErrorConstructor = js.native
  @scala.inline
  def Error_=(x: ErrorConstructor): Unit = js.Dynamic.global.updateDynamic("Error")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("EvalError")
  @js.native
  class EvalError ()
    extends typings.std.Error {
    def this(message: java.lang.String) = this()
  }
  @JSGlobal("EvalError")
  @js.native
  def EvalError: EvalErrorConstructor = js.native
  @scala.inline
  def EvalError_=(x: EvalErrorConstructor): Unit = js.Dynamic.global.updateDynamic("EvalError")(x.asInstanceOf[js.Any])
  
  @JSGlobal("Infinity")
  @js.native
  def Infinity: Double = js.native
  @scala.inline
  def Infinity_=(x: Double): Unit = js.Dynamic.global.updateDynamic("Infinity")(x.asInstanceOf[js.Any])
  
  /////////////////////////////
  /// ECMAScript Internationalization API
  /////////////////////////////
  object Intl {
    
    object Collator {
      
      @JSGlobal("Intl.Collator")
      @js.native
      def apply(): typings.miniprogramWxs.Intl.Collator = js.native
      @JSGlobal("Intl.Collator")
      @js.native
      def apply(locales: js.UndefOr[scala.Nothing], options: CollatorOptions): typings.miniprogramWxs.Intl.Collator = js.native
      @JSGlobal("Intl.Collator")
      @js.native
      def apply(locales: java.lang.String): typings.miniprogramWxs.Intl.Collator = js.native
      @JSGlobal("Intl.Collator")
      @js.native
      def apply(locales: java.lang.String, options: CollatorOptions): typings.miniprogramWxs.Intl.Collator = js.native
      @JSGlobal("Intl.Collator")
      @js.native
      def apply(locales: Array[java.lang.String]): typings.miniprogramWxs.Intl.Collator = js.native
      @JSGlobal("Intl.Collator")
      @js.native
      def apply(locales: Array[java.lang.String], options: CollatorOptions): typings.miniprogramWxs.Intl.Collator = js.native
      
      @JSGlobal("Intl.Collator.supportedLocalesOf")
      @js.native
      def supportedLocalesOf(locales: java.lang.String): Array[java.lang.String] = js.native
      @JSGlobal("Intl.Collator.supportedLocalesOf")
      @js.native
      def supportedLocalesOf(locales: java.lang.String, options: CollatorOptions): Array[java.lang.String] = js.native
      @JSGlobal("Intl.Collator.supportedLocalesOf")
      @js.native
      def supportedLocalesOf(locales: Array[java.lang.String]): Array[java.lang.String] = js.native
      @JSGlobal("Intl.Collator.supportedLocalesOf")
      @js.native
      def supportedLocalesOf(locales: Array[java.lang.String], options: CollatorOptions): Array[java.lang.String] = js.native
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Intl.Collator")
    @js.native
    class CollatorCls () extends Collator {
      def this(locales: java.lang.String) = this()
      def this(locales: Array[java.lang.String]) = this()
      def this(locales: js.UndefOr[scala.Nothing], options: CollatorOptions) = this()
      def this(locales: java.lang.String, options: CollatorOptions) = this()
      def this(locales: Array[java.lang.String], options: CollatorOptions) = this()
    }
    
    object DateTimeFormat {
      
      @JSGlobal("Intl.DateTimeFormat")
      @js.native
      def apply(): typings.miniprogramWxs.Intl.DateTimeFormat = js.native
      @JSGlobal("Intl.DateTimeFormat")
      @js.native
      def apply(locales: js.UndefOr[scala.Nothing], options: DateTimeFormatOptions): typings.miniprogramWxs.Intl.DateTimeFormat = js.native
      @JSGlobal("Intl.DateTimeFormat")
      @js.native
      def apply(locales: java.lang.String): typings.miniprogramWxs.Intl.DateTimeFormat = js.native
      @JSGlobal("Intl.DateTimeFormat")
      @js.native
      def apply(locales: java.lang.String, options: DateTimeFormatOptions): typings.miniprogramWxs.Intl.DateTimeFormat = js.native
      @JSGlobal("Intl.DateTimeFormat")
      @js.native
      def apply(locales: Array[java.lang.String]): typings.miniprogramWxs.Intl.DateTimeFormat = js.native
      @JSGlobal("Intl.DateTimeFormat")
      @js.native
      def apply(locales: Array[java.lang.String], options: DateTimeFormatOptions): typings.miniprogramWxs.Intl.DateTimeFormat = js.native
      
      @JSGlobal("Intl.DateTimeFormat.supportedLocalesOf")
      @js.native
      def supportedLocalesOf(locales: java.lang.String): Array[java.lang.String] = js.native
      @JSGlobal("Intl.DateTimeFormat.supportedLocalesOf")
      @js.native
      def supportedLocalesOf(locales: java.lang.String, options: DateTimeFormatOptions): Array[java.lang.String] = js.native
      @JSGlobal("Intl.DateTimeFormat.supportedLocalesOf")
      @js.native
      def supportedLocalesOf(locales: Array[java.lang.String]): Array[java.lang.String] = js.native
      @JSGlobal("Intl.DateTimeFormat.supportedLocalesOf")
      @js.native
      def supportedLocalesOf(locales: Array[java.lang.String], options: DateTimeFormatOptions): Array[java.lang.String] = js.native
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Intl.DateTimeFormat")
    @js.native
    class DateTimeFormatCls () extends DateTimeFormat {
      def this(locales: java.lang.String) = this()
      def this(locales: Array[java.lang.String]) = this()
      def this(locales: js.UndefOr[scala.Nothing], options: DateTimeFormatOptions) = this()
      def this(locales: java.lang.String, options: DateTimeFormatOptions) = this()
      def this(locales: Array[java.lang.String], options: DateTimeFormatOptions) = this()
    }
    
    object NumberFormat {
      
      @JSGlobal("Intl.NumberFormat")
      @js.native
      def apply(): typings.miniprogramWxs.Intl.NumberFormat = js.native
      @JSGlobal("Intl.NumberFormat")
      @js.native
      def apply(locales: js.UndefOr[scala.Nothing], options: NumberFormatOptions): typings.miniprogramWxs.Intl.NumberFormat = js.native
      @JSGlobal("Intl.NumberFormat")
      @js.native
      def apply(locales: java.lang.String): typings.miniprogramWxs.Intl.NumberFormat = js.native
      @JSGlobal("Intl.NumberFormat")
      @js.native
      def apply(locales: java.lang.String, options: NumberFormatOptions): typings.miniprogramWxs.Intl.NumberFormat = js.native
      @JSGlobal("Intl.NumberFormat")
      @js.native
      def apply(locales: Array[java.lang.String]): typings.miniprogramWxs.Intl.NumberFormat = js.native
      @JSGlobal("Intl.NumberFormat")
      @js.native
      def apply(locales: Array[java.lang.String], options: NumberFormatOptions): typings.miniprogramWxs.Intl.NumberFormat = js.native
      
      @JSGlobal("Intl.NumberFormat.supportedLocalesOf")
      @js.native
      def supportedLocalesOf(locales: java.lang.String): Array[java.lang.String] = js.native
      @JSGlobal("Intl.NumberFormat.supportedLocalesOf")
      @js.native
      def supportedLocalesOf(locales: java.lang.String, options: NumberFormatOptions): Array[java.lang.String] = js.native
      @JSGlobal("Intl.NumberFormat.supportedLocalesOf")
      @js.native
      def supportedLocalesOf(locales: Array[java.lang.String]): Array[java.lang.String] = js.native
      @JSGlobal("Intl.NumberFormat.supportedLocalesOf")
      @js.native
      def supportedLocalesOf(locales: Array[java.lang.String], options: NumberFormatOptions): Array[java.lang.String] = js.native
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Intl.NumberFormat")
    @js.native
    class NumberFormatCls () extends NumberFormat {
      def this(locales: java.lang.String) = this()
      def this(locales: Array[java.lang.String]) = this()
      def this(locales: js.UndefOr[scala.Nothing], options: NumberFormatOptions) = this()
      def this(locales: java.lang.String, options: NumberFormatOptions) = this()
      def this(locales: Array[java.lang.String], options: NumberFormatOptions) = this()
    }
  }
  
  /**
    * An intrinsic object that provides functions to convert JavaScript values to and from the JavaScript Object Notation (JSON) format.
    */
  @JSGlobal("JSON")
  @js.native
  def JSON: typings.miniprogramWxs.JSON = js.native
  @scala.inline
  def JSON_=(x: JSON): Unit = js.Dynamic.global.updateDynamic("JSON")(x.asInstanceOf[js.Any])
  
  /** An intrinsic object that provides basic mathematics functionality and constants. */
  @JSGlobal("Math")
  @js.native
  def Math: typings.miniprogramWxs.Math = js.native
  @scala.inline
  def Math_=(x: Math): Unit = js.Dynamic.global.updateDynamic("Math")(x.asInstanceOf[js.Any])
  
  /////////////////////////////
  /// ECMAScript APIs
  /////////////////////////////
  @JSGlobal("NaN")
  @js.native
  def NaN: Double = js.native
  @scala.inline
  def NaN_=(x: Double): Unit = js.Dynamic.global.updateDynamic("NaN")(x.asInstanceOf[js.Any])
  
  /** An object that represents a number of any kind. All JavaScript numbers are 64-bit floating-point numbers. */
  @JSGlobal("Number")
  @js.native
  def Number: NumberConstructor = js.native
  @scala.inline
  def Number_=(x: NumberConstructor): Unit = js.Dynamic.global.updateDynamic("Number")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("RangeError")
  @js.native
  class RangeError ()
    extends typings.std.Error {
    def this(message: java.lang.String) = this()
  }
  @JSGlobal("RangeError")
  @js.native
  def RangeError: RangeErrorConstructor = js.native
  @scala.inline
  def RangeError_=(x: RangeErrorConstructor): Unit = js.Dynamic.global.updateDynamic("RangeError")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ReferenceError")
  @js.native
  class ReferenceError ()
    extends typings.std.Error {
    def this(message: java.lang.String) = this()
  }
  @JSGlobal("ReferenceError")
  @js.native
  def ReferenceError: ReferenceErrorConstructor = js.native
  @scala.inline
  def ReferenceError_=(x: ReferenceErrorConstructor): Unit = js.Dynamic.global.updateDynamic("ReferenceError")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("SyntaxError")
  @js.native
  class SyntaxError ()
    extends typings.std.Error {
    def this(message: java.lang.String) = this()
  }
  @JSGlobal("SyntaxError")
  @js.native
  def SyntaxError: SyntaxErrorConstructor = js.native
  @scala.inline
  def SyntaxError_=(x: SyntaxErrorConstructor): Unit = js.Dynamic.global.updateDynamic("SyntaxError")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("TypeError")
  @js.native
  class TypeError ()
    extends typings.std.Error {
    def this(message: java.lang.String) = this()
  }
  @JSGlobal("TypeError")
  @js.native
  def TypeError: TypeErrorConstructor = js.native
  @scala.inline
  def TypeError_=(x: TypeErrorConstructor): Unit = js.Dynamic.global.updateDynamic("TypeError")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("URIError")
  @js.native
  class URIError ()
    extends typings.std.Error {
    def this(message: java.lang.String) = this()
  }
  @JSGlobal("URIError")
  @js.native
  def URIError: URIErrorConstructor = js.native
  @scala.inline
  def URIError_=(x: URIErrorConstructor): Unit = js.Dynamic.global.updateDynamic("URIError")(x.asInstanceOf[js.Any])
  
  /**
    * 方法用于在 console 窗口输出信息。它可以接受多个参数，将它们的结果连接起来输出。
    */
  object console {
    
    @JSGlobal("console.log")
    @js.native
    def log(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
    @JSGlobal("console.log")
    @js.native
    def log(message: js.Any, optionalParams: js.Any*): Unit = js.native
  }
  
  /**
    * Gets the unencoded version of an encoded Uniform Resource Identifier (URI).
    * @param encodedURI A value representing an encoded URI.
    */
  @JSGlobal("decodeURI")
  @js.native
  def decodeURI(encodedURI: java.lang.String): java.lang.String = js.native
  
  /**
    * Gets the unencoded version of an encoded component of a Uniform Resource Identifier (URI).
    * @param encodedURIComponent A value representing an encoded URI component.
    */
  @JSGlobal("decodeURIComponent")
  @js.native
  def decodeURIComponent(encodedURIComponent: java.lang.String): java.lang.String = js.native
  
  /**
    * Encodes a text string as a valid Uniform Resource Identifier (URI)
    * @param uri A value representing an encoded URI.
    */
  @JSGlobal("encodeURI")
  @js.native
  def encodeURI(uri: java.lang.String): java.lang.String = js.native
  
  /**
    * Encodes a text string as a valid component of a Uniform Resource Identifier (URI).
    * @param uriComponent A value representing an encoded URI component.
    */
  @JSGlobal("encodeURIComponent")
  @js.native
  def encodeURIComponent(uriComponent: java.lang.String): java.lang.String = js.native
  @JSGlobal("encodeURIComponent")
  @js.native
  def encodeURIComponent(uriComponent: scala.Boolean): java.lang.String = js.native
  @JSGlobal("encodeURIComponent")
  @js.native
  def encodeURIComponent(uriComponent: Double): java.lang.String = js.native
  
  /**
    * 返回一个当前时间的对象。
    */
  @JSGlobal("getDate")
  @js.native
  def getDate(): Date = js.native
  @JSGlobal("getDate")
  @js.native
  def getDate(value: java.lang.String): Date = js.native
  /**
    * 获取时间
    * @param value  时间
    * milliseconds: 从1970年1月1日00:00:00 UTC开始计算的毫秒数
    * datestring: 日期字符串，其格式为："month day, year hours:minutes:seconds"
    */
  @JSGlobal("getDate")
  @js.native
  def getDate(value: Double): Date = js.native
  @JSGlobal("getDate")
  @js.native
  def getDate(year: Double, month: Double): Date = js.native
  @JSGlobal("getDate")
  @js.native
  def getDate(
    year: Double,
    month: Double,
    date: js.UndefOr[scala.Nothing],
    hours: js.UndefOr[scala.Nothing],
    minutes: js.UndefOr[scala.Nothing],
    seconds: js.UndefOr[scala.Nothing],
    ms: Double
  ): Date = js.native
  @JSGlobal("getDate")
  @js.native
  def getDate(
    year: Double,
    month: Double,
    date: js.UndefOr[scala.Nothing],
    hours: js.UndefOr[scala.Nothing],
    minutes: js.UndefOr[scala.Nothing],
    seconds: Double
  ): Date = js.native
  @JSGlobal("getDate")
  @js.native
  def getDate(
    year: Double,
    month: Double,
    date: js.UndefOr[scala.Nothing],
    hours: js.UndefOr[scala.Nothing],
    minutes: js.UndefOr[scala.Nothing],
    seconds: Double,
    ms: Double
  ): Date = js.native
  @JSGlobal("getDate")
  @js.native
  def getDate(
    year: Double,
    month: Double,
    date: js.UndefOr[scala.Nothing],
    hours: js.UndefOr[scala.Nothing],
    minutes: Double
  ): Date = js.native
  @JSGlobal("getDate")
  @js.native
  def getDate(
    year: Double,
    month: Double,
    date: js.UndefOr[scala.Nothing],
    hours: js.UndefOr[scala.Nothing],
    minutes: Double,
    seconds: js.UndefOr[scala.Nothing],
    ms: Double
  ): Date = js.native
  @JSGlobal("getDate")
  @js.native
  def getDate(
    year: Double,
    month: Double,
    date: js.UndefOr[scala.Nothing],
    hours: js.UndefOr[scala.Nothing],
    minutes: Double,
    seconds: Double
  ): Date = js.native
  @JSGlobal("getDate")
  @js.native
  def getDate(
    year: Double,
    month: Double,
    date: js.UndefOr[scala.Nothing],
    hours: js.UndefOr[scala.Nothing],
    minutes: Double,
    seconds: Double,
    ms: Double
  ): Date = js.native
  @JSGlobal("getDate")
  @js.native
  def getDate(year: Double, month: Double, date: js.UndefOr[scala.Nothing], hours: Double): Date = js.native
  @JSGlobal("getDate")
  @js.native
  def getDate(
    year: Double,
    month: Double,
    date: js.UndefOr[scala.Nothing],
    hours: Double,
    minutes: js.UndefOr[scala.Nothing],
    seconds: js.UndefOr[scala.Nothing],
    ms: Double
  ): Date = js.native
  @JSGlobal("getDate")
  @js.native
  def getDate(
    year: Double,
    month: Double,
    date: js.UndefOr[scala.Nothing],
    hours: Double,
    minutes: js.UndefOr[scala.Nothing],
    seconds: Double
  ): Date = js.native
  @JSGlobal("getDate")
  @js.native
  def getDate(
    year: Double,
    month: Double,
    date: js.UndefOr[scala.Nothing],
    hours: Double,
    minutes: js.UndefOr[scala.Nothing],
    seconds: Double,
    ms: Double
  ): Date = js.native
  @JSGlobal("getDate")
  @js.native
  def getDate(year: Double, month: Double, date: js.UndefOr[scala.Nothing], hours: Double, minutes: Double): Date = js.native
  @JSGlobal("getDate")
  @js.native
  def getDate(
    year: Double,
    month: Double,
    date: js.UndefOr[scala.Nothing],
    hours: Double,
    minutes: Double,
    seconds: js.UndefOr[scala.Nothing],
    ms: Double
  ): Date = js.native
  @JSGlobal("getDate")
  @js.native
  def getDate(
    year: Double,
    month: Double,
    date: js.UndefOr[scala.Nothing],
    hours: Double,
    minutes: Double,
    seconds: Double
  ): Date = js.native
  @JSGlobal("getDate")
  @js.native
  def getDate(
    year: Double,
    month: Double,
    date: js.UndefOr[scala.Nothing],
    hours: Double,
    minutes: Double,
    seconds: Double,
    ms: Double
  ): Date = js.native
  @JSGlobal("getDate")
  @js.native
  def getDate(year: Double, month: Double, date: Double): Date = js.native
  @JSGlobal("getDate")
  @js.native
  def getDate(
    year: Double,
    month: Double,
    date: Double,
    hours: js.UndefOr[scala.Nothing],
    minutes: js.UndefOr[scala.Nothing],
    seconds: js.UndefOr[scala.Nothing],
    ms: Double
  ): Date = js.native
  @JSGlobal("getDate")
  @js.native
  def getDate(
    year: Double,
    month: Double,
    date: Double,
    hours: js.UndefOr[scala.Nothing],
    minutes: js.UndefOr[scala.Nothing],
    seconds: Double
  ): Date = js.native
  @JSGlobal("getDate")
  @js.native
  def getDate(
    year: Double,
    month: Double,
    date: Double,
    hours: js.UndefOr[scala.Nothing],
    minutes: js.UndefOr[scala.Nothing],
    seconds: Double,
    ms: Double
  ): Date = js.native
  @JSGlobal("getDate")
  @js.native
  def getDate(year: Double, month: Double, date: Double, hours: js.UndefOr[scala.Nothing], minutes: Double): Date = js.native
  @JSGlobal("getDate")
  @js.native
  def getDate(
    year: Double,
    month: Double,
    date: Double,
    hours: js.UndefOr[scala.Nothing],
    minutes: Double,
    seconds: js.UndefOr[scala.Nothing],
    ms: Double
  ): Date = js.native
  @JSGlobal("getDate")
  @js.native
  def getDate(
    year: Double,
    month: Double,
    date: Double,
    hours: js.UndefOr[scala.Nothing],
    minutes: Double,
    seconds: Double
  ): Date = js.native
  @JSGlobal("getDate")
  @js.native
  def getDate(
    year: Double,
    month: Double,
    date: Double,
    hours: js.UndefOr[scala.Nothing],
    minutes: Double,
    seconds: Double,
    ms: Double
  ): Date = js.native
  @JSGlobal("getDate")
  @js.native
  def getDate(year: Double, month: Double, date: Double, hours: Double): Date = js.native
  @JSGlobal("getDate")
  @js.native
  def getDate(
    year: Double,
    month: Double,
    date: Double,
    hours: Double,
    minutes: js.UndefOr[scala.Nothing],
    seconds: js.UndefOr[scala.Nothing],
    ms: Double
  ): Date = js.native
  @JSGlobal("getDate")
  @js.native
  def getDate(
    year: Double,
    month: Double,
    date: Double,
    hours: Double,
    minutes: js.UndefOr[scala.Nothing],
    seconds: Double
  ): Date = js.native
  @JSGlobal("getDate")
  @js.native
  def getDate(
    year: Double,
    month: Double,
    date: Double,
    hours: Double,
    minutes: js.UndefOr[scala.Nothing],
    seconds: Double,
    ms: Double
  ): Date = js.native
  @JSGlobal("getDate")
  @js.native
  def getDate(year: Double, month: Double, date: Double, hours: Double, minutes: Double): Date = js.native
  @JSGlobal("getDate")
  @js.native
  def getDate(
    year: Double,
    month: Double,
    date: Double,
    hours: Double,
    minutes: Double,
    seconds: js.UndefOr[scala.Nothing],
    ms: Double
  ): Date = js.native
  @JSGlobal("getDate")
  @js.native
  def getDate(year: Double, month: Double, date: Double, hours: Double, minutes: Double, seconds: Double): Date = js.native
  @JSGlobal("getDate")
  @js.native
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
  @JSGlobal("getRegExp")
  @js.native
  def getRegExp(pattern: java.lang.String): RegExp = js.native
  @JSGlobal("getRegExp")
  @js.native
  def getRegExp(pattern: java.lang.String, flags: java.lang.String): RegExp = js.native
  
  /**
    * Determines whether a supplied number is finite.
    * @param number Any numeric value.
    */
  @JSGlobal("isFinite")
  @js.native
  def isFinite(number: Double): scala.Boolean = js.native
  
  /**
    * Returns a Boolean value that indicates whether a value is the reserved value NaN (not a number).
    * @param number A numeric value.
    */
  @JSGlobal("isNaN")
  @js.native
  def isNaN(number: Double): scala.Boolean = js.native
  
  /**
    * 模块
    */
  @JSGlobal("module")
  @js.native
  val module: Module = js.native
  
  /**
    * Converts a string to a floating-point number.
    * @param string A string that contains a floating-point number.
    */
  @JSGlobal("parseFloat")
  @js.native
  def parseFloat(string: java.lang.String): Double = js.native
  
  /**
    * Converts A string to an integer.
    * @param s A string to convert into a number.
    * @param radix A value between 2 and 36 that specifies the base of the number in numString.
    * If this argument is not supplied, strings with a prefix of '0x' are considered hexadecimal.
    * All other strings are considered decimal.
    */
  @JSGlobal("parseInt")
  @js.native
  def parseInt(s: java.lang.String): Double = js.native
  @JSGlobal("parseInt")
  @js.native
  def parseInt(s: java.lang.String, radix: Double): Double = js.native
}
