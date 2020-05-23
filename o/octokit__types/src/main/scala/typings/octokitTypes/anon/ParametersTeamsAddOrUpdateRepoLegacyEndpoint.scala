package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateRepoLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateRepoLegacyRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsAddOrUpdateRepoLegacyEndpoint extends js.Object {
  var parameters: TeamsAddOrUpdateRepoLegacyEndpoint
  var request: TeamsAddOrUpdateRepoLegacyRequestOptions
  var response: OctokitResponse[_]
}

object ParametersTeamsAddOrUpdateRepoLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsAddOrUpdateRepoLegacyEndpoint,
    request: TeamsAddOrUpdateRepoLegacyRequestOptions,
    response: OctokitResponse[_]
  ): ParametersTeamsAddOrUpdateRepoLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsAddOrUpdateRepoLegacyEndpoint]
  }
}

