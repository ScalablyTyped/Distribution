package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotAxis extends js.Object {
  var autorange: scala.Boolean
  var range: js.Tuple2[scala.Double, scala.Double]
}

object PlotAxis {
  @scala.inline
  def apply(autorange: scala.Boolean, range: js.Tuple2[scala.Double, scala.Double]): PlotAxis = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autorange")(autorange)
    __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[PlotAxis]
  }
}

