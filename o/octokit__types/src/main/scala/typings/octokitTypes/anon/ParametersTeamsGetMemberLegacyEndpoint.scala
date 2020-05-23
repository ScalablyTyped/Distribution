package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsGetMemberLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsGetMemberLegacyRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsGetMemberLegacyEndpoint extends js.Object {
  var parameters: TeamsGetMemberLegacyEndpoint
  var request: TeamsGetMemberLegacyRequestOptions
  var response: OctokitResponse[_]
}

object ParametersTeamsGetMemberLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsGetMemberLegacyEndpoint,
    request: TeamsGetMemberLegacyRequestOptions,
    response: OctokitResponse[_]
  ): ParametersTeamsGetMemberLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsGetMemberLegacyEndpoint]
  }
}

