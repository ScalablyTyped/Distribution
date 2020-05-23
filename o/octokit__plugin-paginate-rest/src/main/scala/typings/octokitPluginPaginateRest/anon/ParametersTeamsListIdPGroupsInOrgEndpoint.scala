package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.TeamsListIdPGroupsInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsListIdPGroupsInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsListIdPGroupsInOrgEndpoint extends js.Object {
  var parameters: TeamsListIdPGroupsInOrgEndpoint
  var response: OctokitResponse[TeamsListIdPGroupsInOrgResponseData] with `1`
}

object ParametersTeamsListIdPGroupsInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsListIdPGroupsInOrgEndpoint,
    response: OctokitResponse[TeamsListIdPGroupsInOrgResponseData] with `1`
  ): ParametersTeamsListIdPGroupsInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListIdPGroupsInOrgEndpoint]
  }
}

