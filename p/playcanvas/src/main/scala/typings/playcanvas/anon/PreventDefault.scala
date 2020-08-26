package typings.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreventDefault extends js.Object {
  var preventDefault: js.UndefOr[Boolean] = js.native
  var stopPropagation: js.UndefOr[Boolean] = js.native
}

object PreventDefault {
  @scala.inline
  def apply(): PreventDefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreventDefault]
  }
  @scala.inline
  implicit class PreventDefaultOps[Self <: PreventDefault] (val x: Self) extends AnyVal {
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
    def setPreventDefault(value: Boolean): Self = this.set("preventDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventDefault: Self = this.set("preventDefault", js.undefined)
    @scala.inline
    def setStopPropagation(value: Boolean): Self = this.set("stopPropagation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopPropagation: Self = this.set("stopPropagation", js.undefined)
  }
  
}

