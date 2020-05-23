package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsListMembersLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsListMembersLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsListMembersLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsListMembersLegacyEndpoint extends js.Object {
  var parameters: TeamsListMembersLegacyEndpoint
  var request: TeamsListMembersLegacyRequestOptions
  var response: OctokitResponse[TeamsListMembersLegacyResponseData]
}

object ParametersTeamsListMembersLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsListMembersLegacyEndpoint,
    request: TeamsListMembersLegacyRequestOptions,
    response: OctokitResponse[TeamsListMembersLegacyResponseData]
  ): ParametersTeamsListMembersLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListMembersLegacyEndpoint]
  }
}

