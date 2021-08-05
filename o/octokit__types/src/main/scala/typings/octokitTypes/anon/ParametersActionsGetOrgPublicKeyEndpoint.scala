package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsGetOrgPublicKeyEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetOrgPublicKeyRequestOptions
import typings.octokitTypes.endpointsMod.ActionsGetOrgPublicKeyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsGetOrgPublicKeyEndpoint extends StObject {
  
  var parameters: ActionsGetOrgPublicKeyEndpoint
  
  var request: ActionsGetOrgPublicKeyRequestOptions
  
  var response: OctokitResponse[ActionsGetOrgPublicKeyResponseData]
}
object ParametersActionsGetOrgPublicKeyEndpoint {
  
  inline def apply(
    parameters: ActionsGetOrgPublicKeyEndpoint,
    request: ActionsGetOrgPublicKeyRequestOptions,
    response: OctokitResponse[ActionsGetOrgPublicKeyResponseData]
  ): ParametersActionsGetOrgPublicKeyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetOrgPublicKeyEndpoint]
  }
  
  extension [Self <: ParametersActionsGetOrgPublicKeyEndpoint](x: Self) {
    
    inline def setParameters(value: ActionsGetOrgPublicKeyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActionsGetOrgPublicKeyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActionsGetOrgPublicKeyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
