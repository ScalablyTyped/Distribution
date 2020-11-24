package typings.paypalRestSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PayPalError extends js.Object {
  
  val debug_id: String = js.native
  
  val details: js.Array[ErrorDetails] = js.native
  
  val information_link: String = js.native
  
  val message: String = js.native
  
  val name: String = js.native
}
object PayPalError {
  
  @scala.inline
  def apply(
    debug_id: String,
    details: js.Array[ErrorDetails],
    information_link: String,
    message: String,
    name: String
  ): PayPalError = {
    val __obj = js.Dynamic.literal(debug_id = debug_id.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], information_link = information_link.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayPalError]
  }
  
  @scala.inline
  implicit class PayPalErrorOps[Self <: PayPalError] (val x: Self) extends AnyVal {
    
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
    def setDebug_id(value: String): Self = this.set("debug_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsVarargs(value: ErrorDetails*): Self = this.set("details", js.Array(value :_*))
    
    @scala.inline
    def setDetails(value: js.Array[ErrorDetails]): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInformation_link(value: String): Self = this.set("information_link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
