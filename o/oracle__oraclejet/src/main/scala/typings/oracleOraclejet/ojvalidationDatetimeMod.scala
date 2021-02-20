package typings.oracleOraclejet

import typings.oracleOraclejet.anon.DateField
import typings.oracleOraclejet.anon.Min
import typings.oracleOraclejet.anon.RangeOverflowRangeUnderflow
import typings.oracleOraclejet.ojvalidationBaseMod.Converter
import typings.oracleOraclejet.ojvalidationBaseMod.Validator
import typings.oracleOraclejet.ojvalidationDatetimeMod.DateRestrictionValidator.ValidatorOptions
import typings.oracleOraclejet.ojvalidationDatetimeMod.IntlDateTimeConverter.ConverterOptions
import typings.oracleOraclejet.oracleOraclejetStrings.`2-digit`
import typings.oracleOraclejet.oracleOraclejetStrings.all
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.date
import typings.oracleOraclejet.oracleOraclejetStrings.datetime
import typings.oracleOraclejet.oracleOraclejetStrings.full
import typings.oracleOraclejet.oracleOraclejetStrings.local
import typings.oracleOraclejet.oracleOraclejetStrings.long
import typings.oracleOraclejet.oracleOraclejetStrings.medium
import typings.oracleOraclejet.oracleOraclejetStrings.narrow
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.numeric
import typings.oracleOraclejet.oracleOraclejetStrings.offset
import typings.oracleOraclejet.oracleOraclejetStrings.short
import typings.oracleOraclejet.oracleOraclejetStrings.time
import typings.oracleOraclejet.oracleOraclejetStrings.zulu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojvalidationDatetimeMod {
  
  @JSImport("@oracle/oraclejet/ojvalidation-datetime", "DateRestrictionValidator")
  @js.native
  class DateRestrictionValidator () extends Validator[String] {
    def this(options: ValidatorOptions) = this()
    
    @JSName("getHint")
    def getHint_MDateRestrictionValidator(): String | Null = js.native
  }
  object DateRestrictionValidator {
    
    // tslint:disable-next-line interface-over-type-literal
    @js.native
    trait DayFormatterInput extends StObject {
      
      var date: Double = js.native
      
      var fullYear: Double = js.native
      
      var month: Double = js.native
    }
    object DayFormatterInput {
      
      @scala.inline
      def apply(date: Double, fullYear: Double, month: Double): DayFormatterInput = {
        val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], fullYear = fullYear.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any])
        __obj.asInstanceOf[DayFormatterInput]
      }
      
      @scala.inline
      implicit class DayFormatterInputMutableBuilder[Self <: DayFormatterInput] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFullYear(value: Double): Self = StObject.set(x, "fullYear", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      }
    }
    
    // tslint:disable-next-line interface-over-type-literal
    @js.native
    trait DayFormatterOutput extends StObject {
      
      var className: js.UndefOr[String] = js.native
      
      var disabled: js.UndefOr[Boolean] = js.native
      
      var tooltip: js.UndefOr[String] = js.native
    }
    object DayFormatterOutput {
      
      @scala.inline
      def apply(): DayFormatterOutput = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DayFormatterOutput]
      }
      
      @scala.inline
      implicit class DayFormatterOutputMutableBuilder[Self <: DayFormatterOutput] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        @scala.inline
        def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
        
        @scala.inline
        def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      }
    }
    
    // tslint:disable-next-line interface-over-type-literal
    @js.native
    trait ValidatorOptions extends StObject {
      
      var dayFormatter: js.UndefOr[js.Function1[/* param0 */ DayFormatterInput, DayFormatterOutput | Null | all]] = js.native
      
      var messageDetail: js.UndefOr[String] = js.native
      
      var messageSummary: js.UndefOr[String] = js.native
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
        def setDayFormatter(value: /* param0 */ DayFormatterInput => DayFormatterOutput | Null | all): Self = StObject.set(x, "dayFormatter", js.Any.fromFunction1(value))
        
        @scala.inline
        def setDayFormatterUndefined: Self = StObject.set(x, "dayFormatter", js.undefined)
        
        @scala.inline
        def setMessageDetail(value: String): Self = StObject.set(x, "messageDetail", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMessageDetailUndefined: Self = StObject.set(x, "messageDetail", js.undefined)
        
        @scala.inline
        def setMessageSummary(value: String): Self = StObject.set(x, "messageSummary", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMessageSummaryUndefined: Self = StObject.set(x, "messageSummary", js.undefined)
      }
    }
  }
  
  @JSImport("@oracle/oraclejet/ojvalidation-datetime", "DateTimeConverter")
  @js.native
  abstract class DateTimeConverter () extends Converter[String] {
    
    def calculateWeek(value: String): js.UndefOr[Double] = js.native
    
    def compareISODates(isoStr: String, isoStr2: String): Double = js.native
    
    def getAvailableTimeZones(): js.Array[_] = js.native
    
    def isDayNameSet(): Boolean = js.native
    
    def isDaySet(): Boolean = js.native
    
    def isHourInAMPMSet(): Boolean = js.native
    
    def isHourInDaySet(): Boolean = js.native
    
    def isMilliSecondSet(): Boolean = js.native
    
    def isMinuteSet(): Boolean = js.native
    
    def isMonthSet(): Boolean = js.native
    
    def isSecondSet(): Boolean = js.native
    
    def isYearSet(): Boolean = js.native
  }
  
  @JSImport("@oracle/oraclejet/ojvalidation-datetime", "DateTimeRangeValidator")
  @js.native
  class DateTimeRangeValidator () extends Validator[String] {
    def this(options: typings.oracleOraclejet.ojvalidationDatetimeMod.DateTimeRangeValidator.ValidatorOptions) = this()
    
    @JSName("getHint")
    def getHint_MDateTimeRangeValidator(): String | Null = js.native
  }
  object DateTimeRangeValidator {
    
    // tslint:disable-next-line interface-over-type-literal
    @js.native
    trait ValidatorOptions extends StObject {
      
      var converter: DateTimeConverter = js.native
      
      var hint: js.UndefOr[Min] = js.native
      
      var max: js.UndefOr[String] = js.native
      
      var messageDetail: js.UndefOr[RangeOverflowRangeUnderflow] = js.native
      
      var messageSummary: js.UndefOr[RangeOverflowRangeUnderflow] = js.native
      
      var min: js.UndefOr[String] = js.native
      
      var translationKey: js.UndefOr[String] = js.native
    }
    object ValidatorOptions {
      
      @scala.inline
      def apply(converter: DateTimeConverter): typings.oracleOraclejet.ojvalidationDatetimeMod.DateTimeRangeValidator.ValidatorOptions = {
        val __obj = js.Dynamic.literal(converter = converter.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.oracleOraclejet.ojvalidationDatetimeMod.DateTimeRangeValidator.ValidatorOptions]
      }
      
      @scala.inline
      implicit class ValidatorOptionsMutableBuilder[Self <: typings.oracleOraclejet.ojvalidationDatetimeMod.DateTimeRangeValidator.ValidatorOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConverter(value: DateTimeConverter): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHint(value: Min): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
        
        @scala.inline
        def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
        
        @scala.inline
        def setMessageDetail(value: RangeOverflowRangeUnderflow): Self = StObject.set(x, "messageDetail", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMessageDetailUndefined: Self = StObject.set(x, "messageDetail", js.undefined)
        
        @scala.inline
        def setMessageSummary(value: RangeOverflowRangeUnderflow): Self = StObject.set(x, "messageSummary", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMessageSummaryUndefined: Self = StObject.set(x, "messageSummary", js.undefined)
        
        @scala.inline
        def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
        
        @scala.inline
        def setTranslationKey(value: String): Self = StObject.set(x, "translationKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTranslationKeyUndefined: Self = StObject.set(x, "translationKey", js.undefined)
      }
    }
  }
  
  @JSImport("@oracle/oraclejet/ojvalidation-datetime", "IntlDateTimeConverter")
  @js.native
  class IntlDateTimeConverter () extends DateTimeConverter {
    def this(options: ConverterOptions) = this()
    
    def formatRelative(value: String): String | Null = js.native
    def formatRelative(value: String, relativeOptions: DateField): String | Null = js.native
    
    @JSName("getHint")
    def getHint_MIntlDateTimeConverter(): Null = js.native
    
    @JSName("getOptions")
    def getOptions_MIntlDateTimeConverter(): ConverterOptions = js.native
    
    @JSName("resolvedOptions")
    def resolvedOptions_MIntlDateTimeConverter(): ConverterOptions = js.native
  }
  object IntlDateTimeConverter {
    
    // tslint:disable-next-line interface-over-type-literal
    @js.native
    trait ConverterOptions extends StObject {
      
      var dateFormat: js.UndefOr[short | medium | long | full] = js.native
      
      var day: js.UndefOr[`2-digit` | numeric] = js.native
      
      var dst: js.UndefOr[Boolean] = js.native
      
      var era: js.UndefOr[narrow | short | long] = js.native
      
      var formatType: js.UndefOr[date | time | datetime] = js.native
      
      var hour: js.UndefOr[`2-digit` | numeric] = js.native
      
      var hour12: js.UndefOr[Boolean] = js.native
      
      var isoStrFormat: js.UndefOr[offset | zulu | local | auto] = js.native
      
      var lenientParse: js.UndefOr[full | none] = js.native
      
      var millisecond: js.UndefOr[numeric] = js.native
      
      var minute: js.UndefOr[`2-digit` | numeric] = js.native
      
      var month: js.UndefOr[`2-digit` | numeric | narrow | short | long] = js.native
      
      var pattern: js.UndefOr[String] = js.native
      
      var second: js.UndefOr[`2-digit` | numeric] = js.native
      
      var timeFormat: js.UndefOr[short | medium | long | full] = js.native
      
      var timeZone: js.UndefOr[String] = js.native
      
      var timeZoneName: js.UndefOr[short | long] = js.native
      
      var `two-digit-year-start`: js.UndefOr[Double] = js.native
      
      var weekday: js.UndefOr[narrow | short | long] = js.native
      
      var year: js.UndefOr[`2-digit` | numeric] = js.native
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
        def setDateFormat(value: short | medium | long | full): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
        
        @scala.inline
        def setDay(value: `2-digit` | numeric): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
        
        @scala.inline
        def setDst(value: Boolean): Self = StObject.set(x, "dst", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDstUndefined: Self = StObject.set(x, "dst", js.undefined)
        
        @scala.inline
        def setEra(value: narrow | short | long): Self = StObject.set(x, "era", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEraUndefined: Self = StObject.set(x, "era", js.undefined)
        
        @scala.inline
        def setFormatType(value: date | time | datetime): Self = StObject.set(x, "formatType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormatTypeUndefined: Self = StObject.set(x, "formatType", js.undefined)
        
        @scala.inline
        def setHour(value: `2-digit` | numeric): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHour12(value: Boolean): Self = StObject.set(x, "hour12", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHour12Undefined: Self = StObject.set(x, "hour12", js.undefined)
        
        @scala.inline
        def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
        
        @scala.inline
        def setIsoStrFormat(value: offset | zulu | local | auto): Self = StObject.set(x, "isoStrFormat", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsoStrFormatUndefined: Self = StObject.set(x, "isoStrFormat", js.undefined)
        
        @scala.inline
        def setLenientParse(value: full | none): Self = StObject.set(x, "lenientParse", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLenientParseUndefined: Self = StObject.set(x, "lenientParse", js.undefined)
        
        @scala.inline
        def setMillisecond(value: numeric): Self = StObject.set(x, "millisecond", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMillisecondUndefined: Self = StObject.set(x, "millisecond", js.undefined)
        
        @scala.inline
        def setMinute(value: `2-digit` | numeric): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
        
        @scala.inline
        def setMonth(value: `2-digit` | numeric | narrow | short | long): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
        
        @scala.inline
        def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
        
        @scala.inline
        def setSecond(value: `2-digit` | numeric): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
        
        @scala.inline
        def setTimeFormat(value: short | medium | long | full): Self = StObject.set(x, "timeFormat", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimeFormatUndefined: Self = StObject.set(x, "timeFormat", js.undefined)
        
        @scala.inline
        def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimeZoneName(value: short | long): Self = StObject.set(x, "timeZoneName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimeZoneNameUndefined: Self = StObject.set(x, "timeZoneName", js.undefined)
        
        @scala.inline
        def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
        
        @scala.inline
        def `setTwo-digit-year-start`(value: Double): Self = StObject.set(x, "two-digit-year-start", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setTwo-digit-year-startUndefined`: Self = StObject.set(x, "two-digit-year-start", js.undefined)
        
        @scala.inline
        def setWeekday(value: narrow | short | long): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWeekdayUndefined: Self = StObject.set(x, "weekday", js.undefined)
        
        @scala.inline
        def setYear(value: `2-digit` | numeric): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
      }
    }
  }
  
  @js.native
  trait DateRestrictionValidatorFactory extends StObject {
    
    def createValidator(): DateRestrictionValidator = js.native
    def createValidator(options: ValidatorOptions): DateRestrictionValidator = js.native
  }
  
  @js.native
  trait DateTimeConverterFactory extends StObject {
    
    def createConverter(): IntlDateTimeConverter = js.native
    def createConverter(options: ConverterOptions): IntlDateTimeConverter = js.native
  }
  
  @js.native
  trait DateTimeRangeValidatorFactory extends StObject {
    
    def createValidator(): DateTimeRangeValidator = js.native
    def createValidator(options: typings.oracleOraclejet.ojvalidationDatetimeMod.DateTimeRangeValidator.ValidatorOptions): DateTimeRangeValidator = js.native
  }
}
