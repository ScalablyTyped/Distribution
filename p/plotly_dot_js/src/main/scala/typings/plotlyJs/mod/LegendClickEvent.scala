package typings.plotlyJs.mod

import typings.plotlyJs.PartialConfig
import typings.plotlyJs.PartialLayout
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendClickEvent extends js.Object {
  var config: PartialConfig
  var curveNumber: Double
  var data: js.Array[Data]
  var event: MouseEvent
  var expandedIndex: Double
  var frames: js.Array[Frame]
  var fullData: js.Array[Data]
  var fullLayout: PartialLayout
  var layout: PartialLayout
  var node: PlotlyHTMLElement
}

object LegendClickEvent {
  @scala.inline
  def apply(
    config: PartialConfig,
    curveNumber: Double,
    data: js.Array[Data],
    event: MouseEvent,
    expandedIndex: Double,
    frames: js.Array[Frame],
    fullData: js.Array[Data],
    fullLayout: PartialLayout,
    layout: PartialLayout,
    node: PlotlyHTMLElement
  ): LegendClickEvent = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], curveNumber = curveNumber.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], expandedIndex = expandedIndex.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], fullData = fullData.asInstanceOf[js.Any], fullLayout = fullLayout.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendClickEvent]
  }
}

