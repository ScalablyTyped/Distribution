package typings.momentShortformat

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("moment-shortformat", JSImport.Namespace)
  @js.native
  def apply(): Moment = js.native
  @JSImport("moment-shortformat", JSImport.Namespace)
  @js.native
  def apply(
    inp: js.UndefOr[MomentInput],
    format: js.UndefOr[MomentFormatSpecification],
    language: js.UndefOr[scala.Nothing],
    strict: Boolean
  ): Moment = js.native
  @JSImport("moment-shortformat", JSImport.Namespace)
  @js.native
  def apply(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], language: String): Moment = js.native
  @JSImport("moment-shortformat", JSImport.Namespace)
  @js.native
  def apply(
    inp: js.UndefOr[MomentInput],
    format: js.UndefOr[MomentFormatSpecification],
    language: String,
    strict: Boolean
  ): Moment = js.native
  @JSImport("moment-shortformat", JSImport.Namespace)
  @js.native
  def apply(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], strict: Boolean): Moment = js.native
  @JSImport("moment-shortformat", JSImport.Namespace)
  @js.native
  def apply(inp: js.UndefOr[MomentInput], format: MomentFormatSpecification): Moment = js.native
  @JSImport("moment-shortformat", JSImport.Namespace)
  @js.native
  def apply(inp: js.UndefOr[MomentInput], strict: Boolean): Moment = js.native
  @JSImport("moment-shortformat", JSImport.Namespace)
  @js.native
  def apply(inp: MomentInput): Moment = js.native
  
  @JSImport("moment-shortformat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object HTML5_FMT {
    
    @JSImport("moment-shortformat", "HTML5_FMT")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("moment-shortformat", "HTML5_FMT.DATE")
    @js.native
    def DATE: String = js.native
    
    @JSImport("moment-shortformat", "HTML5_FMT.DATETIME_LOCAL")
    @js.native
    def DATETIME_LOCAL: String = js.native
    @scala.inline
    def DATETIME_LOCAL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATETIME_LOCAL")(x.asInstanceOf[js.Any])
    
    @JSImport("moment-shortformat", "HTML5_FMT.DATETIME_LOCAL_MS")
    @js.native
    def DATETIME_LOCAL_MS: String = js.native
    @scala.inline
    def DATETIME_LOCAL_MS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATETIME_LOCAL_MS")(x.asInstanceOf[js.Any])
    
    @JSImport("moment-shortformat", "HTML5_FMT.DATETIME_LOCAL_SECONDS")
    @js.native
    def DATETIME_LOCAL_SECONDS: String = js.native
    @scala.inline
    def DATETIME_LOCAL_SECONDS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATETIME_LOCAL_SECONDS")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def DATE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATE")(x.asInstanceOf[js.Any])
    
    @JSImport("moment-shortformat", "HTML5_FMT.MONTH")
    @js.native
    def MONTH: String = js.native
    @scala.inline
    def MONTH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MONTH")(x.asInstanceOf[js.Any])
    
    @JSImport("moment-shortformat", "HTML5_FMT.TIME")
    @js.native
    def TIME: String = js.native
    @scala.inline
    def TIME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIME")(x.asInstanceOf[js.Any])
    
    @JSImport("moment-shortformat", "HTML5_FMT.TIME_MS")
    @js.native
    def TIME_MS: String = js.native
    @scala.inline
    def TIME_MS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIME_MS")(x.asInstanceOf[js.Any])
    
    @JSImport("moment-shortformat", "HTML5_FMT.TIME_SECONDS")
    @js.native
    def TIME_SECONDS: String = js.native
    @scala.inline
    def TIME_SECONDS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIME_SECONDS")(x.asInstanceOf[js.Any])
    
    @JSImport("moment-shortformat", "HTML5_FMT.WEEK")
    @js.native
    def WEEK: String = js.native
    @scala.inline
    def WEEK_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WEEK")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("moment-shortformat", "ISO_8601")
  @js.native
  def ISO_8601: MomentBuiltinFormat = js.native
  @scala.inline
  def ISO_8601_=(x: MomentBuiltinFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISO_8601")(x.asInstanceOf[js.Any])
  
  @JSImport("moment-shortformat", "RFC_2822")
  @js.native
  def RFC_2822: MomentBuiltinFormat = js.native
  @scala.inline
  def RFC_2822_=(x: MomentBuiltinFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RFC_2822")(x.asInstanceOf[js.Any])
  
  @JSImport("moment-shortformat", "calendarFormat")
  @js.native
  def calendarFormat(m: Moment, now: Moment): String = js.native
  
  @JSImport("moment-shortformat", "defaultFormat")
  @js.native
  def defaultFormat: String = js.native
  
  @JSImport("moment-shortformat", "defaultFormatUtc")
  @js.native
  def defaultFormatUtc: String = js.native
  @scala.inline
  def defaultFormatUtc_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultFormatUtc")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def defaultFormat_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultFormat")(x.asInstanceOf[js.Any])
  
  @JSImport("moment-shortformat", "defineLocale")
  @js.native
  def defineLocale(language: String, localeSpec: Unit): Locale_ = js.native
  @JSImport("moment-shortformat", "defineLocale")
  @js.native
  def defineLocale(language: String, localeSpec: LocaleSpecification): Locale_ = js.native
  
  @JSImport("moment-shortformat", "deprecationHandler")
  @js.native
  def deprecationHandler: (js.Function2[/* name */ String | Unit, /* msg */ String, Unit]) | Unit = js.native
  @scala.inline
  def deprecationHandler_=(x: (js.Function2[/* name */ String | Unit, /* msg */ String, Unit]) | Unit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deprecationHandler")(x.asInstanceOf[js.Any])
  
  @JSImport("moment-shortformat", "duration")
  @js.native
  def duration(): Duration_ = js.native
  @JSImport("moment-shortformat", "duration")
  @js.native
  def duration(inp: js.UndefOr[DurationInputArg1], unit: DurationInputArg2): Duration_ = js.native
  @JSImport("moment-shortformat", "duration")
  @js.native
  def duration(inp: DurationInputArg1): Duration_ = js.native
  
  @JSImport("moment-shortformat", "fn")
  @js.native
  def fn: Moment = js.native
  @scala.inline
  def fn_=(x: Moment): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
  
  @JSImport("moment-shortformat", "invalid")
  @js.native
  def invalid(): Moment = js.native
  @JSImport("moment-shortformat", "invalid")
  @js.native
  def invalid(flags: MomentParsingFlagsOpt): Moment = js.native
  
  @JSImport("moment-shortformat", "isDate")
  @js.native
  def isDate(m: js.Any): /* is std.Date */ Boolean = js.native
  
  @JSImport("moment-shortformat", "isDuration")
  @js.native
  def isDuration(d: js.Any): /* is moment.moment.Duration */ Boolean = js.native
  
  @JSImport("moment-shortformat", "isMoment")
  @js.native
  def isMoment(m: js.Any): /* is moment.moment.Moment */ Boolean = js.native
  
  @JSImport("moment-shortformat", "lang")
  @js.native
  def lang(): String = js.native
  @JSImport("moment-shortformat", "lang")
  @js.native
  def lang(language: js.UndefOr[scala.Nothing], definition: Locale_): String = js.native
  @JSImport("moment-shortformat", "lang")
  @js.native
  def lang(language: String): String = js.native
  @JSImport("moment-shortformat", "lang")
  @js.native
  def lang(language: String, definition: Locale_): String = js.native
  
  @JSImport("moment-shortformat", "locale")
  @js.native
  def locale(): String = js.native
  @JSImport("moment-shortformat", "locale")
  @js.native
  def locale(language: js.UndefOr[scala.Nothing], definition: Unit): String = js.native
  @JSImport("moment-shortformat", "locale")
  @js.native
  def locale(language: js.UndefOr[scala.Nothing], definition: LocaleSpecification): String = js.native
  @JSImport("moment-shortformat", "locale")
  @js.native
  def locale(language: String): String = js.native
  @JSImport("moment-shortformat", "locale")
  @js.native
  def locale(language: String, definition: Unit): String = js.native
  @JSImport("moment-shortformat", "locale")
  @js.native
  def locale(language: String, definition: LocaleSpecification): String = js.native
  @JSImport("moment-shortformat", "locale")
  @js.native
  def locale(language: js.Array[String]): String = js.native
  
  @JSImport("moment-shortformat", "localeData")
  @js.native
  def localeData(): Locale_ = js.native
  @JSImport("moment-shortformat", "localeData")
  @js.native
  def localeData(key: String): Locale_ = js.native
  @JSImport("moment-shortformat", "localeData")
  @js.native
  def localeData(key: js.Array[String]): Locale_ = js.native
  
  @JSImport("moment-shortformat", "locales")
  @js.native
  def locales(): js.Array[String] = js.native
  
  @JSImport("moment-shortformat", "max")
  @js.native
  def max(moments: Moment*): Moment = js.native
  @JSImport("moment-shortformat", "max")
  @js.native
  def max(moments: js.Array[Moment]): Moment = js.native
  
  @JSImport("moment-shortformat", "min")
  @js.native
  def min(moments: Moment*): Moment = js.native
  @JSImport("moment-shortformat", "min")
  @js.native
  def min(moments: js.Array[Moment]): Moment = js.native
  
  @JSImport("moment-shortformat", "months")
  @js.native
  def months(): js.Array[String] = js.native
  @JSImport("moment-shortformat", "months")
  @js.native
  def months(format: String): js.Array[String] = js.native
  @JSImport("moment-shortformat", "months")
  @js.native
  def months(format: String, index: Double): String = js.native
  @JSImport("moment-shortformat", "months")
  @js.native
  def months(index: Double): String = js.native
  
  @JSImport("moment-shortformat", "monthsShort")
  @js.native
  def monthsShort(): js.Array[String] = js.native
  @JSImport("moment-shortformat", "monthsShort")
  @js.native
  def monthsShort(format: String): js.Array[String] = js.native
  @JSImport("moment-shortformat", "monthsShort")
  @js.native
  def monthsShort(format: String, index: Double): String = js.native
  @JSImport("moment-shortformat", "monthsShort")
  @js.native
  def monthsShort(index: Double): String = js.native
  
  @JSImport("moment-shortformat", "normalizeUnits")
  @js.native
  def normalizeUnits(unit: All): String = js.native
  
  @JSImport("moment-shortformat", "now")
  @js.native
  def now(): Double = js.native
  
  @JSImport("moment-shortformat", "parseTwoDigitYear")
  @js.native
  def parseTwoDigitYear(input: String): Double = js.native
  
  @JSImport("moment-shortformat", "parseZone")
  @js.native
  def parseZone(): Moment = js.native
  @JSImport("moment-shortformat", "parseZone")
  @js.native
  def parseZone(
    inp: js.UndefOr[MomentInput],
    format: js.UndefOr[MomentFormatSpecification],
    language: js.UndefOr[scala.Nothing],
    strict: Boolean
  ): Moment = js.native
  @JSImport("moment-shortformat", "parseZone")
  @js.native
  def parseZone(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], language: String): Moment = js.native
  @JSImport("moment-shortformat", "parseZone")
  @js.native
  def parseZone(
    inp: js.UndefOr[MomentInput],
    format: js.UndefOr[MomentFormatSpecification],
    language: String,
    strict: Boolean
  ): Moment = js.native
  @JSImport("moment-shortformat", "parseZone")
  @js.native
  def parseZone(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], strict: Boolean): Moment = js.native
  @JSImport("moment-shortformat", "parseZone")
  @js.native
  def parseZone(inp: js.UndefOr[MomentInput], format: MomentFormatSpecification): Moment = js.native
  @JSImport("moment-shortformat", "parseZone")
  @js.native
  def parseZone(inp: MomentInput): Moment = js.native
  
  @JSImport("moment-shortformat", "relativeTimeRounding")
  @js.native
  def relativeTimeRounding(): js.Function1[/* num */ Double, Double] = js.native
  @JSImport("moment-shortformat", "relativeTimeRounding")
  @js.native
  def relativeTimeRounding(fn: js.Function1[/* num */ Double, Double]): Boolean = js.native
  
  @JSImport("moment-shortformat", "relativeTimeThreshold")
  @js.native
  def relativeTimeThreshold(threshold: String): Double | Boolean = js.native
  @JSImport("moment-shortformat", "relativeTimeThreshold")
  @js.native
  def relativeTimeThreshold(threshold: String, limit: Double): Boolean = js.native
  
  @JSImport("moment-shortformat", "suppressDeprecationWarnings")
  @js.native
  def suppressDeprecationWarnings: Boolean = js.native
  @scala.inline
  def suppressDeprecationWarnings_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suppressDeprecationWarnings")(x.asInstanceOf[js.Any])
  
  @JSImport("moment-shortformat", "unix")
  @js.native
  def unix(timestamp: Double): Moment = js.native
  
  @JSImport("moment-shortformat", "updateLocale")
  @js.native
  def updateLocale(language: String, localeSpec: Unit): Locale_ = js.native
  @JSImport("moment-shortformat", "updateLocale")
  @js.native
  def updateLocale(language: String, localeSpec: LocaleSpecification): Locale_ = js.native
  
  @JSImport("moment-shortformat", "utc")
  @js.native
  def utc(): Moment = js.native
  @JSImport("moment-shortformat", "utc")
  @js.native
  def utc(
    inp: js.UndefOr[MomentInput],
    format: js.UndefOr[MomentFormatSpecification],
    language: js.UndefOr[scala.Nothing],
    strict: Boolean
  ): Moment = js.native
  @JSImport("moment-shortformat", "utc")
  @js.native
  def utc(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], language: String): Moment = js.native
  @JSImport("moment-shortformat", "utc")
  @js.native
  def utc(
    inp: js.UndefOr[MomentInput],
    format: js.UndefOr[MomentFormatSpecification],
    language: String,
    strict: Boolean
  ): Moment = js.native
  @JSImport("moment-shortformat", "utc")
  @js.native
  def utc(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], strict: Boolean): Moment = js.native
  @JSImport("moment-shortformat", "utc")
  @js.native
  def utc(inp: js.UndefOr[MomentInput], format: MomentFormatSpecification): Moment = js.native
  @JSImport("moment-shortformat", "utc")
  @js.native
  def utc(inp: js.UndefOr[MomentInput], strict: Boolean): Moment = js.native
  @JSImport("moment-shortformat", "utc")
  @js.native
  def utc(inp: MomentInput): Moment = js.native
  
  @JSImport("moment-shortformat", "version")
  @js.native
  def version: String = js.native
  @scala.inline
  def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  @JSImport("moment-shortformat", "weekdays")
  @js.native
  def weekdays(): js.Array[String] = js.native
  @JSImport("moment-shortformat", "weekdays")
  @js.native
  def weekdays(format: String): js.Array[String] = js.native
  @JSImport("moment-shortformat", "weekdays")
  @js.native
  def weekdays(format: String, index: Double): String = js.native
  @JSImport("moment-shortformat", "weekdays")
  @js.native
  def weekdays(index: Double): String = js.native
  @JSImport("moment-shortformat", "weekdays")
  @js.native
  def weekdays(localeSorted: Boolean): js.Array[String] = js.native
  @JSImport("moment-shortformat", "weekdays")
  @js.native
  def weekdays(localeSorted: Boolean, format: String): js.Array[String] = js.native
  @JSImport("moment-shortformat", "weekdays")
  @js.native
  def weekdays(localeSorted: Boolean, format: String, index: Double): String = js.native
  @JSImport("moment-shortformat", "weekdays")
  @js.native
  def weekdays(localeSorted: Boolean, index: Double): String = js.native
  
  @JSImport("moment-shortformat", "weekdaysMin")
  @js.native
  def weekdaysMin(): js.Array[String] = js.native
  @JSImport("moment-shortformat", "weekdaysMin")
  @js.native
  def weekdaysMin(format: String): js.Array[String] = js.native
  @JSImport("moment-shortformat", "weekdaysMin")
  @js.native
  def weekdaysMin(format: String, index: Double): String = js.native
  @JSImport("moment-shortformat", "weekdaysMin")
  @js.native
  def weekdaysMin(index: Double): String = js.native
  @JSImport("moment-shortformat", "weekdaysMin")
  @js.native
  def weekdaysMin(localeSorted: Boolean): js.Array[String] = js.native
  @JSImport("moment-shortformat", "weekdaysMin")
  @js.native
  def weekdaysMin(localeSorted: Boolean, format: String): js.Array[String] = js.native
  @JSImport("moment-shortformat", "weekdaysMin")
  @js.native
  def weekdaysMin(localeSorted: Boolean, format: String, index: Double): String = js.native
  @JSImport("moment-shortformat", "weekdaysMin")
  @js.native
  def weekdaysMin(localeSorted: Boolean, index: Double): String = js.native
  
  @JSImport("moment-shortformat", "weekdaysShort")
  @js.native
  def weekdaysShort(): js.Array[String] = js.native
  @JSImport("moment-shortformat", "weekdaysShort")
  @js.native
  def weekdaysShort(format: String): js.Array[String] = js.native
  @JSImport("moment-shortformat", "weekdaysShort")
  @js.native
  def weekdaysShort(format: String, index: Double): String = js.native
  @JSImport("moment-shortformat", "weekdaysShort")
  @js.native
  def weekdaysShort(index: Double): String = js.native
  @JSImport("moment-shortformat", "weekdaysShort")
  @js.native
  def weekdaysShort(localeSorted: Boolean): js.Array[String] = js.native
  @JSImport("moment-shortformat", "weekdaysShort")
  @js.native
  def weekdaysShort(localeSorted: Boolean, format: String): js.Array[String] = js.native
  @JSImport("moment-shortformat", "weekdaysShort")
  @js.native
  def weekdaysShort(localeSorted: Boolean, format: String, index: Double): String = js.native
  @JSImport("moment-shortformat", "weekdaysShort")
  @js.native
  def weekdaysShort(localeSorted: Boolean, index: Double): String = js.native
  
  /* augmented module */
  object momentAugmentingMod {
    
    @js.native
    trait Moment extends StObject {
      
      def short(): String = js.native
      def short(
        withoutPreOrSuffix: js.UndefOr[scala.Nothing],
        now: typings.momentShortformat.mod.momentAugmentingMod.Moment
      ): String = js.native
      def short(withoutPreOrSuffix: Boolean): String = js.native
      def short(withoutPreOrSuffix: Boolean, now: typings.momentShortformat.mod.momentAugmentingMod.Moment): String = js.native
    }
  }
}
