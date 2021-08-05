package typings.maximMazurokGapiClientDomains.gapi.client.domains

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetrieveRegisterParametersResponse extends StObject {
  
  /** Parameters to use when calling the `RegisterDomain` method. */
  var registerParameters: js.UndefOr[RegisterParameters] = js.undefined
}
object RetrieveRegisterParametersResponse {
  
  inline def apply(): RetrieveRegisterParametersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetrieveRegisterParametersResponse]
  }
  
  extension [Self <: RetrieveRegisterParametersResponse](x: Self) {
    
    inline def setRegisterParameters(value: RegisterParameters): Self = StObject.set(x, "registerParameters", value.asInstanceOf[js.Any])
    
    inline def setRegisterParametersUndefined: Self = StObject.set(x, "registerParameters", js.undefined)
  }
}
