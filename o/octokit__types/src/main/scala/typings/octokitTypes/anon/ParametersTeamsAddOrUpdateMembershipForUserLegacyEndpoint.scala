package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateMembershipForUserLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateMembershipForUserLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateMembershipForUserLegacyResponse422Data
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateMembershipForUserLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsAddOrUpdateMembershipForUserLegacyEndpoint extends js.Object {
  var parameters: TeamsAddOrUpdateMembershipForUserLegacyEndpoint
  var request: TeamsAddOrUpdateMembershipForUserLegacyRequestOptions
  var response: OctokitResponse[
    TeamsAddOrUpdateMembershipForUserLegacyResponseData | TeamsAddOrUpdateMembershipForUserLegacyResponse422Data
  ]
}

object ParametersTeamsAddOrUpdateMembershipForUserLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsAddOrUpdateMembershipForUserLegacyEndpoint,
    request: TeamsAddOrUpdateMembershipForUserLegacyRequestOptions,
    response: OctokitResponse[
      TeamsAddOrUpdateMembershipForUserLegacyResponseData | TeamsAddOrUpdateMembershipForUserLegacyResponse422Data
    ]
  ): ParametersTeamsAddOrUpdateMembershipForUserLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsAddOrUpdateMembershipForUserLegacyEndpoint]
  }
}

