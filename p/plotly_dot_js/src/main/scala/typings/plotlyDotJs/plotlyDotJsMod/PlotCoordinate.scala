package typings.plotlyDotJs.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotCoordinate extends js.Object {
  var pointNumber: Double
  var x: Double
  var y: Double
}

object PlotCoordinate {
  @scala.inline
  def apply(pointNumber: Double, x: Double, y: Double): PlotCoordinate = {
    val __obj = js.Dynamic.literal(pointNumber = pointNumber, x = x, y = y)
  
    __obj.asInstanceOf[PlotCoordinate]
  }
}

