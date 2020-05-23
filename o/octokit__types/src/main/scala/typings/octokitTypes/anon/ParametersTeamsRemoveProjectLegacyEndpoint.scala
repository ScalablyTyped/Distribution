package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsRemoveProjectLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsRemoveProjectLegacyRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsRemoveProjectLegacyEndpoint extends js.Object {
  var parameters: TeamsRemoveProjectLegacyEndpoint
  var request: TeamsRemoveProjectLegacyRequestOptions
  var response: OctokitResponse[_]
}

object ParametersTeamsRemoveProjectLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsRemoveProjectLegacyEndpoint,
    request: TeamsRemoveProjectLegacyRequestOptions,
    response: OctokitResponse[_]
  ): ParametersTeamsRemoveProjectLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsRemoveProjectLegacyEndpoint]
  }
}

