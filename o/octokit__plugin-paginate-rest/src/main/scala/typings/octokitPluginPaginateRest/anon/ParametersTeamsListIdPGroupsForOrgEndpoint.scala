package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.TeamsListIdPGroupsForOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsListIdPGroupsForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsListIdPGroupsForOrgEndpoint extends js.Object {
  var parameters: TeamsListIdPGroupsForOrgEndpoint
  var response: OctokitResponse[TeamsListIdPGroupsForOrgResponseData] with `3`
}

object ParametersTeamsListIdPGroupsForOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsListIdPGroupsForOrgEndpoint,
    response: OctokitResponse[TeamsListIdPGroupsForOrgResponseData] with `3`
  ): ParametersTeamsListIdPGroupsForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListIdPGroupsForOrgEndpoint]
  }
}

