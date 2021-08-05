package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.OauthAuthorizationsListAuthorizationsEndpoint
import typings.octokitTypes.endpointsMod.OauthAuthorizationsListAuthorizationsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersResponse extends StObject {
  
  var parameters: OauthAuthorizationsListAuthorizationsEndpoint
  
  var response: OctokitResponse[OauthAuthorizationsListAuthorizationsResponseData]
}
object ParametersResponse {
  
  inline def apply(
    parameters: OauthAuthorizationsListAuthorizationsEndpoint,
    response: OctokitResponse[OauthAuthorizationsListAuthorizationsResponseData]
  ): ParametersResponse = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersResponse]
  }
  
  extension [Self <: ParametersResponse](x: Self) {
    
    inline def setParameters(value: OauthAuthorizationsListAuthorizationsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[OauthAuthorizationsListAuthorizationsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
