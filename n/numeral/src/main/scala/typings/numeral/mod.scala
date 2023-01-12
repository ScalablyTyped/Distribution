package typings.numeral

import org.scalablytyped.runtime.StringDictionary
import typings.numeral.anon.Billion
import typings.numeral.anon.Decimal
import typings.numeral.anon.Format
import typings.numeral.anon.Symbol
import typings.numeral.numeralStrings.`2Dot0Dot6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A javascript library for formatting and manipulating numbers.
    */
  inline def apply(): Numeral = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Numeral]
  inline def apply(input: Any): Numeral = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[Numeral]
  
  @JSImport("numeral", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // http://numeraljs.com/#use-it
  @JSImport("numeral", "Numeral")
  @js.native
  open class Numeral protected () extends StObject {
    def this(input: Any, value: Double) = this()
    
    def add(value: Any): Numeral = js.native
    
    def difference(value: Any): Double = js.native
    
    def divide(value: Any): Numeral = js.native
    
    def format(): String = js.native
    def format(inputString: String): String = js.native
    def format(inputString: String, roundingFunction: RoundingFunction): String = js.native
    def format(inputString: Unit, roundingFunction: RoundingFunction): String = js.native
    
    def input(): Any = js.native
    
    def multiply(value: Any): Numeral = js.native
    
    def set(value: Any): Numeral = js.native
    
    def subtract(value: Any): Numeral = js.native
    
    def value(): Double | Null = js.native
  }
  
  /**
    * Object with utility functions
    */
  @JSImport("numeral", "_")
  @js.native
  val _underscore: NumeralJSUtils = js.native
  
  inline def defaultFormat(format: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultFormat")(format.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("numeral", "fn")
  @js.native
  val fn: /* import warning: importer.ImportType#apply Failed type conversion: numeral.numeral.Numeral['prototype'] */ js.Any = js.native
  
  /**
    * Object with all loaded formats
    */
  @JSImport("numeral", "formats")
  @js.native
  val formats: NumeralJSFormats = js.native
  
  /** compare numeral object */
  inline def isNumeral(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumeral")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * This function sets the current locale.  If no arguments are passed in,
    * it will simply return the current global locale key.
    */
  inline def locale(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("locale")().asInstanceOf[String]
  inline def locale(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("locale")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * This function provides access to the loaded locale data.  If
    * no arguments are passed in, it will simply return the current
    * global locale object.
    *
    * @param key Locale key, e.g 'es' for a spanish locale definition
    */
  inline def localeData(): NumeralJSLocale = ^.asInstanceOf[js.Dynamic].applyDynamic("localeData")().asInstanceOf[NumeralJSLocale]
  inline def localeData(key: String): NumeralJSLocale = ^.asInstanceOf[js.Dynamic].applyDynamic("localeData")(key.asInstanceOf[js.Any]).asInstanceOf[NumeralJSLocale]
  
  /**
    * Object with all loaded locales
    */
  @JSImport("numeral", "locales")
  @js.native
  val locales: NumeralJSLocales = js.native
  
  inline def nullFormat(format: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("nullFormat")(format.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("numeral", "options")
  @js.native
  val options: NumeralJSOptions = js.native
  
  inline def register(what: RegisterType, key: String, value: NumeralJSFormat): NumeralJSLocale | NumeralJSFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(what.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[NumeralJSLocale | NumeralJSFormat]
  /**
    * Registers a language definition or a custom format definition.
    *
    * @param what Allowed values are: either 'format' or 'locale'
    * @param key The key of the registerd type, e.g. 'de' for a german locale definition
    * @param value The locale definition or the format definitiion
    */
  inline def register(what: RegisterType, key: String, value: NumeralJSLocale): NumeralJSLocale | NumeralJSFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(what.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[NumeralJSLocale | NumeralJSFormat]
  
  /**
    * This function resets the configuration to all the defaults
    */
  inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  
  inline def validate(value: Any, culture: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(value.asInstanceOf[js.Any], culture.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("numeral", "version")
  @js.native
  val version: VERSION_ = js.native
  
  inline def zeroFormat(format: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("zeroFormat")(format.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  // http://numeraljs.com/#custom-formats
  trait NumeralJSFormat extends StObject {
    
    def format(value: Any, format: String, roundingFunction: RoundingFunction): String
    
    var regexps: Format
    
    def unformat(value: String): Double
  }
  object NumeralJSFormat {
    
    inline def apply(format: (Any, String, RoundingFunction) => String, regexps: Format, unformat: String => Double): NumeralJSFormat = {
      val __obj = js.Dynamic.literal(format = js.Any.fromFunction3(format), regexps = regexps.asInstanceOf[js.Any], unformat = js.Any.fromFunction1(unformat))
      __obj.asInstanceOf[NumeralJSFormat]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NumeralJSFormat] (val x: Self) extends AnyVal {
      
      inline def setFormat(value: (Any, String, RoundingFunction) => String): Self = StObject.set(x, "format", js.Any.fromFunction3(value))
      
      inline def setRegexps(value: Format): Self = StObject.set(x, "regexps", value.asInstanceOf[js.Any])
      
      inline def setUnformat(value: String => Double): Self = StObject.set(x, "unformat", js.Any.fromFunction1(value))
    }
  }
  
  type NumeralJSFormats = StringDictionary[NumeralJSFormat]
  
  // http://numeraljs.com/#locales
  trait NumeralJSLocale extends StObject {
    
    var abbreviations: Billion
    
    var currency: Symbol
    
    var delimiters: Decimal
    
    def ordinal(num: Double): String
  }
  object NumeralJSLocale {
    
    inline def apply(abbreviations: Billion, currency: Symbol, delimiters: Decimal, ordinal: Double => String): NumeralJSLocale = {
      val __obj = js.Dynamic.literal(abbreviations = abbreviations.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], delimiters = delimiters.asInstanceOf[js.Any], ordinal = js.Any.fromFunction1(ordinal))
      __obj.asInstanceOf[NumeralJSLocale]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NumeralJSLocale] (val x: Self) extends AnyVal {
      
      inline def setAbbreviations(value: Billion): Self = StObject.set(x, "abbreviations", value.asInstanceOf[js.Any])
      
      inline def setCurrency(value: Symbol): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setDelimiters(value: Decimal): Self = StObject.set(x, "delimiters", value.asInstanceOf[js.Any])
      
      inline def setOrdinal(value: Double => String): Self = StObject.set(x, "ordinal", js.Any.fromFunction1(value))
    }
  }
  
  type NumeralJSLocales = StringDictionary[NumeralJSLocale]
  
  trait NumeralJSOptions extends StObject {
    
    var currentLocale: String
    
    var defaultFormat: String
    
    var nullFormat: String
    
    var scalePercentBy100: Boolean
    
    var zeroFormat: String
  }
  object NumeralJSOptions {
    
    inline def apply(
      currentLocale: String,
      defaultFormat: String,
      nullFormat: String,
      scalePercentBy100: Boolean,
      zeroFormat: String
    ): NumeralJSOptions = {
      val __obj = js.Dynamic.literal(currentLocale = currentLocale.asInstanceOf[js.Any], defaultFormat = defaultFormat.asInstanceOf[js.Any], nullFormat = nullFormat.asInstanceOf[js.Any], scalePercentBy100 = scalePercentBy100.asInstanceOf[js.Any], zeroFormat = zeroFormat.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumeralJSOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NumeralJSOptions] (val x: Self) extends AnyVal {
      
      inline def setCurrentLocale(value: String): Self = StObject.set(x, "currentLocale", value.asInstanceOf[js.Any])
      
      inline def setDefaultFormat(value: String): Self = StObject.set(x, "defaultFormat", value.asInstanceOf[js.Any])
      
      inline def setNullFormat(value: String): Self = StObject.set(x, "nullFormat", value.asInstanceOf[js.Any])
      
      inline def setScalePercentBy100(value: Boolean): Self = StObject.set(x, "scalePercentBy100", value.asInstanceOf[js.Any])
      
      inline def setZeroFormat(value: String): Self = StObject.set(x, "zeroFormat", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NumeralJSUtils extends StObject {
    
    def numberToFormat(value: Double, format: String): String = js.native
    def numberToFormat(value: Double, format: String, roundingFunction: RoundingFunction): String = js.native
    
    def stringToNumber(string: String): Double = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.numeral.numeralStrings.format
    - typings.numeral.numeralStrings.locale
  */
  trait RegisterType extends StObject
  object RegisterType {
    
    inline def format: typings.numeral.numeralStrings.format = "format".asInstanceOf[typings.numeral.numeralStrings.format]
    
    inline def locale: typings.numeral.numeralStrings.locale = "locale".asInstanceOf[typings.numeral.numeralStrings.locale]
  }
  
  type RoundingFunction = js.Function1[/* value */ Double, Double]
  
  type VERSION_ = `2Dot0Dot6`
}
