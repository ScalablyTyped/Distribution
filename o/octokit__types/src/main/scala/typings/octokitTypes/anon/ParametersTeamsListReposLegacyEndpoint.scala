package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsListReposLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsListReposLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsListReposLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsListReposLegacyEndpoint extends js.Object {
  var parameters: TeamsListReposLegacyEndpoint
  var request: TeamsListReposLegacyRequestOptions
  var response: OctokitResponse[TeamsListReposLegacyResponseData]
}

object ParametersTeamsListReposLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsListReposLegacyEndpoint,
    request: TeamsListReposLegacyRequestOptions,
    response: OctokitResponse[TeamsListReposLegacyResponseData]
  ): ParametersTeamsListReposLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListReposLegacyEndpoint]
  }
}

