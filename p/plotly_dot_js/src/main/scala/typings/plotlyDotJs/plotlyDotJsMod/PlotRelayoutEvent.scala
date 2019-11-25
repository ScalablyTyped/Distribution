package typings.plotlyDotJs.plotlyDotJsMod

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
    val __obj = js.Dynamic.literal(scene = scene.asInstanceOf[js.Any], xaxis = xaxis.asInstanceOf[js.Any], yaxis = yaxis.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PlotRelayoutEvent]
  }
}

