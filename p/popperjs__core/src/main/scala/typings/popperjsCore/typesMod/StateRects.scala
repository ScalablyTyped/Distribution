package typings.popperjsCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateRects extends js.Object {
  
  var popper: Rect = js.native
  
  var reference: Rect = js.native
}
object StateRects {
  
  @scala.inline
  def apply(popper: Rect, reference: Rect): StateRects = {
    val __obj = js.Dynamic.literal(popper = popper.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateRects]
  }
  
  @scala.inline
  implicit class StateRectsOps[Self <: StateRects] (val x: Self) extends AnyVal {
    
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
    def setPopper(value: Rect): Self = this.set("popper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReference(value: Rect): Self = this.set("reference", value.asInstanceOf[js.Any])
  }
}
