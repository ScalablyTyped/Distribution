package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OauthAuthorizationsUpdateAuthorizationEndpoint
import typings.octokitTypes.endpointsMod.OauthAuthorizationsUpdateAuthorizationRequestOptions
import typings.octokitTypes.endpointsMod.OauthAuthorizationsUpdateAuthorizationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOauthAuthorizationsUpdateAuthorizationEndpoint extends StObject {
  
  var parameters: OauthAuthorizationsUpdateAuthorizationEndpoint = js.native
  
  var request: OauthAuthorizationsUpdateAuthorizationRequestOptions = js.native
  
  var response: OctokitResponse[OauthAuthorizationsUpdateAuthorizationResponseData] = js.native
}
object ParametersOauthAuthorizationsUpdateAuthorizationEndpoint {
  
  @scala.inline
  def apply(
    parameters: OauthAuthorizationsUpdateAuthorizationEndpoint,
    request: OauthAuthorizationsUpdateAuthorizationRequestOptions,
    response: OctokitResponse[OauthAuthorizationsUpdateAuthorizationResponseData]
  ): ParametersOauthAuthorizationsUpdateAuthorizationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOauthAuthorizationsUpdateAuthorizationEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOauthAuthorizationsUpdateAuthorizationEndpointMutableBuilder[Self <: ParametersOauthAuthorizationsUpdateAuthorizationEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OauthAuthorizationsUpdateAuthorizationEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OauthAuthorizationsUpdateAuthorizationRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OauthAuthorizationsUpdateAuthorizationResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
