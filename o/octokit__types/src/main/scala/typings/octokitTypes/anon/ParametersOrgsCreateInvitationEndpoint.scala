package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsCreateInvitationEndpoint
import typings.octokitTypes.endpointsMod.OrgsCreateInvitationRequestOptions
import typings.octokitTypes.endpointsMod.OrgsCreateInvitationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersOrgsCreateInvitationEndpoint extends js.Object {
  var parameters: OrgsCreateInvitationEndpoint = js.native
  var request: OrgsCreateInvitationRequestOptions = js.native
  var response: OctokitResponse[OrgsCreateInvitationResponseData] = js.native
}

object ParametersOrgsCreateInvitationEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsCreateInvitationEndpoint,
    request: OrgsCreateInvitationRequestOptions,
    response: OctokitResponse[OrgsCreateInvitationResponseData]
  ): ParametersOrgsCreateInvitationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsCreateInvitationEndpoint]
  }
  @scala.inline
  implicit class ParametersOrgsCreateInvitationEndpointOps[Self <: ParametersOrgsCreateInvitationEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: OrgsCreateInvitationEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: OrgsCreateInvitationRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsCreateInvitationResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

