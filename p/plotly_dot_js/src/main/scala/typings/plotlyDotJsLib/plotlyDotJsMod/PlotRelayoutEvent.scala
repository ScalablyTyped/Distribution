package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotRelayoutEvent extends js.Object {
  var scene: PlotScene
  var xaxis: PlotAxis
  var yaxis: PlotAxis
}

object PlotRelayoutEvent {
  @scala.inline
  def apply(scene: PlotScene, xaxis: PlotAxis, yaxis: PlotAxis): PlotRelayoutEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scene")(scene)
    __obj.updateDynamic("xaxis")(xaxis)
    __obj.updateDynamic("yaxis")(yaxis)
    __obj.asInstanceOf[PlotRelayoutEvent]
  }
}

