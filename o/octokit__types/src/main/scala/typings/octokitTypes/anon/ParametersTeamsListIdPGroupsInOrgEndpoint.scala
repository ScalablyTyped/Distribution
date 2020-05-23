package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsListIdPGroupsInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsListIdPGroupsInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsListIdPGroupsInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsListIdPGroupsInOrgEndpoint extends js.Object {
  var parameters: TeamsListIdPGroupsInOrgEndpoint
  var request: TeamsListIdPGroupsInOrgRequestOptions
  var response: OctokitResponse[TeamsListIdPGroupsInOrgResponseData]
}

object ParametersTeamsListIdPGroupsInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsListIdPGroupsInOrgEndpoint,
    request: TeamsListIdPGroupsInOrgRequestOptions,
    response: OctokitResponse[TeamsListIdPGroupsInOrgResponseData]
  ): ParametersTeamsListIdPGroupsInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListIdPGroupsInOrgEndpoint]
  }
}

