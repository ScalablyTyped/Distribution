package typings.openfin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScreenX extends js.Object {
  var screenX: Double = js.native
  var screenY: Double = js.native
}

object ScreenX {
  @scala.inline
  def apply(screenX: Double, screenY: Double): ScreenX = {
    val __obj = js.Dynamic.literal(screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenX]
  }
  @scala.inline
  implicit class ScreenXOps[Self <: ScreenX] (val x: Self) extends AnyVal {
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
    def setScreenX(value: Double): Self = this.set("screenX", value.asInstanceOf[js.Any])
    @scala.inline
    def setScreenY(value: Double): Self = this.set("screenY", value.asInstanceOf[js.Any])
  }
  
}

