package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateMembershipLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateMembershipLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateMembershipLegacyResponse422Data
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateMembershipLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsAddOrUpdateMembershipLegacyEndpoint extends js.Object {
  var parameters: TeamsAddOrUpdateMembershipLegacyEndpoint
  var request: TeamsAddOrUpdateMembershipLegacyRequestOptions
  var response: OctokitResponse[
    TeamsAddOrUpdateMembershipLegacyResponseData | TeamsAddOrUpdateMembershipLegacyResponse422Data
  ]
}

object ParametersTeamsAddOrUpdateMembershipLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsAddOrUpdateMembershipLegacyEndpoint,
    request: TeamsAddOrUpdateMembershipLegacyRequestOptions,
    response: OctokitResponse[
      TeamsAddOrUpdateMembershipLegacyResponseData | TeamsAddOrUpdateMembershipLegacyResponse422Data
    ]
  ): ParametersTeamsAddOrUpdateMembershipLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsAddOrUpdateMembershipLegacyEndpoint]
  }
}

