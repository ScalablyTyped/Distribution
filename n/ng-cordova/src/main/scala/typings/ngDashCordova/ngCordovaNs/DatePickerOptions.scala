package typings.ngDashCordova.ngCordovaNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerOptions extends js.Object {
  var allowFutureDates: js.UndefOr[Boolean] = js.undefined
  var allowOldDates: js.UndefOr[Boolean] = js.undefined
  var androidTheme: js.UndefOr[AndroidTheme] = js.undefined
  var cancelButtonColor: js.UndefOr[String] = js.undefined
  var cancelButtonLabel: js.UndefOr[String] = js.undefined
  var cancelText: js.UndefOr[String] = js.undefined
  var date: js.UndefOr[Date | String | Double] = js.undefined
  var doneButtonColor: js.UndefOr[String] = js.undefined
  var doneButtonLabel: js.UndefOr[String] = js.undefined
  var is24Hour: js.UndefOr[Boolean] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var maxDate: js.UndefOr[Date | String | Double] = js.undefined
  var minDate: js.UndefOr[Date | String | Double] = js.undefined
  var minuteInterval: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var nowText: js.UndefOr[String] = js.undefined
  var okText: js.UndefOr[String] = js.undefined
  var popoverArrowDirection: js.UndefOr[String] = js.undefined
  var titleText: js.UndefOr[String] = js.undefined
  var todayText: js.UndefOr[String] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object DatePickerOptions {
  @scala.inline
  def apply(
    allowFutureDates: js.UndefOr[Boolean] = js.undefined,
    allowOldDates: js.UndefOr[Boolean] = js.undefined,
    androidTheme: AndroidTheme = null,
    cancelButtonColor: String = null,
    cancelButtonLabel: String = null,
    cancelText: String = null,
    date: Date | String | Double = null,
    doneButtonColor: String = null,
    doneButtonLabel: String = null,
    is24Hour: js.UndefOr[Boolean] = js.undefined,
    locale: String = null,
    maxDate: Date | String | Double = null,
    minDate: Date | String | Double = null,
    minuteInterval: Int | Double = null,
    mode: String = null,
    nowText: String = null,
    okText: String = null,
    popoverArrowDirection: String = null,
    titleText: String = null,
    todayText: String = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): DatePickerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowFutureDates)) __obj.updateDynamic("allowFutureDates")(allowFutureDates)
    if (!js.isUndefined(allowOldDates)) __obj.updateDynamic("allowOldDates")(allowOldDates)
    if (androidTheme != null) __obj.updateDynamic("androidTheme")(androidTheme)
    if (cancelButtonColor != null) __obj.updateDynamic("cancelButtonColor")(cancelButtonColor)
    if (cancelButtonLabel != null) __obj.updateDynamic("cancelButtonLabel")(cancelButtonLabel)
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText)
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (doneButtonColor != null) __obj.updateDynamic("doneButtonColor")(doneButtonColor)
    if (doneButtonLabel != null) __obj.updateDynamic("doneButtonLabel")(doneButtonLabel)
    if (!js.isUndefined(is24Hour)) __obj.updateDynamic("is24Hour")(is24Hour)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (minuteInterval != null) __obj.updateDynamic("minuteInterval")(minuteInterval.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (nowText != null) __obj.updateDynamic("nowText")(nowText)
    if (okText != null) __obj.updateDynamic("okText")(okText)
    if (popoverArrowDirection != null) __obj.updateDynamic("popoverArrowDirection")(popoverArrowDirection)
    if (titleText != null) __obj.updateDynamic("titleText")(titleText)
    if (todayText != null) __obj.updateDynamic("todayText")(todayText)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePickerOptions]
  }
}

