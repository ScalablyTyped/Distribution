package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsGetMembershipLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsGetMembershipLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsGetMembershipLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsGetMembershipLegacyEndpoint extends js.Object {
  var parameters: TeamsGetMembershipLegacyEndpoint
  var request: TeamsGetMembershipLegacyRequestOptions
  var response: OctokitResponse[TeamsGetMembershipLegacyResponseData]
}

object ParametersTeamsGetMembershipLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsGetMembershipLegacyEndpoint,
    request: TeamsGetMembershipLegacyRequestOptions,
    response: OctokitResponse[TeamsGetMembershipLegacyResponseData]
  ): ParametersTeamsGetMembershipLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsGetMembershipLegacyEndpoint]
  }
}

