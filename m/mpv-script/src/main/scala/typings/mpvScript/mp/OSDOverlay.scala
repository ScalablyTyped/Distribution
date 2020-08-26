package typings.mpvScript.mp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OSDOverlay extends js.Object {
  var data: String = js.native
  var res_x: Double = js.native
  var res_y: Double = js.native
  var z: Double = js.native
  def remove(): Unit = js.native
  def update(): Unit = js.native
}

object OSDOverlay {
  @scala.inline
  def apply(data: String, remove: () => Unit, res_x: Double, res_y: Double, update: () => Unit, z: Double): OSDOverlay = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), res_x = res_x.asInstanceOf[js.Any], res_y = res_y.asInstanceOf[js.Any], update = js.Any.fromFunction0(update), z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[OSDOverlay]
  }
  @scala.inline
  implicit class OSDOverlayOps[Self <: OSDOverlay] (val x: Self) extends AnyVal {
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
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
    @scala.inline
    def setRes_x(value: Double): Self = this.set("res_x", value.asInstanceOf[js.Any])
    @scala.inline
    def setRes_y(value: Double): Self = this.set("res_y", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
    @scala.inline
    def setZ(value: Double): Self = this.set("z", value.asInstanceOf[js.Any])
  }
  
}

