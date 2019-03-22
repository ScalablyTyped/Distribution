package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The interface for the context.formatting
	 */
@js.native
trait Formatting extends js.Object {
  /**
  		 * Returns a formatted string that represents the currency value after being formatted.
  		 * @param value A value object to be formatted.
  		 * @param precision The number of digits after decimal point.
  		 * @param symbol The currency symbol/code to be added with currency value.
  		 */
  def formatCurrency(value: scala.Double): java.lang.String = js.native
  def formatCurrency(value: scala.Double, precision: scala.Double): java.lang.String = js.native
  def formatCurrency(value: scala.Double, precision: scala.Double, symbol: java.lang.String): java.lang.String = js.native
  /**
  		 * Returns a formatted string that represents a date in a YYYY-MM-DD standard UTC format.
  		 * Result pattern is based on Standard UTC format.
  		 * @param value The date to be formatted.
  		 * @param includeTime If time component should be included in the return value.
  		 */
  def formatDateAsFilterStringInUTC(value: stdLib.Date): java.lang.String = js.native
  def formatDateAsFilterStringInUTC(value: stdLib.Date, includeTime: scala.Boolean): java.lang.String = js.native
  /**
  		 * Returns a formatted string that represents a date in the long form.
  		 * Result pattern is based on culture. In USA it's "Day of week, Month dd, yyyy"in USA
  		 * @param value Date to format.
  		 */
  def formatDateLong(value: stdLib.Date): java.lang.String = js.native
  /**
  		 * Returns a formatted string that represents a date in the long form using abbreviations.
  		 * Result pattern is based on culture. In USA it's "Abbreviated Day of week, Month dd, yyyy" in USA
  		 * @param value Date to format.
  		 */
  def formatDateLongAbbreviated(value: stdLib.Date): java.lang.String = js.native
  /**
  		 * Returns a string represents the datetime value after being formatted.
  		 * Result pattern is based on culture. In USA it's 'MM/DD/YYYY' in USA
  		 * @param value Date to format.
  		 * @param includeTime Whether to show time in formatted value.
  		 */
  def formatDateShort(value: stdLib.Date): java.lang.String = js.native
  def formatDateShort(value: stdLib.Date, includeTime: scala.Boolean): java.lang.String = js.native
  /**
  		 * Returns a formatted string that represents a date in the year month format.
  		 * @param value Date to format.
  		 */
  def formatDateYearMonth(value: stdLib.Date): java.lang.String = js.native
  /**
  		 * Returns a formatted string that represents the decimal value after being formatted.
  		 * @param value A value object to be formatted.
  		 * @param precision The number of digits after decimal point.
  		 */
  def formatDecimal(value: scala.Double): java.lang.String = js.native
  def formatDecimal(value: scala.Double, precision: scala.Double): java.lang.String = js.native
  /**
  		 * Returns a formatted string represents a given integer value.
  		 * @param value A number primitive to be formatted.
  		 */
  def formatInteger(value: scala.Double): java.lang.String = js.native
  /**
  		 * Returns a formatted string that represents a given language
  		 * @param input A language code to be formatted. Reference: https://go.microsoft.com/fwlink/?linkid=122128
  		 * @returns A formatted string represents a given language value.
  		 */
  def formatLanguage(value: scala.Double): java.lang.String = js.native
  /**
  		 * Returns a formatted string that represents the datetime value after being formatted.
  		 * @param value The date to be formatted.
  		 * @param behavior The behavior of the datetime object to be formatted.
  		 * None = 0,
  		 * UserLocal = 1,
  		 * TimeZoneIndependent = 3
  		 */
  def formatTime(
    value: stdLib.Date,
    behavior: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.FormattingApiNs.DateTimeFieldBehavior
  ): java.lang.String = js.native
  /**
  		 * Gets the ISO week number of the year for a given date. Range 1-53
  		 * @param value The DateTime to convert.
  		 */
  def getWeekOfYear(value: stdLib.Date): scala.Double = js.native
}

