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

object DateOptions {
  @scala.inline
  def apply(
    clear: java.lang.String = null,
    close: java.lang.String = null,
    closeOnClear: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnSelect: js.UndefOr[scala.Boolean] = js.undefined,
    container: java.lang.String | pickadateLib.JQuery = null,
    containerHidden: java.lang.String = null,
    disable: js.Array[_] = null,
    editable: js.UndefOr[scala.Boolean] = js.undefined,
    firstDay: scala.Boolean | scala.Double = null,
    format: java.lang.String = null,
    formatSubmit: java.lang.String = null,
    hiddenName: js.UndefOr[scala.Boolean] = js.undefined,
    hiddenPrefix: java.lang.String = null,
    hiddenSuffix: java.lang.String = null,
    klass: DateKlassOptions = null,
    labelMonthNext: java.lang.String = null,
    labelMonthPrev: java.lang.String = null,
    labelMonthSelect: java.lang.String = null,
    labelYearSelect: java.lang.String = null,
    max: MinOrMaxDateOption = null,
    min: MinOrMaxDateOption = null,
    monthsFull: js.Array[java.lang.String] = null,
    monthsShort: js.Array[java.lang.String] = null,
    onClose: js.Function1[/* event */ js.Any, scala.Unit] = null,
    onOpen: js.Function1[/* event */ js.Any, scala.Unit] = null,
    onRender: js.Function1[/* event */ js.Any, scala.Unit] = null,
    onSet: js.Function1[/* event */ js.Any, scala.Unit] = null,
    onStart: js.Function1[/* event */ js.Any, scala.Unit] = null,
    onStop: js.Function1[/* event */ js.Any, scala.Unit] = null,
    selectMonths: js.UndefOr[scala.Boolean] = js.undefined,
    selectYears: scala.Boolean | scala.Double = null,
    showMonthsShort: js.UndefOr[scala.Boolean] = js.undefined,
    showWeekdaysFull: js.UndefOr[scala.Boolean] = js.undefined,
    today: java.lang.String = null,
    weekdaysFull: js.Array[java.lang.String] = null,
    weekdaysShort: js.Array[java.lang.String] = null
  ): DateOptions = {
    val __obj = js.Dynamic.literal()
    if (clear != null) __obj.updateDynamic("clear")(clear)
    if (close != null) __obj.updateDynamic("close")(close)
    if (!js.isUndefined(closeOnClear)) __obj.updateDynamic("closeOnClear")(closeOnClear)
    if (!js.isUndefined(closeOnSelect)) __obj.updateDynamic("closeOnSelect")(closeOnSelect)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (containerHidden != null) __obj.updateDynamic("containerHidden")(containerHidden)
    if (disable != null) __obj.updateDynamic("disable")(disable)
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable)
    if (firstDay != null) __obj.updateDynamic("firstDay")(firstDay.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (formatSubmit != null) __obj.updateDynamic("formatSubmit")(formatSubmit)
    if (!js.isUndefined(hiddenName)) __obj.updateDynamic("hiddenName")(hiddenName)
    if (hiddenPrefix != null) __obj.updateDynamic("hiddenPrefix")(hiddenPrefix)
    if (hiddenSuffix != null) __obj.updateDynamic("hiddenSuffix")(hiddenSuffix)
    if (klass != null) __obj.updateDynamic("klass")(klass)
    if (labelMonthNext != null) __obj.updateDynamic("labelMonthNext")(labelMonthNext)
    if (labelMonthPrev != null) __obj.updateDynamic("labelMonthPrev")(labelMonthPrev)
    if (labelMonthSelect != null) __obj.updateDynamic("labelMonthSelect")(labelMonthSelect)
    if (labelYearSelect != null) __obj.updateDynamic("labelYearSelect")(labelYearSelect)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (monthsFull != null) __obj.updateDynamic("monthsFull")(monthsFull)
    if (monthsShort != null) __obj.updateDynamic("monthsShort")(monthsShort)
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (onOpen != null) __obj.updateDynamic("onOpen")(onOpen)
    if (onRender != null) __obj.updateDynamic("onRender")(onRender)
    if (onSet != null) __obj.updateDynamic("onSet")(onSet)
    if (onStart != null) __obj.updateDynamic("onStart")(onStart)
    if (onStop != null) __obj.updateDynamic("onStop")(onStop)
    if (!js.isUndefined(selectMonths)) __obj.updateDynamic("selectMonths")(selectMonths)
    if (selectYears != null) __obj.updateDynamic("selectYears")(selectYears.asInstanceOf[js.Any])
    if (!js.isUndefined(showMonthsShort)) __obj.updateDynamic("showMonthsShort")(showMonthsShort)
    if (!js.isUndefined(showWeekdaysFull)) __obj.updateDynamic("showWeekdaysFull")(showWeekdaysFull)
    if (today != null) __obj.updateDynamic("today")(today)
    if (weekdaysFull != null) __obj.updateDynamic("weekdaysFull")(weekdaysFull)
    if (weekdaysShort != null) __obj.updateDynamic("weekdaysShort")(weekdaysShort)
    __obj.asInstanceOf[DateOptions]
  }
}

