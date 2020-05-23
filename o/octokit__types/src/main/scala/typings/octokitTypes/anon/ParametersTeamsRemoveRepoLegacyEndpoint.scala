package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsRemoveRepoLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsRemoveRepoLegacyRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsRemoveRepoLegacyEndpoint extends js.Object {
  var parameters: TeamsRemoveRepoLegacyEndpoint
  var request: TeamsRemoveRepoLegacyRequestOptions
  var response: OctokitResponse[_]
}

object ParametersTeamsRemoveRepoLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsRemoveRepoLegacyEndpoint,
    request: TeamsRemoveRepoLegacyRequestOptions,
    response: OctokitResponse[_]
  ): ParametersTeamsRemoveRepoLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsRemoveRepoLegacyEndpoint]
  }
}

