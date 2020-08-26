package typings.officeUiFabricReact.calendarYearMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalendarYearRange extends js.Object {
  var fromYear: Double = js.native
  var toYear: Double = js.native
}

object ICalendarYearRange {
  @scala.inline
  def apply(fromYear: Double, toYear: Double): ICalendarYearRange = {
    val __obj = js.Dynamic.literal(fromYear = fromYear.asInstanceOf[js.Any], toYear = toYear.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalendarYearRange]
  }
  @scala.inline
  implicit class ICalendarYearRangeOps[Self <: ICalendarYearRange] (val x: Self) extends AnyVal {
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
    def setFromYear(value: Double): Self = this.set("fromYear", value.asInstanceOf[js.Any])
    @scala.inline
    def setToYear(value: Double): Self = this.set("toYear", value.asInstanceOf[js.Any])
  }
  
}

