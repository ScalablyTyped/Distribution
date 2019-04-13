package typings
package pikadayLib.pikadayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PikadayOptions extends js.Object {
  /**
    * Data-attribute on the input field with an aria assistance test (only applied when bound is set)
    */
  var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defines if the field is blurred when a date is selected (default true)
    */
  var blurFieldOnSelect: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Automatically show/hide the datepicker on field focus.
    * Default: true if field is set.
    */
  var bound: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * DOM node to render calendar into, see container example.
    * Default: undefined.
    */
  var container: js.UndefOr[stdLib.HTMLElement | scala.Null] = js.undefined
  /**
    * The initial date to view when first opened.
    */
  var defaultDate: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * Callback function that gets passed a Date object for each day
    * in view. Should return true to disable selection of that day.
    */
  var disableDayFn: js.UndefOr[js.Function1[/* date */ stdLib.Date, scala.Boolean]] = js.undefined
  /**
    * Disallow selection of Saturdays and Sundays.
    */
  var disableWeekends: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Allows user to select date that is in the next or previous months (default: false)
    */
  var enableSelectionDaysInNextAndPreviousMonths: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Array of dates that you would like to differentiate from regular days (e.g. ['Sat Jun 28 2017', 'Sun Jun 29 2017', 'Tue Jul 01 2017',])
    */
  var events: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Bind the datepicker to a form field.
    */
  var field: js.UndefOr[stdLib.HTMLElement | scala.Null] = js.undefined
  /**
    * First day of the week (0: Sunday, 1: Monday, etc).
    */
  var firstDay: js.UndefOr[scala.Double] = js.undefined
  /**
    * The default output format for toString() and field value.
    * Requires Moment.js for custom formatting.
    */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The default flag for moment's strict date parsing (requires Moment.js for custom formatting). Default: false
    */
  var formatStrict: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Language defaults for month and weekday names.
    */
  var i18n: js.UndefOr[PikadayI18nConfig] = js.undefined
  /**
    * Reverse the calendar for right-to-left languages. Default: false.
    */
  var isRTL: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable keyboard input support. Default: true
    */
  var keyboardInput: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When numberOfMonths is used, this will help you to choose where the
    * main calendar will be (default left, can be set to right). Only used
    * for the first display or when a selected date is not already visible.
    */
  var mainCalendar: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The latest date that can be selected (this should be a native
    * Date object - e.g. new Date() or moment().toDate()).
    */
  var maxDate: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * The earliest date that can be selected (this should be a native
    * Date object - e.g. new Date() or moment().toDate()).
    */
  var minDate: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * Number of visible calendars.
    */
  var numberOfMonths: js.UndefOr[scala.Double] = js.undefined
  /**
    * Callback function for when the picker is hidden.
    */
  var onClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Callback function for when the picker draws a new month.
    */
  var onDraw: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Callback function for when the picker becomes visible.
    */
  var onOpen: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Callback function for when a date is selected.
    */
  var onSelect: js.UndefOr[js.ThisFunction1[/* this */ Pikaday, /* date */ stdLib.Date, scala.Unit]] = js.undefined
  /**
    * Function which will be used for parsing input string and getting a date object from it.
    * This function will take precedence over moment.
    */
  var parse: js.UndefOr[
    js.Function2[/* date */ java.lang.String, /* format */ java.lang.String, stdLib.Date | scala.Null]
  ] = js.undefined
  /**
    * Select a whole week instead of a day (default false)
    */
  var pickWholeWeek: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Preferred position of the datepicker relative to the form field
    * (e.g. 'top right'). Automatic adjustment may occur to avoid
    * displaying outside the viewport. Default: 'bottom left'.
    */
  var position: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Can be set to false to not reposition the datepicker within the
    * viewport, forcing it to take the configured position. Default: true.
    */
  var reposition: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Make the defaultDate the initial selected value.
    */
  var setDefaultDate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Render days of the calendar grid that fall in the next or previous months to the current month instead of rendering an empty table cell. Default: false.
    */
  var showDaysInNextAndPreviousMonths: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Render the month after the year in the title. Default: false.
    */
  var showMonthAfterYear: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Show the ISO week number at the head of the row. Default: false.
    */
  var showWeekNumber: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Define a class name that can be used as a hook for styling different
    * themes. Default: null.
    */
  var theme: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Function which will be used for formatting date object to string.
    * This function will take precedence over moment.
    */
  @JSName("toString")
  var toString_FPikadayOptions: js.UndefOr[
    js.Function2[/* date */ stdLib.Date, /* format */ js.UndefOr[java.lang.String], java.lang.String]
  ] = js.undefined
  /**
    * Use a different element to trigger opening the datepicker.
    * Default: field element.
    */
  var trigger: js.UndefOr[stdLib.HTMLElement | scala.Null] = js.undefined
  /**
    * Number of years either side (e.g. 10) or array of upper/lower range
    * (e.g. [1900, 2015]).
    */
  var yearRange: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  /**
    * Additional text to append to the year in the title.
    */
  var yearSuffix: js.UndefOr[java.lang.String] = js.undefined
}

