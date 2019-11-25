package typings.plotlyDotJs.plotlyDotJsMod

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMouseEvent extends js.Object {
  var event: MouseEvent
  var points: js.Array[PlotDatum]
}

object PlotMouseEvent {
  @scala.inline
  def apply(event: MouseEvent, points: js.Array[PlotDatum]): PlotMouseEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PlotMouseEvent]
  }
}

