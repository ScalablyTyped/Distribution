package typings.officeUiFabricReact

import typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType
import typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek
import typings.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear
import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateTimeUtilitiesMod {
  
  @JSImport("office-ui-fabric-react/lib/DateTimeUtilities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/DateTimeUtilities", "DAYS_IN_WEEK")
  @js.native
  val DAYS_IN_WEEK: /* 7 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/DateTimeUtilities", "DateRangeType")
  @js.native
  object DateRangeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType & Double] = js.native
    
    /* 0 */ val Day: typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType.Day & Double = js.native
    
    /* 2 */ val Month: typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType.Month & Double = js.native
    
    /* 1 */ val Week: typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType.Week & Double = js.native
    
    /* 3 */ val WorkWeek: typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType.WorkWeek & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/DateTimeUtilities", "DayOfWeek")
  @js.native
  object DayOfWeek extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek & Double] = js.native
    
    /* 5 */ val Friday: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Friday & Double = js.native
    
    /* 1 */ val Monday: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Monday & Double = js.native
    
    /* 6 */ val Saturday: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Saturday & Double = js.native
    
    /* 0 */ val Sunday: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Sunday & Double = js.native
    
    /* 4 */ val Thursday: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Thursday & Double = js.native
    
    /* 2 */ val Tuesday: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Tuesday & Double = js.native
    
    /* 3 */ val Wednesday: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Wednesday & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/DateTimeUtilities", "FirstWeekOfYear")
  @js.native
  object FirstWeekOfYear extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear & Double] = js.native
    
    /* 0 */ val FirstDay: typings.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear.FirstDay & Double = js.native
    
    /* 2 */ val FirstFourDayWeek: typings.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear.FirstFourDayWeek & Double = js.native
    
    /* 1 */ val FirstFullWeek: typings.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear.FirstFullWeek & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/DateTimeUtilities", "MonthOfYear")
  @js.native
  object MonthOfYear extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear & Double] = js.native
    
    /* 3 */ val April: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.April & Double = js.native
    
    /* 7 */ val August: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.August & Double = js.native
    
    /* 11 */ val December: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.December & Double = js.native
    
    /* 1 */ val February: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.February & Double = js.native
    
    /* 0 */ val January: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.January & Double = js.native
    
    /* 6 */ val July: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.July & Double = js.native
    
    /* 5 */ val June: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.June & Double = js.native
    
    /* 2 */ val March: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.March & Double = js.native
    
    /* 4 */ val May: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.May & Double = js.native
    
    /* 10 */ val November: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.November & Double = js.native
    
    /* 9 */ val October: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.October & Double = js.native
    
    /* 8 */ val September: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.September & Double = js.native
  }
  
  object TimeConstants {
    
    @JSImport("office-ui-fabric-react/lib/DateTimeUtilities", "TimeConstants")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/DateTimeUtilities", "TimeConstants.DaysInOneWeek")
    @js.native
    def DaysInOneWeek: Double = js.native
    inline def DaysInOneWeek_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DaysInOneWeek")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/DateTimeUtilities", "TimeConstants.HoursInOneDay")
    @js.native
    def HoursInOneDay: Double = js.native
    inline def HoursInOneDay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HoursInOneDay")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/DateTimeUtilities", "TimeConstants.MillisecondsIn1Hour")
    @js.native
    def MillisecondsIn1Hour: Double = js.native
    inline def MillisecondsIn1Hour_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MillisecondsIn1Hour")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/DateTimeUtilities", "TimeConstants.MillisecondsIn1Min")
    @js.native
    def MillisecondsIn1Min: Double = js.native
    inline def MillisecondsIn1Min_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MillisecondsIn1Min")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/DateTimeUtilities", "TimeConstants.MillisecondsIn1Sec")
    @js.native
    def MillisecondsIn1Sec: Double = js.native
    inline def MillisecondsIn1Sec_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MillisecondsIn1Sec")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/DateTimeUtilities", "TimeConstants.MillisecondsIn30Mins")
    @js.native
    def MillisecondsIn30Mins: Double = js.native
    inline def MillisecondsIn30Mins_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MillisecondsIn30Mins")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/DateTimeUtilities", "TimeConstants.MillisecondsInOneDay")
    @js.native
    def MillisecondsInOneDay: Double = js.native
    inline def MillisecondsInOneDay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MillisecondsInOneDay")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/DateTimeUtilities", "TimeConstants.MinutesInOneDay")
    @js.native
    def MinutesInOneDay: Double = js.native
    inline def MinutesInOneDay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MinutesInOneDay")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/DateTimeUtilities", "TimeConstants.MinutesInOneHour")
    @js.native
    def MinutesInOneHour: Double = js.native
    inline def MinutesInOneHour_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MinutesInOneHour")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/DateTimeUtilities", "TimeConstants.MonthInOneYear")
    @js.native
    def MonthInOneYear: Double = js.native
    inline def MonthInOneYear_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MonthInOneYear")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/DateTimeUtilities", "TimeConstants.OffsetTo24HourFormat")
    @js.native
    def OffsetTo24HourFormat: Double = js.native
    inline def OffsetTo24HourFormat_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OffsetTo24HourFormat")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/DateTimeUtilities", "TimeConstants.SecondsInOneMinute")
    @js.native
    def SecondsInOneMinute: Double = js.native
    inline def SecondsInOneMinute_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SecondsInOneMinute")(x.asInstanceOf[js.Any])
    
    /**
      * Matches a time string. Groups:
      * 1. hours (with or without leading 0)
      * 2. minutes
      * 3. seconds (optional)
      * 4. meridiem (am/pm, case-insensitive, optional)
      */
    @JSImport("office-ui-fabric-react/lib/DateTimeUtilities", "TimeConstants.TimeFormatRegex")
    @js.native
    def TimeFormatRegex: js.RegExp = js.native
    inline def TimeFormatRegex_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TimeFormatRegex")(x.asInstanceOf[js.Any])
  }
  
  inline def addDays(date: js.Date, days: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addDays")(date.asInstanceOf[js.Any], days.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def addMonths(date: js.Date, months: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addMonths")(date.asInstanceOf[js.Any], months.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def addWeeks(date: js.Date, weeks: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addWeeks")(date.asInstanceOf[js.Any], weeks.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def addYears(date: js.Date, years: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addYears")(date.asInstanceOf[js.Any], years.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def compareDatePart(date1: js.Date, date2: js.Date): Number = (^.asInstanceOf[js.Dynamic].applyDynamic("compareDatePart")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Number]
  
  inline def compareDates(date1: js.Date, date2: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareDates")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def getDatePartHashValue(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDatePartHashValue")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getDateRangeArray(date: js.Date, dateRangeType: DateRangeType, firstDayOfWeek: DayOfWeek): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateRangeArray")(date.asInstanceOf[js.Any], dateRangeType.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def getDateRangeArray(
    date: js.Date,
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    workWeekDays: js.Array[DayOfWeek]
  ): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateRangeArray")(date.asInstanceOf[js.Any], dateRangeType.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any], workWeekDays.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def getDateRangeArray(
    date: js.Date,
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    workWeekDays: js.Array[DayOfWeek],
    daysToSelectInDayView: Double
  ): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateRangeArray")(date.asInstanceOf[js.Any], dateRangeType.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any], workWeekDays.asInstanceOf[js.Any], daysToSelectInDayView.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def getDateRangeArray(
    date: js.Date,
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    workWeekDays: Unit,
    daysToSelectInDayView: Double
  ): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateRangeArray")(date.asInstanceOf[js.Any], dateRangeType.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any], workWeekDays.asInstanceOf[js.Any], daysToSelectInDayView.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  
  inline def getEndDateOfWeek(date: js.Date, firstDayOfWeek: DayOfWeek): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getEndDateOfWeek")(date.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def getMonthEnd(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonthEnd")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def getMonthStart(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonthStart")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def getStartDateOfWeek(date: js.Date, firstDayOfWeek: DayOfWeek): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getStartDateOfWeek")(date.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def getWeekNumber(date: js.Date, firstDayOfWeek: DayOfWeek, firstWeekOfYear: FirstWeekOfYear): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getWeekNumber")(date.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any], firstWeekOfYear.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getWeekNumbersInMonth(
    weeksInMonth: Double,
    firstDayOfWeek: DayOfWeek,
    firstWeekOfYear: FirstWeekOfYear,
    navigatedDate: js.Date
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWeekNumbersInMonth")(weeksInMonth.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any], firstWeekOfYear.asInstanceOf[js.Any], navigatedDate.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def getYearEnd(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getYearEnd")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def getYearStart(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getYearStart")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def isInDateRangeArray(date: js.Date, dateRange: js.Array[js.Date]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInDateRangeArray")(date.asInstanceOf[js.Any], dateRange.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def setMonth(date: js.Date, month: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setMonth")(date.asInstanceOf[js.Any], month.asInstanceOf[js.Any])).asInstanceOf[js.Date]
}
