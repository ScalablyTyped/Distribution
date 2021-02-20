package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OauthAuthorizationsListAuthorizationsEndpoint
import typings.octokitTypes.endpointsMod.OauthAuthorizationsListAuthorizationsRequestOptions
import typings.octokitTypes.endpointsMod.OauthAuthorizationsListAuthorizationsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOauthAuthorizationsListAuthorizationsEndpoint extends StObject {
  
  var parameters: OauthAuthorizationsListAuthorizationsEndpoint = js.native
  
  var request: OauthAuthorizationsListAuthorizationsRequestOptions = js.native
  
  var response: OctokitResponse[OauthAuthorizationsListAuthorizationsResponseData] = js.native
}
object ParametersOauthAuthorizationsListAuthorizationsEndpoint {
  
  @scala.inline
  def apply(
    parameters: OauthAuthorizationsListAuthorizationsEndpoint,
    request: OauthAuthorizationsListAuthorizationsRequestOptions,
    response: OctokitResponse[OauthAuthorizationsListAuthorizationsResponseData]
  ): ParametersOauthAuthorizationsListAuthorizationsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOauthAuthorizationsListAuthorizationsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOauthAuthorizationsListAuthorizationsEndpointMutableBuilder[Self <: ParametersOauthAuthorizationsListAuthorizationsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OauthAuthorizationsListAuthorizationsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OauthAuthorizationsListAuthorizationsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OauthAuthorizationsListAuthorizationsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
