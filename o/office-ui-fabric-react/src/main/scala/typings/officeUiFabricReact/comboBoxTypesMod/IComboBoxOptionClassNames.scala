package typings.officeUiFabricReact.comboBoxTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IComboBoxOptionClassNames extends js.Object {
  
  var optionText: String = js.native
  
  var optionTextWrapper: String = js.native
  
  var root: String = js.native
}
object IComboBoxOptionClassNames {
  
  @scala.inline
  def apply(optionText: String, optionTextWrapper: String, root: String): IComboBoxOptionClassNames = {
    val __obj = js.Dynamic.literal(optionText = optionText.asInstanceOf[js.Any], optionTextWrapper = optionTextWrapper.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IComboBoxOptionClassNames]
  }
  
  @scala.inline
  implicit class IComboBoxOptionClassNamesOps[Self <: IComboBoxOptionClassNames] (val x: Self) extends AnyVal {
    
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
    def setOptionText(value: String): Self = this.set("optionText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionTextWrapper(value: String): Self = this.set("optionTextWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
  }
}
