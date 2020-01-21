package typings.plottable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCenterValue extends js.Object {
  var centerValue: AnonCenterX
  var zoomAmount: Double
}

object AnonCenterValue {
  @scala.inline
  def apply(centerValue: AnonCenterX, zoomAmount: Double): AnonCenterValue = {
    val __obj = js.Dynamic.literal(centerValue = centerValue.asInstanceOf[js.Any], zoomAmount = zoomAmount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCenterValue]
  }
}

