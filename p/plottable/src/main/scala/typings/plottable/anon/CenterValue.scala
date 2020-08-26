package typings.plottable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CenterValue extends js.Object {
  var centerValue: CenterX = js.native
  var zoomAmount: Double = js.native
}

object CenterValue {
  @scala.inline
  def apply(centerValue: CenterX, zoomAmount: Double): CenterValue = {
    val __obj = js.Dynamic.literal(centerValue = centerValue.asInstanceOf[js.Any], zoomAmount = zoomAmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[CenterValue]
  }
  @scala.inline
  implicit class CenterValueOps[Self <: CenterValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCenterValue(value: CenterX): Self = this.set("centerValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoomAmount(value: Double): Self = this.set("zoomAmount", value.asInstanceOf[js.Any])
  }
  
}

