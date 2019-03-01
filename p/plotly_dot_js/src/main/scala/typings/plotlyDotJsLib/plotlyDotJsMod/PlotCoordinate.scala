package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotCoordinate extends js.Object {
  var pointNumber: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object PlotCoordinate {
  @scala.inline
  def apply(pointNumber: scala.Double, x: scala.Double, y: scala.Double): PlotCoordinate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pointNumber")(pointNumber)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[PlotCoordinate]
  }
}

