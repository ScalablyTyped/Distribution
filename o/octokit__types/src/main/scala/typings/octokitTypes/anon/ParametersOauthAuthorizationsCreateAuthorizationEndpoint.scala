package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OauthAuthorizationsCreateAuthorizationEndpoint
import typings.octokitTypes.endpointsMod.OauthAuthorizationsCreateAuthorizationRequestOptions
import typings.octokitTypes.endpointsMod.OauthAuthorizationsCreateAuthorizationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOauthAuthorizationsCreateAuthorizationEndpoint extends StObject {
  
  var parameters: OauthAuthorizationsCreateAuthorizationEndpoint
  
  var request: OauthAuthorizationsCreateAuthorizationRequestOptions
  
  var response: OctokitResponse[OauthAuthorizationsCreateAuthorizationResponseData]
}
object ParametersOauthAuthorizationsCreateAuthorizationEndpoint {
  
  @scala.inline
  def apply(
    parameters: OauthAuthorizationsCreateAuthorizationEndpoint,
    request: OauthAuthorizationsCreateAuthorizationRequestOptions,
    response: OctokitResponse[OauthAuthorizationsCreateAuthorizationResponseData]
  ): ParametersOauthAuthorizationsCreateAuthorizationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOauthAuthorizationsCreateAuthorizationEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOauthAuthorizationsCreateAuthorizationEndpointMutableBuilder[Self <: ParametersOauthAuthorizationsCreateAuthorizationEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OauthAuthorizationsCreateAuthorizationEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OauthAuthorizationsCreateAuthorizationRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OauthAuthorizationsCreateAuthorizationResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
