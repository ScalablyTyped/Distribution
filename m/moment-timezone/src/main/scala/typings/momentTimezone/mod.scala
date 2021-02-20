package typings.momentTimezone

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
import typings.momentTimezone.anon.Links
import typings.momentTimezone.mod.momentAugmentingMod.MomentTimezone
import typings.momentTimezone.momentTimezoneBooleans.`false`
import typings.momentTimezone.momentTimezoneBooleans.`true`
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("moment-timezone", JSImport.Namespace)
  @js.native
  def apply(): Moment = js.native
  @JSImport("moment-timezone", JSImport.Namespace)
  @js.native
  def apply(
    inp: js.UndefOr[MomentInput],
    format: js.UndefOr[MomentFormatSpecification],
    language: js.UndefOr[scala.Nothing],
    strict: Boolean
  ): Moment = js.native
  @JSImport("moment-timezone", JSImport.Namespace)
  @js.native
  def apply(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], language: String): Moment = js.native
  @JSImport("moment-timezone", JSImport.Namespace)
  @js.native
  def apply(
    inp: js.UndefOr[MomentInput],
    format: js.UndefOr[MomentFormatSpecification],
    language: String,
    strict: Boolean
  ): Moment = js.native
  @JSImport("moment-timezone", JSImport.Namespace)
  @js.native
  def apply(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], strict: Boolean): Moment = js.native
  @JSImport("moment-timezone", JSImport.Namespace)
  @js.native
  def apply(inp: js.UndefOr[MomentInput], format: MomentFormatSpecification): Moment = js.native
  @JSImport("moment-timezone", JSImport.Namespace)
  @js.native
  def apply(inp: js.UndefOr[MomentInput], strict: Boolean): Moment = js.native
  @JSImport("moment-timezone", JSImport.Namespace)
  @js.native
  def apply(inp: MomentInput): Moment = js.native
  
  @JSImport("moment-timezone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object HTML5_FMT {
    
    @JSImport("moment-timezone", "HTML5_FMT")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("moment-timezone", "HTML5_FMT.DATE")
    @js.native
    def DATE: String = js.native
    
    @JSImport("moment-timezone", "HTML5_FMT.DATETIME_LOCAL")
    @js.native
    def DATETIME_LOCAL: String = js.native
    @scala.inline
    def DATETIME_LOCAL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATETIME_LOCAL")(x.asInstanceOf[js.Any])
    
    @JSImport("moment-timezone", "HTML5_FMT.DATETIME_LOCAL_MS")
    @js.native
    def DATETIME_LOCAL_MS: String = js.native
    @scala.inline
    def DATETIME_LOCAL_MS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATETIME_LOCAL_MS")(x.asInstanceOf[js.Any])
    
    @JSImport("moment-timezone", "HTML5_FMT.DATETIME_LOCAL_SECONDS")
    @js.native
    def DATETIME_LOCAL_SECONDS: String = js.native
    @scala.inline
    def DATETIME_LOCAL_SECONDS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATETIME_LOCAL_SECONDS")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def DATE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATE")(x.asInstanceOf[js.Any])
    
    @JSImport("moment-timezone", "HTML5_FMT.MONTH")
    @js.native
    def MONTH: String = js.native
    @scala.inline
    def MONTH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MONTH")(x.asInstanceOf[js.Any])
    
    @JSImport("moment-timezone", "HTML5_FMT.TIME")
    @js.native
    def TIME: String = js.native
    @scala.inline
    def TIME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIME")(x.asInstanceOf[js.Any])
    
    @JSImport("moment-timezone", "HTML5_FMT.TIME_MS")
    @js.native
    def TIME_MS: String = js.native
    @scala.inline
    def TIME_MS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIME_MS")(x.asInstanceOf[js.Any])
    
    @JSImport("moment-timezone", "HTML5_FMT.TIME_SECONDS")
    @js.native
    def TIME_SECONDS: String = js.native
    @scala.inline
    def TIME_SECONDS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIME_SECONDS")(x.asInstanceOf[js.Any])
    
    @JSImport("moment-timezone", "HTML5_FMT.WEEK")
    @js.native
    def WEEK: String = js.native
    @scala.inline
    def WEEK_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WEEK")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("moment-timezone", "ISO_8601")
  @js.native
  def ISO_8601: MomentBuiltinFormat = js.native
  @scala.inline
  def ISO_8601_=(x: MomentBuiltinFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISO_8601")(x.asInstanceOf[js.Any])
  
  @JSImport("moment-timezone", "RFC_2822")
  @js.native
  def RFC_2822: MomentBuiltinFormat = js.native
  @scala.inline
  def RFC_2822_=(x: MomentBuiltinFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RFC_2822")(x.asInstanceOf[js.Any])
  
  @JSImport("moment-timezone", "calendarFormat")
  @js.native
  def calendarFormat(m: Moment, now: Moment): String = js.native
  
  @JSImport("moment-timezone", "defaultFormat")
  @js.native
  def defaultFormat: String = js.native
  
  @JSImport("moment-timezone", "defaultFormatUtc")
  @js.native
  def defaultFormatUtc: String = js.native
  @scala.inline
  def defaultFormatUtc_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultFormatUtc")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def defaultFormat_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultFormat")(x.asInstanceOf[js.Any])
  
  @JSImport("moment-timezone", "defineLocale")
  @js.native
  def defineLocale(language: String, localeSpec: Unit): Locale_ = js.native
  @JSImport("moment-timezone", "defineLocale")
  @js.native
  def defineLocale(language: String, localeSpec: LocaleSpecification): Locale_ = js.native
  
  @JSImport("moment-timezone", "deprecationHandler")
  @js.native
  def deprecationHandler: (js.Function2[/* name */ String | Unit, /* msg */ String, Unit]) | Unit = js.native
  @scala.inline
  def deprecationHandler_=(x: (js.Function2[/* name */ String | Unit, /* msg */ String, Unit]) | Unit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deprecationHandler")(x.asInstanceOf[js.Any])
  
  @JSImport("moment-timezone", "duration")
  @js.native
  def duration(): Duration_ = js.native
  @JSImport("moment-timezone", "duration")
  @js.native
  def duration(inp: js.UndefOr[DurationInputArg1], unit: DurationInputArg2): Duration_ = js.native
  @JSImport("moment-timezone", "duration")
  @js.native
  def duration(inp: DurationInputArg1): Duration_ = js.native
  
  @JSImport("moment-timezone", "fn")
  @js.native
  def fn: Moment = js.native
  @scala.inline
  def fn_=(x: Moment): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
  
  @JSImport("moment-timezone", "invalid")
  @js.native
  def invalid(): Moment = js.native
  @JSImport("moment-timezone", "invalid")
  @js.native
  def invalid(flags: MomentParsingFlagsOpt): Moment = js.native
  
  @JSImport("moment-timezone", "isDate")
  @js.native
  def isDate(m: js.Any): /* is std.Date */ Boolean = js.native
  
  @JSImport("moment-timezone", "isDuration")
  @js.native
  def isDuration(d: js.Any): /* is moment.moment.Duration */ Boolean = js.native
  
  @JSImport("moment-timezone", "isMoment")
  @js.native
  def isMoment(m: js.Any): /* is moment.moment.Moment */ Boolean = js.native
  
  @JSImport("moment-timezone", "lang")
  @js.native
  def lang(): String = js.native
  @JSImport("moment-timezone", "lang")
  @js.native
  def lang(language: js.UndefOr[scala.Nothing], definition: Locale_): String = js.native
  @JSImport("moment-timezone", "lang")
  @js.native
  def lang(language: String): String = js.native
  @JSImport("moment-timezone", "lang")
  @js.native
  def lang(language: String, definition: Locale_): String = js.native
  
  @JSImport("moment-timezone", "locale")
  @js.native
  def locale(): String = js.native
  @JSImport("moment-timezone", "locale")
  @js.native
  def locale(language: js.UndefOr[scala.Nothing], definition: Unit): String = js.native
  @JSImport("moment-timezone", "locale")
  @js.native
  def locale(language: js.UndefOr[scala.Nothing], definition: LocaleSpecification): String = js.native
  @JSImport("moment-timezone", "locale")
  @js.native
  def locale(language: String): String = js.native
  @JSImport("moment-timezone", "locale")
  @js.native
  def locale(language: String, definition: Unit): String = js.native
  @JSImport("moment-timezone", "locale")
  @js.native
  def locale(language: String, definition: LocaleSpecification): String = js.native
  @JSImport("moment-timezone", "locale")
  @js.native
  def locale(language: js.Array[String]): String = js.native
  
  @JSImport("moment-timezone", "localeData")
  @js.native
  def localeData(): Locale_ = js.native
  @JSImport("moment-timezone", "localeData")
  @js.native
  def localeData(key: String): Locale_ = js.native
  @JSImport("moment-timezone", "localeData")
  @js.native
  def localeData(key: js.Array[String]): Locale_ = js.native
  
  @JSImport("moment-timezone", "locales")
  @js.native
  def locales(): js.Array[String] = js.native
  
  @JSImport("moment-timezone", "max")
  @js.native
  def max(moments: Moment*): Moment = js.native
  @JSImport("moment-timezone", "max")
  @js.native
  def max(moments: js.Array[Moment]): Moment = js.native
  
  @JSImport("moment-timezone", "min")
  @js.native
  def min(moments: Moment*): Moment = js.native
  @JSImport("moment-timezone", "min")
  @js.native
  def min(moments: js.Array[Moment]): Moment = js.native
  
  /* augmented module */
  object momentAugmentingMod {
    
    @JSImport("moment", "tz")
    @js.native
    val tz: MomentTimezone = js.native
    
    @js.native
    trait Moment extends StObject {
      
      def tz(): js.UndefOr[String] = js.native
      def tz(timezone: String): typings.moment.momentMod.Moment = js.native
      def tz(timezone: String, keepLocalTime: Boolean): typings.moment.momentMod.Moment = js.native
      
      def zoneAbbr(): String = js.native
      
      def zoneName(): String = js.native
    }
    
    @js.native
    trait MomentTimezone extends StObject {
      
      def apply(): typings.moment.momentMod.Moment = js.native
      def apply(
        date: String,
        format: typings.moment.momentMod.MomentFormatSpecification,
        language: String,
        strict: Boolean,
        timezone: String
      ): typings.moment.momentMod.Moment = js.native
      def apply(
        date: String,
        format: typings.moment.momentMod.MomentFormatSpecification,
        language: String,
        timezone: String
      ): typings.moment.momentMod.Moment = js.native
      def apply(
        date: String,
        format: typings.moment.momentMod.MomentFormatSpecification,
        strict: Boolean,
        timezone: String
      ): typings.moment.momentMod.Moment = js.native
      def apply(date: String, format: typings.moment.momentMod.MomentFormatSpecification, timezone: String): typings.moment.momentMod.Moment = js.native
      def apply(date: String, timezone: String): typings.moment.momentMod.Moment = js.native
      def apply(date: js.Any, timezone: String): typings.moment.momentMod.Moment = js.native
      def apply(date: js.Array[Double], timezone: String): typings.moment.momentMod.Moment = js.native
      def apply(date: Double, timezone: String): typings.moment.momentMod.Moment = js.native
      def apply(date: typings.moment.momentMod.Moment, timezone: String): typings.moment.momentMod.Moment = js.native
      def apply(date: Date, timezone: String): typings.moment.momentMod.Moment = js.native
      def apply(timezone: String): typings.moment.momentMod.Moment = js.native
      
      def add(packedZoneString: String): Unit = js.native
      def add(packedZoneString: js.Array[String]): Unit = js.native
      
      def countries(): js.Array[String] = js.native
      
      def guess(): String = js.native
      def guess(ignoreCache: Boolean): String = js.native
      
      def link(packedLinkString: String): Unit = js.native
      def link(packedLinkString: js.Array[String]): Unit = js.native
      
      def load(data: Links): Unit = js.native
      
      def names(): js.Array[String] = js.native
      
      def setDefault(): typings.momentTimezone.mod.momentAugmentingMod.Moment = js.native
      def setDefault(timezone: String): typings.momentTimezone.mod.momentAugmentingMod.Moment = js.native
      
      def zone(timezone: String): MomentZone | Null = js.native
      
      def zonesForCountry(country: String): js.Array[MomentZoneOffset | String] = js.native
      def zonesForCountry(country: String, with_offset: Boolean): js.Array[MomentZoneOffset | String] = js.native
      def zonesForCountry[T /* <: `false` */](country: String, with_offset: T): js.Array[String] = js.native
      @JSName("zonesForCountry")
      def zonesForCountry_T_false[T /* <: `false` */](country: String): js.Array[String] = js.native
      @JSName("zonesForCountry")
      def zonesForCountry_T_true[T /* <: `true` */](country: String, with_offset: T): js.Array[MomentZoneOffset] = js.native
    }
    
    @js.native
    trait MomentZone extends StObject {
      
      def abbr(timestamp: Double): String = js.native
      
      var abbrs: js.Array[String] = js.native
      
      var name: String = js.native
      
      def offset(timestamp: Double): Double = js.native
      
      var offsets: js.Array[Double] = js.native
      
      def parse(timestamp: Double): Double = js.native
      
      var population: Double = js.native
      
      var untils: js.Array[Double] = js.native
      
      def utcOffset(timestamp: Double): Double = js.native
    }
    object MomentZone {
      
      @scala.inline
      def apply(
        abbr: Double => String,
        abbrs: js.Array[String],
        name: String,
        offset: Double => Double,
        offsets: js.Array[Double],
        parse: Double => Double,
        population: Double,
        untils: js.Array[Double],
        utcOffset: Double => Double
      ): MomentZone = {
        val __obj = js.Dynamic.literal(abbr = js.Any.fromFunction1(abbr), abbrs = abbrs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offset = js.Any.fromFunction1(offset), offsets = offsets.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse), population = population.asInstanceOf[js.Any], untils = untils.asInstanceOf[js.Any], utcOffset = js.Any.fromFunction1(utcOffset))
        __obj.asInstanceOf[MomentZone]
      }
      
      @scala.inline
      implicit class MomentZoneMutableBuilder[Self <: MomentZone] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAbbr(value: Double => String): Self = StObject.set(x, "abbr", js.Any.fromFunction1(value))
        
        @scala.inline
        def setAbbrs(value: js.Array[String]): Self = StObject.set(x, "abbrs", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAbbrsVarargs(value: String*): Self = StObject.set(x, "abbrs", js.Array(value :_*))
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOffset(value: Double => Double): Self = StObject.set(x, "offset", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOffsets(value: js.Array[Double]): Self = StObject.set(x, "offsets", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOffsetsVarargs(value: Double*): Self = StObject.set(x, "offsets", js.Array(value :_*))
        
        @scala.inline
        def setParse(value: Double => Double): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
        
        @scala.inline
        def setPopulation(value: Double): Self = StObject.set(x, "population", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUntils(value: js.Array[Double]): Self = StObject.set(x, "untils", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUntilsVarargs(value: Double*): Self = StObject.set(x, "untils", js.Array(value :_*))
        
        @scala.inline
        def setUtcOffset(value: Double => Double): Self = StObject.set(x, "utcOffset", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait MomentZoneOffset extends StObject {
      
      var name: String = js.native
      
      var offset: Double = js.native
    }
    object MomentZoneOffset {
      
      @scala.inline
      def apply(name: String, offset: Double): MomentZoneOffset = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
        __obj.asInstanceOf[MomentZoneOffset]
      }
      
      @scala.inline
      implicit class MomentZoneOffsetMutableBuilder[Self <: MomentZoneOffset] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("moment-timezone", "months")
  @js.native
  def months(): js.Array[String] = js.native
  @JSImport("moment-timezone", "months")
  @js.native
  def months(format: String): js.Array[String] = js.native
  @JSImport("moment-timezone", "months")
  @js.native
  def months(format: String, index: Double): String = js.native
  @JSImport("moment-timezone", "months")
  @js.native
  def months(index: Double): String = js.native
  
  @JSImport("moment-timezone", "monthsShort")
  @js.native
  def monthsShort(): js.Array[String] = js.native
  @JSImport("moment-timezone", "monthsShort")
  @js.native
  def monthsShort(format: String): js.Array[String] = js.native
  @JSImport("moment-timezone", "monthsShort")
  @js.native
  def monthsShort(format: String, index: Double): String = js.native
  @JSImport("moment-timezone", "monthsShort")
  @js.native
  def monthsShort(index: Double): String = js.native
  
  @JSImport("moment-timezone", "normalizeUnits")
  @js.native
  def normalizeUnits(unit: All): String = js.native
  
  @JSImport("moment-timezone", "now")
  @js.native
  def now(): Double = js.native
  
  @JSImport("moment-timezone", "parseTwoDigitYear")
  @js.native
  def parseTwoDigitYear(input: String): Double = js.native
  
  @JSImport("moment-timezone", "parseZone")
  @js.native
  def parseZone(): Moment = js.native
  @JSImport("moment-timezone", "parseZone")
  @js.native
  def parseZone(
    inp: js.UndefOr[MomentInput],
    format: js.UndefOr[MomentFormatSpecification],
    language: js.UndefOr[scala.Nothing],
    strict: Boolean
  ): Moment = js.native
  @JSImport("moment-timezone", "parseZone")
  @js.native
  def parseZone(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], language: String): Moment = js.native
  @JSImport("moment-timezone", "parseZone")
  @js.native
  def parseZone(
    inp: js.UndefOr[MomentInput],
    format: js.UndefOr[MomentFormatSpecification],
    language: String,
    strict: Boolean
  ): Moment = js.native
  @JSImport("moment-timezone", "parseZone")
  @js.native
  def parseZone(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], strict: Boolean): Moment = js.native
  @JSImport("moment-timezone", "parseZone")
  @js.native
  def parseZone(inp: js.UndefOr[MomentInput], format: MomentFormatSpecification): Moment = js.native
  @JSImport("moment-timezone", "parseZone")
  @js.native
  def parseZone(inp: MomentInput): Moment = js.native
  
  @JSImport("moment-timezone", "relativeTimeRounding")
  @js.native
  def relativeTimeRounding(): js.Function1[/* num */ Double, Double] = js.native
  @JSImport("moment-timezone", "relativeTimeRounding")
  @js.native
  def relativeTimeRounding(fn: js.Function1[/* num */ Double, Double]): Boolean = js.native
  
  @JSImport("moment-timezone", "relativeTimeThreshold")
  @js.native
  def relativeTimeThreshold(threshold: String): Double | Boolean = js.native
  @JSImport("moment-timezone", "relativeTimeThreshold")
  @js.native
  def relativeTimeThreshold(threshold: String, limit: Double): Boolean = js.native
  
  @JSImport("moment-timezone", "suppressDeprecationWarnings")
  @js.native
  def suppressDeprecationWarnings: Boolean = js.native
  @scala.inline
  def suppressDeprecationWarnings_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suppressDeprecationWarnings")(x.asInstanceOf[js.Any])
  
  @JSImport("moment-timezone", "tz")
  @js.native
  val tz: MomentTimezone = js.native
  
  @JSImport("moment-timezone", "unix")
  @js.native
  def unix(timestamp: Double): Moment = js.native
  
  @JSImport("moment-timezone", "updateLocale")
  @js.native
  def updateLocale(language: String, localeSpec: Unit): Locale_ = js.native
  @JSImport("moment-timezone", "updateLocale")
  @js.native
  def updateLocale(language: String, localeSpec: LocaleSpecification): Locale_ = js.native
  
  @JSImport("moment-timezone", "utc")
  @js.native
  def utc(): Moment = js.native
  @JSImport("moment-timezone", "utc")
  @js.native
  def utc(
    inp: js.UndefOr[MomentInput],
    format: js.UndefOr[MomentFormatSpecification],
    language: js.UndefOr[scala.Nothing],
    strict: Boolean
  ): Moment = js.native
  @JSImport("moment-timezone", "utc")
  @js.native
  def utc(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], language: String): Moment = js.native
  @JSImport("moment-timezone", "utc")
  @js.native
  def utc(
    inp: js.UndefOr[MomentInput],
    format: js.UndefOr[MomentFormatSpecification],
    language: String,
    strict: Boolean
  ): Moment = js.native
  @JSImport("moment-timezone", "utc")
  @js.native
  def utc(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], strict: Boolean): Moment = js.native
  @JSImport("moment-timezone", "utc")
  @js.native
  def utc(inp: js.UndefOr[MomentInput], format: MomentFormatSpecification): Moment = js.native
  @JSImport("moment-timezone", "utc")
  @js.native
  def utc(inp: js.UndefOr[MomentInput], strict: Boolean): Moment = js.native
  @JSImport("moment-timezone", "utc")
  @js.native
  def utc(inp: MomentInput): Moment = js.native
  
  @JSImport("moment-timezone", "version")
  @js.native
  def version: String = js.native
  @scala.inline
  def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  @JSImport("moment-timezone", "weekdays")
  @js.native
  def weekdays(): js.Array[String] = js.native
  @JSImport("moment-timezone", "weekdays")
  @js.native
  def weekdays(format: String): js.Array[String] = js.native
  @JSImport("moment-timezone", "weekdays")
  @js.native
  def weekdays(format: String, index: Double): String = js.native
  @JSImport("moment-timezone", "weekdays")
  @js.native
  def weekdays(index: Double): String = js.native
  @JSImport("moment-timezone", "weekdays")
  @js.native
  def weekdays(localeSorted: Boolean): js.Array[String] = js.native
  @JSImport("moment-timezone", "weekdays")
  @js.native
  def weekdays(localeSorted: Boolean, format: String): js.Array[String] = js.native
  @JSImport("moment-timezone", "weekdays")
  @js.native
  def weekdays(localeSorted: Boolean, format: String, index: Double): String = js.native
  @JSImport("moment-timezone", "weekdays")
  @js.native
  def weekdays(localeSorted: Boolean, index: Double): String = js.native
  
  @JSImport("moment-timezone", "weekdaysMin")
  @js.native
  def weekdaysMin(): js.Array[String] = js.native
  @JSImport("moment-timezone", "weekdaysMin")
  @js.native
  def weekdaysMin(format: String): js.Array[String] = js.native
  @JSImport("moment-timezone", "weekdaysMin")
  @js.native
  def weekdaysMin(format: String, index: Double): String = js.native
  @JSImport("moment-timezone", "weekdaysMin")
  @js.native
  def weekdaysMin(index: Double): String = js.native
  @JSImport("moment-timezone", "weekdaysMin")
  @js.native
  def weekdaysMin(localeSorted: Boolean): js.Array[String] = js.native
  @JSImport("moment-timezone", "weekdaysMin")
  @js.native
  def weekdaysMin(localeSorted: Boolean, format: String): js.Array[String] = js.native
  @JSImport("moment-timezone", "weekdaysMin")
  @js.native
  def weekdaysMin(localeSorted: Boolean, format: String, index: Double): String = js.native
  @JSImport("moment-timezone", "weekdaysMin")
  @js.native
  def weekdaysMin(localeSorted: Boolean, index: Double): String = js.native
  
  @JSImport("moment-timezone", "weekdaysShort")
  @js.native
  def weekdaysShort(): js.Array[String] = js.native
  @JSImport("moment-timezone", "weekdaysShort")
  @js.native
  def weekdaysShort(format: String): js.Array[String] = js.native
  @JSImport("moment-timezone", "weekdaysShort")
  @js.native
  def weekdaysShort(format: String, index: Double): String = js.native
  @JSImport("moment-timezone", "weekdaysShort")
  @js.native
  def weekdaysShort(index: Double): String = js.native
  @JSImport("moment-timezone", "weekdaysShort")
  @js.native
  def weekdaysShort(localeSorted: Boolean): js.Array[String] = js.native
  @JSImport("moment-timezone", "weekdaysShort")
  @js.native
  def weekdaysShort(localeSorted: Boolean, format: String): js.Array[String] = js.native
  @JSImport("moment-timezone", "weekdaysShort")
  @js.native
  def weekdaysShort(localeSorted: Boolean, format: String, index: Double): String = js.native
  @JSImport("moment-timezone", "weekdaysShort")
  @js.native
  def weekdaysShort(localeSorted: Boolean, index: Double): String = js.native
}
