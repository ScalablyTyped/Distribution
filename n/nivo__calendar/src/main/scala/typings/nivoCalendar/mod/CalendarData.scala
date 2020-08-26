package typings.nivoCalendar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarData extends js.Object {
  var data: js.Array[CalendarDatum] = js.native
  var from: DateOrString = js.native
  var to: DateOrString = js.native
}

object CalendarData {
  @scala.inline
  def apply(data: js.Array[CalendarDatum], from: DateOrString, to: DateOrString): CalendarData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarData]
  }
  @scala.inline
  implicit class CalendarDataOps[Self <: CalendarData] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: CalendarDatum*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[CalendarDatum]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrom(value: DateOrString): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setTo(value: DateOrString): Self = this.set("to", value.asInstanceOf[js.Any])
  }
  
}

