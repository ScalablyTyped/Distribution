package typings.ngCordova.ngCordova

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
    minuteInterval: js.UndefOr[Double] = js.undefined,
    mode: String = null,
    nowText: String = null,
    okText: String = null,
    popoverArrowDirection: String = null,
    titleText: String = null,
    todayText: String = null,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): DatePickerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowFutureDates)) __obj.updateDynamic("allowFutureDates")(allowFutureDates.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowOldDates)) __obj.updateDynamic("allowOldDates")(allowOldDates.get.asInstanceOf[js.Any])
    if (androidTheme != null) __obj.updateDynamic("androidTheme")(androidTheme.asInstanceOf[js.Any])
    if (cancelButtonColor != null) __obj.updateDynamic("cancelButtonColor")(cancelButtonColor.asInstanceOf[js.Any])
    if (cancelButtonLabel != null) __obj.updateDynamic("cancelButtonLabel")(cancelButtonLabel.asInstanceOf[js.Any])
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (doneButtonColor != null) __obj.updateDynamic("doneButtonColor")(doneButtonColor.asInstanceOf[js.Any])
    if (doneButtonLabel != null) __obj.updateDynamic("doneButtonLabel")(doneButtonLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(is24Hour)) __obj.updateDynamic("is24Hour")(is24Hour.get.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (!js.isUndefined(minuteInterval)) __obj.updateDynamic("minuteInterval")(minuteInterval.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (nowText != null) __obj.updateDynamic("nowText")(nowText.asInstanceOf[js.Any])
    if (okText != null) __obj.updateDynamic("okText")(okText.asInstanceOf[js.Any])
    if (popoverArrowDirection != null) __obj.updateDynamic("popoverArrowDirection")(popoverArrowDirection.asInstanceOf[js.Any])
    if (titleText != null) __obj.updateDynamic("titleText")(titleText.asInstanceOf[js.Any])
    if (todayText != null) __obj.updateDynamic("todayText")(todayText.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePickerOptions]
  }
}

