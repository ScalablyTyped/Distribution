package typings.officeUiFabricReact.messageBarTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMessageBarStyles extends js.Object {
  
  /**
    * Style set for the optional element containing the action elements.
    */
  var actions: js.UndefOr[IStyle] = js.native
  
  /**
    * Style set for the element containing the icon, text, and optional dismiss button.
    */
  var content: js.UndefOr[IStyle] = js.native
  
  /**
    * Style set for the element containing the dismiss button.
    */
  var dismissSingleLine: js.UndefOr[IStyle] = js.native
  
  /**
    * Style set for the optional dismiss button.
    */
  var dismissal: js.UndefOr[IStyle] = js.native
  
  /**
    * Style set for the icon used to expand and collapse the MessageBar.
    */
  var expand: js.UndefOr[IStyle] = js.native
  
  /**
    * Style set for the element containing the expand icon.
    */
  var expandSingleLine: js.UndefOr[IStyle] = js.native
  
  /**
    * Style set for the icon.
    */
  var icon: js.UndefOr[IStyle] = js.native
  
  /**
    * Style set for the element containing the icon.
    */
  var iconContainer: js.UndefOr[IStyle] = js.native
  
  /**
    * Style set for the text.
    */
  var innerText: js.UndefOr[IStyle] = js.native
  
  /**
    * Style set for the root element.
    */
  var root: js.UndefOr[IStyle] = js.native
  
  /**
    * Style set for the element containing the text.
    */
  var text: js.UndefOr[IStyle] = js.native
}
object IMessageBarStyles {
  
  @scala.inline
  def apply(): IMessageBarStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMessageBarStyles]
  }
  
  @scala.inline
  implicit class IMessageBarStylesOps[Self <: IMessageBarStyles] (val x: Self) extends AnyVal {
    
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
    def setActions(value: IStyle): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    
    @scala.inline
    def setActionsNull: Self = this.set("actions", null)
    
    @scala.inline
    def setContent(value: IStyle): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setContentNull: Self = this.set("content", null)
    
    @scala.inline
    def setDismissSingleLine(value: IStyle): Self = this.set("dismissSingleLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDismissSingleLine: Self = this.set("dismissSingleLine", js.undefined)
    
    @scala.inline
    def setDismissSingleLineNull: Self = this.set("dismissSingleLine", null)
    
    @scala.inline
    def setDismissal(value: IStyle): Self = this.set("dismissal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDismissal: Self = this.set("dismissal", js.undefined)
    
    @scala.inline
    def setDismissalNull: Self = this.set("dismissal", null)
    
    @scala.inline
    def setExpand(value: IStyle): Self = this.set("expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
    
    @scala.inline
    def setExpandNull: Self = this.set("expand", null)
    
    @scala.inline
    def setExpandSingleLine(value: IStyle): Self = this.set("expandSingleLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandSingleLine: Self = this.set("expandSingleLine", js.undefined)
    
    @scala.inline
    def setExpandSingleLineNull: Self = this.set("expandSingleLine", null)
    
    @scala.inline
    def setIcon(value: IStyle): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIconNull: Self = this.set("icon", null)
    
    @scala.inline
    def setIconContainer(value: IStyle): Self = this.set("iconContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconContainer: Self = this.set("iconContainer", js.undefined)
    
    @scala.inline
    def setIconContainerNull: Self = this.set("iconContainer", null)
    
    @scala.inline
    def setInnerText(value: IStyle): Self = this.set("innerText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerText: Self = this.set("innerText", js.undefined)
    
    @scala.inline
    def setInnerTextNull: Self = this.set("innerText", null)
    
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    
    @scala.inline
    def setText(value: IStyle): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTextNull: Self = this.set("text", null)
  }
}
