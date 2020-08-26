package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OauthAuthorizationsGetAuthorizationEndpoint
import typings.octokitTypes.endpointsMod.OauthAuthorizationsGetAuthorizationRequestOptions
import typings.octokitTypes.endpointsMod.OauthAuthorizationsGetAuthorizationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersOauthAuthorizationsGetAuthorizationEndpoint extends js.Object {
  var parameters: OauthAuthorizationsGetAuthorizationEndpoint = js.native
  var request: OauthAuthorizationsGetAuthorizationRequestOptions = js.native
  var response: OctokitResponse[OauthAuthorizationsGetAuthorizationResponseData] = js.native
}

object ParametersOauthAuthorizationsGetAuthorizationEndpoint {
  @scala.inline
  def apply(
    parameters: OauthAuthorizationsGetAuthorizationEndpoint,
    request: OauthAuthorizationsGetAuthorizationRequestOptions,
    response: OctokitResponse[OauthAuthorizationsGetAuthorizationResponseData]
  ): ParametersOauthAuthorizationsGetAuthorizationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOauthAuthorizationsGetAuthorizationEndpoint]
  }
  @scala.inline
  implicit class ParametersOauthAuthorizationsGetAuthorizationEndpointOps[Self <: ParametersOauthAuthorizationsGetAuthorizationEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: OauthAuthorizationsGetAuthorizationEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: OauthAuthorizationsGetAuthorizationRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[OauthAuthorizationsGetAuthorizationResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

