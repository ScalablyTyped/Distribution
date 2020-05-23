package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.TeamsListPendingInvitationsInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsListPendingInvitationsInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsListPendingInvitationsInOrgEndpoint extends js.Object {
  var parameters: TeamsListPendingInvitationsInOrgEndpoint
  var response: OctokitResponse[TeamsListPendingInvitationsInOrgResponseData]
}

object ParametersTeamsListPendingInvitationsInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsListPendingInvitationsInOrgEndpoint,
    response: OctokitResponse[TeamsListPendingInvitationsInOrgResponseData]
  ): ParametersTeamsListPendingInvitationsInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListPendingInvitationsInOrgEndpoint]
  }
}

