package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMouseEvent extends js.Object {
  var event: stdLib.MouseEvent
  var points: js.Array[PlotDatum]
}

object PlotMouseEvent {
  @scala.inline
  def apply(event: stdLib.MouseEvent, points: js.Array[PlotDatum]): PlotMouseEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("event")(event)
    __obj.updateDynamic("points")(points)
    __obj.asInstanceOf[PlotMouseEvent]
  }
}

