package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsListPendingInvitationsEndpoint
import typings.octokitTypes.endpointsMod.OrgsListPendingInvitationsRequestOptions
import typings.octokitTypes.endpointsMod.OrgsListPendingInvitationsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsListPendingInvitationsEndpoint extends js.Object {
  var parameters: OrgsListPendingInvitationsEndpoint
  var request: OrgsListPendingInvitationsRequestOptions
  var response: OctokitResponse[OrgsListPendingInvitationsResponseData]
}

object ParametersOrgsListPendingInvitationsEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsListPendingInvitationsEndpoint,
    request: OrgsListPendingInvitationsRequestOptions,
    response: OctokitResponse[OrgsListPendingInvitationsResponseData]
  ): ParametersOrgsListPendingInvitationsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListPendingInvitationsEndpoint]
  }
}

