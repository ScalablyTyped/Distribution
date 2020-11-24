package typings.officeUiFabricReact.textFieldTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITextFieldStyles extends js.Object {
  
  /**
    * Style for description element.
    */
  var description: IStyle = js.native
  
  /**
    * Style for error message element.
    */
  var errorMessage: IStyle = js.native
  
  /**
    * Style for main field entry element.
    */
  var field: IStyle = js.native
  
  /**
    * Style for field group encompassing entry area (prefix, field, icon and suffix).
    */
  var fieldGroup: IStyle = js.native
  
  /**
    * Style for icon prop element.
    */
  var icon: IStyle = js.native
  
  /**
    * Style for prefix element.
    */
  var prefix: IStyle = js.native
  
  /**
    * Styling for reveal password button
    */
  var revealButton: IStyle = js.native
  
  /**
    * Styling for reveal password icon
    */
  var revealIcon: IStyle = js.native
  
  /**
    * Styling for reveal password span
    */
  var revealSpan: IStyle = js.native
  
  /**
    * Style for root element.
    */
  var root: IStyle = js.native
  
  /**
    * Styling for subcomponents.
    */
  var subComponentStyles: ITextFieldSubComponentStyles = js.native
  
  /**
    * Style for suffix element.
    */
  var suffix: IStyle = js.native
  
  /**
    * Style for TextField wrapper element.
    */
  var wrapper: IStyle = js.native
}
object ITextFieldStyles {
  
  @scala.inline
  def apply(subComponentStyles: ITextFieldSubComponentStyles): ITextFieldStyles = {
    val __obj = js.Dynamic.literal(subComponentStyles = subComponentStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextFieldStyles]
  }
  
  @scala.inline
  implicit class ITextFieldStylesOps[Self <: ITextFieldStyles] (val x: Self) extends AnyVal {
    
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
    def setSubComponentStyles(value: ITextFieldSubComponentStyles): Self = this.set("subComponentStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: IStyle): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    
    @scala.inline
    def setErrorMessage(value: IStyle): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    
    @scala.inline
    def setErrorMessageNull: Self = this.set("errorMessage", null)
    
    @scala.inline
    def setField(value: IStyle): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setFieldNull: Self = this.set("field", null)
    
    @scala.inline
    def setFieldGroup(value: IStyle): Self = this.set("fieldGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldGroup: Self = this.set("fieldGroup", js.undefined)
    
    @scala.inline
    def setFieldGroupNull: Self = this.set("fieldGroup", null)
    
    @scala.inline
    def setIcon(value: IStyle): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIconNull: Self = this.set("icon", null)
    
    @scala.inline
    def setPrefix(value: IStyle): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setPrefixNull: Self = this.set("prefix", null)
    
    @scala.inline
    def setRevealButton(value: IStyle): Self = this.set("revealButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevealButton: Self = this.set("revealButton", js.undefined)
    
    @scala.inline
    def setRevealButtonNull: Self = this.set("revealButton", null)
    
    @scala.inline
    def setRevealIcon(value: IStyle): Self = this.set("revealIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevealIcon: Self = this.set("revealIcon", js.undefined)
    
    @scala.inline
    def setRevealIconNull: Self = this.set("revealIcon", null)
    
    @scala.inline
    def setRevealSpan(value: IStyle): Self = this.set("revealSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevealSpan: Self = this.set("revealSpan", js.undefined)
    
    @scala.inline
    def setRevealSpanNull: Self = this.set("revealSpan", null)
    
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    
    @scala.inline
    def setSuffix(value: IStyle): Self = this.set("suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
    
    @scala.inline
    def setSuffixNull: Self = this.set("suffix", null)
    
    @scala.inline
    def setWrapper(value: IStyle): Self = this.set("wrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapper: Self = this.set("wrapper", js.undefined)
    
    @scala.inline
    def setWrapperNull: Self = this.set("wrapper", null)
  }
}
