package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateConsumerConfigResponse extends StObject {
  
  var isValid: js.UndefOr[Boolean] = js.undefined
  
  var validationError: js.UndefOr[String] = js.undefined
}
object ValidateConsumerConfigResponse {
  
  @scala.inline
  def apply(): ValidateConsumerConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateConsumerConfigResponse]
  }
  
  @scala.inline
  implicit class ValidateConsumerConfigResponseMutableBuilder[Self <: ValidateConsumerConfigResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValidUndefined: Self = StObject.set(x, "isValid", js.undefined)
    
    @scala.inline
    def setValidationError(value: String): Self = StObject.set(x, "validationError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationErrorUndefined: Self = StObject.set(x, "validationError", js.undefined)
  }
}
