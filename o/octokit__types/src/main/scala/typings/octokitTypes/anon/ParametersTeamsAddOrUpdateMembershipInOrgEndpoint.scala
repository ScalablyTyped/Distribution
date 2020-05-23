package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateMembershipInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateMembershipInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateMembershipInOrgResponse422Data
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateMembershipInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsAddOrUpdateMembershipInOrgEndpoint extends js.Object {
  var parameters: TeamsAddOrUpdateMembershipInOrgEndpoint
  var request: TeamsAddOrUpdateMembershipInOrgRequestOptions
  var response: OctokitResponse[
    TeamsAddOrUpdateMembershipInOrgResponseData | TeamsAddOrUpdateMembershipInOrgResponse422Data
  ]
}

object ParametersTeamsAddOrUpdateMembershipInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsAddOrUpdateMembershipInOrgEndpoint,
    request: TeamsAddOrUpdateMembershipInOrgRequestOptions,
    response: OctokitResponse[
      TeamsAddOrUpdateMembershipInOrgResponseData | TeamsAddOrUpdateMembershipInOrgResponse422Data
    ]
  ): ParametersTeamsAddOrUpdateMembershipInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsAddOrUpdateMembershipInOrgEndpoint]
  }
}

