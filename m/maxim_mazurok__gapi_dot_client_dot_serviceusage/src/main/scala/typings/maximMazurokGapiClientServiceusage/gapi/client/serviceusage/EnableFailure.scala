package typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableFailure extends StObject {
  
  /** An error message describing why the service could not be enabled. */
  var errorMessage: js.UndefOr[String] = js.undefined
  
  /** The service id of a service that could not be enabled. */
  var serviceId: js.UndefOr[String] = js.undefined
}
object EnableFailure {
  
  inline def apply(): EnableFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableFailure]
  }
  
  extension [Self <: EnableFailure](x: Self) {
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    inline def setServiceIdUndefined: Self = StObject.set(x, "serviceId", js.undefined)
  }
}
