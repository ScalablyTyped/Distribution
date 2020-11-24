package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateConsumerConfigResponse extends js.Object {
  
  var isValid: js.UndefOr[Boolean] = js.native
  
  var validationError: js.UndefOr[String] = js.native
}
object ValidateConsumerConfigResponse {
  
  @scala.inline
  def apply(): ValidateConsumerConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateConsumerConfigResponse]
  }
  
  @scala.inline
  implicit class ValidateConsumerConfigResponseOps[Self <: ValidateConsumerConfigResponse] (val x: Self) extends AnyVal {
    
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
    def setIsValid(value: Boolean): Self = this.set("isValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsValid: Self = this.set("isValid", js.undefined)
    
    @scala.inline
    def setValidationError(value: String): Self = this.set("validationError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationError: Self = this.set("validationError", js.undefined)
  }
}
