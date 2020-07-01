package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsRemoveMembershipForUserInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsRemoveMembershipForUserInOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsRemoveMembershipForUserInOrgEndpoint extends js.Object {
  var parameters: TeamsRemoveMembershipForUserInOrgEndpoint
  var request: TeamsRemoveMembershipForUserInOrgRequestOptions
  var response: OctokitResponse[_]
}

object ParametersTeamsRemoveMembershipForUserInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsRemoveMembershipForUserInOrgEndpoint,
    request: TeamsRemoveMembershipForUserInOrgRequestOptions,
    response: OctokitResponse[_]
  ): ParametersTeamsRemoveMembershipForUserInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsRemoveMembershipForUserInOrgEndpoint]
  }
}

