package typings
package pikadayLib.pikadayMod.PikadayNs

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
  var container: js.UndefOr[stdLib.HTMLElement] = js.undefined
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
  var field: js.UndefOr[stdLib.HTMLElement] = js.undefined
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
  var onSelect: js.UndefOr[js.Function1[/* date */ stdLib.Date, scala.Unit]] = js.undefined
  /**
           * Function which will be used for parsing input string and getting a date object from it.
           * This function will take precedence over moment.
           */
  var parse: js.UndefOr[
    js.Function2[/* date */ java.lang.String, /* format */ java.lang.String, stdLib.Date]
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
  var trigger: js.UndefOr[stdLib.HTMLElement] = js.undefined
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

