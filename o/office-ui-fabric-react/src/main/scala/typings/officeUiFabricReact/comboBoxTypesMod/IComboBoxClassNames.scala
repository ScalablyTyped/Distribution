package typings.officeUiFabricReact.comboBoxTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IComboBoxClassNames extends js.Object {
  
  var callout: String = js.native
  
  var container: String = js.native
  
  var divider: String = js.native
  
  var errorMessage: String = js.native
  
  var header: String = js.native
  
  var input: String = js.native
  
  var label: String = js.native
  
  var optionsContainer: String = js.native
  
  var optionsContainerWrapper: String = js.native
  
  var root: String = js.native
  
  var screenReaderText: String = js.native
}
object IComboBoxClassNames {
  
  @scala.inline
  def apply(
    callout: String,
    container: String,
    divider: String,
    errorMessage: String,
    header: String,
    input: String,
    label: String,
    optionsContainer: String,
    optionsContainerWrapper: String,
    root: String,
    screenReaderText: String
  ): IComboBoxClassNames = {
    val __obj = js.Dynamic.literal(callout = callout.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], divider = divider.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], optionsContainer = optionsContainer.asInstanceOf[js.Any], optionsContainerWrapper = optionsContainerWrapper.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], screenReaderText = screenReaderText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IComboBoxClassNames]
  }
  
  @scala.inline
  implicit class IComboBoxClassNamesOps[Self <: IComboBoxClassNames] (val x: Self) extends AnyVal {
    
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
    def setCallout(value: String): Self = this.set("callout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDivider(value: String): Self = this.set("divider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput(value: String): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsContainer(value: String): Self = this.set("optionsContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsContainerWrapper(value: String): Self = this.set("optionsContainerWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenReaderText(value: String): Self = this.set("screenReaderText", value.asInstanceOf[js.Any])
  }
}
