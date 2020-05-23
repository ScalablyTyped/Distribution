package typings.plottable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CenterPoint extends js.Object {
  var centerPoint: Double
  var zoomAmount: Double
}

object CenterPoint {
  @scala.inline
  def apply(centerPoint: Double, zoomAmount: Double): CenterPoint = {
    val __obj = js.Dynamic.literal(centerPoint = centerPoint.asInstanceOf[js.Any], zoomAmount = zoomAmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[CenterPoint]
  }
}

