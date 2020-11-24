package typings.officeUiFabricReact.dialogFooterTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDialogFooterStyles extends js.Object {
  
  var action: IStyle = js.native
  
  /**
    * Style for the actions element.
    */
  var actions: IStyle = js.native
  
  var actionsRight: IStyle = js.native
}
object IDialogFooterStyles {
  
  @scala.inline
  def apply(): IDialogFooterStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDialogFooterStyles]
  }
  
  @scala.inline
  implicit class IDialogFooterStylesOps[Self <: IDialogFooterStyles] (val x: Self) extends AnyVal {
    
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
    def setAction(value: IStyle): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setActionNull: Self = this.set("action", null)
    
    @scala.inline
    def setActions(value: IStyle): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    
    @scala.inline
    def setActionsNull: Self = this.set("actions", null)
    
    @scala.inline
    def setActionsRight(value: IStyle): Self = this.set("actionsRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionsRight: Self = this.set("actionsRight", js.undefined)
    
    @scala.inline
    def setActionsRightNull: Self = this.set("actionsRight", null)
  }
}
