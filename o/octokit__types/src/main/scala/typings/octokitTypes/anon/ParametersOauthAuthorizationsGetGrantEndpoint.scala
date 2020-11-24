package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OauthAuthorizationsGetGrantEndpoint
import typings.octokitTypes.endpointsMod.OauthAuthorizationsGetGrantRequestOptions
import typings.octokitTypes.endpointsMod.OauthAuthorizationsGetGrantResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOauthAuthorizationsGetGrantEndpoint extends js.Object {
  
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
  implicit class ParametersOauthAuthorizationsGetGrantEndpointOps[Self <: ParametersOauthAuthorizationsGetGrantEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: OauthAuthorizationsGetGrantEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OauthAuthorizationsGetGrantRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OauthAuthorizationsGetGrantResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
