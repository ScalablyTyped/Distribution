package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsListIdPGroupsForOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsListIdPGroupsForOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsListIdPGroupsForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsListIdPGroupsForOrgEndpoint extends js.Object {
  var parameters: TeamsListIdPGroupsForOrgEndpoint
  var request: TeamsListIdPGroupsForOrgRequestOptions
  var response: OctokitResponse[TeamsListIdPGroupsForOrgResponseData]
}

object ParametersTeamsListIdPGroupsForOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsListIdPGroupsForOrgEndpoint,
    request: TeamsListIdPGroupsForOrgRequestOptions,
    response: OctokitResponse[TeamsListIdPGroupsForOrgResponseData]
  ): ParametersTeamsListIdPGroupsForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListIdPGroupsForOrgEndpoint]
  }
}

