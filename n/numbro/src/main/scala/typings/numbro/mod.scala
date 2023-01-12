package typings.numbro

import org.scalablytyped.runtime.StringDictionary
import typings.numbro.anon.Billion
import typings.numbro.anon.Code
import typings.numbro.anon.Decimal
import typings.numbro.anon.FourDigits
import typings.numbro.anon.Million
import typings.numbro.mod.numbro.Format
import typings.numbro.mod.numbro.Numbro
import typings.numbro.mod.numbro.NumbroLanguage
import typings.numbro.numbroStrings.billion
import typings.numbro.numbroStrings.binary
import typings.numbro.numbroStrings.byte
import typings.numbro.numbroStrings.currency
import typings.numbro.numbroStrings.decimal
import typings.numbro.numbroStrings.general
import typings.numbro.numbroStrings.infix
import typings.numbro.numbroStrings.million
import typings.numbro.numbroStrings.number
import typings.numbro.numbroStrings.ordinal
import typings.numbro.numbroStrings.parenthesis
import typings.numbro.numbroStrings.percent
import typings.numbro.numbroStrings.postfix
import typings.numbro.numbroStrings.prefix
import typings.numbro.numbroStrings.sign
import typings.numbro.numbroStrings.thousand
import typings.numbro.numbroStrings.time
import typings.numbro.numbroStrings.trillion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    inline def apply(): Numbro = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Numbro]
    inline def apply(value: Any): Numbro = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[Numbro]
    
    @JSImport("numbro", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def defaultCurrencyFormat(newFormat: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultCurrencyFormat")(newFormat.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def defaultFormat(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultFormat")().asInstanceOf[js.Object]
    
    inline def isNumbro(value: Any): /* is numbro.numbro.numbro.Numbro */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumbro")(value.asInstanceOf[js.Any]).asInstanceOf[/* is numbro.numbro.numbro.Numbro */ Boolean]
    
    inline def language(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("language")().asInstanceOf[String]
    
    inline def languageData(): NumbroLanguage = ^.asInstanceOf[js.Dynamic].applyDynamic("languageData")().asInstanceOf[NumbroLanguage]
    inline def languageData(tag: String): NumbroLanguage = ^.asInstanceOf[js.Dynamic].applyDynamic("languageData")(tag.asInstanceOf[js.Any]).asInstanceOf[NumbroLanguage]
    
    inline def languages(): StringDictionary[NumbroLanguage] = ^.asInstanceOf[js.Dynamic].applyDynamic("languages")().asInstanceOf[StringDictionary[NumbroLanguage]]
    
    inline def loadLanguagesInNode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadLanguagesInNode")().asInstanceOf[Unit]
    
    inline def registerLanguage(tag: NumbroLanguage): String = ^.asInstanceOf[js.Dynamic].applyDynamic("registerLanguage")(tag.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def registerLanguage(tag: NumbroLanguage, useLanguage: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLanguage")(tag.asInstanceOf[js.Any], useLanguage.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def setDefaults(format: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaults")(format.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setDefaults(format: Format): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaults")(format.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setLanguage(tag: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLanguage")(tag.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setLanguage(tag: String, fallbackTag: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLanguage")(tag.asInstanceOf[js.Any], fallbackTag.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def unformat(input: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unformat")(input.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def unformat(input: String, format: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("unformat")(input.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def unformat(input: String, format: Format): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("unformat")(input.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def validate(value: String, format: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def validate(value: String, format: Format): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("numbro", "default.version")
    @js.native
    val version: String = js.native
    
    inline def zeroFormat(newFormat: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("zeroFormat")(newFormat.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  object numbro {
    
    trait Format extends StObject {
      
      var abbreviations: js.UndefOr[Billion] = js.undefined
      
      var average: js.UndefOr[Boolean] = js.undefined
      
      var base: js.UndefOr[decimal | binary | general] = js.undefined
      
      var characteristic: js.UndefOr[Double] = js.undefined
      
      var currencyPosition: js.UndefOr[prefix | infix | postfix] = js.undefined
      
      var currencySymbol: js.UndefOr[String] = js.undefined
      
      var exponential: js.UndefOr[Boolean] = js.undefined
      
      var forceAverage: js.UndefOr[trillion | billion | million | thousand] = js.undefined
      
      var forceSign: js.UndefOr[Boolean] = js.undefined
      
      var lowPrecision: js.UndefOr[Boolean] = js.undefined
      
      var mantissa: js.UndefOr[Double] = js.undefined
      
      var negative: js.UndefOr[sign | parenthesis] = js.undefined
      
      var optionalCharacteristic: js.UndefOr[Boolean] = js.undefined
      
      var optionalMantissa: js.UndefOr[Boolean] = js.undefined
      
      var output: js.UndefOr[currency | percent | byte | time | ordinal | number] = js.undefined
      
      var postfix: js.UndefOr[String] = js.undefined
      
      var prefix: js.UndefOr[String] = js.undefined
      
      var prefixSymbol: js.UndefOr[Boolean] = js.undefined
      
      var roundingFunction: js.UndefOr[js.Function1[/* num */ Double, Double]] = js.undefined
      
      var spaceSeparated: js.UndefOr[Boolean] = js.undefined
      
      var spaceSeparatedAbbreviation: js.UndefOr[Boolean] = js.undefined
      
      var spaceSeparatedCurrency: js.UndefOr[Boolean] = js.undefined
      
      var thousandSeparated: js.UndefOr[Boolean] = js.undefined
      
      var totalLength: js.UndefOr[Double] = js.undefined
      
      var trimMantissa: js.UndefOr[Boolean] = js.undefined
    }
    object Format {
      
      inline def apply(): Format = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Format]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
        
        inline def setAbbreviations(value: Billion): Self = StObject.set(x, "abbreviations", value.asInstanceOf[js.Any])
        
        inline def setAbbreviationsUndefined: Self = StObject.set(x, "abbreviations", js.undefined)
        
        inline def setAverage(value: Boolean): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
        
        inline def setAverageUndefined: Self = StObject.set(x, "average", js.undefined)
        
        inline def setBase(value: decimal | binary | general): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
        
        inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
        
        inline def setCharacteristic(value: Double): Self = StObject.set(x, "characteristic", value.asInstanceOf[js.Any])
        
        inline def setCharacteristicUndefined: Self = StObject.set(x, "characteristic", js.undefined)
        
        inline def setCurrencyPosition(value: prefix | infix | postfix): Self = StObject.set(x, "currencyPosition", value.asInstanceOf[js.Any])
        
        inline def setCurrencyPositionUndefined: Self = StObject.set(x, "currencyPosition", js.undefined)
        
        inline def setCurrencySymbol(value: String): Self = StObject.set(x, "currencySymbol", value.asInstanceOf[js.Any])
        
        inline def setCurrencySymbolUndefined: Self = StObject.set(x, "currencySymbol", js.undefined)
        
        inline def setExponential(value: Boolean): Self = StObject.set(x, "exponential", value.asInstanceOf[js.Any])
        
        inline def setExponentialUndefined: Self = StObject.set(x, "exponential", js.undefined)
        
        inline def setForceAverage(value: trillion | billion | million | thousand): Self = StObject.set(x, "forceAverage", value.asInstanceOf[js.Any])
        
        inline def setForceAverageUndefined: Self = StObject.set(x, "forceAverage", js.undefined)
        
        inline def setForceSign(value: Boolean): Self = StObject.set(x, "forceSign", value.asInstanceOf[js.Any])
        
        inline def setForceSignUndefined: Self = StObject.set(x, "forceSign", js.undefined)
        
        inline def setLowPrecision(value: Boolean): Self = StObject.set(x, "lowPrecision", value.asInstanceOf[js.Any])
        
        inline def setLowPrecisionUndefined: Self = StObject.set(x, "lowPrecision", js.undefined)
        
        inline def setMantissa(value: Double): Self = StObject.set(x, "mantissa", value.asInstanceOf[js.Any])
        
        inline def setMantissaUndefined: Self = StObject.set(x, "mantissa", js.undefined)
        
        inline def setNegative(value: sign | parenthesis): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
        
        inline def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
        
        inline def setOptionalCharacteristic(value: Boolean): Self = StObject.set(x, "optionalCharacteristic", value.asInstanceOf[js.Any])
        
        inline def setOptionalCharacteristicUndefined: Self = StObject.set(x, "optionalCharacteristic", js.undefined)
        
        inline def setOptionalMantissa(value: Boolean): Self = StObject.set(x, "optionalMantissa", value.asInstanceOf[js.Any])
        
        inline def setOptionalMantissaUndefined: Self = StObject.set(x, "optionalMantissa", js.undefined)
        
        inline def setOutput(value: currency | percent | byte | time | ordinal | number): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
        
        inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
        
        inline def setPostfix(value: String): Self = StObject.set(x, "postfix", value.asInstanceOf[js.Any])
        
        inline def setPostfixUndefined: Self = StObject.set(x, "postfix", js.undefined)
        
        inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
        
        inline def setPrefixSymbol(value: Boolean): Self = StObject.set(x, "prefixSymbol", value.asInstanceOf[js.Any])
        
        inline def setPrefixSymbolUndefined: Self = StObject.set(x, "prefixSymbol", js.undefined)
        
        inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
        
        inline def setRoundingFunction(value: /* num */ Double => Double): Self = StObject.set(x, "roundingFunction", js.Any.fromFunction1(value))
        
        inline def setRoundingFunctionUndefined: Self = StObject.set(x, "roundingFunction", js.undefined)
        
        inline def setSpaceSeparated(value: Boolean): Self = StObject.set(x, "spaceSeparated", value.asInstanceOf[js.Any])
        
        inline def setSpaceSeparatedAbbreviation(value: Boolean): Self = StObject.set(x, "spaceSeparatedAbbreviation", value.asInstanceOf[js.Any])
        
        inline def setSpaceSeparatedAbbreviationUndefined: Self = StObject.set(x, "spaceSeparatedAbbreviation", js.undefined)
        
        inline def setSpaceSeparatedCurrency(value: Boolean): Self = StObject.set(x, "spaceSeparatedCurrency", value.asInstanceOf[js.Any])
        
        inline def setSpaceSeparatedCurrencyUndefined: Self = StObject.set(x, "spaceSeparatedCurrency", js.undefined)
        
        inline def setSpaceSeparatedUndefined: Self = StObject.set(x, "spaceSeparated", js.undefined)
        
        inline def setThousandSeparated(value: Boolean): Self = StObject.set(x, "thousandSeparated", value.asInstanceOf[js.Any])
        
        inline def setThousandSeparatedUndefined: Self = StObject.set(x, "thousandSeparated", js.undefined)
        
        inline def setTotalLength(value: Double): Self = StObject.set(x, "totalLength", value.asInstanceOf[js.Any])
        
        inline def setTotalLengthUndefined: Self = StObject.set(x, "totalLength", js.undefined)
        
        inline def setTrimMantissa(value: Boolean): Self = StObject.set(x, "trimMantissa", value.asInstanceOf[js.Any])
        
        inline def setTrimMantissaUndefined: Self = StObject.set(x, "trimMantissa", js.undefined)
      }
    }
    
    @js.native
    trait Numbro extends StObject {
      
      def add(value: Double): this.type = js.native
      
      def binaryByteUnits(): String = js.native
      
      def byteUnits(): String = js.native
      
      def decimalByteUnits(): String = js.native
      
      def difference(value: Double): Double = js.native
      
      def divide(value: Double): this.type = js.native
      
      def format(): String = js.native
      def format(format: String): String = js.native
      def format(format: Format): String = js.native
      
      def formatCurrency(): String = js.native
      def formatCurrency(format: String): String = js.native
      def formatCurrency(format: Format): String = js.native
      
      def formatTime(): String = js.native
      def formatTime(format: String): String = js.native
      def formatTime(format: Format): String = js.native
      
      def multiply(value: Double): this.type = js.native
      
      def set(value: Double): this.type = js.native
      
      def subtract(value: Double): this.type = js.native
      
      def value(): Double = js.native
    }
    
    trait NumbroLanguage extends StObject {
      
      var abbreviations: Million
      
      var byteFormat: js.UndefOr[Format] = js.undefined
      
      var currency: Code
      
      var currencyFormat: js.UndefOr[Format] = js.undefined
      
      var defaults: js.UndefOr[Format] = js.undefined
      
      var delimiters: Decimal
      
      var formats: FourDigits
      
      var languageTag: String
      
      def ordinal(num: Double): String
      
      var ordinalFormat: js.UndefOr[Format] = js.undefined
      
      var percentageFormat: js.UndefOr[Format] = js.undefined
      
      var spaceSeparated: js.UndefOr[Boolean] = js.undefined
      
      var timeDefaults: js.UndefOr[Format] = js.undefined
    }
    object NumbroLanguage {
      
      inline def apply(
        abbreviations: Million,
        currency: Code,
        delimiters: Decimal,
        formats: FourDigits,
        languageTag: String,
        ordinal: Double => String
      ): NumbroLanguage = {
        val __obj = js.Dynamic.literal(abbreviations = abbreviations.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], delimiters = delimiters.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any], languageTag = languageTag.asInstanceOf[js.Any], ordinal = js.Any.fromFunction1(ordinal))
        __obj.asInstanceOf[NumbroLanguage]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: NumbroLanguage] (val x: Self) extends AnyVal {
        
        inline def setAbbreviations(value: Million): Self = StObject.set(x, "abbreviations", value.asInstanceOf[js.Any])
        
        inline def setByteFormat(value: Format): Self = StObject.set(x, "byteFormat", value.asInstanceOf[js.Any])
        
        inline def setByteFormatUndefined: Self = StObject.set(x, "byteFormat", js.undefined)
        
        inline def setCurrency(value: Code): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
        
        inline def setCurrencyFormat(value: Format): Self = StObject.set(x, "currencyFormat", value.asInstanceOf[js.Any])
        
        inline def setCurrencyFormatUndefined: Self = StObject.set(x, "currencyFormat", js.undefined)
        
        inline def setDefaults(value: Format): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
        
        inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
        
        inline def setDelimiters(value: Decimal): Self = StObject.set(x, "delimiters", value.asInstanceOf[js.Any])
        
        inline def setFormats(value: FourDigits): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
        
        inline def setLanguageTag(value: String): Self = StObject.set(x, "languageTag", value.asInstanceOf[js.Any])
        
        inline def setOrdinal(value: Double => String): Self = StObject.set(x, "ordinal", js.Any.fromFunction1(value))
        
        inline def setOrdinalFormat(value: Format): Self = StObject.set(x, "ordinalFormat", value.asInstanceOf[js.Any])
        
        inline def setOrdinalFormatUndefined: Self = StObject.set(x, "ordinalFormat", js.undefined)
        
        inline def setPercentageFormat(value: Format): Self = StObject.set(x, "percentageFormat", value.asInstanceOf[js.Any])
        
        inline def setPercentageFormatUndefined: Self = StObject.set(x, "percentageFormat", js.undefined)
        
        inline def setSpaceSeparated(value: Boolean): Self = StObject.set(x, "spaceSeparated", value.asInstanceOf[js.Any])
        
        inline def setSpaceSeparatedUndefined: Self = StObject.set(x, "spaceSeparated", js.undefined)
        
        inline def setTimeDefaults(value: Format): Self = StObject.set(x, "timeDefaults", value.asInstanceOf[js.Any])
        
        inline def setTimeDefaultsUndefined: Self = StObject.set(x, "timeDefaults", js.undefined)
      }
    }
  }
}
