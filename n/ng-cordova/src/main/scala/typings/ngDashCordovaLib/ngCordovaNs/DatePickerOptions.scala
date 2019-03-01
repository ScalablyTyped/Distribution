package typings
package ngDashCordovaLib.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerOptions extends js.Object {
  var allowFutureDates: js.UndefOr[scala.Boolean] = js.undefined
  var allowOldDates: js.UndefOr[scala.Boolean] = js.undefined
  var androidTheme: js.UndefOr[AndroidTheme] = js.undefined
  var cancelButtonColor: js.UndefOr[java.lang.String] = js.undefined
  var cancelButtonLabel: js.UndefOr[java.lang.String] = js.undefined
  var cancelText: js.UndefOr[java.lang.String] = js.undefined
  var date: js.UndefOr[stdLib.Date | java.lang.String | scala.Double] = js.undefined
  var doneButtonColor: js.UndefOr[java.lang.String] = js.undefined
  var doneButtonLabel: js.UndefOr[java.lang.String] = js.undefined
  var is24Hour: js.UndefOr[scala.Boolean] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var maxDate: js.UndefOr[stdLib.Date | java.lang.String | scala.Double] = js.undefined
  var minDate: js.UndefOr[stdLib.Date | java.lang.String | scala.Double] = js.undefined
  var minuteInterval: js.UndefOr[scala.Double] = js.undefined
  var mode: js.UndefOr[java.lang.String] = js.undefined
  var nowText: js.UndefOr[java.lang.String] = js.undefined
  var okText: js.UndefOr[java.lang.String] = js.undefined
  var popoverArrowDirection: js.UndefOr[java.lang.String] = js.undefined
  var titleText: js.UndefOr[java.lang.String] = js.undefined
  var todayText: js.UndefOr[java.lang.String] = js.undefined
  var x: js.UndefOr[scala.Double] = js.undefined
  var y: js.UndefOr[scala.Double] = js.undefined
}

object DatePickerOptions {
  @scala.inline
  def apply(
    allowFutureDates: js.UndefOr[scala.Boolean] = js.undefined,
    allowOldDates: js.UndefOr[scala.Boolean] = js.undefined,
    androidTheme: AndroidTheme = null,
    cancelButtonColor: java.lang.String = null,
    cancelButtonLabel: java.lang.String = null,
    cancelText: java.lang.String = null,
    date: stdLib.Date | java.lang.String | scala.Double = null,
    doneButtonColor: java.lang.String = null,
    doneButtonLabel: java.lang.String = null,
    is24Hour: js.UndefOr[scala.Boolean] = js.undefined,
    locale: java.lang.String = null,
    maxDate: stdLib.Date | java.lang.String | scala.Double = null,
    minDate: stdLib.Date | java.lang.String | scala.Double = null,
    minuteInterval: scala.Int | scala.Double = null,
    mode: java.lang.String = null,
    nowText: java.lang.String = null,
    okText: java.lang.String = null,
    popoverArrowDirection: java.lang.String = null,
    titleText: java.lang.String = null,
    todayText: java.lang.String = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
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

