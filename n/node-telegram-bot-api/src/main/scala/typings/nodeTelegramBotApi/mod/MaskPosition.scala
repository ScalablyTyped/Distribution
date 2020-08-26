package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaskPosition extends js.Object {
  var point: String = js.native
  var scale: Double = js.native
  var x_shift: Double = js.native
  var y_shift: Double = js.native
}

object MaskPosition {
  @scala.inline
  def apply(point: String, scale: Double, x_shift: Double, y_shift: Double): MaskPosition = {
    val __obj = js.Dynamic.literal(point = point.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], x_shift = x_shift.asInstanceOf[js.Any], y_shift = y_shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskPosition]
  }
  @scala.inline
  implicit class MaskPositionOps[Self <: MaskPosition] (val x: Self) extends AnyVal {
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
    def setPoint(value: String): Self = this.set("point", value.asInstanceOf[js.Any])
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def setX_shift(value: Double): Self = this.set("x_shift", value.asInstanceOf[js.Any])
    @scala.inline
    def setY_shift(value: Double): Self = this.set("y_shift", value.asInstanceOf[js.Any])
  }
  
}

