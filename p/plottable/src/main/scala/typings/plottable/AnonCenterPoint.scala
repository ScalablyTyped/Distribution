package typings.plottable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCenterPoint extends js.Object {
  var centerPoint: Double
  var zoomAmount: Double
}

object AnonCenterPoint {
  @scala.inline
  def apply(centerPoint: Double, zoomAmount: Double): AnonCenterPoint = {
    val __obj = js.Dynamic.literal(centerPoint = centerPoint.asInstanceOf[js.Any], zoomAmount = zoomAmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCenterPoint]
  }
}

