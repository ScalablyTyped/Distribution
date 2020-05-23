package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.TeamsListProjectsLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsListProjectsLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsListProjectsLegacyEndpoint extends js.Object {
  var parameters: TeamsListProjectsLegacyEndpoint
  var response: OctokitResponse[TeamsListProjectsLegacyResponseData]
}

object ParametersTeamsListProjectsLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsListProjectsLegacyEndpoint,
    response: OctokitResponse[TeamsListProjectsLegacyResponseData]
  ): ParametersTeamsListProjectsLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListProjectsLegacyEndpoint]
  }
}

