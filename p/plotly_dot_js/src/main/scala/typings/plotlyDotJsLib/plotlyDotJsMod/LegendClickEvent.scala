package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendClickEvent extends js.Object {
  var config: stdLib.Partial[Config]
  var curveNumber: scala.Double
  var data: js.Array[Data]
  var event: stdLib.MouseEvent
  var expandedIndex: scala.Double
  var frames: js.Array[Frame]
  var fullData: js.Array[Data]
  var fullLayout: stdLib.Partial[Layout]
  var layout: stdLib.Partial[Layout]
  var node: PlotlyHTMLElement
}

object LegendClickEvent {
  @scala.inline
  def apply(
    config: stdLib.Partial[Config],
    curveNumber: scala.Double,
    data: js.Array[Data],
    event: stdLib.MouseEvent,
    expandedIndex: scala.Double,
    frames: js.Array[Frame],
    fullData: js.Array[Data],
    fullLayout: stdLib.Partial[Layout],
    layout: stdLib.Partial[Layout],
    node: PlotlyHTMLElement
  ): LegendClickEvent = {
    val __obj = js.Dynamic.literal(config = config, curveNumber = curveNumber, data = data, event = event, expandedIndex = expandedIndex, frames = frames, fullData = fullData, fullLayout = fullLayout, layout = layout, node = node)
  
    __obj.asInstanceOf[LegendClickEvent]
  }
}

