package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsListPendingInvitationsLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsListPendingInvitationsLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsListPendingInvitationsLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsListPendingInvitationsLegacyEndpoint extends js.Object {
  var parameters: TeamsListPendingInvitationsLegacyEndpoint
  var request: TeamsListPendingInvitationsLegacyRequestOptions
  var response: OctokitResponse[TeamsListPendingInvitationsLegacyResponseData]
}

object ParametersTeamsListPendingInvitationsLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsListPendingInvitationsLegacyEndpoint,
    request: TeamsListPendingInvitationsLegacyRequestOptions,
    response: OctokitResponse[TeamsListPendingInvitationsLegacyResponseData]
  ): ParametersTeamsListPendingInvitationsLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListPendingInvitationsLegacyEndpoint]
  }
}

