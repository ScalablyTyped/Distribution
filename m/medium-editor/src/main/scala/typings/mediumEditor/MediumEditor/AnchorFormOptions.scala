package typings.mediumEditor.MediumEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnchorFormOptions extends js.Object {
  
  var customClassOption: js.UndefOr[String] = js.native
  
  var customClassOptionText: js.UndefOr[String] = js.native
  
  var linkValidation: js.UndefOr[Boolean] = js.native
  
  var placeholderText: js.UndefOr[String] = js.native
  
  var targetCheckbox: js.UndefOr[Boolean] = js.native
  
  var targetCheckboxText: js.UndefOr[String] = js.native
}
object AnchorFormOptions {
  
  @scala.inline
  def apply(): AnchorFormOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnchorFormOptions]
  }
  
  @scala.inline
  implicit class AnchorFormOptionsOps[Self <: AnchorFormOptions] (val x: Self) extends AnyVal {
    
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
    def setCustomClassOption(value: String): Self = this.set("customClassOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomClassOption: Self = this.set("customClassOption", js.undefined)
    
    @scala.inline
    def setCustomClassOptionText(value: String): Self = this.set("customClassOptionText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomClassOptionText: Self = this.set("customClassOptionText", js.undefined)
    
    @scala.inline
    def setLinkValidation(value: Boolean): Self = this.set("linkValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkValidation: Self = this.set("linkValidation", js.undefined)
    
    @scala.inline
    def setPlaceholderText(value: String): Self = this.set("placeholderText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholderText: Self = this.set("placeholderText", js.undefined)
    
    @scala.inline
    def setTargetCheckbox(value: Boolean): Self = this.set("targetCheckbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetCheckbox: Self = this.set("targetCheckbox", js.undefined)
    
    @scala.inline
    def setTargetCheckboxText(value: String): Self = this.set("targetCheckboxText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetCheckboxText: Self = this.set("targetCheckboxText", js.undefined)
  }
}
