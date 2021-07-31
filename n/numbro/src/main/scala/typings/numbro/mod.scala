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
    
    @scala.inline
    def apply(): Numbro = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Numbro]
    @scala.inline
    def apply(value: js.Any): Numbro = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[Numbro]
    
    @JSImport("numbro", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def defaultCurrencyFormat(newFormat: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultCurrencyFormat")(newFormat.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    @scala.inline
    def defaultFormat(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultFormat")().asInstanceOf[js.Object]
    
    @scala.inline
    def isNumbro(value: js.Any): /* is numbro.numbro.numbro.Numbro */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumbro")(value.asInstanceOf[js.Any]).asInstanceOf[/* is numbro.numbro.numbro.Numbro */ Boolean]
    
    @scala.inline
    def language(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("language")().asInstanceOf[String]
    
    @scala.inline
    def languageData(): NumbroLanguage = ^.asInstanceOf[js.Dynamic].applyDynamic("languageData")().asInstanceOf[NumbroLanguage]
    @scala.inline
    def languageData(tag: String): NumbroLanguage = ^.asInstanceOf[js.Dynamic].applyDynamic("languageData")(tag.asInstanceOf[js.Any]).asInstanceOf[NumbroLanguage]
    
    @scala.inline
    def languages(): StringDictionary[NumbroLanguage] = ^.asInstanceOf[js.Dynamic].applyDynamic("languages")().asInstanceOf[StringDictionary[NumbroLanguage]]
    
    @scala.inline
    def loadLanguagesInNode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadLanguagesInNode")().asInstanceOf[Unit]
    
    @scala.inline
    def registerLanguage(tag: NumbroLanguage): String = ^.asInstanceOf[js.Dynamic].applyDynamic("registerLanguage")(tag.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def registerLanguage(tag: NumbroLanguage, useLanguage: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLanguage")(tag.asInstanceOf[js.Any], useLanguage.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def setDefaults(format: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaults")(format.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def setDefaults(format: Format): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaults")(format.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def setLanguage(tag: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLanguage")(tag.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def setLanguage(tag: String, fallbackTag: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLanguage")(tag.asInstanceOf[js.Any], fallbackTag.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def unformat(input: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unformat")(input.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def unformat(input: String, format: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("unformat")(input.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def unformat(input: String, format: Format): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("unformat")(input.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def validate(value: String, format: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def validate(value: String, format: Format): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("numbro", "default.version")
    @js.native
    val version: String = js.native
    
    @scala.inline
    def zeroFormat(newFormat: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("zeroFormat")(newFormat.asInstanceOf[js.Any]).asInstanceOf[Unit]
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
      
      @scala.inline
      def apply(): Format = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Format]
      }
      
      @scala.inline
      implicit class FormatMutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAbbreviations(value: Billion): Self = StObject.set(x, "abbreviations", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAbbreviationsUndefined: Self = StObject.set(x, "abbreviations", js.undefined)
        
        @scala.inline
        def setAverage(value: Boolean): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAverageUndefined: Self = StObject.set(x, "average", js.undefined)
        
        @scala.inline
        def setBase(value: decimal | binary | general): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
        
        @scala.inline
        def setCharacteristic(value: Double): Self = StObject.set(x, "characteristic", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCharacteristicUndefined: Self = StObject.set(x, "characteristic", js.undefined)
        
        @scala.inline
        def setCurrencyPosition(value: prefix | infix | postfix): Self = StObject.set(x, "currencyPosition", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCurrencyPositionUndefined: Self = StObject.set(x, "currencyPosition", js.undefined)
        
        @scala.inline
        def setCurrencySymbol(value: String): Self = StObject.set(x, "currencySymbol", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCurrencySymbolUndefined: Self = StObject.set(x, "currencySymbol", js.undefined)
        
        @scala.inline
        def setExponential(value: Boolean): Self = StObject.set(x, "exponential", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExponentialUndefined: Self = StObject.set(x, "exponential", js.undefined)
        
        @scala.inline
        def setForceAverage(value: trillion | billion | million | thousand): Self = StObject.set(x, "forceAverage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForceAverageUndefined: Self = StObject.set(x, "forceAverage", js.undefined)
        
        @scala.inline
        def setForceSign(value: Boolean): Self = StObject.set(x, "forceSign", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForceSignUndefined: Self = StObject.set(x, "forceSign", js.undefined)
        
        @scala.inline
        def setMantissa(value: Double): Self = StObject.set(x, "mantissa", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMantissaUndefined: Self = StObject.set(x, "mantissa", js.undefined)
        
        @scala.inline
        def setNegative(value: sign | parenthesis): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
        
        @scala.inline
        def setOptionalCharacteristic(value: Boolean): Self = StObject.set(x, "optionalCharacteristic", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOptionalCharacteristicUndefined: Self = StObject.set(x, "optionalCharacteristic", js.undefined)
        
        @scala.inline
        def setOptionalMantissa(value: Boolean): Self = StObject.set(x, "optionalMantissa", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOptionalMantissaUndefined: Self = StObject.set(x, "optionalMantissa", js.undefined)
        
        @scala.inline
        def setOutput(value: currency | percent | byte | time | ordinal | number): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
        
        @scala.inline
        def setPostfix(value: String): Self = StObject.set(x, "postfix", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPostfixUndefined: Self = StObject.set(x, "postfix", js.undefined)
        
        @scala.inline
        def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrefixSymbol(value: Boolean): Self = StObject.set(x, "prefixSymbol", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrefixSymbolUndefined: Self = StObject.set(x, "prefixSymbol", js.undefined)
        
        @scala.inline
        def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
        
        @scala.inline
        def setRoundingFunction(value: /* num */ Double => Double): Self = StObject.set(x, "roundingFunction", js.Any.fromFunction1(value))
        
        @scala.inline
        def setRoundingFunctionUndefined: Self = StObject.set(x, "roundingFunction", js.undefined)
        
        @scala.inline
        def setSpaceSeparated(value: Boolean): Self = StObject.set(x, "spaceSeparated", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpaceSeparatedAbbreviation(value: Boolean): Self = StObject.set(x, "spaceSeparatedAbbreviation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpaceSeparatedAbbreviationUndefined: Self = StObject.set(x, "spaceSeparatedAbbreviation", js.undefined)
        
        @scala.inline
        def setSpaceSeparatedCurrency(value: Boolean): Self = StObject.set(x, "spaceSeparatedCurrency", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpaceSeparatedCurrencyUndefined: Self = StObject.set(x, "spaceSeparatedCurrency", js.undefined)
        
        @scala.inline
        def setSpaceSeparatedUndefined: Self = StObject.set(x, "spaceSeparated", js.undefined)
        
        @scala.inline
        def setThousandSeparated(value: Boolean): Self = StObject.set(x, "thousandSeparated", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setThousandSeparatedUndefined: Self = StObject.set(x, "thousandSeparated", js.undefined)
        
        @scala.inline
        def setTotalLength(value: Double): Self = StObject.set(x, "totalLength", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTotalLengthUndefined: Self = StObject.set(x, "totalLength", js.undefined)
        
        @scala.inline
        def setTrimMantissa(value: Boolean): Self = StObject.set(x, "trimMantissa", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTrimMantissaUndefined: Self = StObject.set(x, "trimMantissa", js.undefined)
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
      
      @scala.inline
      def apply(
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
      implicit class NumbroLanguageMutableBuilder[Self <: NumbroLanguage] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAbbreviations(value: Million): Self = StObject.set(x, "abbreviations", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setByteFormat(value: Format): Self = StObject.set(x, "byteFormat", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setByteFormatUndefined: Self = StObject.set(x, "byteFormat", js.undefined)
        
        @scala.inline
        def setCurrency(value: Code): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCurrencyFormat(value: Format): Self = StObject.set(x, "currencyFormat", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCurrencyFormatUndefined: Self = StObject.set(x, "currencyFormat", js.undefined)
        
        @scala.inline
        def setDefaults(value: Format): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
        
        @scala.inline
        def setDelimiters(value: Decimal): Self = StObject.set(x, "delimiters", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormats(value: FourDigits): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLanguageTag(value: String): Self = StObject.set(x, "languageTag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOrdinal(value: Double => String): Self = StObject.set(x, "ordinal", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOrdinalFormat(value: Format): Self = StObject.set(x, "ordinalFormat", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOrdinalFormatUndefined: Self = StObject.set(x, "ordinalFormat", js.undefined)
        
        @scala.inline
        def setPercentageFormat(value: Format): Self = StObject.set(x, "percentageFormat", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPercentageFormatUndefined: Self = StObject.set(x, "percentageFormat", js.undefined)
        
        @scala.inline
        def setSpaceSeparated(value: Boolean): Self = StObject.set(x, "spaceSeparated", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpaceSeparatedUndefined: Self = StObject.set(x, "spaceSeparated", js.undefined)
        
        @scala.inline
        def setTimeDefaults(value: Format): Self = StObject.set(x, "timeDefaults", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimeDefaultsUndefined: Self = StObject.set(x, "timeDefaults", js.undefined)
      }
    }
  }
}
