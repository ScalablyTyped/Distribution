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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): Moment = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Moment]
  @scala.inline
  def apply(inp: Unit, format: Unit, language: String): Moment = (^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def apply(inp: Unit, format: Unit, language: String, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def apply(inp: Unit, format: Unit, language: Unit, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def apply(inp: Unit, format: Unit, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def apply(inp: Unit, format: MomentFormatSpecification): Moment = (^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def apply(inp: Unit, format: MomentFormatSpecification, language: String): Moment = (^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def apply(inp: Unit, format: MomentFormatSpecification, language: String, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def apply(inp: Unit, format: MomentFormatSpecification, language: Unit, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def apply(inp: Unit, format: MomentFormatSpecification, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def apply(inp: Unit, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def apply(inp: MomentInput): Moment = ^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any]).asInstanceOf[Moment]
  @scala.inline
  def apply(inp: MomentInput, format: Unit, language: String): Moment = (^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def apply(inp: MomentInput, format: Unit, language: String, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def apply(inp: MomentInput, format: Unit, language: Unit, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def apply(inp: MomentInput, format: Unit, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def apply(inp: MomentInput, format: MomentFormatSpecification): Moment = (^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def apply(inp: MomentInput, format: MomentFormatSpecification, language: String): Moment = (^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def apply(inp: MomentInput, format: MomentFormatSpecification, language: String, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def apply(inp: MomentInput, format: MomentFormatSpecification, language: Unit, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def apply(inp: MomentInput, format: MomentFormatSpecification, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def apply(inp: MomentInput, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  
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
  
  @scala.inline
  def calendarFormat(m: Moment, now: Moment): String = (^.asInstanceOf[js.Dynamic].applyDynamic("calendarFormat")(m.asInstanceOf[js.Any], now.asInstanceOf[js.Any])).asInstanceOf[String]
  
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
  
  @scala.inline
  def defineLocale(language: String, localeSpec: Unit): Locale_ = (^.asInstanceOf[js.Dynamic].applyDynamic("defineLocale")(language.asInstanceOf[js.Any], localeSpec.asInstanceOf[js.Any])).asInstanceOf[Locale_]
  @scala.inline
  def defineLocale(language: String, localeSpec: LocaleSpecification): Locale_ = (^.asInstanceOf[js.Dynamic].applyDynamic("defineLocale")(language.asInstanceOf[js.Any], localeSpec.asInstanceOf[js.Any])).asInstanceOf[Locale_]
  
  @JSImport("moment-timezone", "deprecationHandler")
  @js.native
  def deprecationHandler: (js.Function2[/* name */ String | Unit, /* msg */ String, Unit]) | Unit = js.native
  @scala.inline
  def deprecationHandler_=(x: (js.Function2[/* name */ String | Unit, /* msg */ String, Unit]) | Unit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deprecationHandler")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def duration(): Duration_ = ^.asInstanceOf[js.Dynamic].applyDynamic("duration")().asInstanceOf[Duration_]
  @scala.inline
  def duration(inp: Unit, unit: DurationInputArg2): Duration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("duration")(inp.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Duration_]
  @scala.inline
  def duration(inp: DurationInputArg1): Duration_ = ^.asInstanceOf[js.Dynamic].applyDynamic("duration")(inp.asInstanceOf[js.Any]).asInstanceOf[Duration_]
  @scala.inline
  def duration(inp: DurationInputArg1, unit: DurationInputArg2): Duration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("duration")(inp.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Duration_]
  
  @JSImport("moment-timezone", "fn")
  @js.native
  def fn: Moment = js.native
  @scala.inline
  def fn_=(x: Moment): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def invalid(): Moment = ^.asInstanceOf[js.Dynamic].applyDynamic("invalid")().asInstanceOf[Moment]
  @scala.inline
  def invalid(flags: MomentParsingFlagsOpt): Moment = ^.asInstanceOf[js.Dynamic].applyDynamic("invalid")(flags.asInstanceOf[js.Any]).asInstanceOf[Moment]
  
  @scala.inline
  def isDate(m: js.Any): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(m.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
  
  @scala.inline
  def isDuration(d: js.Any): /* is moment.moment.Duration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDuration")(d.asInstanceOf[js.Any]).asInstanceOf[/* is moment.moment.Duration */ Boolean]
  
  @scala.inline
  def isMoment(m: js.Any): /* is moment.moment.Moment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMoment")(m.asInstanceOf[js.Any]).asInstanceOf[/* is moment.moment.Moment */ Boolean]
  
  @scala.inline
  def lang(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("lang")().asInstanceOf[String]
  @scala.inline
  def lang(language: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("lang")(language.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def lang(language: String, definition: Locale_): String = (^.asInstanceOf[js.Dynamic].applyDynamic("lang")(language.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def lang(language: Unit, definition: Locale_): String = (^.asInstanceOf[js.Dynamic].applyDynamic("lang")(language.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def locale(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("locale")().asInstanceOf[String]
  @scala.inline
  def locale(language: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("locale")(language.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def locale(language: String, definition: Unit): String = (^.asInstanceOf[js.Dynamic].applyDynamic("locale")(language.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def locale(language: String, definition: LocaleSpecification): String = (^.asInstanceOf[js.Dynamic].applyDynamic("locale")(language.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def locale(language: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("locale")(language.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def locale(language: Unit, definition: Unit): String = (^.asInstanceOf[js.Dynamic].applyDynamic("locale")(language.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def locale(language: Unit, definition: LocaleSpecification): String = (^.asInstanceOf[js.Dynamic].applyDynamic("locale")(language.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def localeData(): Locale_ = ^.asInstanceOf[js.Dynamic].applyDynamic("localeData")().asInstanceOf[Locale_]
  @scala.inline
  def localeData(key: String): Locale_ = ^.asInstanceOf[js.Dynamic].applyDynamic("localeData")(key.asInstanceOf[js.Any]).asInstanceOf[Locale_]
  @scala.inline
  def localeData(key: js.Array[String]): Locale_ = ^.asInstanceOf[js.Dynamic].applyDynamic("localeData")(key.asInstanceOf[js.Any]).asInstanceOf[Locale_]
  
  @scala.inline
  def locales(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("locales")().asInstanceOf[js.Array[String]]
  
  @scala.inline
  def max(moments: Moment*): Moment = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(moments.asInstanceOf[js.Any]).asInstanceOf[Moment]
  @scala.inline
  def max(moments: js.Array[Moment]): Moment = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(moments.asInstanceOf[js.Any]).asInstanceOf[Moment]
  
  @scala.inline
  def min(moments: Moment*): Moment = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(moments.asInstanceOf[js.Any]).asInstanceOf[Moment]
  @scala.inline
  def min(moments: js.Array[Moment]): Moment = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(moments.asInstanceOf[js.Any]).asInstanceOf[Moment]
  
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
    
    trait MomentZone extends StObject {
      
      def abbr(timestamp: Double): String
      
      var abbrs: js.Array[String]
      
      var name: String
      
      def offset(timestamp: Double): Double
      
      var offsets: js.Array[Double]
      
      def parse(timestamp: Double): Double
      
      var population: Double
      
      var untils: js.Array[Double]
      
      def utcOffset(timestamp: Double): Double
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
    
    trait MomentZoneOffset extends StObject {
      
      var name: String
      
      var offset: Double
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
  
  @scala.inline
  def months(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("months")().asInstanceOf[js.Array[String]]
  @scala.inline
  def months(format: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("months")(format.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def months(format: String, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("months")(format.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def months(index: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("months")(index.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def monthsShort(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("monthsShort")().asInstanceOf[js.Array[String]]
  @scala.inline
  def monthsShort(format: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("monthsShort")(format.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def monthsShort(format: String, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("monthsShort")(format.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def monthsShort(index: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("monthsShort")(index.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def normalizeUnits(unit: All): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeUnits")(unit.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
  
  @scala.inline
  def parseTwoDigitYear(input: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTwoDigitYear")(input.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def parseZone(): Moment = ^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")().asInstanceOf[Moment]
  @scala.inline
  def parseZone(inp: Unit, format: Unit, language: String): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def parseZone(inp: Unit, format: Unit, language: String, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def parseZone(inp: Unit, format: Unit, language: Unit, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def parseZone(inp: Unit, format: Unit, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def parseZone(inp: Unit, format: MomentFormatSpecification): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def parseZone(inp: Unit, format: MomentFormatSpecification, language: String): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def parseZone(inp: Unit, format: MomentFormatSpecification, language: String, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def parseZone(inp: Unit, format: MomentFormatSpecification, language: Unit, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def parseZone(inp: Unit, format: MomentFormatSpecification, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def parseZone(inp: MomentInput): Moment = ^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any]).asInstanceOf[Moment]
  @scala.inline
  def parseZone(inp: MomentInput, format: Unit, language: String): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def parseZone(inp: MomentInput, format: Unit, language: String, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def parseZone(inp: MomentInput, format: Unit, language: Unit, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def parseZone(inp: MomentInput, format: Unit, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def parseZone(inp: MomentInput, format: MomentFormatSpecification): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def parseZone(inp: MomentInput, format: MomentFormatSpecification, language: String): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def parseZone(inp: MomentInput, format: MomentFormatSpecification, language: String, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def parseZone(inp: MomentInput, format: MomentFormatSpecification, language: Unit, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def parseZone(inp: MomentInput, format: MomentFormatSpecification, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  
  @scala.inline
  def relativeTimeRounding(): js.Function1[/* num */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("relativeTimeRounding")().asInstanceOf[js.Function1[/* num */ Double, Double]]
  @scala.inline
  def relativeTimeRounding(fn: js.Function1[/* num */ Double, Double]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("relativeTimeRounding")(fn.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def relativeTimeThreshold(threshold: String): Double | Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("relativeTimeThreshold")(threshold.asInstanceOf[js.Any]).asInstanceOf[Double | Boolean]
  @scala.inline
  def relativeTimeThreshold(threshold: String, limit: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("relativeTimeThreshold")(threshold.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("moment-timezone", "suppressDeprecationWarnings")
  @js.native
  def suppressDeprecationWarnings: Boolean = js.native
  @scala.inline
  def suppressDeprecationWarnings_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suppressDeprecationWarnings")(x.asInstanceOf[js.Any])
  
  @JSImport("moment-timezone", "tz")
  @js.native
  val tz: MomentTimezone = js.native
  
  @scala.inline
  def unix(timestamp: Double): Moment = ^.asInstanceOf[js.Dynamic].applyDynamic("unix")(timestamp.asInstanceOf[js.Any]).asInstanceOf[Moment]
  
  @scala.inline
  def updateLocale(language: String, localeSpec: Unit): Locale_ = (^.asInstanceOf[js.Dynamic].applyDynamic("updateLocale")(language.asInstanceOf[js.Any], localeSpec.asInstanceOf[js.Any])).asInstanceOf[Locale_]
  @scala.inline
  def updateLocale(language: String, localeSpec: LocaleSpecification): Locale_ = (^.asInstanceOf[js.Dynamic].applyDynamic("updateLocale")(language.asInstanceOf[js.Any], localeSpec.asInstanceOf[js.Any])).asInstanceOf[Locale_]
  
  @scala.inline
  def utc(): Moment = ^.asInstanceOf[js.Dynamic].applyDynamic("utc")().asInstanceOf[Moment]
  @scala.inline
  def utc(inp: Unit, format: Unit, language: String): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def utc(inp: Unit, format: Unit, language: String, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def utc(inp: Unit, format: Unit, language: Unit, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def utc(inp: Unit, format: Unit, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def utc(inp: Unit, format: MomentFormatSpecification): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def utc(inp: Unit, format: MomentFormatSpecification, language: String): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def utc(inp: Unit, format: MomentFormatSpecification, language: String, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def utc(inp: Unit, format: MomentFormatSpecification, language: Unit, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def utc(inp: Unit, format: MomentFormatSpecification, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def utc(inp: Unit, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def utc(inp: MomentInput): Moment = ^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any]).asInstanceOf[Moment]
  @scala.inline
  def utc(inp: MomentInput, format: Unit, language: String): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def utc(inp: MomentInput, format: Unit, language: String, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def utc(inp: MomentInput, format: Unit, language: Unit, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def utc(inp: MomentInput, format: Unit, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def utc(inp: MomentInput, format: MomentFormatSpecification): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def utc(inp: MomentInput, format: MomentFormatSpecification, language: String): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def utc(inp: MomentInput, format: MomentFormatSpecification, language: String, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def utc(inp: MomentInput, format: MomentFormatSpecification, language: Unit, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def utc(inp: MomentInput, format: MomentFormatSpecification, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  @scala.inline
  def utc(inp: MomentInput, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  
  @JSImport("moment-timezone", "version")
  @js.native
  def version: String = js.native
  @scala.inline
  def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def weekdays(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")().asInstanceOf[js.Array[String]]
  @scala.inline
  def weekdays(format: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")(format.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def weekdays(format: String, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")(format.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def weekdays(index: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")(index.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def weekdays(localeSorted: Boolean): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")(localeSorted.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def weekdays(localeSorted: Boolean, format: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")(localeSorted.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def weekdays(localeSorted: Boolean, format: String, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")(localeSorted.asInstanceOf[js.Any], format.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def weekdays(localeSorted: Boolean, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")(localeSorted.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def weekdaysMin(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysMin")().asInstanceOf[js.Array[String]]
  @scala.inline
  def weekdaysMin(format: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysMin")(format.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def weekdaysMin(format: String, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysMin")(format.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def weekdaysMin(index: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysMin")(index.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def weekdaysMin(localeSorted: Boolean): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysMin")(localeSorted.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def weekdaysMin(localeSorted: Boolean, format: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysMin")(localeSorted.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def weekdaysMin(localeSorted: Boolean, format: String, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysMin")(localeSorted.asInstanceOf[js.Any], format.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def weekdaysMin(localeSorted: Boolean, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysMin")(localeSorted.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def weekdaysShort(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysShort")().asInstanceOf[js.Array[String]]
  @scala.inline
  def weekdaysShort(format: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysShort")(format.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def weekdaysShort(format: String, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysShort")(format.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def weekdaysShort(index: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysShort")(index.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def weekdaysShort(localeSorted: Boolean): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysShort")(localeSorted.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def weekdaysShort(localeSorted: Boolean, format: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysShort")(localeSorted.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def weekdaysShort(localeSorted: Boolean, format: String, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysShort")(localeSorted.asInstanceOf[js.Any], format.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def weekdaysShort(localeSorted: Boolean, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysShort")(localeSorted.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
}
