package typings.powerappsComponentFramework.ComponentFramework.NavigationApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the String parameters for Alert Dialog.
  */
@js.native
trait AlertDialogStrings extends js.Object {
  
  /**
    * The confirm button label. If you do not specify the button label, OK (in user's preferred language) is used as the button label.
    */
  var confirmButtonLabel: js.UndefOr[String] = js.native
  
  /**
    * The message to be displyed in the alert dialog.
    */
  var text: String = js.native
}
object AlertDialogStrings {
  
  @scala.inline
  def apply(text: String): AlertDialogStrings = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertDialogStrings]
  }
  
  @scala.inline
  implicit class AlertDialogStringsOps[Self <: AlertDialogStrings] (val x: Self) extends AnyVal {
    
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmButtonLabel(value: String): Self = this.set("confirmButtonLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmButtonLabel: Self = this.set("confirmButtonLabel", js.undefined)
  }
}
