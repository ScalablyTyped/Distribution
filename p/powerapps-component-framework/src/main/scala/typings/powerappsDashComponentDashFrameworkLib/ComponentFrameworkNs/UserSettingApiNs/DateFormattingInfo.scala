package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.UserSettingApiNs

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
  var abbreviatedDayNames: js.Array[java.lang.String]
  /**
  			 * @example { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", "" }
  			 */
  var abbreviatedMonthGenitiveNames: js.Array[java.lang.String]
  /**
  			 * @example { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", "" }
  			 */
  var abbreviatedMonthNames: js.Array[java.lang.String]
  /**
  			 * @example "AM"
  			 */
  var amDesignator: java.lang.String
  /**
  			 * @example See interface Calendar
  			 */
  var calendar: Calendar
  /**
  			 * @example 0
  			 */
  var calendarWeekRule: scala.Double
  /**
  			 * @example "/"
  			 */
  var dateSeparator: java.lang.String
  /**
  			 * @example { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" }
  			 */
  var dayNames: js.Array[java.lang.String]
  /**
  			 * @example See interface DayOfWeek
  			 */
  var firstDayOfWeek: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.UserSettingApiNs.TypesNs.DayOfWeek
  /**
  			 * @example "dddd, MMMM d, yyyy h:mm:ss tt"
  			 */
  var fullDateTimePattern: java.lang.String
  /**
  			 * @example "dddd, MMMM d, yyyy"
  			 */
  var longDatePattern: java.lang.String
  /**
  			 * @example "hh:mm:ss tt"
  			 */
  var longTimePattern: java.lang.String
  /**
  			 * @example "MMMM dd"
  			 */
  var monthDayPattern: java.lang.String
  /**
  			 * @example { "January", "February", "March", ...  "December", "" }
  			 */
  var monthGenitiveNames: js.Array[java.lang.String]
  /**
  			 * @example { "January", "February", "March", ...  "December", "" }
  			 */
  var monthNames: js.Array[java.lang.String]
  /**
  			 * @example "PM"
  			 */
  var pmDesignator: java.lang.String
  /**
  			 * @example "M/d/yyyy"
  			 */
  var shortDatePattern: java.lang.String
  /**
  			 * @example "h:mm tt"
  			 */
  var shortTimePattern: java.lang.String
  /**
  			 * @example { "Su", "Mo", "Tu", "We", "Th", "Fr", "Sa" }
  			 */
  var shortestDayNames: js.Array[java.lang.String]
  /**
  			 * @example "yyyy'-'MM'-'dd'T'HH':'mm':'ss"
  			 */
  var sortableDateTimePattern: java.lang.String
  /**
  			 * @example ":"
  			 */
  var timeSeparator: java.lang.String
  /**
  			 * @example "yyyy'-'MM'-'dd HH':'mm':'ss'Z'"
  			 */
  var universalSortableDateTimePattern: java.lang.String
  /**
  			 * @example "MMMM yyyy"
  			 */
  var yearMonthPattern: java.lang.String
}

object DateFormattingInfo {
  @scala.inline
  def apply(
    abbreviatedDayNames: js.Array[java.lang.String],
    abbreviatedMonthGenitiveNames: js.Array[java.lang.String],
    abbreviatedMonthNames: js.Array[java.lang.String],
    amDesignator: java.lang.String,
    calendar: Calendar,
    calendarWeekRule: scala.Double,
    dateSeparator: java.lang.String,
    dayNames: js.Array[java.lang.String],
    firstDayOfWeek: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.UserSettingApiNs.TypesNs.DayOfWeek,
    fullDateTimePattern: java.lang.String,
    longDatePattern: java.lang.String,
    longTimePattern: java.lang.String,
    monthDayPattern: java.lang.String,
    monthGenitiveNames: js.Array[java.lang.String],
    monthNames: js.Array[java.lang.String],
    pmDesignator: java.lang.String,
    shortDatePattern: java.lang.String,
    shortTimePattern: java.lang.String,
    shortestDayNames: js.Array[java.lang.String],
    sortableDateTimePattern: java.lang.String,
    timeSeparator: java.lang.String,
    universalSortableDateTimePattern: java.lang.String,
    yearMonthPattern: java.lang.String
  ): DateFormattingInfo = {
    val __obj = js.Dynamic.literal(abbreviatedDayNames = abbreviatedDayNames, abbreviatedMonthGenitiveNames = abbreviatedMonthGenitiveNames, abbreviatedMonthNames = abbreviatedMonthNames, amDesignator = amDesignator, calendar = calendar, calendarWeekRule = calendarWeekRule, dateSeparator = dateSeparator, dayNames = dayNames, firstDayOfWeek = firstDayOfWeek, fullDateTimePattern = fullDateTimePattern, longDatePattern = longDatePattern, longTimePattern = longTimePattern, monthDayPattern = monthDayPattern, monthGenitiveNames = monthGenitiveNames, monthNames = monthNames, pmDesignator = pmDesignator, shortDatePattern = shortDatePattern, shortTimePattern = shortTimePattern, shortestDayNames = shortestDayNames, sortableDateTimePattern = sortableDateTimePattern, timeSeparator = timeSeparator, universalSortableDateTimePattern = universalSortableDateTimePattern, yearMonthPattern = yearMonthPattern)
  
    __obj.asInstanceOf[DateFormattingInfo]
  }
}

