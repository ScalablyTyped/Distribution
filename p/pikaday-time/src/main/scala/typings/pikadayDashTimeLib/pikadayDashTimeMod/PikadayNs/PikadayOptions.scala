package typings
package pikadayDashTimeLib.pikadayDashTimeMod.PikadayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PikadayOptions extends js.Object {
  /**
    * Optional numeric property to prevent calendar from auto-closing after date is selected.
    */
  var autoClose: js.UndefOr[scala.Boolean] = js.undefined
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
    * Language defaults for month and weekday names.
    */
  var i18n: js.UndefOr[PikadayI18nConfig] = js.undefined
  /**
    * Optional numeric property to specify the increment step for hour.
    */
  var incrementHourBy: js.UndefOr[scala.Double] = js.undefined
  /**
    * Optional numeric property to specify the increment step for minute.
    */
  var incrementMinuteBy: js.UndefOr[scala.Double] = js.undefined
  /**
    * Optional numeric property to specify the increment step for second.
    */
  var incrementSecondBy: js.UndefOr[scala.Double] = js.undefined
  /**
    * Reverse the calendar for right-to-left languages. Default: false.
    */
  var isRTL: js.UndefOr[scala.Boolean] = js.undefined
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
    * Optional boolean property to specify whether to show minute controls with calendar or not.
    */
  var showMinutes: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Render the month after the year in the title. Default: false.
    */
  var showMonthAfterYear: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional boolean property to specify whether to show second controls with calendar or not.
    */
  var showSeconds: js.UndefOr[scala.Boolean] = js.undefined
  /*--pikaday-time specific addition--*/
  /**
    * Optional boolean property to specify whether to show time controls with calendar or not.
    */
  var showTime: js.UndefOr[scala.Boolean] = js.undefined
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
    * Optional string added to left of time select
    */
  var timeLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Use a different element to trigger opening the datepicker.
    * Default: field element.
    */
  var trigger: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /**
    * Optional boolean property to specify whether to use 24 hours format or not.
    */
  var use24hour: js.UndefOr[scala.Boolean] = js.undefined
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

