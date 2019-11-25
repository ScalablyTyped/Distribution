package typings.pikadayDashTime.pikadayDashTimeMod

import typings.std.Date
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PikadayOptions extends js.Object {
  /**
    * Optional numeric property to prevent calendar from auto-closing after date is selected.
    */
  var autoClose: js.UndefOr[Boolean] = js.undefined
  /**
    * Automatically show/hide the datepicker on field focus.
    * Default: true if field is set.
    */
  var bound: js.UndefOr[Boolean] = js.undefined
  /**
    * DOM node to render calendar into, see container example.
    * Default: undefined.
    */
  var container: js.UndefOr[HTMLElement] = js.undefined
  /**
    * The initial date to view when first opened.
    */
  var defaultDate: js.UndefOr[Date] = js.undefined
  /**
    * Callback function that gets passed a Date object for each day
    * in view. Should return true to disable selection of that day.
    */
  var disableDayFn: js.UndefOr[js.Function1[/* date */ Date, Boolean]] = js.undefined
  /**
    * Disallow selection of Saturdays and Sundays.
    */
  var disableWeekends: js.UndefOr[Boolean] = js.undefined
  /**
    * Bind the datepicker to a form field.
    */
  var field: js.UndefOr[HTMLElement] = js.undefined
  /**
    * First day of the week (0: Sunday, 1: Monday, etc).
    */
  var firstDay: js.UndefOr[Double] = js.undefined
  /**
    * The default output format for toString() and field value.
    * Requires Moment.js for custom formatting.
    */
  var format: js.UndefOr[String] = js.undefined
  /**
    * Language defaults for month and weekday names.
    */
  var i18n: js.UndefOr[PikadayI18nConfig] = js.undefined
  /**
    * Optional numeric property to specify the increment step for hour.
    */
  var incrementHourBy: js.UndefOr[Double] = js.undefined
  /**
    * Optional numeric property to specify the increment step for minute.
    */
  var incrementMinuteBy: js.UndefOr[Double] = js.undefined
  /**
    * Optional numeric property to specify the increment step for second.
    */
  var incrementSecondBy: js.UndefOr[Double] = js.undefined
  /**
    * Reverse the calendar for right-to-left languages. Default: false.
    */
  var isRTL: js.UndefOr[Boolean] = js.undefined
  /**
    * When numberOfMonths is used, this will help you to choose where the
    * main calendar will be (default left, can be set to right). Only used
    * for the first display or when a selected date is not already visible.
    */
  var mainCalendar: js.UndefOr[String] = js.undefined
  /**
    * The latest date that can be selected (this should be a native
    * Date object - e.g. new Date() or moment().toDate()).
    */
  var maxDate: js.UndefOr[Date] = js.undefined
  /**
    * The earliest date that can be selected (this should be a native
    * Date object - e.g. new Date() or moment().toDate()).
    */
  var minDate: js.UndefOr[Date] = js.undefined
  /**
    * Number of visible calendars.
    */
  var numberOfMonths: js.UndefOr[Double] = js.undefined
  /**
    * Callback function for when the picker is hidden.
    */
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Callback function for when the picker draws a new month.
    */
  var onDraw: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Callback function for when the picker becomes visible.
    */
  var onOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Callback function for when a date is selected.
    */
  var onSelect: js.UndefOr[js.Function1[/* date */ Date, Unit]] = js.undefined
  /**
    * Preferred position of the datepicker relative to the form field
    * (e.g. 'top right'). Automatic adjustment may occur to avoid
    * displaying outside the viewport. Default: 'bottom left'.
    */
  var position: js.UndefOr[String] = js.undefined
  /**
    * Can be set to false to not reposition the datepicker within the
    * viewport, forcing it to take the configured position. Default: true.
    */
  var reposition: js.UndefOr[Boolean] = js.undefined
  /**
    * Make the defaultDate the initial selected value.
    */
  var setDefaultDate: js.UndefOr[Boolean] = js.undefined
  /**
    * Render days of the calendar grid that fall in the next or previous months to the current month instead of rendering an empty table cell. Default: false.
    */
  var showDaysInNextAndPreviousMonths: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional boolean property to specify whether to show minute controls with calendar or not.
    */
  var showMinutes: js.UndefOr[Boolean] = js.undefined
  /**
    * Render the month after the year in the title. Default: false.
    */
  var showMonthAfterYear: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional boolean property to specify whether to show second controls with calendar or not.
    */
  var showSeconds: js.UndefOr[Boolean] = js.undefined
  /*--pikaday-time specific addition--*/
  /**
    * Optional boolean property to specify whether to show time controls with calendar or not.
    */
  var showTime: js.UndefOr[Boolean] = js.undefined
  /**
    * Show the ISO week number at the head of the row. Default: false.
    */
  var showWeekNumber: js.UndefOr[Boolean] = js.undefined
  /**
    * Define a class name that can be used as a hook for styling different
    * themes. Default: null.
    */
  var theme: js.UndefOr[String] = js.undefined
  /**
    * Optional string added to left of time select
    */
  var timeLabel: js.UndefOr[String] = js.undefined
  /**
    * Use a different element to trigger opening the datepicker.
    * Default: field element.
    */
  var trigger: js.UndefOr[HTMLElement] = js.undefined
  /**
    * Optional boolean property to specify whether to use 24 hours format or not.
    */
  var use24hour: js.UndefOr[Boolean] = js.undefined
  /**
    * Number of years either side (e.g. 10) or array of upper/lower range
    * (e.g. [1900, 2015]).
    */
  var yearRange: js.UndefOr[Double | js.Array[Double]] = js.undefined
  /**
    * Additional text to append to the year in the title.
    */
  var yearSuffix: js.UndefOr[String] = js.undefined
}

