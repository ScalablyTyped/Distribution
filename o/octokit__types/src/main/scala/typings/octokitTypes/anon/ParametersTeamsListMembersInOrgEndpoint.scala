package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsListMembersInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsListMembersInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsListMembersInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsListMembersInOrgEndpoint extends js.Object {
  var parameters: TeamsListMembersInOrgEndpoint
  var request: TeamsListMembersInOrgRequestOptions
  var response: OctokitResponse[TeamsListMembersInOrgResponseData]
}

object ParametersTeamsListMembersInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsListMembersInOrgEndpoint,
    request: TeamsListMembersInOrgRequestOptions,
    response: OctokitResponse[TeamsListMembersInOrgResponseData]
  ): ParametersTeamsListMembersInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListMembersInOrgEndpoint]
  }
}

