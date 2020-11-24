package typings.mondaySdkJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelButton extends js.Object {
  
  /**
    * The text for the cancel button
    * Defaults to "Cancel"
    */
  var cancelButton: js.UndefOr[String] = js.native
  
  /**
    * The text for the confirmation button
    * Defaults to "OK"
    */
  var confirmButton: js.UndefOr[String] = js.native
  
  /**
    * Either to exclude the cancel button
    * Defaults to `false`
    */
  var excludeCancelButton: js.UndefOr[Boolean] = js.native
  
  /**
    * The message to display in the dialog
    */
  var message: String = js.native
}
object CancelButton {
  
  @scala.inline
  def apply(message: String): CancelButton = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelButton]
  }
  
  @scala.inline
  implicit class CancelButtonOps[Self <: CancelButton] (val x: Self) extends AnyVal {
    
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
    def setCancelButton(value: String): Self = this.set("cancelButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelButton: Self = this.set("cancelButton", js.undefined)
    
    @scala.inline
    def setConfirmButton(value: String): Self = this.set("confirmButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmButton: Self = this.set("confirmButton", js.undefined)
    
    @scala.inline
    def setExcludeCancelButton(value: Boolean): Self = this.set("excludeCancelButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeCancelButton: Self = this.set("excludeCancelButton", js.undefined)
  }
}
