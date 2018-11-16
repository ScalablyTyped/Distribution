package typings
package nodeDashCalendarLib.nodeDashCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-calendar", "Calendar")
@js.native
class Calendar () extends js.Object {
  /**
  		 * @param {number} firstweekday
  		 *  Numerical day of the week the calendar weeks should start.
  		 *  (0=MON, 1=TUE, ...) Default: 0
  		 */
  def this(firstweekday: scala.Double) = this()
  /**
  		 * Numerical day of the week the calendar weeks should start.
  		 * (0=MON, 1=TUE, ...)
  		 * 
  		 * @method getfirstweekday
  		 */
  def getfirstweekday(): scala.Double = js.native
  /**
  		 * Dates for one month. The array will contain Date values and will always
  		 * iterate through complete weeks, so it will yield dates outside the
  		 * specified month.
  		 * 
  		 * @param {number} year
  		 *  Year for which the calendar should be generated.
  		 * 
  		 * @param {number} month
  		 *  Month for which the calendar should be generated.
  		 */
  def itermonthdates(year: scala.Double, month: scala.Double): js.Array[stdLib.Date] = js.native
  /**
  		 * Like itermonthdates(), but will yield day numbers. For days outside
  		 * the specified month the day number is 0.
  		 * 
  		 * @param {number} year
  		 *  Year for which the calendar should be generated.
  		 * 
  		 * @param {number} month
  		 *  Month for which the calendar should be generated.
  		 */
  def itermonthdays(year: scala.Double, month: scala.Double): js.Array[scala.Double] = js.native
  /**
  		 * Like itermonthdates(), but will yield [day number, weekday number]
  		 * arrays. For days outside the specified month the day number is 0.
  		 * 
  		 * @param {number} year
  		 *  Year for which the calendar should be generated.
  		 * 
  		 * @param {number} month
  		 *  Month for which the calendar should be generated.
  		 */
  def itermonthdays2(year: scala.Double, month: scala.Double): js.Array[js.Tuple2[scala.Double, scala.Double]] = js.native
  /**
  		 * One week of weekday numbers starting with the configured first one.
  		 */
  def iterweekdays(): js.Array[scala.Double] = js.native
  /**
  		 * A matrix (array of array) representing a month's calendar.
  		 * Each row represents a week; week entries are Date values.
  		 * 
  		 * @param {number} year
  		 *  Year for which the calendar should be generated.
  		 * 
  		 * @param {number} month
  		 *  Month for which the calendar should be generated.
  		 */
  def monthdatescalendar(year: scala.Double, month: scala.Double): nodeDashCalendarLib.IMonthGrid[stdLib.Date] = js.native
  /**
  		 * Return a matrix representing a month's calendar. Each row represents
  		 * a week; week entries are [day number, weekday number] arrays. Day numbers
  		 * outside this month are zero.
  		 * 
  		 * @param {number} year
  		 *  Year for which the calendar should be generated.
  		 * 
  		 * @param {number} month
  		 *  Month for which the calendar should be generated.
  		 */
  def monthdays2calendar(year: scala.Double, month: scala.Double): nodeDashCalendarLib.IMonthGrid[js.Tuple2[scala.Double, scala.Double]] = js.native
  /**
  		 * A matrix representing a month's calendar. Each row represents a week;
  		 * days outside this month are zero.
  		 * 
  		 * @param {number} year
  		 *  Year for which the calendar should be generated.
  		 * 
  		 * @param {number} month
  		 *  Month for which the calendar should be generated.
  		 */
  def monthdayscalendar(year: scala.Double, month: scala.Double): nodeDashCalendarLib.IMonthGrid[scala.Double] = js.native
  /**
  		 * Numerical day of the week the calendar weeks should start.
  		 * (0=MON, 1=TUE, ...)
  		 * 
  		 * @param {number} firstweekday
  		 *  Numerical day of the week the calendar weeks should start.
  		 *  (0=MON, 1=TUE, ...) Default: 0
  		 */
  def setfirstweekday(firstweekday: scala.Double): scala.Unit = js.native
  /**
  		 * The specified year ready for formatting. The return value is an array
  		 * of month rows. Each month row contains up to width months. Each month
  		 * contains between 4 and 6 weeks and each week contains 1-7 days. Days
  		 * are Date objects.
  		 * 
  		 * @param {number} year
  		 *  Year for which the calendar should be generated.
  		 * 
  		 * @param {number} width
  		 *  The number of months to include in each row. Default: 3
  		 */
  def yeardatescalendar(year: scala.Double): nodeDashCalendarLib.IYearGrid[stdLib.Date] = js.native
  /**
  		 * The specified year ready for formatting. The return value is an array
  		 * of month rows. Each month row contains up to width months. Each month
  		 * contains between 4 and 6 weeks and each week contains 1-7 days. Days
  		 * are Date objects.
  		 * 
  		 * @param {number} year
  		 *  Year for which the calendar should be generated.
  		 * 
  		 * @param {number} width
  		 *  The number of months to include in each row. Default: 3
  		 */
  def yeardatescalendar(year: scala.Double, width: scala.Double): nodeDashCalendarLib.IYearGrid[stdLib.Date] = js.native
  /**
  		 * The specified year ready for formatting (similar to yeardatescalendar()).
  		 * Entries in the week arrays are [day number, weekday number] arrays.
  		 * Day numbers outside this month are zero.
  		 * 
  		 * @param {number} year
  		 *  Year for which the calendar should be generated
  		 * 
  		 * @param {number} width
  		 *  The number of months to include in each row. Default: 3
  		 */
  def yeardays2calendar(year: scala.Double): nodeDashCalendarLib.IYearGrid[js.Tuple2[scala.Double, scala.Double]] = js.native
  /**
  		 * The specified year ready for formatting (similar to yeardatescalendar()).
  		 * Entries in the week arrays are [day number, weekday number] arrays.
  		 * Day numbers outside this month are zero.
  		 * 
  		 * @param {number} year
  		 *  Year for which the calendar should be generated
  		 * 
  		 * @param {number} width
  		 *  The number of months to include in each row. Default: 3
  		 */
  def yeardays2calendar(year: scala.Double, width: scala.Double): nodeDashCalendarLib.IYearGrid[js.Tuple2[scala.Double, scala.Double]] = js.native
  /**
  		 * the specified year ready for formatting (similar to yeardatescalendar()).
  		 * Entries in the week arrays are day numbers. Day numbers outside this
  		 * month are zero.
  		 * 
  		 * @param {number} year
  		 *  Year for which the calendar should be generated
  		 * 
  		 * @param {number} width
  		 *  The number of months to include in each row. Default: 3
  		 */
  def yeardayscalendar(year: scala.Double): nodeDashCalendarLib.IYearGrid[scala.Double] = js.native
  /**
  		 * the specified year ready for formatting (similar to yeardatescalendar()).
  		 * Entries in the week arrays are day numbers. Day numbers outside this
  		 * month are zero.
  		 * 
  		 * @param {number} year
  		 *  Year for which the calendar should be generated
  		 * 
  		 * @param {number} width
  		 *  The number of months to include in each row. Default: 3
  		 */
  def yeardayscalendar(year: scala.Double, width: scala.Double): nodeDashCalendarLib.IYearGrid[scala.Double] = js.native
}

