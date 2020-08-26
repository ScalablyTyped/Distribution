package typings.officeUiFabricReact.textTypesMod

import typings.uifabricFoundation.ihtmlslotsMod.IHTMLSlot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextSlots extends js.Object {
  var root: js.UndefOr[IHTMLSlot] = js.native
}

object ITextSlots {
  @scala.inline
  def apply(): ITextSlots = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITextSlots]
  }
  @scala.inline
  implicit class ITextSlotsOps[Self <: ITextSlots] (val x: Self) extends AnyVal {
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
    def setRoot(value: IHTMLSlot): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
  
}

