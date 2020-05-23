package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.TeamsListMembersLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsListMembersLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsListMembersLegacyEndpoint extends js.Object {
  var parameters: TeamsListMembersLegacyEndpoint
  var response: OctokitResponse[TeamsListMembersLegacyResponseData]
}

object ParametersTeamsListMembersLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsListMembersLegacyEndpoint,
    response: OctokitResponse[TeamsListMembersLegacyResponseData]
  ): ParametersTeamsListMembersLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListMembersLegacyEndpoint]
  }
}

