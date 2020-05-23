package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsCreateOrUpdateIdPGroupConnectionsLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsCreateOrUpdateIdPGroupConnectionsLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint extends js.Object {
  var parameters: TeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint
  var request: TeamsCreateOrUpdateIdPGroupConnectionsLegacyRequestOptions
  var response: OctokitResponse[TeamsCreateOrUpdateIdPGroupConnectionsLegacyResponseData]
}

object ParametersTeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint,
    request: TeamsCreateOrUpdateIdPGroupConnectionsLegacyRequestOptions,
    response: OctokitResponse[TeamsCreateOrUpdateIdPGroupConnectionsLegacyResponseData]
  ): ParametersTeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint]
  }
}

