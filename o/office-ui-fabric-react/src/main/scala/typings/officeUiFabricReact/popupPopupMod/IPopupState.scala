package typings.officeUiFabricReact.popupPopupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPopupState extends js.Object {
  
  var needsVerticalScrollBar: js.UndefOr[Boolean] = js.native
}
object IPopupState {
  
  @scala.inline
  def apply(): IPopupState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPopupState]
  }
  
  @scala.inline
  implicit class IPopupStateOps[Self <: IPopupState] (val x: Self) extends AnyVal {
    
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
    def setNeedsVerticalScrollBar(value: Boolean): Self = this.set("needsVerticalScrollBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeedsVerticalScrollBar: Self = this.set("needsVerticalScrollBar", js.undefined)
  }
}
