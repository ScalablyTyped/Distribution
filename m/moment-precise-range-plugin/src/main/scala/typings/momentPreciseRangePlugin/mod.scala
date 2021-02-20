package typings.momentPreciseRangePlugin

import typings.moment.mod.DurationInputArg1
import typings.moment.mod.DurationInputArg2
import typings.moment.mod.Duration_
import typings.moment.mod.LocaleSpecification
import typings.moment.mod.Locale_
import typings.moment.mod.Moment
import typings.moment.mod.MomentBuiltinFormat
import typings.moment.mod.MomentFormatSpecification
import typings.moment.mod.MomentInput
import typings.moment.mod.MomentParsingFlagsOpt
import typings.moment.mod.unitOfTime.All
import typings.momentPreciseRangePlugin.mod.momentAugmentingMod.PreciseRangeValueObject
import typings.momentPreciseRangePlugin.momentPreciseRangePluginBooleans.`false`
import typings.momentPreciseRangePlugin.momentPreciseRangePluginBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("moment-precise-range-plugin", JSImport.Namespace)
  @js.native
  def apply(): Moment = js.native
  @JSImport("moment-precise-range-plugin", JSImport.Namespace)
  @js.native
  def apply(
    inp: js.UndefOr[MomentInput],
    format: js.UndefOr[MomentFormatSpecification],
    language: js.UndefOr[scala.Nothing],
    strict: Boolean
  ): Moment = js.native
  @JSImport("moment-precise-range-plugin", JSImport.Namespace)
  @js.native
  def apply(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], language: String): Moment = js.native
  @JSImport("moment-precise-range-plugin", JSImport.Namespace)
  @js.native
  def apply(
    inp: js.UndefOr[MomentInput],
    format: js.UndefOr[MomentFormatSpecification],
    language: String,
    strict: Boolean
  ): Moment = js.native
  @JSImport("moment-precise-range-plugin", JSImport.Namespace)
  @js.native
  def apply(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], strict: Boolean): Moment = js.native
  @JSImport("moment-precise-range-plugin", JSImport.Namespace)
  @js.native
  def apply(inp: js.UndefOr[MomentInput], format: MomentFormatSpecification): Moment = js.native
  @JSImport("moment-precise-range-plugin", JSImport.Namespace)
  @js.native
  def apply(inp: js.UndefOr[MomentInput], strict: Boolean): Moment = js.native
  @JSImport("moment-precise-range-plugin", JSImport.Namespace)
  @js.native
  def apply(inp: MomentInput): Moment = js.native
  
  @JSImport("moment-precise-range-plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object HTML5_FMT {
    
    @JSImport("moment-precise-range-plugin", "HTML5_FMT")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("moment-precise-range-plugin", "HTML5_FMT.DATE")
    @js.native
    def DATE: String = js.native
    
    @JSImport("moment-precise-range-plugin", "HTML5_FMT.DATETIME_LOCAL")
    @js.native
    def DATETIME_LOCAL: String = js.native
    @scala.inline
    def DATETIME_LOCAL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATETIME_LOCAL")(x.asInstanceOf[js.Any])
    
    @JSImport("moment-precise-range-plugin", "HTML5_FMT.DATETIME_LOCAL_MS")
    @js.native
    def DATETIME_LOCAL_MS: String = js.native
    @scala.inline
    def DATETIME_LOCAL_MS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATETIME_LOCAL_MS")(x.asInstanceOf[js.Any])
    
    @JSImport("moment-precise-range-plugin", "HTML5_FMT.DATETIME_LOCAL_SECONDS")
    @js.native
    def DATETIME_LOCAL_SECONDS: String = js.native
    @scala.inline
    def DATETIME_LOCAL_SECONDS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATETIME_LOCAL_SECONDS")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def DATE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATE")(x.asInstanceOf[js.Any])
    
    @JSImport("moment-precise-range-plugin", "HTML5_FMT.MONTH")
    @js.native
    def MONTH: String = js.native
    @scala.inline
    def MONTH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MONTH")(x.asInstanceOf[js.Any])
    
    @JSImport("moment-precise-range-plugin", "HTML5_FMT.TIME")
    @js.native
    def TIME: String = js.native
    @scala.inline
    def TIME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIME")(x.asInstanceOf[js.Any])
    
    @JSImport("moment-precise-range-plugin", "HTML5_FMT.TIME_MS")
    @js.native
    def TIME_MS: String = js.native
    @scala.inline
    def TIME_MS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIME_MS")(x.asInstanceOf[js.Any])
    
    @JSImport("moment-precise-range-plugin", "HTML5_FMT.TIME_SECONDS")
    @js.native
    def TIME_SECONDS: String = js.native
    @scala.inline
    def TIME_SECONDS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIME_SECONDS")(x.asInstanceOf[js.Any])
    
    @JSImport("moment-precise-range-plugin", "HTML5_FMT.WEEK")
    @js.native
    def WEEK: String = js.native
    @scala.inline
    def WEEK_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WEEK")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("moment-precise-range-plugin", "ISO_8601")
  @js.native
  def ISO_8601: MomentBuiltinFormat = js.native
  @scala.inline
  def ISO_8601_=(x: MomentBuiltinFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISO_8601")(x.asInstanceOf[js.Any])
  
  @JSImport("moment-precise-range-plugin", "RFC_2822")
  @js.native
  def RFC_2822: MomentBuiltinFormat = js.native
  @scala.inline
  def RFC_2822_=(x: MomentBuiltinFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RFC_2822")(x.asInstanceOf[js.Any])
  
  @JSImport("moment-precise-range-plugin", "calendarFormat")
  @js.native
  def calendarFormat(m: Moment, now: Moment): String = js.native
  
  @JSImport("moment-precise-range-plugin", "defaultFormat")
  @js.native
  def defaultFormat: String = js.native
  
  @JSImport("moment-precise-range-plugin", "defaultFormatUtc")
  @js.native
  def defaultFormatUtc: String = js.native
  @scala.inline
  def defaultFormatUtc_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultFormatUtc")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def defaultFormat_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultFormat")(x.asInstanceOf[js.Any])
  
  @JSImport("moment-precise-range-plugin", "defineLocale")
  @js.native
  def defineLocale(language: String, localeSpec: Unit): Locale_ = js.native
  @JSImport("moment-precise-range-plugin", "defineLocale")
  @js.native
  def defineLocale(language: String, localeSpec: LocaleSpecification): Locale_ = js.native
  
  @JSImport("moment-precise-range-plugin", "deprecationHandler")
  @js.native
  def deprecationHandler: (js.Function2[/* name */ String | Unit, /* msg */ String, Unit]) | Unit = js.native
  @scala.inline
  def deprecationHandler_=(x: (js.Function2[/* name */ String | Unit, /* msg */ String, Unit]) | Unit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deprecationHandler")(x.asInstanceOf[js.Any])
  
  @JSImport("moment-precise-range-plugin", "duration")
  @js.native
  def duration(): Duration_ = js.native
  @JSImport("moment-precise-range-plugin", "duration")
  @js.native
  def duration(inp: js.UndefOr[DurationInputArg1], unit: DurationInputArg2): Duration_ = js.native
  @JSImport("moment-precise-range-plugin", "duration")
  @js.native
  def duration(inp: DurationInputArg1): Duration_ = js.native
  
  @JSImport("moment-precise-range-plugin", "fn")
  @js.native
  def fn: Moment = js.native
  @scala.inline
  def fn_=(x: Moment): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
  
  @JSImport("moment-precise-range-plugin", "invalid")
  @js.native
  def invalid(): Moment = js.native
  @JSImport("moment-precise-range-plugin", "invalid")
  @js.native
  def invalid(flags: MomentParsingFlagsOpt): Moment = js.native
  
  @JSImport("moment-precise-range-plugin", "isDate")
  @js.native
  def isDate(m: js.Any): /* is std.Date */ Boolean = js.native
  
  @JSImport("moment-precise-range-plugin", "isDuration")
  @js.native
  def isDuration(d: js.Any): /* is moment.moment.Duration */ Boolean = js.native
  
  @JSImport("moment-precise-range-plugin", "isMoment")
  @js.native
  def isMoment(m: js.Any): /* is moment.moment.Moment */ Boolean = js.native
  
  @JSImport("moment-precise-range-plugin", "lang")
  @js.native
  def lang(): String = js.native
  @JSImport("moment-precise-range-plugin", "lang")
  @js.native
  def lang(language: js.UndefOr[scala.Nothing], definition: Locale_): String = js.native
  @JSImport("moment-precise-range-plugin", "lang")
  @js.native
  def lang(language: String): String = js.native
  @JSImport("moment-precise-range-plugin", "lang")
  @js.native
  def lang(language: String, definition: Locale_): String = js.native
  
  @JSImport("moment-precise-range-plugin", "locale")
  @js.native
  def locale(): String = js.native
  @JSImport("moment-precise-range-plugin", "locale")
  @js.native
  def locale(language: js.UndefOr[scala.Nothing], definition: Unit): String = js.native
  @JSImport("moment-precise-range-plugin", "locale")
  @js.native
  def locale(language: js.UndefOr[scala.Nothing], definition: LocaleSpecification): String = js.native
  @JSImport("moment-precise-range-plugin", "locale")
  @js.native
  def locale(language: String): String = js.native
  @JSImport("moment-precise-range-plugin", "locale")
  @js.native
  def locale(language: String, definition: Unit): String = js.native
  @JSImport("moment-precise-range-plugin", "locale")
  @js.native
  def locale(language: String, definition: LocaleSpecification): String = js.native
  @JSImport("moment-precise-range-plugin", "locale")
  @js.native
  def locale(language: js.Array[String]): String = js.native
  
  @JSImport("moment-precise-range-plugin", "localeData")
  @js.native
  def localeData(): Locale_ = js.native
  @JSImport("moment-precise-range-plugin", "localeData")
  @js.native
  def localeData(key: String): Locale_ = js.native
  @JSImport("moment-precise-range-plugin", "localeData")
  @js.native
  def localeData(key: js.Array[String]): Locale_ = js.native
  
  @JSImport("moment-precise-range-plugin", "locales")
  @js.native
  def locales(): js.Array[String] = js.native
  
  @JSImport("moment-precise-range-plugin", "max")
  @js.native
  def max(moments: Moment*): Moment = js.native
  @JSImport("moment-precise-range-plugin", "max")
  @js.native
  def max(moments: js.Array[Moment]): Moment = js.native
  
  @JSImport("moment-precise-range-plugin", "min")
  @js.native
  def min(moments: Moment*): Moment = js.native
  @JSImport("moment-precise-range-plugin", "min")
  @js.native
  def min(moments: js.Array[Moment]): Moment = js.native
  
  /* augmented module */
  object momentAugmentingMod {
    
    @JSImport("moment", "preciseDiff")
    @js.native
    def preciseDiff_false(
      d1: typings.momentPreciseRangePlugin.mod.momentAugmentingMod.Moment,
      d2: typings.momentPreciseRangePlugin.mod.momentAugmentingMod.Moment,
      returnValueObject: js.UndefOr[`false`]
    ): String = js.native
    @JSImport("moment", "preciseDiff")
    @js.native
    def preciseDiff_true(
      d1: typings.momentPreciseRangePlugin.mod.momentAugmentingMod.Moment,
      d2: typings.momentPreciseRangePlugin.mod.momentAugmentingMod.Moment,
      returnValueObject: `true`
    ): PreciseRangeValueObject = js.native
    
    @js.native
    trait Moment extends StObject {
      
      def preciseDiff(d2: typings.momentPreciseRangePlugin.mod.momentAugmentingMod.Moment): String = js.native
      @JSName("preciseDiff")
      def preciseDiff_false(d2: typings.momentPreciseRangePlugin.mod.momentAugmentingMod.Moment, returnValueObject: `false`): String = js.native
      @JSName("preciseDiff")
      def preciseDiff_true(d2: typings.momentPreciseRangePlugin.mod.momentAugmentingMod.Moment, returnValueObject: `true`): PreciseRangeValueObject = js.native
    }
    
    @js.native
    trait PreciseRangeValueObject extends StObject {
      
      var days: Double = js.native
      
      var firstDateWasLater: Boolean = js.native
      
      var hours: Double = js.native
      
      var minutes: Double = js.native
      
      var months: Double = js.native
      
      var seconds: Double = js.native
      
      var years: Double = js.native
    }
    object PreciseRangeValueObject {
      
      @scala.inline
      def apply(
        days: Double,
        firstDateWasLater: Boolean,
        hours: Double,
        minutes: Double,
        months: Double,
        seconds: Double,
        years: Double
      ): PreciseRangeValueObject = {
        val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], firstDateWasLater = firstDateWasLater.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], years = years.asInstanceOf[js.Any])
        __obj.asInstanceOf[PreciseRangeValueObject]
      }
      
      @scala.inline
      implicit class PreciseRangeValueObjectMutableBuilder[Self <: PreciseRangeValueObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDays(value: Double): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFirstDateWasLater(value: Boolean): Self = StObject.set(x, "firstDateWasLater", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMonths(value: Double): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setYears(value: Double): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("moment-precise-range-plugin", "months")
  @js.native
  def months(): js.Array[String] = js.native
  @JSImport("moment-precise-range-plugin", "months")
  @js.native
  def months(format: String): js.Array[String] = js.native
  @JSImport("moment-precise-range-plugin", "months")
  @js.native
  def months(format: String, index: Double): String = js.native
  @JSImport("moment-precise-range-plugin", "months")
  @js.native
  def months(index: Double): String = js.native
  
  @JSImport("moment-precise-range-plugin", "monthsShort")
  @js.native
  def monthsShort(): js.Array[String] = js.native
  @JSImport("moment-precise-range-plugin", "monthsShort")
  @js.native
  def monthsShort(format: String): js.Array[String] = js.native
  @JSImport("moment-precise-range-plugin", "monthsShort")
  @js.native
  def monthsShort(format: String, index: Double): String = js.native
  @JSImport("moment-precise-range-plugin", "monthsShort")
  @js.native
  def monthsShort(index: Double): String = js.native
  
  @JSImport("moment-precise-range-plugin", "normalizeUnits")
  @js.native
  def normalizeUnits(unit: All): String = js.native
  
  @JSImport("moment-precise-range-plugin", "now")
  @js.native
  def now(): Double = js.native
  
  @JSImport("moment-precise-range-plugin", "parseTwoDigitYear")
  @js.native
  def parseTwoDigitYear(input: String): Double = js.native
  
  @JSImport("moment-precise-range-plugin", "parseZone")
  @js.native
  def parseZone(): Moment = js.native
  @JSImport("moment-precise-range-plugin", "parseZone")
  @js.native
  def parseZone(
    inp: js.UndefOr[MomentInput],
    format: js.UndefOr[MomentFormatSpecification],
    language: js.UndefOr[scala.Nothing],
    strict: Boolean
  ): Moment = js.native
  @JSImport("moment-precise-range-plugin", "parseZone")
  @js.native
  def parseZone(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], language: String): Moment = js.native
  @JSImport("moment-precise-range-plugin", "parseZone")
  @js.native
  def parseZone(
    inp: js.UndefOr[MomentInput],
    format: js.UndefOr[MomentFormatSpecification],
    language: String,
    strict: Boolean
  ): Moment = js.native
  @JSImport("moment-precise-range-plugin", "parseZone")
  @js.native
  def parseZone(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], strict: Boolean): Moment = js.native
  @JSImport("moment-precise-range-plugin", "parseZone")
  @js.native
  def parseZone(inp: js.UndefOr[MomentInput], format: MomentFormatSpecification): Moment = js.native
  @JSImport("moment-precise-range-plugin", "parseZone")
  @js.native
  def parseZone(inp: MomentInput): Moment = js.native
  
  @JSImport("moment-precise-range-plugin", "preciseDiff")
  @js.native
  def preciseDiff(
    d1: typings.momentPreciseRangePlugin.mod.momentAugmentingMod.Moment,
    d2: typings.momentPreciseRangePlugin.mod.momentAugmentingMod.Moment
  ): String = js.native
  @JSImport("moment-precise-range-plugin", "preciseDiff")
  @js.native
  def preciseDiff_false(
    d1: typings.momentPreciseRangePlugin.mod.momentAugmentingMod.Moment,
    d2: typings.momentPreciseRangePlugin.mod.momentAugmentingMod.Moment,
    returnValueObject: `false`
  ): String = js.native
  @JSImport("moment-precise-range-plugin", "preciseDiff")
  @js.native
  def preciseDiff_true(
    d1: typings.momentPreciseRangePlugin.mod.momentAugmentingMod.Moment,
    d2: typings.momentPreciseRangePlugin.mod.momentAugmentingMod.Moment,
    returnValueObject: `true`
  ): PreciseRangeValueObject = js.native
  
  @JSImport("moment-precise-range-plugin", "relativeTimeRounding")
  @js.native
  def relativeTimeRounding(): js.Function1[/* num */ Double, Double] = js.native
  @JSImport("moment-precise-range-plugin", "relativeTimeRounding")
  @js.native
  def relativeTimeRounding(fn: js.Function1[/* num */ Double, Double]): Boolean = js.native
  
  @JSImport("moment-precise-range-plugin", "relativeTimeThreshold")
  @js.native
  def relativeTimeThreshold(threshold: String): Double | Boolean = js.native
  @JSImport("moment-precise-range-plugin", "relativeTimeThreshold")
  @js.native
  def relativeTimeThreshold(threshold: String, limit: Double): Boolean = js.native
  
  @JSImport("moment-precise-range-plugin", "suppressDeprecationWarnings")
  @js.native
  def suppressDeprecationWarnings: Boolean = js.native
  @scala.inline
  def suppressDeprecationWarnings_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suppressDeprecationWarnings")(x.asInstanceOf[js.Any])
  
  @JSImport("moment-precise-range-plugin", "unix")
  @js.native
  def unix(timestamp: Double): Moment = js.native
  
  @JSImport("moment-precise-range-plugin", "updateLocale")
  @js.native
  def updateLocale(language: String, localeSpec: Unit): Locale_ = js.native
  @JSImport("moment-precise-range-plugin", "updateLocale")
  @js.native
  def updateLocale(language: String, localeSpec: LocaleSpecification): Locale_ = js.native
  
  @JSImport("moment-precise-range-plugin", "utc")
  @js.native
  def utc(): Moment = js.native
  @JSImport("moment-precise-range-plugin", "utc")
  @js.native
  def utc(
    inp: js.UndefOr[MomentInput],
    format: js.UndefOr[MomentFormatSpecification],
    language: js.UndefOr[scala.Nothing],
    strict: Boolean
  ): Moment = js.native
  @JSImport("moment-precise-range-plugin", "utc")
  @js.native
  def utc(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], language: String): Moment = js.native
  @JSImport("moment-precise-range-plugin", "utc")
  @js.native
  def utc(
    inp: js.UndefOr[MomentInput],
    format: js.UndefOr[MomentFormatSpecification],
    language: String,
    strict: Boolean
  ): Moment = js.native
  @JSImport("moment-precise-range-plugin", "utc")
  @js.native
  def utc(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], strict: Boolean): Moment = js.native
  @JSImport("moment-precise-range-plugin", "utc")
  @js.native
  def utc(inp: js.UndefOr[MomentInput], format: MomentFormatSpecification): Moment = js.native
  @JSImport("moment-precise-range-plugin", "utc")
  @js.native
  def utc(inp: js.UndefOr[MomentInput], strict: Boolean): Moment = js.native
  @JSImport("moment-precise-range-plugin", "utc")
  @js.native
  def utc(inp: MomentInput): Moment = js.native
  
  @JSImport("moment-precise-range-plugin", "version")
  @js.native
  def version: String = js.native
  @scala.inline
  def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  @JSImport("moment-precise-range-plugin", "weekdays")
  @js.native
  def weekdays(): js.Array[String] = js.native
  @JSImport("moment-precise-range-plugin", "weekdays")
  @js.native
  def weekdays(format: String): js.Array[String] = js.native
  @JSImport("moment-precise-range-plugin", "weekdays")
  @js.native
  def weekdays(format: String, index: Double): String = js.native
  @JSImport("moment-precise-range-plugin", "weekdays")
  @js.native
  def weekdays(index: Double): String = js.native
  @JSImport("moment-precise-range-plugin", "weekdays")
  @js.native
  def weekdays(localeSorted: Boolean): js.Array[String] = js.native
  @JSImport("moment-precise-range-plugin", "weekdays")
  @js.native
  def weekdays(localeSorted: Boolean, format: String): js.Array[String] = js.native
  @JSImport("moment-precise-range-plugin", "weekdays")
  @js.native
  def weekdays(localeSorted: Boolean, format: String, index: Double): String = js.native
  @JSImport("moment-precise-range-plugin", "weekdays")
  @js.native
  def weekdays(localeSorted: Boolean, index: Double): String = js.native
  
  @JSImport("moment-precise-range-plugin", "weekdaysMin")
  @js.native
  def weekdaysMin(): js.Array[String] = js.native
  @JSImport("moment-precise-range-plugin", "weekdaysMin")
  @js.native
  def weekdaysMin(format: String): js.Array[String] = js.native
  @JSImport("moment-precise-range-plugin", "weekdaysMin")
  @js.native
  def weekdaysMin(format: String, index: Double): String = js.native
  @JSImport("moment-precise-range-plugin", "weekdaysMin")
  @js.native
  def weekdaysMin(index: Double): String = js.native
  @JSImport("moment-precise-range-plugin", "weekdaysMin")
  @js.native
  def weekdaysMin(localeSorted: Boolean): js.Array[String] = js.native
  @JSImport("moment-precise-range-plugin", "weekdaysMin")
  @js.native
  def weekdaysMin(localeSorted: Boolean, format: String): js.Array[String] = js.native
  @JSImport("moment-precise-range-plugin", "weekdaysMin")
  @js.native
  def weekdaysMin(localeSorted: Boolean, format: String, index: Double): String = js.native
  @JSImport("moment-precise-range-plugin", "weekdaysMin")
  @js.native
  def weekdaysMin(localeSorted: Boolean, index: Double): String = js.native
  
  @JSImport("moment-precise-range-plugin", "weekdaysShort")
  @js.native
  def weekdaysShort(): js.Array[String] = js.native
  @JSImport("moment-precise-range-plugin", "weekdaysShort")
  @js.native
  def weekdaysShort(format: String): js.Array[String] = js.native
  @JSImport("moment-precise-range-plugin", "weekdaysShort")
  @js.native
  def weekdaysShort(format: String, index: Double): String = js.native
  @JSImport("moment-precise-range-plugin", "weekdaysShort")
  @js.native
  def weekdaysShort(index: Double): String = js.native
  @JSImport("moment-precise-range-plugin", "weekdaysShort")
  @js.native
  def weekdaysShort(localeSorted: Boolean): js.Array[String] = js.native
  @JSImport("moment-precise-range-plugin", "weekdaysShort")
  @js.native
  def weekdaysShort(localeSorted: Boolean, format: String): js.Array[String] = js.native
  @JSImport("moment-precise-range-plugin", "weekdaysShort")
  @js.native
  def weekdaysShort(localeSorted: Boolean, format: String, index: Double): String = js.native
  @JSImport("moment-precise-range-plugin", "weekdaysShort")
  @js.native
  def weekdaysShort(localeSorted: Boolean, index: Double): String = js.native
}
