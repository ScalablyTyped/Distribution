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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("numbro", JSImport.Default)
    @js.native
    def apply(): Numbro = js.native
    @JSImport("numbro", JSImport.Default)
    @js.native
    def apply(value: js.Any): Numbro = js.native
    
    @JSImport("numbro", "default.defaultCurrencyFormat")
    @js.native
    def defaultCurrencyFormat(newFormat: String): js.Object = js.native
    
    @JSImport("numbro", "default.defaultFormat")
    @js.native
    def defaultFormat(): js.Object = js.native
    
    @JSImport("numbro", "default.isNumbro")
    @js.native
    def isNumbro(value: js.Any): /* is numbro.numbro.numbro.Numbro */ Boolean = js.native
    
    @JSImport("numbro", "default.language")
    @js.native
    def language(): String = js.native
    
    @JSImport("numbro", "default.languageData")
    @js.native
    def languageData(): NumbroLanguage = js.native
    @JSImport("numbro", "default.languageData")
    @js.native
    def languageData(tag: String): NumbroLanguage = js.native
    
    @JSImport("numbro", "default.languages")
    @js.native
    def languages(): StringDictionary[NumbroLanguage] = js.native
    
    @JSImport("numbro", "default.loadLanguagesInNode")
    @js.native
    def loadLanguagesInNode(): Unit = js.native
    
    @JSImport("numbro", "default.registerLanguage")
    @js.native
    def registerLanguage(tag: NumbroLanguage): String = js.native
    @JSImport("numbro", "default.registerLanguage")
    @js.native
    def registerLanguage(tag: NumbroLanguage, useLanguage: Boolean): String = js.native
    
    @JSImport("numbro", "default.setDefaults")
    @js.native
    def setDefaults(format: String): Unit = js.native
    @JSImport("numbro", "default.setDefaults")
    @js.native
    def setDefaults(format: Format): Unit = js.native
    
    @JSImport("numbro", "default.setLanguage")
    @js.native
    def setLanguage(tag: String): Unit = js.native
    @JSImport("numbro", "default.setLanguage")
    @js.native
    def setLanguage(tag: String, fallbackTag: String): Unit = js.native
    
    @JSImport("numbro", "default.unformat")
    @js.native
    def unformat(input: String): Double = js.native
    @JSImport("numbro", "default.unformat")
    @js.native
    def unformat(input: String, format: String): Double = js.native
    @JSImport("numbro", "default.unformat")
    @js.native
    def unformat(input: String, format: Format): Double = js.native
    
    @JSImport("numbro", "default.validate")
    @js.native
    def validate(value: String, format: String): Boolean = js.native
    @JSImport("numbro", "default.validate")
    @js.native
    def validate(value: String, format: Format): Boolean = js.native
    
    @JSImport("numbro", "default.version")
    @js.native
    val version: String = js.native
    
    @JSImport("numbro", "default.zeroFormat")
    @js.native
    def zeroFormat(newFormat: String): Unit = js.native
  }
  
  object numbro {
    
    @js.native
    trait Format extends StObject {
      
      var abbreviations: js.UndefOr[Billion] = js.native
      
      var average: js.UndefOr[Boolean] = js.native
      
      var base: js.UndefOr[decimal | binary | general] = js.native
      
      var characteristic: js.UndefOr[Double] = js.native
      
      var currencyPosition: js.UndefOr[prefix | infix | postfix] = js.native
      
      var currencySymbol: js.UndefOr[String] = js.native
      
      var exponential: js.UndefOr[Boolean] = js.native
      
      var forceAverage: js.UndefOr[trillion | billion | million | thousand] = js.native
      
      var forceSign: js.UndefOr[Boolean] = js.native
      
      var mantissa: js.UndefOr[Double] = js.native
      
      var negative: js.UndefOr[sign | parenthesis] = js.native
      
      var optionalCharacteristic: js.UndefOr[Boolean] = js.native
      
      var optionalMantissa: js.UndefOr[Boolean] = js.native
      
      var output: js.UndefOr[currency | percent | byte | time | ordinal | number] = js.native
      
      var postfix: js.UndefOr[String] = js.native
      
      var prefix: js.UndefOr[String] = js.native
      
      var prefixSymbol: js.UndefOr[Boolean] = js.native
      
      var roundingFunction: js.UndefOr[js.Function1[/* num */ Double, Double]] = js.native
      
      var spaceSeparated: js.UndefOr[Boolean] = js.native
      
      var spaceSeparatedAbbreviation: js.UndefOr[Boolean] = js.native
      
      var spaceSeparatedCurrency: js.UndefOr[Boolean] = js.native
      
      var thousandSeparated: js.UndefOr[Boolean] = js.native
      
      var totalLength: js.UndefOr[Double] = js.native
      
      var trimMantissa: js.UndefOr[Boolean] = js.native
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
    
    @js.native
    trait NumbroLanguage extends StObject {
      
      var abbreviations: Million = js.native
      
      var byteFormat: js.UndefOr[Format] = js.native
      
      var currency: Code = js.native
      
      var currencyFormat: js.UndefOr[Format] = js.native
      
      var defaults: js.UndefOr[Format] = js.native
      
      var delimiters: Decimal = js.native
      
      var formats: FourDigits = js.native
      
      var languageTag: String = js.native
      
      def ordinal(num: Double): String = js.native
      
      var ordinalFormat: js.UndefOr[Format] = js.native
      
      var percentageFormat: js.UndefOr[Format] = js.native
      
      var spaceSeparated: js.UndefOr[Boolean] = js.native
      
      var timeDefaults: js.UndefOr[Format] = js.native
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
