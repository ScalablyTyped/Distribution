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
    val __obj = js.Dynamic.literal(scene = scene, xaxis = xaxis, yaxis = yaxis)
  
    __obj.asInstanceOf[PlotRelayoutEvent]
  }
}

