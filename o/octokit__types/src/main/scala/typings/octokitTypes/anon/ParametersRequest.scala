package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsRevokeGrantForApplicationEndpoint
import typings.octokitTypes.endpointsMod.AppsRevokeGrantForApplicationRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersRequest extends StObject {
  
  var parameters: AppsRevokeGrantForApplicationEndpoint
  
  var request: AppsRevokeGrantForApplicationRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersRequest {
  
  inline def apply(
    parameters: AppsRevokeGrantForApplicationEndpoint,
    request: AppsRevokeGrantForApplicationRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersRequest = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersRequest]
  }
  
  extension [Self <: ParametersRequest](x: Self) {
    
    inline def setParameters(value: AppsRevokeGrantForApplicationEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: AppsRevokeGrantForApplicationRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
