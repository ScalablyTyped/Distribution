package typings.momentHoliday.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Holidays_ extends js.Object {
  var active: HolidaysMapping = js.native
  var active_last: HolidaysMapping = js.native
}

object Holidays_ {
  @scala.inline
  def apply(active: HolidaysMapping, active_last: HolidaysMapping): Holidays_ = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], active_last = active_last.asInstanceOf[js.Any])
    __obj.asInstanceOf[Holidays_]
  }
  @scala.inline
  implicit class Holidays_Ops[Self <: Holidays_] (val x: Self) extends AnyVal {
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
    def setActive(value: HolidaysMapping): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setActive_last(value: HolidaysMapping): Self = this.set("active_last", value.asInstanceOf[js.Any])
  }
  
}

