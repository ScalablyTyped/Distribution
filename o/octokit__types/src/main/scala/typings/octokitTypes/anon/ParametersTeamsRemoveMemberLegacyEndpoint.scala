package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsRemoveMemberLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsRemoveMemberLegacyRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsRemoveMemberLegacyEndpoint extends js.Object {
  var parameters: TeamsRemoveMemberLegacyEndpoint
  var request: TeamsRemoveMemberLegacyRequestOptions
  var response: OctokitResponse[_]
}

object ParametersTeamsRemoveMemberLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsRemoveMemberLegacyEndpoint,
    request: TeamsRemoveMemberLegacyRequestOptions,
    response: OctokitResponse[_]
  ): ParametersTeamsRemoveMemberLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsRemoveMemberLegacyEndpoint]
  }
}

