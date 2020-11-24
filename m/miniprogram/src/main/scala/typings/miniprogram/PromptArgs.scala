package typings.miniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromptArgs extends AsyncCallback[Unit] {
  
  /**
    * Message alignment, supporting enumeration left/center/right, iOS center, android left.
    */
  var align: js.UndefOr[String] = js.native
  
  /**
    * OK button text, which is “Cancel” by default.
    */
  var cancelButtonText: js.UndefOr[String] = js.native
  
  /**
    * Text of prompt box, which is “Enter contents here” by default.
    */
  var message: String = js.native
  
  /**
    * OK button text, which is “OK” by default.
    */
  var okButtonText: js.UndefOr[String] = js.native
  
  /**
    * Prompt text for the entry box.
    */
  var placeholder: js.UndefOr[String] = js.native
  
  /**
    * Title of prompt box.
    */
  var title: js.UndefOr[String] = js.native
}
object PromptArgs {
  
  @scala.inline
  def apply(message: String): PromptArgs = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptArgs]
  }
  
  @scala.inline
  implicit class PromptArgsOps[Self <: PromptArgs] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setCancelButtonText(value: String): Self = this.set("cancelButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelButtonText: Self = this.set("cancelButtonText", js.undefined)
    
    @scala.inline
    def setOkButtonText(value: String): Self = this.set("okButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOkButtonText: Self = this.set("okButtonText", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
