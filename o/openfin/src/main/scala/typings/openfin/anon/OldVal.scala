package typings.openfin.anon

import typings.openfin.shapesMod.Hotkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OldVal extends js.Object {
  var newVal: js.UndefOr[js.Array[Hotkey]] = js.native
  var oldVal: js.UndefOr[js.Array[Hotkey]] = js.native
}

object OldVal {
  @scala.inline
  def apply(): OldVal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OldVal]
  }
  @scala.inline
  implicit class OldValOps[Self <: OldVal] (val x: Self) extends AnyVal {
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
    def setNewValVarargs(value: Hotkey*): Self = this.set("newVal", js.Array(value :_*))
    @scala.inline
    def setNewVal(value: js.Array[Hotkey]): Self = this.set("newVal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewVal: Self = this.set("newVal", js.undefined)
    @scala.inline
    def setOldValVarargs(value: Hotkey*): Self = this.set("oldVal", js.Array(value :_*))
    @scala.inline
    def setOldVal(value: js.Array[Hotkey]): Self = this.set("oldVal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldVal: Self = this.set("oldVal", js.undefined)
  }
  
}

