package typings.meteorSjobs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The supported fields for in and on can be used in singular and/or plural versions.
  * The date object will be updated in the order that is specified.
  */
@js.native
trait CfgTimeObject extends js.Object {
  var day: js.UndefOr[Double] = js.native
  var days: js.UndefOr[Double] = js.native
  var hour: js.UndefOr[Double] = js.native
  var hours: js.UndefOr[Double] = js.native
  var milisecond: js.UndefOr[Double] = js.native
  var miliseconds: js.UndefOr[Double] = js.native
  var minute: js.UndefOr[Double] = js.native
  var minutes: js.UndefOr[Double] = js.native
  var month: js.UndefOr[Double] = js.native
  var months: js.UndefOr[Double] = js.native
  var second: js.UndefOr[Double] = js.native
  var seconds: js.UndefOr[Double] = js.native
  var year: js.UndefOr[Double] = js.native
  var years: js.UndefOr[Double] = js.native
}

object CfgTimeObject {
  @scala.inline
  def apply(): CfgTimeObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CfgTimeObject]
  }
  @scala.inline
  implicit class CfgTimeObjectOps[Self <: CfgTimeObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDay(value: Double): Self = this.set("day", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDay: Self = this.set("day", js.undefined)
    @scala.inline
    def setDays(value: Double): Self = this.set("days", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDays: Self = this.set("days", js.undefined)
    @scala.inline
    def setHour(value: Double): Self = this.set("hour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHour: Self = this.set("hour", js.undefined)
    @scala.inline
    def setHours(value: Double): Self = this.set("hours", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHours: Self = this.set("hours", js.undefined)
    @scala.inline
    def setMilisecond(value: Double): Self = this.set("milisecond", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMilisecond: Self = this.set("milisecond", js.undefined)
    @scala.inline
    def setMiliseconds(value: Double): Self = this.set("miliseconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMiliseconds: Self = this.set("miliseconds", js.undefined)
    @scala.inline
    def setMinute(value: Double): Self = this.set("minute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinute: Self = this.set("minute", js.undefined)
    @scala.inline
    def setMinutes(value: Double): Self = this.set("minutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinutes: Self = this.set("minutes", js.undefined)
    @scala.inline
    def setMonth(value: Double): Self = this.set("month", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    @scala.inline
    def setMonths(value: Double): Self = this.set("months", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonths: Self = this.set("months", js.undefined)
    @scala.inline
    def setSecond(value: Double): Self = this.set("second", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecond: Self = this.set("second", js.undefined)
    @scala.inline
    def setSeconds(value: Double): Self = this.set("seconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeconds: Self = this.set("seconds", js.undefined)
    @scala.inline
    def setYear(value: Double): Self = this.set("year", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYear: Self = this.set("year", js.undefined)
    @scala.inline
    def setYears(value: Double): Self = this.set("years", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYears: Self = this.set("years", js.undefined)
  }
  
}

