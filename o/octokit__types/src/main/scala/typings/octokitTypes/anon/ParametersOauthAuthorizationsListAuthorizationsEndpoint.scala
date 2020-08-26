package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OauthAuthorizationsListAuthorizationsEndpoint
import typings.octokitTypes.endpointsMod.OauthAuthorizationsListAuthorizationsRequestOptions
import typings.octokitTypes.endpointsMod.OauthAuthorizationsListAuthorizationsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersOauthAuthorizationsListAuthorizationsEndpoint extends js.Object {
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
  implicit class ParametersOauthAuthorizationsListAuthorizationsEndpointOps[Self <: ParametersOauthAuthorizationsListAuthorizationsEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: OauthAuthorizationsListAuthorizationsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: OauthAuthorizationsListAuthorizationsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[OauthAuthorizationsListAuthorizationsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

