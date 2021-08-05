package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsCheckAuthorizationEndpoint
import typings.octokitTypes.endpointsMod.AppsCheckAuthorizationRequestOptions
import typings.octokitTypes.endpointsMod.AppsCheckAuthorizationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersAppsCheckAuthorizationEndpoint extends StObject {
  
  var parameters: AppsCheckAuthorizationEndpoint
  
  var request: AppsCheckAuthorizationRequestOptions
  
  var response: OctokitResponse[AppsCheckAuthorizationResponseData]
}
object ParametersAppsCheckAuthorizationEndpoint {
  
  inline def apply(
    parameters: AppsCheckAuthorizationEndpoint,
    request: AppsCheckAuthorizationRequestOptions,
    response: OctokitResponse[AppsCheckAuthorizationResponseData]
  ): ParametersAppsCheckAuthorizationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsCheckAuthorizationEndpoint]
  }
  
  extension [Self <: ParametersAppsCheckAuthorizationEndpoint](x: Self) {
    
    inline def setParameters(value: AppsCheckAuthorizationEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: AppsCheckAuthorizationRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[AppsCheckAuthorizationResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
