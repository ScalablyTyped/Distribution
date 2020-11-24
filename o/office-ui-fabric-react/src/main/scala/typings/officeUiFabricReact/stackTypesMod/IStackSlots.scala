package typings.officeUiFabricReact.stackTypesMod

import typings.uifabricFoundation.ihtmlslotsMod.IHTMLSlot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStackSlots extends js.Object {
  
  /**
    * Defines a slot that is placed inside the root slot in order to achieve wrapping. Only used when the wrap
    * property is set to true.
    */
  var inner: js.UndefOr[IHTMLSlot] = js.native
  
  /**
    * Defines root slot of the component.
    */
  var root: js.UndefOr[IHTMLSlot] = js.native
}
object IStackSlots {
  
  @scala.inline
  def apply(): IStackSlots = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStackSlots]
  }
  
  @scala.inline
  implicit class IStackSlotsOps[Self <: IStackSlots] (val x: Self) extends AnyVal {
    
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
    def setInner(value: IHTMLSlot): Self = this.set("inner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInner: Self = this.set("inner", js.undefined)
    
    @scala.inline
    def setRoot(value: IHTMLSlot): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
}
