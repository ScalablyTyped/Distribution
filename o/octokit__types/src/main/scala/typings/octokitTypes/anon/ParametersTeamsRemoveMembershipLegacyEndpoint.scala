package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsRemoveMembershipLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsRemoveMembershipLegacyRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsRemoveMembershipLegacyEndpoint extends js.Object {
  var parameters: TeamsRemoveMembershipLegacyEndpoint
  var request: TeamsRemoveMembershipLegacyRequestOptions
  var response: OctokitResponse[_]
}

object ParametersTeamsRemoveMembershipLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsRemoveMembershipLegacyEndpoint,
    request: TeamsRemoveMembershipLegacyRequestOptions,
    response: OctokitResponse[_]
  ): ParametersTeamsRemoveMembershipLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsRemoveMembershipLegacyEndpoint]
  }
}

