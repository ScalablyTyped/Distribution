package typings.powerappsComponentFramework.ComponentFramework.NavigationApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for error dialog options.
  * You must set either the errorCode or message attribute.
  */
@js.native
trait ErrorDialogOptions extends js.Object {
  
  /**
    * Details about the error. When you specify this, the Download Log File button is available in the error message, and clicking it will let users download a text file with
    * the content specified in this attribute.
    */
  var details: js.UndefOr[String] = js.native
  
  /**
    * If you just set errorCode, the message for the error code is automatically retrieved from the server and displayed in the error dialog. If you specify an errorCode value,
    * an error dialog with a default error message is displyed.
    */
  var errorCode: js.UndefOr[Double] = js.native
  
  /**
    * The message to be displayed in the error dialog.
    */
  var message: js.UndefOr[String] = js.native
}
object ErrorDialogOptions {
  
  @scala.inline
  def apply(): ErrorDialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorDialogOptions]
  }
  
  @scala.inline
  implicit class ErrorDialogOptionsOps[Self <: ErrorDialogOptions] (val x: Self) extends AnyVal {
    
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
    def setDetails(value: String): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    
    @scala.inline
    def setErrorCode(value: Double): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCode: Self = this.set("errorCode", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
}
