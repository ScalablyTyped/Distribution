package typings.meteorSjobs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The supported fields for in and on can be used in singular and/or plural versions.
  * The date object will be updated in the order that is specified.
  */
trait CfgTimeObject extends js.Object {
  var day: js.UndefOr[Double] = js.undefined
  var days: js.UndefOr[Double] = js.undefined
  var hour: js.UndefOr[Double] = js.undefined
  var hours: js.UndefOr[Double] = js.undefined
  var milisecond: js.UndefOr[Double] = js.undefined
  var miliseconds: js.UndefOr[Double] = js.undefined
  var minute: js.UndefOr[Double] = js.undefined
  var minutes: js.UndefOr[Double] = js.undefined
  var month: js.UndefOr[Double] = js.undefined
  var months: js.UndefOr[Double] = js.undefined
  var second: js.UndefOr[Double] = js.undefined
  var seconds: js.UndefOr[Double] = js.undefined
  var year: js.UndefOr[Double] = js.undefined
  var years: js.UndefOr[Double] = js.undefined
}

object CfgTimeObject {
  @scala.inline
  def apply(
    day: js.UndefOr[Double] = js.undefined,
    days: js.UndefOr[Double] = js.undefined,
    hour: js.UndefOr[Double] = js.undefined,
    hours: js.UndefOr[Double] = js.undefined,
    milisecond: js.UndefOr[Double] = js.undefined,
    miliseconds: js.UndefOr[Double] = js.undefined,
    minute: js.UndefOr[Double] = js.undefined,
    minutes: js.UndefOr[Double] = js.undefined,
    month: js.UndefOr[Double] = js.undefined,
    months: js.UndefOr[Double] = js.undefined,
    second: js.UndefOr[Double] = js.undefined,
    seconds: js.UndefOr[Double] = js.undefined,
    year: js.UndefOr[Double] = js.undefined,
    years: js.UndefOr[Double] = js.undefined
  ): CfgTimeObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(day)) __obj.updateDynamic("day")(day.get.asInstanceOf[js.Any])
    if (!js.isUndefined(days)) __obj.updateDynamic("days")(days.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hour)) __obj.updateDynamic("hour")(hour.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hours)) __obj.updateDynamic("hours")(hours.get.asInstanceOf[js.Any])
    if (!js.isUndefined(milisecond)) __obj.updateDynamic("milisecond")(milisecond.get.asInstanceOf[js.Any])
    if (!js.isUndefined(miliseconds)) __obj.updateDynamic("miliseconds")(miliseconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minute)) __obj.updateDynamic("minute")(minute.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minutes)) __obj.updateDynamic("minutes")(minutes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(month)) __obj.updateDynamic("month")(month.get.asInstanceOf[js.Any])
    if (!js.isUndefined(months)) __obj.updateDynamic("months")(months.get.asInstanceOf[js.Any])
    if (!js.isUndefined(second)) __obj.updateDynamic("second")(second.get.asInstanceOf[js.Any])
    if (!js.isUndefined(seconds)) __obj.updateDynamic("seconds")(seconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(year)) __obj.updateDynamic("year")(year.get.asInstanceOf[js.Any])
    if (!js.isUndefined(years)) __obj.updateDynamic("years")(years.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CfgTimeObject]
  }
}

