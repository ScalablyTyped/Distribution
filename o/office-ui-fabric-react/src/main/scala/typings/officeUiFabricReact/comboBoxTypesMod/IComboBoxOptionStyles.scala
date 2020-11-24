package typings.officeUiFabricReact.comboBoxTypesMod

import typings.officeUiFabricReact.buttonTypesMod.IButtonStyles
import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IComboBoxOptionStyles extends IButtonStyles {
  
  /**
    * Styles for the text inside the comboBox option.
    * This should be used instead of the description
    * inside IButtonStyles because we custom render the text
    * in the comboBox options.
    */
  var optionText: IStyle = js.native
  
  /**
    * Styles for the comboBox option text's wrapper.
    */
  var optionTextWrapper: IStyle = js.native
}
object IComboBoxOptionStyles {
  
  @scala.inline
  def apply(): IComboBoxOptionStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IComboBoxOptionStyles]
  }
  
  @scala.inline
  implicit class IComboBoxOptionStylesOps[Self <: IComboBoxOptionStyles] (val x: Self) extends AnyVal {
    
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
    def setOptionText(value: IStyle): Self = this.set("optionText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionText: Self = this.set("optionText", js.undefined)
    
    @scala.inline
    def setOptionTextNull: Self = this.set("optionText", null)
    
    @scala.inline
    def setOptionTextWrapper(value: IStyle): Self = this.set("optionTextWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionTextWrapper: Self = this.set("optionTextWrapper", js.undefined)
    
    @scala.inline
    def setOptionTextWrapperNull: Self = this.set("optionTextWrapper", null)
  }
}
