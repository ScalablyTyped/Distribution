package typings.miniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfirmArgs extends AsyncCallback[Unit] {
  
  /**
    * OK button text, which is “Cancel” by default.
    */
  var cancelButtonText: js.UndefOr[String] = js.native
  
  /**
    * OK button text, which is “OK” by default.
    */
  var confirmButtonText: js.UndefOr[String] = js.native
  
  /**
    * Content of the confirm box.
    */
  var content: js.UndefOr[String] = js.native
  
  /**
    * Title of the confirm box.
    */
  var title: js.UndefOr[String] = js.native
}
object ConfirmArgs {
  
  @scala.inline
  def apply(): ConfirmArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmArgs]
  }
  
  @scala.inline
  implicit class ConfirmArgsOps[Self <: ConfirmArgs] (val x: Self) extends AnyVal {
    
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
    def setCancelButtonText(value: String): Self = this.set("cancelButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelButtonText: Self = this.set("cancelButtonText", js.undefined)
    
    @scala.inline
    def setConfirmButtonText(value: String): Self = this.set("confirmButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmButtonText: Self = this.set("confirmButtonText", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
