package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateConsumerConfigResponse extends StObject {
  
  var isValid: js.UndefOr[Boolean] = js.undefined
  
  var validationError: js.UndefOr[String] = js.undefined
}
object ValidateConsumerConfigResponse {
  
  inline def apply(): ValidateConsumerConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateConsumerConfigResponse]
  }
  
  extension [Self <: ValidateConsumerConfigResponse](x: Self) {
    
    inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    inline def setIsValidUndefined: Self = StObject.set(x, "isValid", js.undefined)
    
    inline def setValidationError(value: String): Self = StObject.set(x, "validationError", value.asInstanceOf[js.Any])
    
    inline def setValidationErrorUndefined: Self = StObject.set(x, "validationError", js.undefined)
  }
}
