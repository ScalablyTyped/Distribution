package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsRemoveMembershipForUserLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsRemoveMembershipForUserLegacyRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsRemoveMembershipForUserLegacyEndpoint extends js.Object {
  var parameters: TeamsRemoveMembershipForUserLegacyEndpoint
  var request: TeamsRemoveMembershipForUserLegacyRequestOptions
  var response: OctokitResponse[_]
}

object ParametersTeamsRemoveMembershipForUserLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsRemoveMembershipForUserLegacyEndpoint,
    request: TeamsRemoveMembershipForUserLegacyRequestOptions,
    response: OctokitResponse[_]
  ): ParametersTeamsRemoveMembershipForUserLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsRemoveMembershipForUserLegacyEndpoint]
  }
}

