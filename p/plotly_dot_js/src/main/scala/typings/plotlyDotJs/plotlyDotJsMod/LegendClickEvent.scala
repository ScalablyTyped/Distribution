package typings.plotlyDotJs.plotlyDotJsMod

import typings.std.MouseEvent
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendClickEvent extends js.Object {
  var config: Partial[Config]
  var curveNumber: Double
  var data: js.Array[Data]
  var event: MouseEvent
  var expandedIndex: Double
  var frames: js.Array[Frame]
  var fullData: js.Array[Data]
  var fullLayout: Partial[Layout]
  var layout: Partial[Layout]
  var node: PlotlyHTMLElement
}

object LegendClickEvent {
  @scala.inline
  def apply(
    config: Partial[Config],
    curveNumber: Double,
    data: js.Array[Data],
    event: MouseEvent,
    expandedIndex: Double,
    frames: js.Array[Frame],
    fullData: js.Array[Data],
    fullLayout: Partial[Layout],
    layout: Partial[Layout],
    node: PlotlyHTMLElement
  ): LegendClickEvent = {
    val __obj = js.Dynamic.literal(config = config, curveNumber = curveNumber, data = data, event = event, expandedIndex = expandedIndex, frames = frames, fullData = fullData, fullLayout = fullLayout, layout = layout, node = node)
  
    __obj.asInstanceOf[LegendClickEvent]
  }
}

