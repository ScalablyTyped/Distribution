package typings.nodeCalendar

import typings.std.Date
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This module allows you to output calendars like the Unix cal program, and provides
  * additional useful functions related to the calendar. By default, these calendars
  * have Monday as the first day of the week, and Sunday as the last (the European
  * convention). Use setfirstweekday() to set the first day of the week to Sunday
  * (6) or to any other weekday. Parameters that specify dates are given as integers.
  */
@JSImport("node-calendar", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  /**
  		 * @param {number} firstweekday
  		 *  Numerical day of the week the calendar weeks should start.
  		 *  (0=MON, 1=TUE, ...) Default: 0
  		 */
  class Calendar () extends js.Object {
    def this(firstweekday: Double) = this()
    /**
    		 * Numerical day of the week the calendar weeks should start.
    		 * (0=MON, 1=TUE, ...)
    		 * 
    		 * @method getfirstweekday
    		 */
    def getfirstweekday(): Double = js.native
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
    def itermonthdates(year: Double, month: Double): js.Array[Date] = js.native
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
    def itermonthdays(year: Double, month: Double): js.Array[Double] = js.native
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
    def itermonthdays2(year: Double, month: Double): js.Array[js.Tuple2[Double, Double]] = js.native
    /**
    		 * One week of weekday numbers starting with the configured first one.
    		 */
    def iterweekdays(): js.Array[Double] = js.native
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
    def monthdatescalendar(year: Double, month: Double): IMonthGrid[Date] = js.native
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
    def monthdays2calendar(year: Double, month: Double): IMonthGrid[js.Tuple2[Double, Double]] = js.native
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
    def monthdayscalendar(year: Double, month: Double): IMonthGrid[Double] = js.native
    /**
    		 * Numerical day of the week the calendar weeks should start.
    		 * (0=MON, 1=TUE, ...)
    		 * 
    		 * @param {number} firstweekday
    		 *  Numerical day of the week the calendar weeks should start.
    		 *  (0=MON, 1=TUE, ...) Default: 0
    		 */
    def setfirstweekday(firstweekday: Double): Unit = js.native
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
    def yeardatescalendar(year: Double): IYearGrid[Date] = js.native
    def yeardatescalendar(year: Double, width: Double): IYearGrid[Date] = js.native
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
    def yeardays2calendar(year: Double): IYearGrid[js.Tuple2[Double, Double]] = js.native
    def yeardays2calendar(year: Double, width: Double): IYearGrid[js.Tuple2[Double, Double]] = js.native
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
    def yeardayscalendar(year: Double): IYearGrid[Double] = js.native
    def yeardayscalendar(year: Double, width: Double): IYearGrid[Double] = js.native
  }
  
  @js.native
  /**
  		 * @param {string} message
  		 *  Optional custom error message.
  		 */
  class IllegalDayError () extends Error {
    def this(message: String) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  @js.native
  /**
  		 * @param {string} message
  		 *  Optional custom error message.
  		 */
  class IllegalLocaleError () extends Error {
    def this(message: String) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  @js.native
  /**
  		 * @param {string} message
  		 *  Optional custom error message.
  		 */
  class IllegalMonthError () extends Error {
    def this(message: String) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  @js.native
  /**
  		 * @param {string} message
  		 *  Optional custom error message.
  		 */
  class IllegalTimeError () extends Error {
    def this(message: String) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  @js.native
  /**
  		 * @param {string} message
  		 *  Optional custom error message.
  		 */
  class IllegalWeekdayError () extends Error {
    def this(message: String) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  var APRIL: Double = js.native
  var AUGUST: Double = js.native
  var DECEMBER: Double = js.native
  var FEBRUARY: Double = js.native
  var FRIDAY: Double = js.native
  var JANUARY: Double = js.native
  var JULY: Double = js.native
  var JUNE: Double = js.native
  var MARCH: Double = js.native
  var MAY: Double = js.native
  var MONDAY: Double = js.native
  var NOVEMBER: Double = js.native
  var OCTOBER: Double = js.native
  var SATURDAY: Double = js.native
  var SEPTEMBER: Double = js.native
  var SUNDAY: Double = js.native
  var THURSDAY: Double = js.native
  var TUESDAY: Double = js.native
  var WEDNESDAY: Double = js.native
  @JSName("day_abbr")
  var dayAbbr: js.Array[String] = js.native
  @JSName("day_name")
  var dayName: js.Array[String] = js.native
  @JSName("month_abbr")
  var monthAbbr: js.Array[String] = js.native
  @JSName("month_name")
  var monthName: js.Array[String] = js.native
  def isleap(year: Double): Boolean = js.native
  def leapdays(y1: Double, y2: Double): Double = js.native
  def monthrange(year: Double, month: Double): js.Tuple2[Double, Double] = js.native
  def setlocale(): Unit = js.native
  def setlocale(locale: String): Unit = js.native
  def timegm(timegmt: js.Tuple6[Double, Double, Double, Double, Double, Double]): Double = js.native
  def weekday(year: Double, month: Double, day: Double): Double = js.native
}

