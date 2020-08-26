package typings.plotlyJs.mod

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotMouseEvent extends js.Object {
  var event: MouseEvent = js.native
  var points: js.Array[PlotDatum] = js.native
}

object PlotMouseEvent {
  @scala.inline
  def apply(event: MouseEvent, points: js.Array[PlotDatum]): PlotMouseEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotMouseEvent]
  }
  @scala.inline
  implicit class PlotMouseEventOps[Self <: PlotMouseEvent] (val x: Self) extends AnyVal {
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
    def setEvent(value: MouseEvent): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointsVarargs(value: PlotDatum*): Self = this.set("points", js.Array(value :_*))
    @scala.inline
    def setPoints(value: js.Array[PlotDatum]): Self = this.set("points", value.asInstanceOf[js.Any])
  }
  
}

