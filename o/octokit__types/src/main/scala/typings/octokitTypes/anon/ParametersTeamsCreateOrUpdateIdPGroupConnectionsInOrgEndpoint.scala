package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsCreateOrUpdateIdPGroupConnectionsInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsCreateOrUpdateIdPGroupConnectionsInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpoint extends js.Object {
  var parameters: TeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpoint
  var request: TeamsCreateOrUpdateIdPGroupConnectionsInOrgRequestOptions
  var response: OctokitResponse[TeamsCreateOrUpdateIdPGroupConnectionsInOrgResponseData]
}

object ParametersTeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpoint,
    request: TeamsCreateOrUpdateIdPGroupConnectionsInOrgRequestOptions,
    response: OctokitResponse[TeamsCreateOrUpdateIdPGroupConnectionsInOrgResponseData]
  ): ParametersTeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpoint]
  }
}

