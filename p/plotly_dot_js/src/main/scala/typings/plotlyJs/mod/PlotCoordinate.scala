package typings.plotlyJs.mod

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
    val __obj = js.Dynamic.literal(pointNumber = pointNumber.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotCoordinate]
  }
}

