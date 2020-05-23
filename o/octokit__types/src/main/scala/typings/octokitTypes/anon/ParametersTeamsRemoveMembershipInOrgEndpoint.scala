package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsRemoveMembershipInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsRemoveMembershipInOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsRemoveMembershipInOrgEndpoint extends js.Object {
  var parameters: TeamsRemoveMembershipInOrgEndpoint
  var request: TeamsRemoveMembershipInOrgRequestOptions
  var response: OctokitResponse[_]
}

object ParametersTeamsRemoveMembershipInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsRemoveMembershipInOrgEndpoint,
    request: TeamsRemoveMembershipInOrgRequestOptions,
    response: OctokitResponse[_]
  ): ParametersTeamsRemoveMembershipInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsRemoveMembershipInOrgEndpoint]
  }
}

