package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsCheckManagesRepoLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsCheckManagesRepoLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsCheckManagesRepoLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsCheckManagesRepoLegacyEndpoint extends js.Object {
  var parameters: TeamsCheckManagesRepoLegacyEndpoint
  var request: TeamsCheckManagesRepoLegacyRequestOptions
  var response: OctokitResponse[TeamsCheckManagesRepoLegacyResponseData]
}

object ParametersTeamsCheckManagesRepoLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsCheckManagesRepoLegacyEndpoint,
    request: TeamsCheckManagesRepoLegacyRequestOptions,
    response: OctokitResponse[TeamsCheckManagesRepoLegacyResponseData]
  ): ParametersTeamsCheckManagesRepoLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsCheckManagesRepoLegacyEndpoint]
  }
}

