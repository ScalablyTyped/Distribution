package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.TeamsListReposLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsListReposLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsListReposLegacyEndpoint extends js.Object {
  var parameters: TeamsListReposLegacyEndpoint
  var response: OctokitResponse[TeamsListReposLegacyResponseData]
}

object ParametersTeamsListReposLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsListReposLegacyEndpoint,
    response: OctokitResponse[TeamsListReposLegacyResponseData]
  ): ParametersTeamsListReposLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListReposLegacyEndpoint]
  }
}

