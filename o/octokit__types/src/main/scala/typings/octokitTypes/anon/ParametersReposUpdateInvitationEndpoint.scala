package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposUpdateInvitationEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdateInvitationRequestOptions
import typings.octokitTypes.endpointsMod.ReposUpdateInvitationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposUpdateInvitationEndpoint extends js.Object {
  var parameters: ReposUpdateInvitationEndpoint = js.native
  var request: ReposUpdateInvitationRequestOptions = js.native
  var response: OctokitResponse[ReposUpdateInvitationResponseData] = js.native
}

object ParametersReposUpdateInvitationEndpoint {
  @scala.inline
  def apply(
    parameters: ReposUpdateInvitationEndpoint,
    request: ReposUpdateInvitationRequestOptions,
    response: OctokitResponse[ReposUpdateInvitationResponseData]
  ): ParametersReposUpdateInvitationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposUpdateInvitationEndpoint]
  }
  @scala.inline
  implicit class ParametersReposUpdateInvitationEndpointOps[Self <: ParametersReposUpdateInvitationEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposUpdateInvitationEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposUpdateInvitationRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposUpdateInvitationResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

