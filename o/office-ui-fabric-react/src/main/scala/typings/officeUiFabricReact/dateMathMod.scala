package typings.officeUiFabricReact

import typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType
import typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek
import typings.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear
import typings.std.Date
import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", JSImport.Namespace)
@js.native
object dateMathMod extends js.Object {
  def addDays(date: Date, days: Double): Date = js.native
  def addMonths(date: Date, months: Double): Date = js.native
  def addWeeks(date: Date, weeks: Double): Date = js.native
  def addYears(date: Date, years: Double): Date = js.native
  def compareDatePart(date1: Date, date2: Date): Number = js.native
  def compareDates(date1: Date, date2: Date): Boolean = js.native
  def getDateRangeArray(date: Date, dateRangeType: DateRangeType, firstDayOfWeek: DayOfWeek): js.Array[Date] = js.native
  def getDateRangeArray(
    date: Date,
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    workWeekDays: js.UndefOr[scala.Nothing],
    daysToSelectInDayView: Double
  ): js.Array[Date] = js.native
  def getDateRangeArray(
    date: Date,
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    workWeekDays: js.Array[DayOfWeek]
  ): js.Array[Date] = js.native
  def getDateRangeArray(
    date: Date,
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    workWeekDays: js.Array[DayOfWeek],
    daysToSelectInDayView: Double
  ): js.Array[Date] = js.native
  def getMonthEnd(date: Date): Date = js.native
  def getMonthStart(date: Date): Date = js.native
  def getStartDateOfWeek(date: Date, firstDayOfWeek: DayOfWeek): Date = js.native
  def getWeekNumber(date: Date, firstDayOfWeek: DayOfWeek, firstWeekOfYear: FirstWeekOfYear): Double = js.native
  def getWeekNumbersInMonth(
    weeksInMonth: Double,
    firstDayOfWeek: DayOfWeek,
    firstWeekOfYear: FirstWeekOfYear,
    navigatedDate: Date
  ): js.Array[Double] = js.native
  def getYearEnd(date: Date): Date = js.native
  def getYearStart(date: Date): Date = js.native
  def isInDateRangeArray(date: Date, dateRange: js.Array[Date]): Boolean = js.native
  def setMonth(date: Date, month: Double): Date = js.native
}

