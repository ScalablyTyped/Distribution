package typings.momentHijri

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
import typings.momentHijri.mod.momentAugmentingMod.iConvert.GregorianResult
import typings.momentHijri.mod.momentAugmentingMod.iConvert.HijriResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Moment = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Moment]
  inline def apply(inp: Unit, format: Unit, language: String): Moment = (^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def apply(inp: Unit, format: Unit, language: String, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def apply(inp: Unit, format: Unit, language: Unit, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def apply(inp: Unit, format: Unit, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def apply(inp: Unit, format: MomentFormatSpecification): Moment = (^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def apply(inp: Unit, format: MomentFormatSpecification, language: String): Moment = (^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def apply(inp: Unit, format: MomentFormatSpecification, language: String, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def apply(inp: Unit, format: MomentFormatSpecification, language: Unit, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def apply(inp: Unit, format: MomentFormatSpecification, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def apply(inp: Unit, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def apply(inp: MomentInput): Moment = ^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any]).asInstanceOf[Moment]
  inline def apply(inp: MomentInput, format: Unit, language: String): Moment = (^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def apply(inp: MomentInput, format: Unit, language: String, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def apply(inp: MomentInput, format: Unit, language: Unit, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def apply(inp: MomentInput, format: Unit, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def apply(inp: MomentInput, format: MomentFormatSpecification): Moment = (^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def apply(inp: MomentInput, format: MomentFormatSpecification, language: String): Moment = (^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def apply(inp: MomentInput, format: MomentFormatSpecification, language: String, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def apply(inp: MomentInput, format: MomentFormatSpecification, language: Unit, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def apply(inp: MomentInput, format: MomentFormatSpecification, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def apply(inp: MomentInput, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  
  @JSImport("moment-hijri", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object HTML5_FMT {
    
    @JSImport("moment-hijri", "HTML5_FMT")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("moment-hijri", "HTML5_FMT.DATE")
    @js.native
    def DATE: String = js.native
    
    @JSImport("moment-hijri", "HTML5_FMT.DATETIME_LOCAL")
    @js.native
    def DATETIME_LOCAL: String = js.native
    inline def DATETIME_LOCAL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATETIME_LOCAL")(x.asInstanceOf[js.Any])
    
    @JSImport("moment-hijri", "HTML5_FMT.DATETIME_LOCAL_MS")
    @js.native
    def DATETIME_LOCAL_MS: String = js.native
    inline def DATETIME_LOCAL_MS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATETIME_LOCAL_MS")(x.asInstanceOf[js.Any])
    
    @JSImport("moment-hijri", "HTML5_FMT.DATETIME_LOCAL_SECONDS")
    @js.native
    def DATETIME_LOCAL_SECONDS: String = js.native
    inline def DATETIME_LOCAL_SECONDS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATETIME_LOCAL_SECONDS")(x.asInstanceOf[js.Any])
    
    inline def DATE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATE")(x.asInstanceOf[js.Any])
    
    @JSImport("moment-hijri", "HTML5_FMT.MONTH")
    @js.native
    def MONTH: String = js.native
    inline def MONTH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MONTH")(x.asInstanceOf[js.Any])
    
    @JSImport("moment-hijri", "HTML5_FMT.TIME")
    @js.native
    def TIME: String = js.native
    inline def TIME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIME")(x.asInstanceOf[js.Any])
    
    @JSImport("moment-hijri", "HTML5_FMT.TIME_MS")
    @js.native
    def TIME_MS: String = js.native
    inline def TIME_MS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIME_MS")(x.asInstanceOf[js.Any])
    
    @JSImport("moment-hijri", "HTML5_FMT.TIME_SECONDS")
    @js.native
    def TIME_SECONDS: String = js.native
    inline def TIME_SECONDS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIME_SECONDS")(x.asInstanceOf[js.Any])
    
    @JSImport("moment-hijri", "HTML5_FMT.WEEK")
    @js.native
    def WEEK: String = js.native
    inline def WEEK_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WEEK")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("moment-hijri", "ISO_8601")
  @js.native
  def ISO_8601: MomentBuiltinFormat = js.native
  inline def ISO_8601_=(x: MomentBuiltinFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISO_8601")(x.asInstanceOf[js.Any])
  
  @JSImport("moment-hijri", "RFC_2822")
  @js.native
  def RFC_2822: MomentBuiltinFormat = js.native
  inline def RFC_2822_=(x: MomentBuiltinFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RFC_2822")(x.asInstanceOf[js.Any])
  
  inline def calendarFormat(m: Moment, now: Moment): String = (^.asInstanceOf[js.Dynamic].applyDynamic("calendarFormat")(m.asInstanceOf[js.Any], now.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("moment-hijri", "defaultFormat")
  @js.native
  def defaultFormat: String = js.native
  
  @JSImport("moment-hijri", "defaultFormatUtc")
  @js.native
  def defaultFormatUtc: String = js.native
  inline def defaultFormatUtc_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultFormatUtc")(x.asInstanceOf[js.Any])
  
  inline def defaultFormat_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultFormat")(x.asInstanceOf[js.Any])
  
  inline def defineLocale(language: String, localeSpec: Unit): Locale_ = (^.asInstanceOf[js.Dynamic].applyDynamic("defineLocale")(language.asInstanceOf[js.Any], localeSpec.asInstanceOf[js.Any])).asInstanceOf[Locale_]
  inline def defineLocale(language: String, localeSpec: LocaleSpecification): Locale_ = (^.asInstanceOf[js.Dynamic].applyDynamic("defineLocale")(language.asInstanceOf[js.Any], localeSpec.asInstanceOf[js.Any])).asInstanceOf[Locale_]
  
  @JSImport("moment-hijri", "deprecationHandler")
  @js.native
  def deprecationHandler: (js.Function2[/* name */ String | Unit, /* msg */ String, Unit]) | Unit = js.native
  inline def deprecationHandler_=(x: (js.Function2[/* name */ String | Unit, /* msg */ String, Unit]) | Unit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deprecationHandler")(x.asInstanceOf[js.Any])
  
  inline def duration(): Duration_ = ^.asInstanceOf[js.Dynamic].applyDynamic("duration")().asInstanceOf[Duration_]
  inline def duration(inp: Unit, unit: DurationInputArg2): Duration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("duration")(inp.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Duration_]
  inline def duration(inp: DurationInputArg1): Duration_ = ^.asInstanceOf[js.Dynamic].applyDynamic("duration")(inp.asInstanceOf[js.Any]).asInstanceOf[Duration_]
  inline def duration(inp: DurationInputArg1, unit: DurationInputArg2): Duration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("duration")(inp.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Duration_]
  
  @JSImport("moment-hijri", "fn")
  @js.native
  def fn: Moment = js.native
  inline def fn_=(x: Moment): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
  
  object iConvert {
    
    @JSImport("moment-hijri", "iConvert")
    @js.native
    val ^ : js.Any = js.native
    
    inline def toGregorian(hy: Double, hm: Double, hd: Double): GregorianResult = (^.asInstanceOf[js.Dynamic].applyDynamic("toGregorian")(hy.asInstanceOf[js.Any], hm.asInstanceOf[js.Any], hd.asInstanceOf[js.Any])).asInstanceOf[GregorianResult]
    
    inline def toHijri(gy: Double, gm: Double, gd: Double): HijriResult = (^.asInstanceOf[js.Dynamic].applyDynamic("toHijri")(gy.asInstanceOf[js.Any], gm.asInstanceOf[js.Any], gd.asInstanceOf[js.Any])).asInstanceOf[HijriResult]
  }
  
  inline def iDaysInMonth(year: Double, month: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("iDaysInMonth")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def invalid(): Moment = ^.asInstanceOf[js.Dynamic].applyDynamic("invalid")().asInstanceOf[Moment]
  inline def invalid(flags: MomentParsingFlagsOpt): Moment = ^.asInstanceOf[js.Dynamic].applyDynamic("invalid")(flags.asInstanceOf[js.Any]).asInstanceOf[Moment]
  
  inline def isDate(m: Any): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(m.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
  
  inline def isDuration(d: Any): /* is moment.moment.Duration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDuration")(d.asInstanceOf[js.Any]).asInstanceOf[/* is moment.moment.Duration */ Boolean]
  
  inline def isMoment(m: Any): /* is moment.moment.Moment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMoment")(m.asInstanceOf[js.Any]).asInstanceOf[/* is moment.moment.Moment */ Boolean]
  
  inline def lang(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("lang")().asInstanceOf[String]
  inline def lang(language: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("lang")(language.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def lang(language: String, definition: Locale_): String = (^.asInstanceOf[js.Dynamic].applyDynamic("lang")(language.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def lang(language: Unit, definition: Locale_): String = (^.asInstanceOf[js.Dynamic].applyDynamic("lang")(language.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def locale(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("locale")().asInstanceOf[String]
  inline def locale(language: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("locale")(language.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def locale(language: String, definition: Unit): String = (^.asInstanceOf[js.Dynamic].applyDynamic("locale")(language.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def locale(language: String, definition: LocaleSpecification): String = (^.asInstanceOf[js.Dynamic].applyDynamic("locale")(language.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def locale(language: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("locale")(language.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def locale(language: Unit, definition: Unit): String = (^.asInstanceOf[js.Dynamic].applyDynamic("locale")(language.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def locale(language: Unit, definition: LocaleSpecification): String = (^.asInstanceOf[js.Dynamic].applyDynamic("locale")(language.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def localeData(): Locale_ = ^.asInstanceOf[js.Dynamic].applyDynamic("localeData")().asInstanceOf[Locale_]
  inline def localeData(key: String): Locale_ = ^.asInstanceOf[js.Dynamic].applyDynamic("localeData")(key.asInstanceOf[js.Any]).asInstanceOf[Locale_]
  inline def localeData(key: js.Array[String]): Locale_ = ^.asInstanceOf[js.Dynamic].applyDynamic("localeData")(key.asInstanceOf[js.Any]).asInstanceOf[Locale_]
  
  inline def locales(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("locales")().asInstanceOf[js.Array[String]]
  
  inline def max(moments: Moment*): Moment = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(moments.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Moment]
  inline def max(moments: js.Array[Moment]): Moment = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(moments.asInstanceOf[js.Any]).asInstanceOf[Moment]
  
  inline def min(moments: Moment*): Moment = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(moments.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Moment]
  inline def min(moments: js.Array[Moment]): Moment = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(moments.asInstanceOf[js.Any]).asInstanceOf[Moment]
  
  /* augmented module */
  object momentAugmentingMod {
    
    @JSImport("moment", JSImport.Namespace)
    @js.native
    val ^ : js.Any = js.native
    
    object iConvert {
      
      @JSImport("moment", "iConvert")
      @js.native
      val ^ : js.Any = js.native
      
      inline def toGregorian(hy: Double, hm: Double, hd: Double): GregorianResult = (^.asInstanceOf[js.Dynamic].applyDynamic("toGregorian")(hy.asInstanceOf[js.Any], hm.asInstanceOf[js.Any], hd.asInstanceOf[js.Any])).asInstanceOf[GregorianResult]
      
      inline def toHijri(gy: Double, gm: Double, gd: Double): HijriResult = (^.asInstanceOf[js.Dynamic].applyDynamic("toHijri")(gy.asInstanceOf[js.Any], gm.asInstanceOf[js.Any], gd.asInstanceOf[js.Any])).asInstanceOf[HijriResult]
      
      trait GregorianResult extends StObject {
        
        var gd: Double
        
        var gm: Double
        
        var gy: Double
      }
      object GregorianResult {
        
        inline def apply(gd: Double, gm: Double, gy: Double): GregorianResult = {
          val __obj = js.Dynamic.literal(gd = gd.asInstanceOf[js.Any], gm = gm.asInstanceOf[js.Any], gy = gy.asInstanceOf[js.Any])
          __obj.asInstanceOf[GregorianResult]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: GregorianResult] (val x: Self) extends AnyVal {
          
          inline def setGd(value: Double): Self = StObject.set(x, "gd", value.asInstanceOf[js.Any])
          
          inline def setGm(value: Double): Self = StObject.set(x, "gm", value.asInstanceOf[js.Any])
          
          inline def setGy(value: Double): Self = StObject.set(x, "gy", value.asInstanceOf[js.Any])
        }
      }
      
      trait HijriResult extends StObject {
        
        var hd: Double
        
        var hm: Double
        
        var hy: Double
      }
      object HijriResult {
        
        inline def apply(hd: Double, hm: Double, hy: Double): HijriResult = {
          val __obj = js.Dynamic.literal(hd = hd.asInstanceOf[js.Any], hm = hm.asInstanceOf[js.Any], hy = hy.asInstanceOf[js.Any])
          __obj.asInstanceOf[HijriResult]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: HijriResult] (val x: Self) extends AnyVal {
          
          inline def setHd(value: Double): Self = StObject.set(x, "hd", value.asInstanceOf[js.Any])
          
          inline def setHm(value: Double): Self = StObject.set(x, "hm", value.asInstanceOf[js.Any])
          
          inline def setHy(value: Double): Self = StObject.set(x, "hy", value.asInstanceOf[js.Any])
        }
      }
    }
    
    inline def iDaysInMonth(year: Double, month: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("iDaysInMonth")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /* Rewritten from type alias, can be one of: 
      - typings.momentHijri.momentHijriStrings.iYear
      - typings.momentHijri.momentHijriStrings.iMonth
    */
    trait IUnitOfTime extends StObject
    object IUnitOfTime {
      
      inline def iMonth: typings.momentHijri.momentHijriStrings.iMonth = "iMonth".asInstanceOf[typings.momentHijri.momentHijriStrings.iMonth]
      
      inline def iYear: typings.momentHijri.momentHijriStrings.iYear = "iYear".asInstanceOf[typings.momentHijri.momentHijriStrings.iYear]
    }
    
    @js.native
    trait Moment extends StObject {
      
      def add(amount: String, unit: IUnitOfTime): typings.momentHijri.mod.momentAugmentingMod.Moment = js.native
      def add(amount: Double, unit: IUnitOfTime): typings.momentHijri.mod.momentAugmentingMod.Moment = js.native
      
      def endOf(unit: IUnitOfTime): typings.momentHijri.mod.momentAugmentingMod.Moment = js.native
      
      def iDate(): Double = js.native
      def iDate(d: Double): typings.momentHijri.mod.momentAugmentingMod.Moment = js.native
      
      def iDayOfYear(): Double = js.native
      def iDayOfYear(d: Double): typings.momentHijri.mod.momentAugmentingMod.Moment = js.native
      
      def iDaysInMonth(): Double = js.native
      
      def iMonth(): Double = js.native
      def iMonth(m: String): typings.momentHijri.mod.momentAugmentingMod.Moment = js.native
      def iMonth(m: Double): typings.momentHijri.mod.momentAugmentingMod.Moment = js.native
      
      def iWeek(): Double = js.native
      def iWeek(d: Double): typings.momentHijri.mod.momentAugmentingMod.Moment = js.native
      
      def iWeekYear(): Double = js.native
      def iWeekYear(d: Double): typings.momentHijri.mod.momentAugmentingMod.Moment = js.native
      
      def iYear(): Double = js.native
      def iYear(y: Double): typings.momentHijri.mod.momentAugmentingMod.Moment = js.native
      
      def startOf(unit: IUnitOfTime): typings.momentHijri.mod.momentAugmentingMod.Moment = js.native
      
      def subtract(amount: String, unit: IUnitOfTime): typings.momentHijri.mod.momentAugmentingMod.Moment = js.native
      def subtract(amount: Double, unit: IUnitOfTime): typings.momentHijri.mod.momentAugmentingMod.Moment = js.native
    }
  }
  
  inline def months(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("months")().asInstanceOf[js.Array[String]]
  inline def months(format: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("months")(format.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def months(format: String, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("months")(format.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def months(index: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("months")(index.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def monthsShort(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("monthsShort")().asInstanceOf[js.Array[String]]
  inline def monthsShort(format: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("monthsShort")(format.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def monthsShort(format: String, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("monthsShort")(format.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def monthsShort(index: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("monthsShort")(index.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def normalizeUnits(unit: All): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeUnits")(unit.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
  
  inline def parseTwoDigitYear(input: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTwoDigitYear")(input.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def parseZone(): Moment = ^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")().asInstanceOf[Moment]
  inline def parseZone(inp: Unit, format: Unit, language: String): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def parseZone(inp: Unit, format: Unit, language: String, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def parseZone(inp: Unit, format: Unit, language: Unit, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def parseZone(inp: Unit, format: Unit, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def parseZone(inp: Unit, format: MomentFormatSpecification): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def parseZone(inp: Unit, format: MomentFormatSpecification, language: String): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def parseZone(inp: Unit, format: MomentFormatSpecification, language: String, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def parseZone(inp: Unit, format: MomentFormatSpecification, language: Unit, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def parseZone(inp: Unit, format: MomentFormatSpecification, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def parseZone(inp: MomentInput): Moment = ^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any]).asInstanceOf[Moment]
  inline def parseZone(inp: MomentInput, format: Unit, language: String): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def parseZone(inp: MomentInput, format: Unit, language: String, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def parseZone(inp: MomentInput, format: Unit, language: Unit, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def parseZone(inp: MomentInput, format: Unit, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def parseZone(inp: MomentInput, format: MomentFormatSpecification): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def parseZone(inp: MomentInput, format: MomentFormatSpecification, language: String): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def parseZone(inp: MomentInput, format: MomentFormatSpecification, language: String, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def parseZone(inp: MomentInput, format: MomentFormatSpecification, language: Unit, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def parseZone(inp: MomentInput, format: MomentFormatSpecification, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  
  inline def relativeTimeRounding(): js.Function1[/* num */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("relativeTimeRounding")().asInstanceOf[js.Function1[/* num */ Double, Double]]
  inline def relativeTimeRounding(fn: js.Function1[/* num */ Double, Double]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("relativeTimeRounding")(fn.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def relativeTimeThreshold(threshold: String): Double | Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("relativeTimeThreshold")(threshold.asInstanceOf[js.Any]).asInstanceOf[Double | Boolean]
  inline def relativeTimeThreshold(threshold: String, limit: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("relativeTimeThreshold")(threshold.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("moment-hijri", "suppressDeprecationWarnings")
  @js.native
  def suppressDeprecationWarnings: Boolean = js.native
  inline def suppressDeprecationWarnings_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suppressDeprecationWarnings")(x.asInstanceOf[js.Any])
  
  inline def unix(timestamp: Double): Moment = ^.asInstanceOf[js.Dynamic].applyDynamic("unix")(timestamp.asInstanceOf[js.Any]).asInstanceOf[Moment]
  
  inline def updateLocale(language: String, localeSpec: Unit): Locale_ = (^.asInstanceOf[js.Dynamic].applyDynamic("updateLocale")(language.asInstanceOf[js.Any], localeSpec.asInstanceOf[js.Any])).asInstanceOf[Locale_]
  inline def updateLocale(language: String, localeSpec: LocaleSpecification): Locale_ = (^.asInstanceOf[js.Dynamic].applyDynamic("updateLocale")(language.asInstanceOf[js.Any], localeSpec.asInstanceOf[js.Any])).asInstanceOf[Locale_]
  
  inline def utc(): Moment = ^.asInstanceOf[js.Dynamic].applyDynamic("utc")().asInstanceOf[Moment]
  inline def utc(inp: Unit, format: Unit, language: String): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def utc(inp: Unit, format: Unit, language: String, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def utc(inp: Unit, format: Unit, language: Unit, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def utc(inp: Unit, format: Unit, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def utc(inp: Unit, format: MomentFormatSpecification): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def utc(inp: Unit, format: MomentFormatSpecification, language: String): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def utc(inp: Unit, format: MomentFormatSpecification, language: String, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def utc(inp: Unit, format: MomentFormatSpecification, language: Unit, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def utc(inp: Unit, format: MomentFormatSpecification, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def utc(inp: Unit, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def utc(inp: MomentInput): Moment = ^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any]).asInstanceOf[Moment]
  inline def utc(inp: MomentInput, format: Unit, language: String): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def utc(inp: MomentInput, format: Unit, language: String, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def utc(inp: MomentInput, format: Unit, language: Unit, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def utc(inp: MomentInput, format: Unit, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def utc(inp: MomentInput, format: MomentFormatSpecification): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def utc(inp: MomentInput, format: MomentFormatSpecification, language: String): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def utc(inp: MomentInput, format: MomentFormatSpecification, language: String, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def utc(inp: MomentInput, format: MomentFormatSpecification, language: Unit, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def utc(inp: MomentInput, format: MomentFormatSpecification, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def utc(inp: MomentInput, strict: Boolean): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Moment]
  
  @JSImport("moment-hijri", "version")
  @js.native
  def version: String = js.native
  inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  inline def weekdays(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")().asInstanceOf[js.Array[String]]
  inline def weekdays(format: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")(format.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def weekdays(format: String, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")(format.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def weekdays(index: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")(index.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def weekdays(localeSorted: Boolean): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")(localeSorted.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def weekdays(localeSorted: Boolean, format: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")(localeSorted.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def weekdays(localeSorted: Boolean, format: String, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")(localeSorted.asInstanceOf[js.Any], format.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def weekdays(localeSorted: Boolean, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")(localeSorted.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def weekdaysMin(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysMin")().asInstanceOf[js.Array[String]]
  inline def weekdaysMin(format: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysMin")(format.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def weekdaysMin(format: String, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysMin")(format.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def weekdaysMin(index: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysMin")(index.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def weekdaysMin(localeSorted: Boolean): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysMin")(localeSorted.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def weekdaysMin(localeSorted: Boolean, format: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysMin")(localeSorted.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def weekdaysMin(localeSorted: Boolean, format: String, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysMin")(localeSorted.asInstanceOf[js.Any], format.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def weekdaysMin(localeSorted: Boolean, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysMin")(localeSorted.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def weekdaysShort(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysShort")().asInstanceOf[js.Array[String]]
  inline def weekdaysShort(format: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysShort")(format.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def weekdaysShort(format: String, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysShort")(format.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def weekdaysShort(index: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysShort")(index.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def weekdaysShort(localeSorted: Boolean): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysShort")(localeSorted.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def weekdaysShort(localeSorted: Boolean, format: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysShort")(localeSorted.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def weekdaysShort(localeSorted: Boolean, format: String, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysShort")(localeSorted.asInstanceOf[js.Any], format.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def weekdaysShort(localeSorted: Boolean, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysShort")(localeSorted.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
}
