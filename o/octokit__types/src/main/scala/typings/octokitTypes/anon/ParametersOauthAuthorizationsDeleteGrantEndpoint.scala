package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OauthAuthorizationsDeleteGrantEndpoint
import typings.octokitTypes.endpointsMod.OauthAuthorizationsDeleteGrantRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOauthAuthorizationsDeleteGrantEndpoint extends StObject {
  
  var parameters: OauthAuthorizationsDeleteGrantEndpoint
  
  var request: OauthAuthorizationsDeleteGrantRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersOauthAuthorizationsDeleteGrantEndpoint {
  
  @scala.inline
  def apply(
    parameters: OauthAuthorizationsDeleteGrantEndpoint,
    request: OauthAuthorizationsDeleteGrantRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersOauthAuthorizationsDeleteGrantEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOauthAuthorizationsDeleteGrantEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOauthAuthorizationsDeleteGrantEndpointMutableBuilder[Self <: ParametersOauthAuthorizationsDeleteGrantEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OauthAuthorizationsDeleteGrantEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OauthAuthorizationsDeleteGrantRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
