package typings.officeUiFabricReact

import typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType
import typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek
import typings.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear
import typings.std.Date
import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateMathMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addDays(date: Date, days: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addDays")(date.asInstanceOf[js.Any], days.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def addMonths(date: Date, months: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addMonths")(date.asInstanceOf[js.Any], months.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def addWeeks(date: Date, weeks: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addWeeks")(date.asInstanceOf[js.Any], weeks.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def addYears(date: Date, years: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addYears")(date.asInstanceOf[js.Any], years.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def compareDatePart(date1: Date, date2: Date): Number = (^.asInstanceOf[js.Dynamic].applyDynamic("compareDatePart")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Number]
  
  inline def compareDates(date1: Date, date2: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareDates")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def getDatePartHashValue(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDatePartHashValue")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getDateRangeArray(date: Date, dateRangeType: DateRangeType, firstDayOfWeek: DayOfWeek): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateRangeArray")(date.asInstanceOf[js.Any], dateRangeType.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  inline def getDateRangeArray(
    date: Date,
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    workWeekDays: js.Array[DayOfWeek]
  ): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateRangeArray")(date.asInstanceOf[js.Any], dateRangeType.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any], workWeekDays.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  inline def getDateRangeArray(
    date: Date,
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    workWeekDays: js.Array[DayOfWeek],
    daysToSelectInDayView: Double
  ): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateRangeArray")(date.asInstanceOf[js.Any], dateRangeType.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any], workWeekDays.asInstanceOf[js.Any], daysToSelectInDayView.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  inline def getDateRangeArray(
    date: Date,
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    workWeekDays: Unit,
    daysToSelectInDayView: Double
  ): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateRangeArray")(date.asInstanceOf[js.Any], dateRangeType.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any], workWeekDays.asInstanceOf[js.Any], daysToSelectInDayView.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  
  inline def getEndDateOfWeek(date: Date, firstDayOfWeek: DayOfWeek): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getEndDateOfWeek")(date.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def getMonthEnd(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonthEnd")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  inline def getMonthStart(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonthStart")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  inline def getStartDateOfWeek(date: Date, firstDayOfWeek: DayOfWeek): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getStartDateOfWeek")(date.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def getWeekNumber(date: Date, firstDayOfWeek: DayOfWeek, firstWeekOfYear: FirstWeekOfYear): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getWeekNumber")(date.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any], firstWeekOfYear.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getWeekNumbersInMonth(
    weeksInMonth: Double,
    firstDayOfWeek: DayOfWeek,
    firstWeekOfYear: FirstWeekOfYear,
    navigatedDate: Date
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWeekNumbersInMonth")(weeksInMonth.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any], firstWeekOfYear.asInstanceOf[js.Any], navigatedDate.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def getYearEnd(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getYearEnd")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  inline def getYearStart(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getYearStart")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  inline def isInDateRangeArray(date: Date, dateRange: js.Array[Date]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInDateRangeArray")(date.asInstanceOf[js.Any], dateRange.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def setMonth(date: Date, month: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setMonth")(date.asInstanceOf[js.Any], month.asInstanceOf[js.Any])).asInstanceOf[Date]
}
