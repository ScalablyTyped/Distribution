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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojvalidationNumberMod {
  
  @JSImport("@oracle/oraclejet/ojvalidation-number", "IntlNumberConverter")
  @js.native
  open class IntlNumberConverter () extends NumberConverter {
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
    trait ConverterOptions extends StObject {
      
      var currency: js.UndefOr[String] = js.undefined
      
      var currencyDisplay: js.UndefOr[code | symbol | name] = js.undefined
      
      var currencyFormat: js.UndefOr[standard | short | long] = js.undefined
      
      var decimalFormat: js.UndefOr[standard | short | long] = js.undefined
      
      var lenientParse: js.UndefOr[full | none] = js.undefined
      
      var maximumFractionDigits: js.UndefOr[Double] = js.undefined
      
      var minimumFractionDigits: js.UndefOr[Double] = js.undefined
      
      var minimumIntegerDigits: js.UndefOr[Double] = js.undefined
      
      var pattern: js.UndefOr[String] = js.undefined
      
      var roundDuringParse: js.UndefOr[Boolean] = js.undefined
      
      var roundingMode: js.UndefOr[HALF_UP | HALF_DOWN | HALF_EVEN] = js.undefined
      
      var separators: js.UndefOr[Separators] = js.undefined
      
      var style: js.UndefOr[decimal | currency | percent | unit] = js.undefined
      
      var unit: js.UndefOr[byte | bit] = js.undefined
      
      var useGrouping: js.UndefOr[Boolean] = js.undefined
    }
    object ConverterOptions {
      
      inline def apply(): ConverterOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ConverterOptions]
      }
      
      extension [Self <: ConverterOptions](x: Self) {
        
        inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
        
        inline def setCurrencyDisplay(value: code | symbol | name): Self = StObject.set(x, "currencyDisplay", value.asInstanceOf[js.Any])
        
        inline def setCurrencyDisplayUndefined: Self = StObject.set(x, "currencyDisplay", js.undefined)
        
        inline def setCurrencyFormat(value: standard | short | long): Self = StObject.set(x, "currencyFormat", value.asInstanceOf[js.Any])
        
        inline def setCurrencyFormatUndefined: Self = StObject.set(x, "currencyFormat", js.undefined)
        
        inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
        
        inline def setDecimalFormat(value: standard | short | long): Self = StObject.set(x, "decimalFormat", value.asInstanceOf[js.Any])
        
        inline def setDecimalFormatUndefined: Self = StObject.set(x, "decimalFormat", js.undefined)
        
        inline def setLenientParse(value: full | none): Self = StObject.set(x, "lenientParse", value.asInstanceOf[js.Any])
        
        inline def setLenientParseUndefined: Self = StObject.set(x, "lenientParse", js.undefined)
        
        inline def setMaximumFractionDigits(value: Double): Self = StObject.set(x, "maximumFractionDigits", value.asInstanceOf[js.Any])
        
        inline def setMaximumFractionDigitsUndefined: Self = StObject.set(x, "maximumFractionDigits", js.undefined)
        
        inline def setMinimumFractionDigits(value: Double): Self = StObject.set(x, "minimumFractionDigits", value.asInstanceOf[js.Any])
        
        inline def setMinimumFractionDigitsUndefined: Self = StObject.set(x, "minimumFractionDigits", js.undefined)
        
        inline def setMinimumIntegerDigits(value: Double): Self = StObject.set(x, "minimumIntegerDigits", value.asInstanceOf[js.Any])
        
        inline def setMinimumIntegerDigitsUndefined: Self = StObject.set(x, "minimumIntegerDigits", js.undefined)
        
        inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
        
        inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
        
        inline def setRoundDuringParse(value: Boolean): Self = StObject.set(x, "roundDuringParse", value.asInstanceOf[js.Any])
        
        inline def setRoundDuringParseUndefined: Self = StObject.set(x, "roundDuringParse", js.undefined)
        
        inline def setRoundingMode(value: HALF_UP | HALF_DOWN | HALF_EVEN): Self = StObject.set(x, "roundingMode", value.asInstanceOf[js.Any])
        
        inline def setRoundingModeUndefined: Self = StObject.set(x, "roundingMode", js.undefined)
        
        inline def setSeparators(value: Separators): Self = StObject.set(x, "separators", value.asInstanceOf[js.Any])
        
        inline def setSeparatorsUndefined: Self = StObject.set(x, "separators", js.undefined)
        
        inline def setStyle(value: decimal | currency | percent | unit): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
        
        inline def setUnit(value: byte | bit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
        
        inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
        
        inline def setUseGrouping(value: Boolean): Self = StObject.set(x, "useGrouping", value.asInstanceOf[js.Any])
        
        inline def setUseGroupingUndefined: Self = StObject.set(x, "useGrouping", js.undefined)
      }
    }
    
    // tslint:disable-next-line interface-over-type-literal
    trait Separators extends StObject {
      
      var decimal: js.UndefOr[String] = js.undefined
      
      var group: js.UndefOr[String] = js.undefined
    }
    object Separators {
      
      inline def apply(): Separators = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Separators]
      }
      
      extension [Self <: Separators](x: Self) {
        
        inline def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
        
        inline def setDecimalUndefined: Self = StObject.set(x, "decimal", js.undefined)
        
        inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
        
        inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      }
    }
  }
  
  @JSImport("@oracle/oraclejet/ojvalidation-number", "NumberConverter")
  @js.native
  open class NumberConverter ()
    extends StObject
       with Converter[Double] {
    
    /* CompleteClass */
    override def format(value: Double): String | Null = js.native
    
    /* CompleteClass */
    override def parse(value: String): Double | Null = js.native
  }
  
  @JSImport("@oracle/oraclejet/ojvalidation-number", "NumberRangeValidator")
  @js.native
  open class NumberRangeValidator ()
    extends StObject
       with Validator[String | Double] {
    def this(options: ValidatorOptions) = this()
    
    @JSName("getHint")
    def getHint_MNumberRangeValidator(): String | Null = js.native
    
    /* CompleteClass */
    override def validate(value: String | Double): Unit = js.native
    def validate(value: String): Unit = js.native
    def validate(value: Double): Unit = js.native
  }
  object NumberRangeValidator {
    
    // tslint:disable-next-line interface-over-type-literal
    trait ValidatorOptions extends StObject {
      
      var converter: js.UndefOr[NumberConverter] = js.undefined
      
      var hint: js.UndefOr[Max] = js.undefined
      
      var max: js.UndefOr[Double] = js.undefined
      
      var messageDetail: js.UndefOr[ExactRangeOverflow] = js.undefined
      
      var messageSummary: js.UndefOr[RangeOverflowRangeUnderflow] = js.undefined
      
      var min: js.UndefOr[Double] = js.undefined
    }
    object ValidatorOptions {
      
      inline def apply(): ValidatorOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ValidatorOptions]
      }
      
      extension [Self <: ValidatorOptions](x: Self) {
        
        inline def setConverter(value: NumberConverter): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
        
        inline def setConverterUndefined: Self = StObject.set(x, "converter", js.undefined)
        
        inline def setHint(value: Max): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
        
        inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
        
        inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
        
        inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
        
        inline def setMessageDetail(value: ExactRangeOverflow): Self = StObject.set(x, "messageDetail", value.asInstanceOf[js.Any])
        
        inline def setMessageDetailUndefined: Self = StObject.set(x, "messageDetail", js.undefined)
        
        inline def setMessageSummary(value: RangeOverflowRangeUnderflow): Self = StObject.set(x, "messageSummary", value.asInstanceOf[js.Any])
        
        inline def setMessageSummaryUndefined: Self = StObject.set(x, "messageSummary", js.undefined)
        
        inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
        
        inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
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
