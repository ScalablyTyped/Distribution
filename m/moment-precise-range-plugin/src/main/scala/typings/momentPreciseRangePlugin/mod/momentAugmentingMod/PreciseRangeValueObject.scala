package typings.momentPreciseRangePlugin.mod.momentAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreciseRangeValueObject extends js.Object {
  var days: Double = js.native
  var firstDateWasLater: Boolean = js.native
  var hours: Double = js.native
  var minutes: Double = js.native
  var months: Double = js.native
  var seconds: Double = js.native
  var years: Double = js.native
}

object PreciseRangeValueObject {
  @scala.inline
  def apply(
    days: Double,
    firstDateWasLater: Boolean,
    hours: Double,
    minutes: Double,
    months: Double,
    seconds: Double,
    years: Double
  ): PreciseRangeValueObject = {
    val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], firstDateWasLater = firstDateWasLater.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], years = years.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreciseRangeValueObject]
  }
  @scala.inline
  implicit class PreciseRangeValueObjectOps[Self <: PreciseRangeValueObject] (val x: Self) extends AnyVal {
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
    def setDays(value: Double): Self = this.set("days", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstDateWasLater(value: Boolean): Self = this.set("firstDateWasLater", value.asInstanceOf[js.Any])
    @scala.inline
    def setHours(value: Double): Self = this.set("hours", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinutes(value: Double): Self = this.set("minutes", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonths(value: Double): Self = this.set("months", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeconds(value: Double): Self = this.set("seconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setYears(value: Double): Self = this.set("years", value.asInstanceOf[js.Any])
  }
  
}

