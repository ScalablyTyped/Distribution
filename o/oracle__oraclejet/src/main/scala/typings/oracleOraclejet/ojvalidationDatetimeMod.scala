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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojvalidationDatetimeMod {
  
  @JSImport("@oracle/oraclejet/ojvalidation-datetime", "DateRestrictionValidator")
  @js.native
  class DateRestrictionValidator ()
    extends StObject
       with Validator[String] {
    def this(options: ValidatorOptions) = this()
    
    @JSName("getHint")
    def getHint_MDateRestrictionValidator(): String | Null = js.native
    
    /* CompleteClass */
    override def validate(value: String): Unit = js.native
  }
  object DateRestrictionValidator {
    
    // tslint:disable-next-line interface-over-type-literal
    trait DayFormatterInput extends StObject {
      
      var date: Double
      
      var fullYear: Double
      
      var month: Double
    }
    object DayFormatterInput {
      
      inline def apply(date: Double, fullYear: Double, month: Double): DayFormatterInput = {
        val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], fullYear = fullYear.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any])
        __obj.asInstanceOf[DayFormatterInput]
      }
      
      extension [Self <: DayFormatterInput](x: Self) {
        
        inline def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
        
        inline def setFullYear(value: Double): Self = StObject.set(x, "fullYear", value.asInstanceOf[js.Any])
        
        inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      }
    }
    
    // tslint:disable-next-line interface-over-type-literal
    trait DayFormatterOutput extends StObject {
      
      var className: js.UndefOr[String] = js.undefined
      
      var disabled: js.UndefOr[Boolean] = js.undefined
      
      var tooltip: js.UndefOr[String] = js.undefined
    }
    object DayFormatterOutput {
      
      inline def apply(): DayFormatterOutput = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DayFormatterOutput]
      }
      
      extension [Self <: DayFormatterOutput](x: Self) {
        
        inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
        
        inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
        
        inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
        
        inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      }
    }
    
    // tslint:disable-next-line interface-over-type-literal
    trait ValidatorOptions extends StObject {
      
      var dayFormatter: js.UndefOr[js.Function1[/* param0 */ DayFormatterInput, DayFormatterOutput | Null | all]] = js.undefined
      
      var messageDetail: js.UndefOr[String] = js.undefined
      
      var messageSummary: js.UndefOr[String] = js.undefined
    }
    object ValidatorOptions {
      
      inline def apply(): ValidatorOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ValidatorOptions]
      }
      
      extension [Self <: ValidatorOptions](x: Self) {
        
        inline def setDayFormatter(value: /* param0 */ DayFormatterInput => DayFormatterOutput | Null | all): Self = StObject.set(x, "dayFormatter", js.Any.fromFunction1(value))
        
        inline def setDayFormatterUndefined: Self = StObject.set(x, "dayFormatter", js.undefined)
        
        inline def setMessageDetail(value: String): Self = StObject.set(x, "messageDetail", value.asInstanceOf[js.Any])
        
        inline def setMessageDetailUndefined: Self = StObject.set(x, "messageDetail", js.undefined)
        
        inline def setMessageSummary(value: String): Self = StObject.set(x, "messageSummary", value.asInstanceOf[js.Any])
        
        inline def setMessageSummaryUndefined: Self = StObject.set(x, "messageSummary", js.undefined)
      }
    }
  }
  
  @JSImport("@oracle/oraclejet/ojvalidation-datetime", "DateTimeConverter")
  @js.native
  abstract class DateTimeConverter ()
    extends StObject
       with Converter[String] {
    
    def calculateWeek(value: String): js.UndefOr[Double] = js.native
    
    def compareISODates(isoStr: String, isoStr2: String): Double = js.native
    
    /* CompleteClass */
    override def format(value: String): String | Null = js.native
    
    def getAvailableTimeZones(): js.Array[js.Any] = js.native
    
    def isDayNameSet(): Boolean = js.native
    
    def isDaySet(): Boolean = js.native
    
    def isHourInAMPMSet(): Boolean = js.native
    
    def isHourInDaySet(): Boolean = js.native
    
    def isMilliSecondSet(): Boolean = js.native
    
    def isMinuteSet(): Boolean = js.native
    
    def isMonthSet(): Boolean = js.native
    
    def isSecondSet(): Boolean = js.native
    
    def isYearSet(): Boolean = js.native
    
    /* CompleteClass */
    override def parse(value: String): String | Null = js.native
  }
  
  @JSImport("@oracle/oraclejet/ojvalidation-datetime", "DateTimeRangeValidator")
  @js.native
  class DateTimeRangeValidator ()
    extends StObject
       with Validator[String] {
    def this(options: typings.oracleOraclejet.ojvalidationDatetimeMod.DateTimeRangeValidator.ValidatorOptions) = this()
    
    @JSName("getHint")
    def getHint_MDateTimeRangeValidator(): String | Null = js.native
    
    /* CompleteClass */
    override def validate(value: String): Unit = js.native
  }
  object DateTimeRangeValidator {
    
    // tslint:disable-next-line interface-over-type-literal
    trait ValidatorOptions extends StObject {
      
      var converter: DateTimeConverter
      
      var hint: js.UndefOr[Min] = js.undefined
      
      var max: js.UndefOr[String] = js.undefined
      
      var messageDetail: js.UndefOr[RangeOverflowRangeUnderflow] = js.undefined
      
      var messageSummary: js.UndefOr[RangeOverflowRangeUnderflow] = js.undefined
      
      var min: js.UndefOr[String] = js.undefined
      
      var translationKey: js.UndefOr[String] = js.undefined
    }
    object ValidatorOptions {
      
      inline def apply(converter: DateTimeConverter): typings.oracleOraclejet.ojvalidationDatetimeMod.DateTimeRangeValidator.ValidatorOptions = {
        val __obj = js.Dynamic.literal(converter = converter.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.oracleOraclejet.ojvalidationDatetimeMod.DateTimeRangeValidator.ValidatorOptions]
      }
      
      extension [Self <: typings.oracleOraclejet.ojvalidationDatetimeMod.DateTimeRangeValidator.ValidatorOptions](x: Self) {
        
        inline def setConverter(value: DateTimeConverter): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
        
        inline def setHint(value: Min): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
        
        inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
        
        inline def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
        
        inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
        
        inline def setMessageDetail(value: RangeOverflowRangeUnderflow): Self = StObject.set(x, "messageDetail", value.asInstanceOf[js.Any])
        
        inline def setMessageDetailUndefined: Self = StObject.set(x, "messageDetail", js.undefined)
        
        inline def setMessageSummary(value: RangeOverflowRangeUnderflow): Self = StObject.set(x, "messageSummary", value.asInstanceOf[js.Any])
        
        inline def setMessageSummaryUndefined: Self = StObject.set(x, "messageSummary", js.undefined)
        
        inline def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
        
        inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
        
        inline def setTranslationKey(value: String): Self = StObject.set(x, "translationKey", value.asInstanceOf[js.Any])
        
        inline def setTranslationKeyUndefined: Self = StObject.set(x, "translationKey", js.undefined)
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
    trait ConverterOptions extends StObject {
      
      var dateFormat: js.UndefOr[short | medium | long | full] = js.undefined
      
      var day: js.UndefOr[`2-digit` | numeric] = js.undefined
      
      var dst: js.UndefOr[Boolean] = js.undefined
      
      var era: js.UndefOr[narrow | short | long] = js.undefined
      
      var formatType: js.UndefOr[date | time | datetime] = js.undefined
      
      var hour: js.UndefOr[`2-digit` | numeric] = js.undefined
      
      var hour12: js.UndefOr[Boolean] = js.undefined
      
      var isoStrFormat: js.UndefOr[offset | zulu | local | auto] = js.undefined
      
      var lenientParse: js.UndefOr[full | none] = js.undefined
      
      var millisecond: js.UndefOr[numeric] = js.undefined
      
      var minute: js.UndefOr[`2-digit` | numeric] = js.undefined
      
      var month: js.UndefOr[`2-digit` | numeric | narrow | short | long] = js.undefined
      
      var pattern: js.UndefOr[String] = js.undefined
      
      var second: js.UndefOr[`2-digit` | numeric] = js.undefined
      
      var timeFormat: js.UndefOr[short | medium | long | full] = js.undefined
      
      var timeZone: js.UndefOr[String] = js.undefined
      
      var timeZoneName: js.UndefOr[short | long] = js.undefined
      
      var `two-digit-year-start`: js.UndefOr[Double] = js.undefined
      
      var weekday: js.UndefOr[narrow | short | long] = js.undefined
      
      var year: js.UndefOr[`2-digit` | numeric] = js.undefined
    }
    object ConverterOptions {
      
      inline def apply(): ConverterOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ConverterOptions]
      }
      
      extension [Self <: ConverterOptions](x: Self) {
        
        inline def setDateFormat(value: short | medium | long | full): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
        
        inline def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
        
        inline def setDay(value: `2-digit` | numeric): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
        
        inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
        
        inline def setDst(value: Boolean): Self = StObject.set(x, "dst", value.asInstanceOf[js.Any])
        
        inline def setDstUndefined: Self = StObject.set(x, "dst", js.undefined)
        
        inline def setEra(value: narrow | short | long): Self = StObject.set(x, "era", value.asInstanceOf[js.Any])
        
        inline def setEraUndefined: Self = StObject.set(x, "era", js.undefined)
        
        inline def setFormatType(value: date | time | datetime): Self = StObject.set(x, "formatType", value.asInstanceOf[js.Any])
        
        inline def setFormatTypeUndefined: Self = StObject.set(x, "formatType", js.undefined)
        
        inline def setHour(value: `2-digit` | numeric): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
        
        inline def setHour12(value: Boolean): Self = StObject.set(x, "hour12", value.asInstanceOf[js.Any])
        
        inline def setHour12Undefined: Self = StObject.set(x, "hour12", js.undefined)
        
        inline def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
        
        inline def setIsoStrFormat(value: offset | zulu | local | auto): Self = StObject.set(x, "isoStrFormat", value.asInstanceOf[js.Any])
        
        inline def setIsoStrFormatUndefined: Self = StObject.set(x, "isoStrFormat", js.undefined)
        
        inline def setLenientParse(value: full | none): Self = StObject.set(x, "lenientParse", value.asInstanceOf[js.Any])
        
        inline def setLenientParseUndefined: Self = StObject.set(x, "lenientParse", js.undefined)
        
        inline def setMillisecond(value: numeric): Self = StObject.set(x, "millisecond", value.asInstanceOf[js.Any])
        
        inline def setMillisecondUndefined: Self = StObject.set(x, "millisecond", js.undefined)
        
        inline def setMinute(value: `2-digit` | numeric): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
        
        inline def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
        
        inline def setMonth(value: `2-digit` | numeric | narrow | short | long): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
        
        inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
        
        inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
        
        inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
        
        inline def setSecond(value: `2-digit` | numeric): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
        
        inline def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
        
        inline def setTimeFormat(value: short | medium | long | full): Self = StObject.set(x, "timeFormat", value.asInstanceOf[js.Any])
        
        inline def setTimeFormatUndefined: Self = StObject.set(x, "timeFormat", js.undefined)
        
        inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
        
        inline def setTimeZoneName(value: short | long): Self = StObject.set(x, "timeZoneName", value.asInstanceOf[js.Any])
        
        inline def setTimeZoneNameUndefined: Self = StObject.set(x, "timeZoneName", js.undefined)
        
        inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
        
        inline def `setTwo-digit-year-start`(value: Double): Self = StObject.set(x, "two-digit-year-start", value.asInstanceOf[js.Any])
        
        inline def `setTwo-digit-year-startUndefined`: Self = StObject.set(x, "two-digit-year-start", js.undefined)
        
        inline def setWeekday(value: narrow | short | long): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
        
        inline def setWeekdayUndefined: Self = StObject.set(x, "weekday", js.undefined)
        
        inline def setYear(value: `2-digit` | numeric): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
        
        inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
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
