package typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.UserSettingApiNs

import typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.UserSettingApiNs.TypesNs.DayOfWeek
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The interface for Org Date Format Info exposed to a custom control
		 * Result pattern is based on culture,examples are for 'USA' area
		 */
trait DateFormattingInfo extends js.Object {
  /**
  			 * @example { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" }
  			 */
  var abbreviatedDayNames: js.Array[String]
  /**
  			 * @example { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", "" }
  			 */
  var abbreviatedMonthGenitiveNames: js.Array[String]
  /**
  			 * @example { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", "" }
  			 */
  var abbreviatedMonthNames: js.Array[String]
  /**
  			 * @example "AM"
  			 */
  var amDesignator: String
  /**
  			 * @example See interface Calendar
  			 */
  var calendar: Calendar
  /**
  			 * @example 0
  			 */
  var calendarWeekRule: Double
  /**
  			 * @example "/"
  			 */
  var dateSeparator: String
  /**
  			 * @example { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" }
  			 */
  var dayNames: js.Array[String]
  /**
  			 * @example See interface DayOfWeek
  			 */
  var firstDayOfWeek: DayOfWeek
  /**
  			 * @example "dddd, MMMM d, yyyy h:mm:ss tt"
  			 */
  var fullDateTimePattern: String
  /**
  			 * @example "dddd, MMMM d, yyyy"
  			 */
  var longDatePattern: String
  /**
  			 * @example "hh:mm:ss tt"
  			 */
  var longTimePattern: String
  /**
  			 * @example "MMMM dd"
  			 */
  var monthDayPattern: String
  /**
  			 * @example { "January", "February", "March", ...  "December", "" }
  			 */
  var monthGenitiveNames: js.Array[String]
  /**
  			 * @example { "January", "February", "March", ...  "December", "" }
  			 */
  var monthNames: js.Array[String]
  /**
  			 * @example "PM"
  			 */
  var pmDesignator: String
  /**
  			 * @example "M/d/yyyy"
  			 */
  var shortDatePattern: String
  /**
  			 * @example "h:mm tt"
  			 */
  var shortTimePattern: String
  /**
  			 * @example { "Su", "Mo", "Tu", "We", "Th", "Fr", "Sa" }
  			 */
  var shortestDayNames: js.Array[String]
  /**
  			 * @example "yyyy'-'MM'-'dd'T'HH':'mm':'ss"
  			 */
  var sortableDateTimePattern: String
  /**
  			 * @example ":"
  			 */
  var timeSeparator: String
  /**
  			 * @example "yyyy'-'MM'-'dd HH':'mm':'ss'Z'"
  			 */
  var universalSortableDateTimePattern: String
  /**
  			 * @example "MMMM yyyy"
  			 */
  var yearMonthPattern: String
}

object DateFormattingInfo {
  @scala.inline
  def apply(
    abbreviatedDayNames: js.Array[String],
    abbreviatedMonthGenitiveNames: js.Array[String],
    abbreviatedMonthNames: js.Array[String],
    amDesignator: String,
    calendar: Calendar,
    calendarWeekRule: Double,
    dateSeparator: String,
    dayNames: js.Array[String],
    firstDayOfWeek: DayOfWeek,
    fullDateTimePattern: String,
    longDatePattern: String,
    longTimePattern: String,
    monthDayPattern: String,
    monthGenitiveNames: js.Array[String],
    monthNames: js.Array[String],
    pmDesignator: String,
    shortDatePattern: String,
    shortTimePattern: String,
    shortestDayNames: js.Array[String],
    sortableDateTimePattern: String,
    timeSeparator: String,
    universalSortableDateTimePattern: String,
    yearMonthPattern: String
  ): DateFormattingInfo = {
    val __obj = js.Dynamic.literal(abbreviatedDayNames = abbreviatedDayNames, abbreviatedMonthGenitiveNames = abbreviatedMonthGenitiveNames, abbreviatedMonthNames = abbreviatedMonthNames, amDesignator = amDesignator, calendar = calendar, calendarWeekRule = calendarWeekRule, dateSeparator = dateSeparator, dayNames = dayNames, firstDayOfWeek = firstDayOfWeek, fullDateTimePattern = fullDateTimePattern, longDatePattern = longDatePattern, longTimePattern = longTimePattern, monthDayPattern = monthDayPattern, monthGenitiveNames = monthGenitiveNames, monthNames = monthNames, pmDesignator = pmDesignator, shortDatePattern = shortDatePattern, shortTimePattern = shortTimePattern, shortestDayNames = shortestDayNames, sortableDateTimePattern = sortableDateTimePattern, timeSeparator = timeSeparator, universalSortableDateTimePattern = universalSortableDateTimePattern, yearMonthPattern = yearMonthPattern)
  
    __obj.asInstanceOf[DateFormattingInfo]
  }
}

