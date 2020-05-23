package typings.plottable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CenterValue extends js.Object {
  var centerValue: CenterX
  var zoomAmount: Double
}

object CenterValue {
  @scala.inline
  def apply(centerValue: CenterX, zoomAmount: Double): CenterValue = {
    val __obj = js.Dynamic.literal(centerValue = centerValue.asInstanceOf[js.Any], zoomAmount = zoomAmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[CenterValue]
  }
}

