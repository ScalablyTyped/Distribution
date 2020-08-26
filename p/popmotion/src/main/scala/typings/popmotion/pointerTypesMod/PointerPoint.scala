package typings.popmotion.pointerTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointerPoint extends js.Object {
  var clientX: Double = js.native
  var clientY: Double = js.native
  var pageX: Double = js.native
  var pageY: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object PointerPoint {
  @scala.inline
  def apply(clientX: Double, clientY: Double, pageX: Double, pageY: Double, x: Double, y: Double): PointerPoint = {
    val __obj = js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerPoint]
  }
  @scala.inline
  implicit class PointerPointOps[Self <: PointerPoint] (val x: Self) extends AnyVal {
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
    def setClientX(value: Double): Self = this.set("clientX", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientY(value: Double): Self = this.set("clientY", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageX(value: Double): Self = this.set("pageX", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageY(value: Double): Self = this.set("pageY", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