object PikadayOptions {
  @scala.inline
  def apply(
    ariaLabel: java.lang.String = null,
    blurFieldOnSelect: js.UndefOr[scala.Boolean] = js.undefined,
    bound: js.UndefOr[scala.Boolean] = js.undefined,
    container: stdLib.HTMLElement = null,
    defaultDate: stdLib.Date = null,
    disableDayFn: /* date */ stdLib.Date => scala.Boolean = null,
    disableWeekends: js.UndefOr[scala.Boolean] = js.undefined,
    enableSelectionDaysInNextAndPreviousMonths: js.UndefOr[scala.Boolean] = js.undefined,
    events: js.Array[java.lang.String] = null,
    field: stdLib.HTMLElement = null,
    firstDay: scala.Int | scala.Double = null,
    format: java.lang.String = null,
    formatStrict: js.UndefOr[scala.Boolean] = js.undefined,
    i18n: PikadayI18nConfig = null,
    isRTL: js.UndefOr[scala.Boolean] = js.undefined,
    keyboardInput: js.UndefOr[scala.Boolean] = js.undefined,
    mainCalendar: java.lang.String = null,
    maxDate: stdLib.Date = null,
    minDate: stdLib.Date = null,
    numberOfMonths: scala.Int | scala.Double = null,
    onClose: () => scala.Unit = null,
    onDraw: () => scala.Unit = null,
    onOpen: () => scala.Unit = null,
    onSelect: js.ThisFunction1[/* this */ Pikaday, /* date */ stdLib.Date, scala.Unit] = null,
    parse: (/* date */ java.lang.String, /* format */ java.lang.String) => stdLib.Date | scala.Null = null,
    pickWholeWeek: js.UndefOr[scala.Boolean] = js.undefined,
    position: java.lang.String = null,
    reposition: js.UndefOr[scala.Boolean] = js.undefined,
    setDefaultDate: js.UndefOr[scala.Boolean] = js.undefined,
    showDaysInNextAndPreviousMonths: js.UndefOr[scala.Boolean] = js.undefined,
    showMonthAfterYear: js.UndefOr[scala.Boolean] = js.undefined,
    showWeekNumber: js.UndefOr[scala.Boolean] = js.undefined,
    theme: java.lang.String = null,
    toString: (/* date */ stdLib.Date, /* format */ js.UndefOr[java.lang.String]) => java.lang.String = null,
    trigger: stdLib.HTMLElement = null,
    yearRange: scala.Double | js.Array[scala.Double] = null,
    yearSuffix: java.lang.String = null
  ): PikadayOptions = {
    val __obj = js.Dynamic.literal()
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (!js.isUndefined(blurFieldOnSelect)) __obj.updateDynamic("blurFieldOnSelect")(blurFieldOnSelect)
    if (!js.isUndefined(bound)) __obj.updateDynamic("bound")(bound)
    if (container != null) __obj.updateDynamic("container")(container)
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate)
    if (disableDayFn != null) __obj.updateDynamic("disableDayFn")(js.Any.fromFunction1(disableDayFn))
    if (!js.isUndefined(disableWeekends)) __obj.updateDynamic("disableWeekends")(disableWeekends)
    if (!js.isUndefined(enableSelectionDaysInNextAndPreviousMonths)) __obj.updateDynamic("enableSelectionDaysInNextAndPreviousMonths")(enableSelectionDaysInNextAndPreviousMonths)
    if (events != null) __obj.updateDynamic("events")(events)
    if (field != null) __obj.updateDynamic("field")(field)
    if (firstDay != null) __obj.updateDynamic("firstDay")(firstDay.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(formatStrict)) __obj.updateDynamic("formatStrict")(formatStrict)
    if (i18n != null) __obj.updateDynamic("i18n")(i18n)
    if (!js.isUndefined(isRTL)) __obj.updateDynamic("isRTL")(isRTL)
    if (!js.isUndefined(keyboardInput)) __obj.updateDynamic("keyboardInput")(keyboardInput)
    if (mainCalendar != null) __obj.updateDynamic("mainCalendar")(mainCalendar)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate)
    if (minDate != null) __obj.updateDynamic("minDate")(minDate)
    if (numberOfMonths != null) __obj.updateDynamic("numberOfMonths")(numberOfMonths.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onDraw != null) __obj.updateDynamic("onDraw")(js.Any.fromFunction0(onDraw))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (parse != null) __obj.updateDynamic("parse")(js.Any.fromFunction2(parse))
    if (!js.isUndefined(pickWholeWeek)) __obj.updateDynamic("pickWholeWeek")(pickWholeWeek)
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(reposition)) __obj.updateDynamic("reposition")(reposition)
    if (!js.isUndefined(setDefaultDate)) __obj.updateDynamic("setDefaultDate")(setDefaultDate)
    if (!js.isUndefined(showDaysInNextAndPreviousMonths)) __obj.updateDynamic("showDaysInNextAndPreviousMonths")(showDaysInNextAndPreviousMonths)
    if (!js.isUndefined(showMonthAfterYear)) __obj.updateDynamic("showMonthAfterYear")(showMonthAfterYear)
    if (!js.isUndefined(showWeekNumber)) __obj.updateDynamic("showWeekNumber")(showWeekNumber)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (toString != null) __obj.updateDynamic("toString")(js.Any.fromFunction2(toString))
    if (trigger != null) __obj.updateDynamic("trigger")(trigger)
    if (yearRange != null) __obj.updateDynamic("yearRange")(yearRange.asInstanceOf[js.Any])
    if (yearSuffix != null) __obj.updateDynamic("yearSuffix")(yearSuffix)
    __obj.asInstanceOf[PikadayOptions]
  }
}

