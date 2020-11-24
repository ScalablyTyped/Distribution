package typings.mediumEditor.MediumEditor

import typings.std.Document
import typings.std.HTMLElement
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoreOptions extends js.Object {
  
  var activeButtonClass: js.UndefOr[String] = js.native
  
  var allowMultiParagraphSelection: js.UndefOr[Boolean] = js.native
  
  var anchor: js.UndefOr[AnchorFormOptions] = js.native
  
  var anchorPreview: js.UndefOr[AnchorPreviewOptions | Boolean] = js.native
  
  var autoLink: js.UndefOr[Boolean] = js.native
  
  var buttonLabels: js.UndefOr[String | Boolean] = js.native
  
  var contentWindow: js.UndefOr[Window] = js.native
  
  var delay: js.UndefOr[Double] = js.native
  
  var disableDoubleReturn: js.UndefOr[Boolean] = js.native
  
  var disableEditing: js.UndefOr[Boolean] = js.native
  
  var disableExtraSpaces: js.UndefOr[Boolean] = js.native
  
  var disableReturn: js.UndefOr[Boolean] = js.native
  
  var elementsContainer: js.UndefOr[HTMLElement] = js.native
  
  var extensions: js.UndefOr[js.Any] = js.native
  
  var imageDragging: js.UndefOr[Boolean] = js.native
  
  var keyboardCommands: js.UndefOr[KeyboardCommandsOptions | Boolean] = js.native
  
  var ownerDocument: js.UndefOr[Document] = js.native
  
  var paste: js.UndefOr[PasteOptions] = js.native
  
  var placeholder: js.UndefOr[PlaceholderOptions | Boolean] = js.native
  
  var spellcheck: js.UndefOr[Boolean] = js.native
  
  var targetBlank: js.UndefOr[Boolean] = js.native
  
  var toolbar: js.UndefOr[ToolbarOptions | Boolean] = js.native
}
object CoreOptions {
  
  @scala.inline
  def apply(): CoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoreOptions]
  }
  
  @scala.inline
  implicit class CoreOptionsOps[Self <: CoreOptions] (val x: Self) extends AnyVal {
    
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
    def setActiveButtonClass(value: String): Self = this.set("activeButtonClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveButtonClass: Self = this.set("activeButtonClass", js.undefined)
    
    @scala.inline
    def setAllowMultiParagraphSelection(value: Boolean): Self = this.set("allowMultiParagraphSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMultiParagraphSelection: Self = this.set("allowMultiParagraphSelection", js.undefined)
    
    @scala.inline
    def setAnchor(value: AnchorFormOptions): Self = this.set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    
    @scala.inline
    def setAnchorPreview(value: AnchorPreviewOptions | Boolean): Self = this.set("anchorPreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorPreview: Self = this.set("anchorPreview", js.undefined)
    
    @scala.inline
    def setAutoLink(value: Boolean): Self = this.set("autoLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoLink: Self = this.set("autoLink", js.undefined)
    
    @scala.inline
    def setButtonLabels(value: String | Boolean): Self = this.set("buttonLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonLabels: Self = this.set("buttonLabels", js.undefined)
    
    @scala.inline
    def setContentWindow(value: Window): Self = this.set("contentWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentWindow: Self = this.set("contentWindow", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setDisableDoubleReturn(value: Boolean): Self = this.set("disableDoubleReturn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableDoubleReturn: Self = this.set("disableDoubleReturn", js.undefined)
    
    @scala.inline
    def setDisableEditing(value: Boolean): Self = this.set("disableEditing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableEditing: Self = this.set("disableEditing", js.undefined)
    
    @scala.inline
    def setDisableExtraSpaces(value: Boolean): Self = this.set("disableExtraSpaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableExtraSpaces: Self = this.set("disableExtraSpaces", js.undefined)
    
    @scala.inline
    def setDisableReturn(value: Boolean): Self = this.set("disableReturn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableReturn: Self = this.set("disableReturn", js.undefined)
    
    @scala.inline
    def setElementsContainer(value: HTMLElement): Self = this.set("elementsContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElementsContainer: Self = this.set("elementsContainer", js.undefined)
    
    @scala.inline
    def setExtensions(value: js.Any): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    
    @scala.inline
    def setImageDragging(value: Boolean): Self = this.set("imageDragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageDragging: Self = this.set("imageDragging", js.undefined)
    
    @scala.inline
    def setKeyboardCommands(value: KeyboardCommandsOptions | Boolean): Self = this.set("keyboardCommands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardCommands: Self = this.set("keyboardCommands", js.undefined)
    
    @scala.inline
    def setOwnerDocument(value: Document): Self = this.set("ownerDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerDocument: Self = this.set("ownerDocument", js.undefined)
    
    @scala.inline
    def setPaste(value: PasteOptions): Self = this.set("paste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaste: Self = this.set("paste", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: PlaceholderOptions | Boolean): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setSpellcheck(value: Boolean): Self = this.set("spellcheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpellcheck: Self = this.set("spellcheck", js.undefined)
    
    @scala.inline
    def setTargetBlank(value: Boolean): Self = this.set("targetBlank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetBlank: Self = this.set("targetBlank", js.undefined)
    
    @scala.inline
    def setToolbar(value: ToolbarOptions | Boolean): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
  }
}
