package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsListProjectsLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsListProjectsLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsListProjectsLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsListProjectsLegacyEndpoint extends js.Object {
  var parameters: TeamsListProjectsLegacyEndpoint
  var request: TeamsListProjectsLegacyRequestOptions
  var response: OctokitResponse[TeamsListProjectsLegacyResponseData]
}

object ParametersTeamsListProjectsLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsListProjectsLegacyEndpoint,
    request: TeamsListProjectsLegacyRequestOptions,
    response: OctokitResponse[TeamsListProjectsLegacyResponseData]
  ): ParametersTeamsListProjectsLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListProjectsLegacyEndpoint]
  }
}

