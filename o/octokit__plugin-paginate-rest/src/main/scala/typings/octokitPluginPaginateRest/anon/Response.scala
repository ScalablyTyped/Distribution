package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.OauthAuthorizationsListGrantsEndpoint
import typings.octokitTypes.endpointsMod.OauthAuthorizationsListGrantsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends js.Object {
  var parameters: OauthAuthorizationsListGrantsEndpoint = js.native
  var response: OctokitResponse[OauthAuthorizationsListGrantsResponseData] = js.native
}

object Response {
  @scala.inline
  def apply(
    parameters: OauthAuthorizationsListGrantsEndpoint,
    response: OctokitResponse[OauthAuthorizationsListGrantsResponseData]
  ): Response = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  @scala.inline
  implicit class ResponseOps[Self <: Response] (val x: Self) extends AnyVal {
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
    def setParameters(value: OauthAuthorizationsListGrantsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[OauthAuthorizationsListGrantsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

