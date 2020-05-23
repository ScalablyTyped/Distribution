package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsAddMemberLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsAddMemberLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsAddMemberLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsAddMemberLegacyEndpoint extends js.Object {
  var parameters: TeamsAddMemberLegacyEndpoint
  var request: TeamsAddMemberLegacyRequestOptions
  var response: OctokitResponse[TeamsAddMemberLegacyResponseData]
}

object ParametersTeamsAddMemberLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsAddMemberLegacyEndpoint,
    request: TeamsAddMemberLegacyRequestOptions,
    response: OctokitResponse[TeamsAddMemberLegacyResponseData]
  ): ParametersTeamsAddMemberLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsAddMemberLegacyEndpoint]
  }
}

