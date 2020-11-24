package typings.popperjsCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateOffsets extends js.Object {
  
  var arrow: js.UndefOr[Offsets] = js.native
  
  var popper: Offsets = js.native
}
object StateOffsets {
  
  @scala.inline
  def apply(popper: Offsets): StateOffsets = {
    val __obj = js.Dynamic.literal(popper = popper.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateOffsets]
  }
  
  @scala.inline
  implicit class StateOffsetsOps[Self <: StateOffsets] (val x: Self) extends AnyVal {
    
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
    def setPopper(value: Offsets): Self = this.set("popper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrow(value: Offsets): Self = this.set("arrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrow: Self = this.set("arrow", js.undefined)
  }
}
