package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OauthAuthorizationsListAuthorizationsEndpoint
import typings.octokitTypes.endpointsMod.OauthAuthorizationsListAuthorizationsRequestOptions
import typings.octokitTypes.endpointsMod.OauthAuthorizationsListAuthorizationsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOauthAuthorizationsListAuthorizationsEndpoint extends StObject {
  
  var parameters: OauthAuthorizationsListAuthorizationsEndpoint
  
  var request: OauthAuthorizationsListAuthorizationsRequestOptions
  
  var response: OctokitResponse[OauthAuthorizationsListAuthorizationsResponseData]
}
object ParametersOauthAuthorizationsListAuthorizationsEndpoint {
  
  inline def apply(
    parameters: OauthAuthorizationsListAuthorizationsEndpoint,
    request: OauthAuthorizationsListAuthorizationsRequestOptions,
    response: OctokitResponse[OauthAuthorizationsListAuthorizationsResponseData]
  ): ParametersOauthAuthorizationsListAuthorizationsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOauthAuthorizationsListAuthorizationsEndpoint]
  }
  
  extension [Self <: ParametersOauthAuthorizationsListAuthorizationsEndpoint](x: Self) {
    
    inline def setParameters(value: OauthAuthorizationsListAuthorizationsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: OauthAuthorizationsListAuthorizationsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[OauthAuthorizationsListAuthorizationsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