object PikadayOptions {
  @scala.inline
  def apply(
    autoClose: js.UndefOr[Boolean] = js.undefined,
    bound: js.UndefOr[Boolean] = js.undefined,
    container: HTMLElement = null,
    defaultDate: Date = null,
    disableDayFn: /* date */ Date => Boolean = null,
    disableWeekends: js.UndefOr[Boolean] = js.undefined,
    field: HTMLElement = null,
    firstDay: Int | Double = null,
    format: String = null,
    i18n: PikadayI18nConfig = null,
    incrementHourBy: Int | Double = null,
    incrementMinuteBy: Int | Double = null,
    incrementSecondBy: Int | Double = null,
    isRTL: js.UndefOr[Boolean] = js.undefined,
    mainCalendar: String = null,
    maxDate: Date = null,
    minDate: Date = null,
    numberOfMonths: Int | Double = null,
    onClose: () => Unit = null,
    onDraw: () => Unit = null,
    onOpen: () => Unit = null,
    onSelect: /* date */ Date => Unit = null,
    position: String = null,
    reposition: js.UndefOr[Boolean] = js.undefined,
    setDefaultDate: js.UndefOr[Boolean] = js.undefined,
    showDaysInNextAndPreviousMonths: js.UndefOr[Boolean] = js.undefined,
    showMinutes: js.UndefOr[Boolean] = js.undefined,
    showMonthAfterYear: js.UndefOr[Boolean] = js.undefined,
    showSeconds: js.UndefOr[Boolean] = js.undefined,
    showTime: js.UndefOr[Boolean] = js.undefined,
    showWeekNumber: js.UndefOr[Boolean] = js.undefined,
    theme: String = null,
    timeLabel: String = null,
    trigger: HTMLElement = null,
    use24hour: js.UndefOr[Boolean] = js.undefined,
    yearRange: Double | js.Array[Double] = null,
    yearSuffix: String = null
  ): PikadayOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose.asInstanceOf[js.Any])
    if (!js.isUndefined(bound)) __obj.updateDynamic("bound")(bound.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate.asInstanceOf[js.Any])
    if (disableDayFn != null) __obj.updateDynamic("disableDayFn")(js.Any.fromFunction1(disableDayFn))
    if (!js.isUndefined(disableWeekends)) __obj.updateDynamic("disableWeekends")(disableWeekends.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (firstDay != null) __obj.updateDynamic("firstDay")(firstDay.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (i18n != null) __obj.updateDynamic("i18n")(i18n.asInstanceOf[js.Any])
    if (incrementHourBy != null) __obj.updateDynamic("incrementHourBy")(incrementHourBy.asInstanceOf[js.Any])
    if (incrementMinuteBy != null) __obj.updateDynamic("incrementMinuteBy")(incrementMinuteBy.asInstanceOf[js.Any])
    if (incrementSecondBy != null) __obj.updateDynamic("incrementSecondBy")(incrementSecondBy.asInstanceOf[js.Any])
    if (!js.isUndefined(isRTL)) __obj.updateDynamic("isRTL")(isRTL.asInstanceOf[js.Any])
    if (mainCalendar != null) __obj.updateDynamic("mainCalendar")(mainCalendar.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (numberOfMonths != null) __obj.updateDynamic("numberOfMonths")(numberOfMonths.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onDraw != null) __obj.updateDynamic("onDraw")(js.Any.fromFunction0(onDraw))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(reposition)) __obj.updateDynamic("reposition")(reposition.asInstanceOf[js.Any])
    if (!js.isUndefined(setDefaultDate)) __obj.updateDynamic("setDefaultDate")(setDefaultDate.asInstanceOf[js.Any])
    if (!js.isUndefined(showDaysInNextAndPreviousMonths)) __obj.updateDynamic("showDaysInNextAndPreviousMonths")(showDaysInNextAndPreviousMonths.asInstanceOf[js.Any])
    if (!js.isUndefined(showMinutes)) __obj.updateDynamic("showMinutes")(showMinutes.asInstanceOf[js.Any])
    if (!js.isUndefined(showMonthAfterYear)) __obj.updateDynamic("showMonthAfterYear")(showMonthAfterYear.asInstanceOf[js.Any])
    if (!js.isUndefined(showSeconds)) __obj.updateDynamic("showSeconds")(showSeconds.asInstanceOf[js.Any])
    if (!js.isUndefined(showTime)) __obj.updateDynamic("showTime")(showTime.asInstanceOf[js.Any])
    if (!js.isUndefined(showWeekNumber)) __obj.updateDynamic("showWeekNumber")(showWeekNumber.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (timeLabel != null) __obj.updateDynamic("timeLabel")(timeLabel.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (!js.isUndefined(use24hour)) __obj.updateDynamic("use24hour")(use24hour.asInstanceOf[js.Any])
    if (yearRange != null) __obj.updateDynamic("yearRange")(yearRange.asInstanceOf[js.Any])
    if (yearSuffix != null) __obj.updateDynamic("yearSuffix")(yearSuffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[PikadayOptions]
  }
}

