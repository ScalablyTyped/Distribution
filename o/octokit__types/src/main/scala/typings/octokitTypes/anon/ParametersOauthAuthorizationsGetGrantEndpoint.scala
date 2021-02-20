package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OauthAuthorizationsGetGrantEndpoint
import typings.octokitTypes.endpointsMod.OauthAuthorizationsGetGrantRequestOptions
import typings.octokitTypes.endpointsMod.OauthAuthorizationsGetGrantResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOauthAuthorizationsGetGrantEndpoint extends StObject {
  
  var parameters: OauthAuthorizationsGetGrantEndpoint = js.native
  
  var request: OauthAuthorizationsGetGrantRequestOptions = js.native
  
  var response: OctokitResponse[OauthAuthorizationsGetGrantResponseData] = js.native
}
object ParametersOauthAuthorizationsGetGrantEndpoint {
  
  @scala.inline
  def apply(
    parameters: OauthAuthorizationsGetGrantEndpoint,
    request: OauthAuthorizationsGetGrantRequestOptions,
    response: OctokitResponse[OauthAuthorizationsGetGrantResponseData]
  ): ParametersOauthAuthorizationsGetGrantEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOauthAuthorizationsGetGrantEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOauthAuthorizationsGetGrantEndpointMutableBuilder[Self <: ParametersOauthAuthorizationsGetGrantEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OauthAuthorizationsGetGrantEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OauthAuthorizationsGetGrantRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OauthAuthorizationsGetGrantResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
