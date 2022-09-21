package typings.miniprogramWxs

import typings.miniprogramWxs.Intl.Collator
import typings.miniprogramWxs.Intl.CollatorOptions
import typings.miniprogramWxs.Intl.DateTimeFormat
import typings.miniprogramWxs.Intl.DateTimeFormatOptions
import typings.miniprogramWxs.Intl.NumberFormat
import typings.miniprogramWxs.Intl.NumberFormatOptions
import typings.miniprogramWxs.Intl.ResolvedCollatorOptions
import typings.miniprogramWxs.Intl.ResolvedNumberFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("Date")
  @js.native
  def Date: DateConstructor = js.native
  inline def Date_=(x: DateConstructor): Unit = js.Dynamic.global.updateDynamic("Date")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Error")
  @js.native
  open class Error ()
    extends StObject
       with typings.miniprogramWxs.Error {
    def this(message: java.lang.String) = this()
    
    /* CompleteClass */
    var message: java.lang.String = js.native
    
    /* CompleteClass */
    var name: java.lang.String = js.native
  }
  @JSGlobal("Error")
  @js.native
  def Error: ErrorConstructor = js.native
  inline def Error_=(x: ErrorConstructor): Unit = js.Dynamic.global.updateDynamic("Error")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("EvalError")
  @js.native
  open class EvalError ()
    extends StObject
       with typings.std.Error {
    def this(message: java.lang.String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: java.lang.String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: java.lang.String = js.native
  }
  @JSGlobal("EvalError")
  @js.native
  def EvalError: EvalErrorConstructor = js.native
  inline def EvalError_=(x: EvalErrorConstructor): Unit = js.Dynamic.global.updateDynamic("EvalError")(x.asInstanceOf[js.Any])
  
  @JSGlobal("Infinity")
  @js.native
  def Infinity: Double = js.native
  inline def Infinity_=(x: Double): Unit = js.Dynamic.global.updateDynamic("Infinity")(x.asInstanceOf[js.Any])
  
  /////////////////////////////
  /// ECMAScript Internationalization API
  /////////////////////////////
  object Intl {
    
    object Collator {
      
      inline def apply(): typings.miniprogramWxs.Intl.Collator = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.miniprogramWxs.Intl.Collator]
      inline def apply(locales: java.lang.String): typings.miniprogramWxs.Intl.Collator = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[typings.miniprogramWxs.Intl.Collator]
      inline def apply(locales: java.lang.String, options: CollatorOptions): typings.miniprogramWxs.Intl.Collator = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.miniprogramWxs.Intl.Collator]
      inline def apply(locales: Unit, options: CollatorOptions): typings.miniprogramWxs.Intl.Collator = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.miniprogramWxs.Intl.Collator]
      inline def apply(locales: Array[java.lang.String]): typings.miniprogramWxs.Intl.Collator = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[typings.miniprogramWxs.Intl.Collator]
      inline def apply(locales: Array[java.lang.String], options: CollatorOptions): typings.miniprogramWxs.Intl.Collator = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.miniprogramWxs.Intl.Collator]
      
      @JSGlobal("Intl.Collator")
      @js.native
      val ^ : js.Any = js.native
      
      inline def supportedLocalesOf(locales: java.lang.String): Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[Array[java.lang.String]]
      inline def supportedLocalesOf(locales: java.lang.String, options: CollatorOptions): Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Array[java.lang.String]]
      inline def supportedLocalesOf(locales: Array[java.lang.String]): Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[Array[java.lang.String]]
      inline def supportedLocalesOf(locales: Array[java.lang.String], options: CollatorOptions): Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Array[java.lang.String]]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Intl.Collator")
    @js.native
    open class CollatorCls ()
      extends StObject
         with Collator {
      def this(locales: java.lang.String) = this()
      def this(locales: Array[java.lang.String]) = this()
      def this(locales: java.lang.String, options: CollatorOptions) = this()
      def this(locales: Unit, options: CollatorOptions) = this()
      def this(locales: Array[java.lang.String], options: CollatorOptions) = this()
      
      /* CompleteClass */
      override def compare(x: java.lang.String, y: java.lang.String): Double = js.native
      
      /* CompleteClass */
      override def resolvedOptions(): ResolvedCollatorOptions = js.native
    }
    
    object DateTimeFormat {
      
      inline def apply(): typings.miniprogramWxs.Intl.DateTimeFormat = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.miniprogramWxs.Intl.DateTimeFormat]
      inline def apply(locales: java.lang.String): typings.miniprogramWxs.Intl.DateTimeFormat = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[typings.miniprogramWxs.Intl.DateTimeFormat]
      inline def apply(locales: java.lang.String, options: DateTimeFormatOptions): typings.miniprogramWxs.Intl.DateTimeFormat = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.miniprogramWxs.Intl.DateTimeFormat]
      inline def apply(locales: Unit, options: DateTimeFormatOptions): typings.miniprogramWxs.Intl.DateTimeFormat = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.miniprogramWxs.Intl.DateTimeFormat]
      inline def apply(locales: Array[java.lang.String]): typings.miniprogramWxs.Intl.DateTimeFormat = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[typings.miniprogramWxs.Intl.DateTimeFormat]
      inline def apply(locales: Array[java.lang.String], options: DateTimeFormatOptions): typings.miniprogramWxs.Intl.DateTimeFormat = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.miniprogramWxs.Intl.DateTimeFormat]
      
      @JSGlobal("Intl.DateTimeFormat")
      @js.native
      val ^ : js.Any = js.native
      
      inline def supportedLocalesOf(locales: java.lang.String): Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[Array[java.lang.String]]
      inline def supportedLocalesOf(locales: java.lang.String, options: DateTimeFormatOptions): Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Array[java.lang.String]]
      inline def supportedLocalesOf(locales: Array[java.lang.String]): Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[Array[java.lang.String]]
      inline def supportedLocalesOf(locales: Array[java.lang.String], options: DateTimeFormatOptions): Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Array[java.lang.String]]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Intl.DateTimeFormat")
    @js.native
    open class DateTimeFormatCls ()
      extends StObject
         with DateTimeFormat {
      def this(locales: java.lang.String) = this()
      def this(locales: Array[java.lang.String]) = this()
      def this(locales: java.lang.String, options: DateTimeFormatOptions) = this()
      def this(locales: Unit, options: DateTimeFormatOptions) = this()
      def this(locales: Array[java.lang.String], options: DateTimeFormatOptions) = this()
    }
    
    object NumberFormat {
      
      inline def apply(): typings.miniprogramWxs.Intl.NumberFormat = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.miniprogramWxs.Intl.NumberFormat]
      inline def apply(locales: java.lang.String): typings.miniprogramWxs.Intl.NumberFormat = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[typings.miniprogramWxs.Intl.NumberFormat]
      inline def apply(locales: java.lang.String, options: NumberFormatOptions): typings.miniprogramWxs.Intl.NumberFormat = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.miniprogramWxs.Intl.NumberFormat]
      inline def apply(locales: Unit, options: NumberFormatOptions): typings.miniprogramWxs.Intl.NumberFormat = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.miniprogramWxs.Intl.NumberFormat]
      inline def apply(locales: Array[java.lang.String]): typings.miniprogramWxs.Intl.NumberFormat = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[typings.miniprogramWxs.Intl.NumberFormat]
      inline def apply(locales: Array[java.lang.String], options: NumberFormatOptions): typings.miniprogramWxs.Intl.NumberFormat = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.miniprogramWxs.Intl.NumberFormat]
      
      @JSGlobal("Intl.NumberFormat")
      @js.native
      val ^ : js.Any = js.native
      
      inline def supportedLocalesOf(locales: java.lang.String): Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[Array[java.lang.String]]
      inline def supportedLocalesOf(locales: java.lang.String, options: NumberFormatOptions): Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Array[java.lang.String]]
      inline def supportedLocalesOf(locales: Array[java.lang.String]): Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[Array[java.lang.String]]
      inline def supportedLocalesOf(locales: Array[java.lang.String], options: NumberFormatOptions): Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Array[java.lang.String]]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Intl.NumberFormat")
    @js.native
    open class NumberFormatCls ()
      extends StObject
         with NumberFormat {
      def this(locales: java.lang.String) = this()
      def this(locales: Array[java.lang.String]) = this()
      def this(locales: java.lang.String, options: NumberFormatOptions) = this()
      def this(locales: Unit, options: NumberFormatOptions) = this()
      def this(locales: Array[java.lang.String], options: NumberFormatOptions) = this()
      
      /* CompleteClass */
      override def format(value: Double): java.lang.String = js.native
      
      /* CompleteClass */
      override def resolvedOptions(): ResolvedNumberFormatOptions = js.native
    }
  }
  
  /**
    * An intrinsic object that provides functions to convert JavaScript values to and from the JavaScript Object Notation (JSON) format.
    */
  @JSGlobal("JSON")
  @js.native
  def JSON: typings.miniprogramWxs.JSON = js.native
  inline def JSON_=(x: JSON): Unit = js.Dynamic.global.updateDynamic("JSON")(x.asInstanceOf[js.Any])
  
  /** An intrinsic object that provides basic mathematics functionality and constants. */
  @JSGlobal("Math")
  @js.native
  def Math: typings.miniprogramWxs.Math = js.native
  inline def Math_=(x: Math): Unit = js.Dynamic.global.updateDynamic("Math")(x.asInstanceOf[js.Any])
  
  /////////////////////////////
  /// ECMAScript APIs
  /////////////////////////////
  @JSGlobal("NaN")
  @js.native
  def NaN: Double = js.native
  inline def NaN_=(x: Double): Unit = js.Dynamic.global.updateDynamic("NaN")(x.asInstanceOf[js.Any])
  
  /** An object that represents a number of any kind. All JavaScript numbers are 64-bit floating-point numbers. */
  @JSGlobal("Number")
  @js.native
  def Number: NumberConstructor = js.native
  inline def Number_=(x: NumberConstructor): Unit = js.Dynamic.global.updateDynamic("Number")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("RangeError")
  @js.native
  open class RangeError ()
    extends StObject
       with typings.std.Error {
    def this(message: java.lang.String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: java.lang.String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: java.lang.String = js.native
  }
  @JSGlobal("RangeError")
  @js.native
  def RangeError: RangeErrorConstructor = js.native
  inline def RangeError_=(x: RangeErrorConstructor): Unit = js.Dynamic.global.updateDynamic("RangeError")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ReferenceError")
  @js.native
  open class ReferenceError ()
    extends StObject
       with typings.std.Error {
    def this(message: java.lang.String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: java.lang.String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: java.lang.String = js.native
  }
  @JSGlobal("ReferenceError")
  @js.native
  def ReferenceError: ReferenceErrorConstructor = js.native
  inline def ReferenceError_=(x: ReferenceErrorConstructor): Unit = js.Dynamic.global.updateDynamic("ReferenceError")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("SyntaxError")
  @js.native
  open class SyntaxError ()
    extends StObject
       with typings.std.Error {
    def this(message: java.lang.String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: java.lang.String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: java.lang.String = js.native
  }
  @JSGlobal("SyntaxError")
  @js.native
  def SyntaxError: SyntaxErrorConstructor = js.native
  inline def SyntaxError_=(x: SyntaxErrorConstructor): Unit = js.Dynamic.global.updateDynamic("SyntaxError")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("TypeError")
  @js.native
  open class TypeError ()
    extends StObject
       with typings.std.Error {
    def this(message: java.lang.String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: java.lang.String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: java.lang.String = js.native
  }
  @JSGlobal("TypeError")
  @js.native
  def TypeError: TypeErrorConstructor = js.native
  inline def TypeError_=(x: TypeErrorConstructor): Unit = js.Dynamic.global.updateDynamic("TypeError")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("URIError")
  @js.native
  open class URIError ()
    extends StObject
       with typings.std.Error {
    def this(message: java.lang.String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: java.lang.String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: java.lang.String = js.native
  }
  @JSGlobal("URIError")
  @js.native
  def URIError: URIErrorConstructor = js.native
  inline def URIError_=(x: URIErrorConstructor): Unit = js.Dynamic.global.updateDynamic("URIError")(x.asInstanceOf[js.Any])
  
  /**
    * 方法用于在 console 窗口输出信息。它可以接受多个参数，将它们的结果连接起来输出。
    */
  object console {
    
    @JSGlobal("console")
    @js.native
    val ^ : js.Any = js.native
    
    inline def log(message: Any, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(List(message.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    inline def log(message: Unit, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(List(message.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  }
  
  /**
    * Gets the unencoded version of an encoded Uniform Resource Identifier (URI).
    * @param encodedURI A value representing an encoded URI.
    */
  inline def decodeURI(encodedURI: java.lang.String): java.lang.String = js.Dynamic.global.applyDynamic("decodeURI")(encodedURI.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /**
    * Gets the unencoded version of an encoded component of a Uniform Resource Identifier (URI).
    * @param encodedURIComponent A value representing an encoded URI component.
    */
  inline def decodeURIComponent(encodedURIComponent: java.lang.String): java.lang.String = js.Dynamic.global.applyDynamic("decodeURIComponent")(encodedURIComponent.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /**
    * Encodes a text string as a valid Uniform Resource Identifier (URI)
    * @param uri A value representing an encoded URI.
    */
  inline def encodeURI(uri: java.lang.String): java.lang.String = js.Dynamic.global.applyDynamic("encodeURI")(uri.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /**
    * Encodes a text string as a valid component of a Uniform Resource Identifier (URI).
    * @param uriComponent A value representing an encoded URI component.
    */
  inline def encodeURIComponent(uriComponent: java.lang.String): java.lang.String = js.Dynamic.global.applyDynamic("encodeURIComponent")(uriComponent.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  inline def encodeURIComponent(uriComponent: scala.Boolean): java.lang.String = js.Dynamic.global.applyDynamic("encodeURIComponent")(uriComponent.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  inline def encodeURIComponent(uriComponent: Double): java.lang.String = js.Dynamic.global.applyDynamic("encodeURIComponent")(uriComponent.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /**
    * 返回一个当前时间的对象。
    */
  inline def getDate(): Date = js.Dynamic.global.applyDynamic("getDate")().asInstanceOf[Date]
  inline def getDate(value: java.lang.String): Date = js.Dynamic.global.applyDynamic("getDate")(value.asInstanceOf[js.Any]).asInstanceOf[Date]
  /**
    * 获取时间
    * @param value  时间
    * milliseconds: 从1970年1月1日00:00:00 UTC开始计算的毫秒数
    * datestring: 日期字符串，其格式为："month day, year hours:minutes:seconds"
    */
  inline def getDate(value: Double): Date = js.Dynamic.global.applyDynamic("getDate")(value.asInstanceOf[js.Any]).asInstanceOf[Date]
  inline def getDate(year: Double, month: Double): Date = (js.Dynamic.global.applyDynamic("getDate")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any])).asInstanceOf[Date]
  inline def getDate(year: Double, month: Double, date: Double): Date = (js.Dynamic.global.applyDynamic("getDate")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Date]
  inline def getDate(year: Double, month: Double, date: Double, hours: Double): Date = (js.Dynamic.global.applyDynamic("getDate")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], date.asInstanceOf[js.Any], hours.asInstanceOf[js.Any])).asInstanceOf[Date]
  inline def getDate(year: Double, month: Double, date: Double, hours: Double, minutes: Double): Date = (js.Dynamic.global.applyDynamic("getDate")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], date.asInstanceOf[js.Any], hours.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any])).asInstanceOf[Date]
  inline def getDate(year: Double, month: Double, date: Double, hours: Double, minutes: Double, seconds: Double): Date = (js.Dynamic.global.applyDynamic("getDate")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], date.asInstanceOf[js.Any], hours.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any])).asInstanceOf[Date]
  inline def getDate(
    year: Double,
    month: Double,
    date: Double,
    hours: Double,
    minutes: Double,
    seconds: Double,
    ms: Double
  ): Date = (js.Dynamic.global.applyDynamic("getDate")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], date.asInstanceOf[js.Any], hours.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[Date]
  inline def getDate(
    year: Double,
    month: Double,
    date: Double,
    hours: Double,
    minutes: Double,
    seconds: Unit,
    ms: Double
  ): Date = (js.Dynamic.global.applyDynamic("getDate")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], date.asInstanceOf[js.Any], hours.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[Date]
  inline def getDate(year: Double, month: Double, date: Double, hours: Double, minutes: Unit, seconds: Double): Date = (js.Dynamic.global.applyDynamic("getDate")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], date.asInstanceOf[js.Any], hours.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any])).asInstanceOf[Date]
  inline def getDate(
    year: Double,
    month: Double,
    date: Double,
    hours: Double,
    minutes: Unit,
    seconds: Double,
    ms: Double
  ): Date = (js.Dynamic.global.applyDynamic("getDate")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], date.asInstanceOf[js.Any], hours.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[Date]
  inline def getDate(year: Double, month: Double, date: Double, hours: Double, minutes: Unit, seconds: Unit, ms: Double): Date = (js.Dynamic.global.applyDynamic("getDate")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], date.asInstanceOf[js.Any], hours.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[Date]
  inline def getDate(year: Double, month: Double, date: Double, hours: Unit, minutes: Double): Date = (js.Dynamic.global.applyDynamic("getDate")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], date.asInstanceOf[js.Any], hours.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any])).asInstanceOf[Date]
  inline def getDate(year: Double, month: Double, date: Double, hours: Unit, minutes: Double, seconds: Double): Date = (js.Dynamic.global.applyDynamic("getDate")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], date.asInstanceOf[js.Any], hours.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any])).asInstanceOf[Date]
  inline def getDate(
    year: Double,
    month: Double,
    date: Double,
    hours: Unit,
    minutes: Double,
    seconds: Double,
    ms: Double
  ): Date = (js.Dynamic.global.applyDynamic("getDate")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], date.asInstanceOf[js.Any], hours.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[Date]
  inline def getDate(year: Double, month: Double, date: Double, hours: Unit, minutes: Double, seconds: Unit, ms: Double): Date = (js.Dynamic.global.applyDynamic("getDate")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], date.asInstanceOf[js.Any], hours.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[Date]
  inline def getDate(year: Double, month: Double, date: Double, hours: Unit, minutes: Unit, seconds: Double): Date = (js.Dynamic.global.applyDynamic("getDate")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], date.asInstanceOf[js.Any], hours.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any])).asInstanceOf[Date]
  inline def getDate(year: Double, month: Double, date: Double, hours: Unit, minutes: Unit, seconds: Double, ms: Double): Date = (js.Dynamic.global.applyDynamic("getDate")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], date.asInstanceOf[js.Any], hours.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[Date]
  inline def getDate(year: Double, month: Double, date: Double, hours: Unit, minutes: Unit, seconds: Unit, ms: Double): Date = (js.Dynamic.global.applyDynamic("getDate")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], date.asInstanceOf[js.Any], hours.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[Date]
  inline def getDate(year: Double, month: Double, date: Unit, hours: Double): Date = (js.Dynamic.global.applyDynamic("getDate")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], date.asInstanceOf[js.Any], hours.asInstanceOf[js.Any])).asInstanceOf[Date]
  inline def getDate(year: Double, month: Double, date: Unit, hours: Double, minutes: Double): Date = (js.Dynamic.global.applyDynamic("getDate")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], date.asInstanceOf[js.Any], hours.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any])).asInstanceOf[Date]
  inline def getDate(year: Double, month: Double, date: Unit, hours: Double, minutes: Double, seconds: Double): Date = (js.Dynamic.global.applyDynamic("getDate")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], date.asInstanceOf[js.Any], hours.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any])).asInstanceOf[Date]
  inline def getDate(
    year: Double,
    month: Double,
    date: Unit,
    hours: Double,
    minutes: Double,
    seconds: Double,
    ms: Double
  ): Date = (js.Dynamic.global.applyDynamic("getDate")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], date.asInstanceOf[js.Any], hours.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[Date]
  inline def getDate(year: Double, month: Double, date: Unit, hours: Double, minutes: Double, seconds: Unit, ms: Double): Date = (js.Dynamic.global.applyDynamic("getDate")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], date.asInstanceOf[js.Any], hours.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[Date]
  inline def getDate(year: Double, month: Double, date: Unit, hours: Double, minutes: Unit, seconds: Double): Date = (js.Dynamic.global.applyDynamic("getDate")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], date.asInstanceOf[js.Any], hours.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any])).asInstanceOf[Date]
  inline def getDate(year: Double, month: Double, date: Unit, hours: Double, minutes: Unit, seconds: Double, ms: Double): Date = (js.Dynamic.global.applyDynamic("getDate")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], date.asInstanceOf[js.Any], hours.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[Date]
  inline def getDate(year: Double, month: Double, date: Unit, hours: Double, minutes: Unit, seconds: Unit, ms: Double): Date = (js.Dynamic.global.applyDynamic("getDate")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], date.asInstanceOf[js.Any], hours.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[Date]
  inline def getDate(year: Double, month: Double, date: Unit, hours: Unit, minutes: Double): Date = (js.Dynamic.global.applyDynamic("getDate")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], date.asInstanceOf[js.Any], hours.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any])).asInstanceOf[Date]
  inline def getDate(year: Double, month: Double, date: Unit, hours: Unit, minutes: Double, seconds: Double): Date = (js.Dynamic.global.applyDynamic("getDate")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], date.asInstanceOf[js.Any], hours.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any])).asInstanceOf[Date]
  inline def getDate(year: Double, month: Double, date: Unit, hours: Unit, minutes: Double, seconds: Double, ms: Double): Date = (js.Dynamic.global.applyDynamic("getDate")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], date.asInstanceOf[js.Any], hours.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[Date]
  inline def getDate(year: Double, month: Double, date: Unit, hours: Unit, minutes: Double, seconds: Unit, ms: Double): Date = (js.Dynamic.global.applyDynamic("getDate")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], date.asInstanceOf[js.Any], hours.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[Date]
  inline def getDate(year: Double, month: Double, date: Unit, hours: Unit, minutes: Unit, seconds: Double): Date = (js.Dynamic.global.applyDynamic("getDate")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], date.asInstanceOf[js.Any], hours.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any])).asInstanceOf[Date]
  inline def getDate(year: Double, month: Double, date: Unit, hours: Unit, minutes: Unit, seconds: Double, ms: Double): Date = (js.Dynamic.global.applyDynamic("getDate")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], date.asInstanceOf[js.Any], hours.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[Date]
  inline def getDate(year: Double, month: Double, date: Unit, hours: Unit, minutes: Unit, seconds: Unit, ms: Double): Date = (js.Dynamic.global.applyDynamic("getDate")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], date.asInstanceOf[js.Any], hours.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  /**
    * 生成 regexp 对象需要使用 getRegExp函数。
    * @param pattern : 正则表达式的内容
    * @param flags ：修饰符`g`: global;`i`: ignoreCase; `m`: multiline
    */
  inline def getRegExp(pattern: java.lang.String): RegExp = js.Dynamic.global.applyDynamic("getRegExp")(pattern.asInstanceOf[js.Any]).asInstanceOf[RegExp]
  inline def getRegExp(pattern: java.lang.String, flags: java.lang.String): RegExp = (js.Dynamic.global.applyDynamic("getRegExp")(pattern.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[RegExp]
  
  /**
    * Determines whether a supplied number is finite.
    * @param number Any numeric value.
    */
  inline def isFinite(number: Double): scala.Boolean = js.Dynamic.global.applyDynamic("isFinite")(number.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  /**
    * Returns a Boolean value that indicates whether a value is the reserved value NaN (not a number).
    * @param number A numeric value.
    */
  inline def isNaN(number: Double): scala.Boolean = js.Dynamic.global.applyDynamic("isNaN")(number.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
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
  inline def parseFloat(string: java.lang.String): Double = js.Dynamic.global.applyDynamic("parseFloat")(string.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Converts A string to an integer.
    * @param s A string to convert into a number.
    * @param radix A value between 2 and 36 that specifies the base of the number in numString.
    * If this argument is not supplied, strings with a prefix of '0x' are considered hexadecimal.
    * All other strings are considered decimal.
    */
  inline def parseInt(s: java.lang.String): Double = js.Dynamic.global.applyDynamic("parseInt")(s.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def parseInt(s: java.lang.String, radix: Double): Double = (js.Dynamic.global.applyDynamic("parseInt")(s.asInstanceOf[js.Any], radix.asInstanceOf[js.Any])).asInstanceOf[Double]
}
