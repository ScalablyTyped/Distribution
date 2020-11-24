package typings.maximMazurokGapiClientGmailpostmastertools.gapi.client.gmailpostmastertools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeliveryError extends js.Object {
  
  /** The class of delivery error. */
  var errorClass: js.UndefOr[String] = js.native
  
  /** The ratio of messages where the error occurred vs all authenticated traffic. */
  var errorRatio: js.UndefOr[Double] = js.native
  
  /** The type of delivery error. */
  var errorType: js.UndefOr[String] = js.native
}
object DeliveryError {
  
  @scala.inline
  def apply(): DeliveryError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeliveryError]
  }
  
  @scala.inline
  implicit class DeliveryErrorOps[Self <: DeliveryError] (val x: Self) extends AnyVal {
    
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
    def setErrorClass(value: String): Self = this.set("errorClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorClass: Self = this.set("errorClass", js.undefined)
    
    @scala.inline
    def setErrorRatio(value: Double): Self = this.set("errorRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorRatio: Self = this.set("errorRatio", js.undefined)
    
    @scala.inline
    def setErrorType(value: String): Self = this.set("errorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorType: Self = this.set("errorType", js.undefined)
  }
}
