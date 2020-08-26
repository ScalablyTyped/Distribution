package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.OrgsListPendingInvitationsEndpoint
import typings.octokitTypes.endpointsMod.OrgsListPendingInvitationsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersOrgsListPendingInvitationsEndpoint extends js.Object {
  var parameters: OrgsListPendingInvitationsEndpoint = js.native
  var response: OctokitResponse[OrgsListPendingInvitationsResponseData] = js.native
}

object ParametersOrgsListPendingInvitationsEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsListPendingInvitationsEndpoint,
    response: OctokitResponse[OrgsListPendingInvitationsResponseData]
  ): ParametersOrgsListPendingInvitationsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListPendingInvitationsEndpoint]
  }
  @scala.inline
  implicit class ParametersOrgsListPendingInvitationsEndpointOps[Self <: ParametersOrgsListPendingInvitationsEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: OrgsListPendingInvitationsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListPendingInvitationsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

