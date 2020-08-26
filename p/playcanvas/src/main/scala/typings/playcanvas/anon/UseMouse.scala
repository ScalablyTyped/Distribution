package typings.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseMouse extends js.Object {
  var useMouse: js.UndefOr[Boolean] = js.native
  var useTouch: js.UndefOr[Boolean] = js.native
  var useXr: js.UndefOr[Boolean] = js.native
}

object UseMouse {
  @scala.inline
  def apply(): UseMouse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseMouse]
  }
  @scala.inline
  implicit class UseMouseOps[Self <: UseMouse] (val x: Self) extends AnyVal {
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
    def setUseMouse(value: Boolean): Self = this.set("useMouse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseMouse: Self = this.set("useMouse", js.undefined)
    @scala.inline
    def setUseTouch(value: Boolean): Self = this.set("useTouch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseTouch: Self = this.set("useTouch", js.undefined)
    @scala.inline
    def setUseXr(value: Boolean): Self = this.set("useXr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseXr: Self = this.set("useXr", js.undefined)
  }
  
}

