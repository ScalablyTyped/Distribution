package typings.plottable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CenterValue extends js.Object {
  var centerValue: Anon_CenterX
  var zoomAmount: Double
}

object Anon_CenterValue {
  @scala.inline
  def apply(centerValue: Anon_CenterX, zoomAmount: Double): Anon_CenterValue = {
    val __obj = js.Dynamic.literal(centerValue = centerValue.asInstanceOf[js.Any], zoomAmount = zoomAmount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CenterValue]
  }
}

