package typings
package pickadateLib.PickadateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateOptions extends Options {
   // default 'Today'
  var close: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Disable a specific or arbitrary set of dates selectable on the
    * picker. Accepts an array of Date objects, arrays formatted as
    * [YEAR, MONTH, DATE], integers representing days of the week
    * (from 1 to 7), or objects with a range of dates. Switch to a
    * whitelist by setting `true` as the first item in the collection.
    * Enable dates that fall within a range of disabled dates by
    * adding an `inverted` parameter to the item within the collection.
    */
  var disable: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * The first day of the week can be set to either Sunday or Monday.
    * True or 1 sets it as Monday and false or 0 as Sunday.
    */
  var firstDay: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  // Classes
  var klass: js.UndefOr[DateKlassOptions] = js.undefined
   // default 'Close'
  // Accessibility labels
  var labelMonthNext: js.UndefOr[java.lang.String] = js.undefined
   // default 'Next month'
  var labelMonthPrev: js.UndefOr[java.lang.String] = js.undefined
   // default 'Previous month'
  var labelMonthSelect: js.UndefOr[java.lang.String] = js.undefined
   // default 'Select a month'
  var labelYearSelect: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set the maximum selectable date on the picker.
    * Accepts the same values as the `min` property.
    */
  var max: js.UndefOr[MinOrMaxDateOption] = js.undefined
  /**
    * Set the minimum selectable date on the picker. Accepts a Date object,
    * array formatted as [YEAR, MONTH, DATE], a positive or negative integer
    * for a date relative to today, or a boolean (`true` sets it to today,
    * `false` removes any limit).
    */
  var min: js.UndefOr[MinOrMaxDateOption] = js.undefined
  // Strings and translations
  var monthsFull: js.UndefOr[js.Array[java.lang.String]] = js.undefined
   // default 'January' through 'December'
  var monthsShort: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * True enables the dropdown selector and false replaces it with text
    */
  var selectMonths: js.UndefOr[scala.Boolean] = js.undefined
   //default 'Select a year'
  /**
    * True enables the dropdown selector and false replaces it with text.
    * You can also specify the number of years to show in the dropdown
    * using an even integer - half before and half after the year in focus.
    * If true the value will default to 10.
    */
  var selectYears: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
   // default 'Sun' through 'Sat'
  var showMonthsShort: js.UndefOr[scala.Boolean] = js.undefined
  var showWeekdaysFull: js.UndefOr[scala.Boolean] = js.undefined
  // Buttons
  var today: js.UndefOr[java.lang.String] = js.undefined
   // default 'Jan' through 'Dec'
  var weekdaysFull: js.UndefOr[js.Array[java.lang.String]] = js.undefined
   // default 'Sunday' through 'Saturday'
  var weekdaysShort: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

