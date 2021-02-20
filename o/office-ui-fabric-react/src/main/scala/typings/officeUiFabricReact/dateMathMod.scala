package typings.officeUiFabricReact

import typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType
import typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek
import typings.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear
import typings.std.Date
import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateMathMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", "addDays")
  @js.native
  def addDays(date: Date, days: Double): Date = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", "addMonths")
  @js.native
  def addMonths(date: Date, months: Double): Date = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", "addWeeks")
  @js.native
  def addWeeks(date: Date, weeks: Double): Date = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", "addYears")
  @js.native
  def addYears(date: Date, years: Double): Date = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", "compareDatePart")
  @js.native
  def compareDatePart(date1: Date, date2: Date): Number = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", "compareDates")
  @js.native
  def compareDates(date1: Date, date2: Date): Boolean = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", "getDatePartHashValue")
  @js.native
  def getDatePartHashValue(date: Date): Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", "getDateRangeArray")
  @js.native
  def getDateRangeArray(date: Date, dateRangeType: DateRangeType, firstDayOfWeek: DayOfWeek): js.Array[Date] = js.native
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", "getDateRangeArray")
  @js.native
  def getDateRangeArray(
    date: Date,
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    workWeekDays: js.UndefOr[scala.Nothing],
    daysToSelectInDayView: Double
  ): js.Array[Date] = js.native
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", "getDateRangeArray")
  @js.native
  def getDateRangeArray(
    date: Date,
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    workWeekDays: js.Array[DayOfWeek]
  ): js.Array[Date] = js.native
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", "getDateRangeArray")
  @js.native
  def getDateRangeArray(
    date: Date,
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    workWeekDays: js.Array[DayOfWeek],
    daysToSelectInDayView: Double
  ): js.Array[Date] = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", "getEndDateOfWeek")
  @js.native
  def getEndDateOfWeek(date: Date, firstDayOfWeek: DayOfWeek): Date = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", "getMonthEnd")
  @js.native
  def getMonthEnd(date: Date): Date = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", "getMonthStart")
  @js.native
  def getMonthStart(date: Date): Date = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", "getStartDateOfWeek")
  @js.native
  def getStartDateOfWeek(date: Date, firstDayOfWeek: DayOfWeek): Date = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", "getWeekNumber")
  @js.native
  def getWeekNumber(date: Date, firstDayOfWeek: DayOfWeek, firstWeekOfYear: FirstWeekOfYear): Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", "getWeekNumbersInMonth")
  @js.native
  def getWeekNumbersInMonth(
    weeksInMonth: Double,
    firstDayOfWeek: DayOfWeek,
    firstWeekOfYear: FirstWeekOfYear,
    navigatedDate: Date
  ): js.Array[Double] = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", "getYearEnd")
  @js.native
  def getYearEnd(date: Date): Date = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", "getYearStart")
  @js.native
  def getYearStart(date: Date): Date = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", "isInDateRangeArray")
  @js.native
  def isInDateRangeArray(date: Date, dateRange: js.Array[Date]): Boolean = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", "setMonth")
  @js.native
  def setMonth(date: Date, month: Double): Date = js.native
}
