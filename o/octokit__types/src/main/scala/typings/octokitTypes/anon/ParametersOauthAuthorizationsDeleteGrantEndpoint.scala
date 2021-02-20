package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OauthAuthorizationsDeleteGrantEndpoint
import typings.octokitTypes.endpointsMod.OauthAuthorizationsDeleteGrantRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOauthAuthorizationsDeleteGrantEndpoint extends StObject {
  
  var parameters: OauthAuthorizationsDeleteGrantEndpoint = js.native
  
  var request: OauthAuthorizationsDeleteGrantRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersOauthAuthorizationsDeleteGrantEndpoint {
  
  @scala.inline
  def apply(
    parameters: OauthAuthorizationsDeleteGrantEndpoint,
    request: OauthAuthorizationsDeleteGrantRequestOptions,
    response: OctokitResponse[_]
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
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
