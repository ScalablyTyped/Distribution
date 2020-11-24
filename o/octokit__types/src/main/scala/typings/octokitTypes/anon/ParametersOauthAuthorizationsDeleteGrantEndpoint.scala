package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OauthAuthorizationsDeleteGrantEndpoint
import typings.octokitTypes.endpointsMod.OauthAuthorizationsDeleteGrantRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOauthAuthorizationsDeleteGrantEndpoint extends js.Object {
  
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
  implicit class ParametersOauthAuthorizationsDeleteGrantEndpointOps[Self <: ParametersOauthAuthorizationsDeleteGrantEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: OauthAuthorizationsDeleteGrantEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OauthAuthorizationsDeleteGrantRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
