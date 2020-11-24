package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OauthAuthorizationsUpdateAuthorizationEndpoint
import typings.octokitTypes.endpointsMod.OauthAuthorizationsUpdateAuthorizationRequestOptions
import typings.octokitTypes.endpointsMod.OauthAuthorizationsUpdateAuthorizationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOauthAuthorizationsUpdateAuthorizationEndpoint extends js.Object {
  
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
  implicit class ParametersOauthAuthorizationsUpdateAuthorizationEndpointOps[Self <: ParametersOauthAuthorizationsUpdateAuthorizationEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: OauthAuthorizationsUpdateAuthorizationEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OauthAuthorizationsUpdateAuthorizationRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OauthAuthorizationsUpdateAuthorizationResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
