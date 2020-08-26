package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OauthAuthorizationsDeleteAuthorizationEndpoint
import typings.octokitTypes.endpointsMod.OauthAuthorizationsDeleteAuthorizationRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersOauthAuthorizationsDeleteAuthorizationEndpoint extends js.Object {
  var parameters: OauthAuthorizationsDeleteAuthorizationEndpoint = js.native
  var request: OauthAuthorizationsDeleteAuthorizationRequestOptions = js.native
  var response: OctokitResponse[_] = js.native
}

object ParametersOauthAuthorizationsDeleteAuthorizationEndpoint {
  @scala.inline
  def apply(
    parameters: OauthAuthorizationsDeleteAuthorizationEndpoint,
    request: OauthAuthorizationsDeleteAuthorizationRequestOptions,
    response: OctokitResponse[_]
  ): ParametersOauthAuthorizationsDeleteAuthorizationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOauthAuthorizationsDeleteAuthorizationEndpoint]
  }
  @scala.inline
  implicit class ParametersOauthAuthorizationsDeleteAuthorizationEndpointOps[Self <: ParametersOauthAuthorizationsDeleteAuthorizationEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: OauthAuthorizationsDeleteAuthorizationEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: OauthAuthorizationsDeleteAuthorizationRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

