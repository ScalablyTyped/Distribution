package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OauthAuthorizationsCreateAuthorizationEndpoint
import typings.octokitTypes.endpointsMod.OauthAuthorizationsCreateAuthorizationRequestOptions
import typings.octokitTypes.endpointsMod.OauthAuthorizationsCreateAuthorizationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOauthAuthorizationsCreateAuthorizationEndpoint extends js.Object {
  
  var parameters: OauthAuthorizationsCreateAuthorizationEndpoint = js.native
  
  var request: OauthAuthorizationsCreateAuthorizationRequestOptions = js.native
  
  var response: OctokitResponse[OauthAuthorizationsCreateAuthorizationResponseData] = js.native
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
  implicit class ParametersOauthAuthorizationsCreateAuthorizationEndpointOps[Self <: ParametersOauthAuthorizationsCreateAuthorizationEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParameters(value: OauthAuthorizationsCreateAuthorizationEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OauthAuthorizationsCreateAuthorizationRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OauthAuthorizationsCreateAuthorizationResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
