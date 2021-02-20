package typings.oracleOraclejet

import typings.oracleOraclejet.anon.ExactRangeOverflow
import typings.oracleOraclejet.anon.Max
import typings.oracleOraclejet.anon.RangeOverflowRangeUnderflow
import typings.oracleOraclejet.ojvalidationBaseMod.Converter
import typings.oracleOraclejet.ojvalidationBaseMod.Validator
import typings.oracleOraclejet.ojvalidationNumberMod.IntlNumberConverter.ConverterOptions
import typings.oracleOraclejet.ojvalidationNumberMod.NumberRangeValidator.ValidatorOptions
import typings.oracleOraclejet.oracleOraclejetStrings.HALF_DOWN
import typings.oracleOraclejet.oracleOraclejetStrings.HALF_EVEN
import typings.oracleOraclejet.oracleOraclejetStrings.HALF_UP
import typings.oracleOraclejet.oracleOraclejetStrings.bit
import typings.oracleOraclejet.oracleOraclejetStrings.byte
import typings.oracleOraclejet.oracleOraclejetStrings.code
import typings.oracleOraclejet.oracleOraclejetStrings.currency
import typings.oracleOraclejet.oracleOraclejetStrings.decimal
import typings.oracleOraclejet.oracleOraclejetStrings.full
import typings.oracleOraclejet.oracleOraclejetStrings.long
import typings.oracleOraclejet.oracleOraclejetStrings.name
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.percent
import typings.oracleOraclejet.oracleOraclejetStrings.short
import typings.oracleOraclejet.oracleOraclejetStrings.standard
import typings.oracleOraclejet.oracleOraclejetStrings.symbol
import typings.oracleOraclejet.oracleOraclejetStrings.unit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojvalidationNumberMod {
  
  @JSImport("@oracle/oraclejet/ojvalidation-number", "IntlNumberConverter")
  @js.native
  class IntlNumberConverter () extends NumberConverter {
    def this(options: ConverterOptions) = this()
    
    @JSName("getHint")
    def getHint_MIntlNumberConverter(): Null = js.native
    
    @JSName("getOptions")
    def getOptions_MIntlNumberConverter(): ConverterOptions = js.native
    
    @JSName("resolvedOptions")
    def resolvedOptions_MIntlNumberConverter(): ConverterOptions = js.native
  }
  object IntlNumberConverter {
    
    // tslint:disable-next-line interface-over-type-literal
    @js.native
    trait ConverterOptions extends StObject {
      
      var currency: js.UndefOr[String] = js.native
      
      var currencyDisplay: js.UndefOr[code | symbol | name] = js.native
      
      var currencyFormat: js.UndefOr[standard | short | long] = js.native
      
      var decimalFormat: js.UndefOr[standard | short | long] = js.native
      
      var lenientParse: js.UndefOr[full | none] = js.native
      
      var maximumFractionDigits: js.UndefOr[Double] = js.native
      
      var minimumFractionDigits: js.UndefOr[Double] = js.native
      
      var minimumIntegerDigits: js.UndefOr[Double] = js.native
      
      var pattern: js.UndefOr[String] = js.native
      
      var roundDuringParse: js.UndefOr[Boolean] = js.native
      
      var roundingMode: js.UndefOr[HALF_UP | HALF_DOWN | HALF_EVEN] = js.native
      
      var separators: js.UndefOr[Separators] = js.native
      
      var style: js.UndefOr[decimal | currency | percent | unit] = js.native
      
      var unit: js.UndefOr[byte | bit] = js.native
      
      var useGrouping: js.UndefOr[Boolean] = js.native
    }
    object ConverterOptions {
      
      @scala.inline
      def apply(): ConverterOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ConverterOptions]
      }
      
      @scala.inline
      implicit class ConverterOptionsMutableBuilder[Self <: ConverterOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCurrencyDisplay(value: code | symbol | name): Self = StObject.set(x, "currencyDisplay", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCurrencyDisplayUndefined: Self = StObject.set(x, "currencyDisplay", js.undefined)
        
        @scala.inline
        def setCurrencyFormat(value: standard | short | long): Self = StObject.set(x, "currencyFormat", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCurrencyFormatUndefined: Self = StObject.set(x, "currencyFormat", js.undefined)
        
        @scala.inline
        def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
        
        @scala.inline
        def setDecimalFormat(value: standard | short | long): Self = StObject.set(x, "decimalFormat", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDecimalFormatUndefined: Self = StObject.set(x, "decimalFormat", js.undefined)
        
        @scala.inline
        def setLenientParse(value: full | none): Self = StObject.set(x, "lenientParse", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLenientParseUndefined: Self = StObject.set(x, "lenientParse", js.undefined)
        
        @scala.inline
        def setMaximumFractionDigits(value: Double): Self = StObject.set(x, "maximumFractionDigits", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaximumFractionDigitsUndefined: Self = StObject.set(x, "maximumFractionDigits", js.undefined)
        
        @scala.inline
        def setMinimumFractionDigits(value: Double): Self = StObject.set(x, "minimumFractionDigits", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinimumFractionDigitsUndefined: Self = StObject.set(x, "minimumFractionDigits", js.undefined)
        
        @scala.inline
        def setMinimumIntegerDigits(value: Double): Self = StObject.set(x, "minimumIntegerDigits", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinimumIntegerDigitsUndefined: Self = StObject.set(x, "minimumIntegerDigits", js.undefined)
        
        @scala.inline
        def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
        
        @scala.inline
        def setRoundDuringParse(value: Boolean): Self = StObject.set(x, "roundDuringParse", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRoundDuringParseUndefined: Self = StObject.set(x, "roundDuringParse", js.undefined)
        
        @scala.inline
        def setRoundingMode(value: HALF_UP | HALF_DOWN | HALF_EVEN): Self = StObject.set(x, "roundingMode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRoundingModeUndefined: Self = StObject.set(x, "roundingMode", js.undefined)
        
        @scala.inline
        def setSeparators(value: Separators): Self = StObject.set(x, "separators", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSeparatorsUndefined: Self = StObject.set(x, "separators", js.undefined)
        
        @scala.inline
        def setStyle(value: decimal | currency | percent | unit): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
        
        @scala.inline
        def setUnit(value: byte | bit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
        
        @scala.inline
        def setUseGrouping(value: Boolean): Self = StObject.set(x, "useGrouping", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUseGroupingUndefined: Self = StObject.set(x, "useGrouping", js.undefined)
      }
    }
    
    // tslint:disable-next-line interface-over-type-literal
    @js.native
    trait Separators extends StObject {
      
      var decimal: js.UndefOr[String] = js.native
      
      var group: js.UndefOr[String] = js.native
    }
    object Separators {
      
      @scala.inline
      def apply(): Separators = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Separators]
      }
      
      @scala.inline
      implicit class SeparatorsMutableBuilder[Self <: Separators] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDecimalUndefined: Self = StObject.set(x, "decimal", js.undefined)
        
        @scala.inline
        def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      }
    }
  }
  
  @JSImport("@oracle/oraclejet/ojvalidation-number", "NumberConverter")
  @js.native
  class NumberConverter () extends Converter[Double]
  
  @JSImport("@oracle/oraclejet/ojvalidation-number", "NumberRangeValidator")
  @js.native
  class NumberRangeValidator () extends Validator[String | Double] {
    def this(options: ValidatorOptions) = this()
    
    @JSName("getHint")
    def getHint_MNumberRangeValidator(): String | Null = js.native
    
    def validate(value: String): Unit = js.native
    def validate(value: Double): Unit = js.native
  }
  object NumberRangeValidator {
    
    // tslint:disable-next-line interface-over-type-literal
    @js.native
    trait ValidatorOptions extends StObject {
      
      var converter: js.UndefOr[NumberConverter] = js.native
      
      var hint: js.UndefOr[Max] = js.native
      
      var max: js.UndefOr[Double] = js.native
      
      var messageDetail: js.UndefOr[ExactRangeOverflow] = js.native
      
      var messageSummary: js.UndefOr[RangeOverflowRangeUnderflow] = js.native
      
      var min: js.UndefOr[Double] = js.native
    }
    object ValidatorOptions {
      
      @scala.inline
      def apply(): ValidatorOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ValidatorOptions]
      }
      
      @scala.inline
      implicit class ValidatorOptionsMutableBuilder[Self <: ValidatorOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConverter(value: NumberConverter): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConverterUndefined: Self = StObject.set(x, "converter", js.undefined)
        
        @scala.inline
        def setHint(value: Max): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
        
        @scala.inline
        def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
        
        @scala.inline
        def setMessageDetail(value: ExactRangeOverflow): Self = StObject.set(x, "messageDetail", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMessageDetailUndefined: Self = StObject.set(x, "messageDetail", js.undefined)
        
        @scala.inline
        def setMessageSummary(value: RangeOverflowRangeUnderflow): Self = StObject.set(x, "messageSummary", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMessageSummaryUndefined: Self = StObject.set(x, "messageSummary", js.undefined)
        
        @scala.inline
        def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      }
    }
  }
  
  @js.native
  trait NumberConverterFactory extends StObject {
    
    def createConverter(): IntlNumberConverter = js.native
    def createConverter(options: ConverterOptions): IntlNumberConverter = js.native
  }
  
  @js.native
  trait NumberRangeValidatorFactory extends StObject {
    
    def createValidator(): NumberRangeValidator = js.native
    def createValidator(options: ValidatorOptions): NumberRangeValidator = js.native
  }
}
