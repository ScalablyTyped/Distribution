package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsGetMembershipForUserLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsGetMembershipForUserLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsGetMembershipForUserLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsGetMembershipForUserLegacyEndpoint extends js.Object {
  var parameters: TeamsGetMembershipForUserLegacyEndpoint
  var request: TeamsGetMembershipForUserLegacyRequestOptions
  var response: OctokitResponse[TeamsGetMembershipForUserLegacyResponseData]
}

object ParametersTeamsGetMembershipForUserLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsGetMembershipForUserLegacyEndpoint,
    request: TeamsGetMembershipForUserLegacyRequestOptions,
    response: OctokitResponse[TeamsGetMembershipForUserLegacyResponseData]
  ): ParametersTeamsGetMembershipForUserLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsGetMembershipForUserLegacyEndpoint]
  }
}

