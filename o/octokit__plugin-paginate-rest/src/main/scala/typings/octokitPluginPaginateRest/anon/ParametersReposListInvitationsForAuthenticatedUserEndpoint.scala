package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListInvitationsForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ReposListInvitationsForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposListInvitationsForAuthenticatedUserEndpoint extends js.Object {
  var parameters: ReposListInvitationsForAuthenticatedUserEndpoint = js.native
  var response: OctokitResponse[ReposListInvitationsForAuthenticatedUserResponseData] = js.native
}

object ParametersReposListInvitationsForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: ReposListInvitationsForAuthenticatedUserEndpoint,
    response: OctokitResponse[ReposListInvitationsForAuthenticatedUserResponseData]
  ): ParametersReposListInvitationsForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListInvitationsForAuthenticatedUserEndpoint]
  }
  @scala.inline
  implicit class ParametersReposListInvitationsForAuthenticatedUserEndpointOps[Self <: ParametersReposListInvitationsForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposListInvitationsForAuthenticatedUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListInvitationsForAuthenticatedUserResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

