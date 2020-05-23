package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.TeamsListDiscussionsLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsListDiscussionsLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsListDiscussionsLegacyEndpoint extends js.Object {
  var parameters: TeamsListDiscussionsLegacyEndpoint
  var response: OctokitResponse[TeamsListDiscussionsLegacyResponseData]
}

object ParametersTeamsListDiscussionsLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsListDiscussionsLegacyEndpoint,
    response: OctokitResponse[TeamsListDiscussionsLegacyResponseData]
  ): ParametersTeamsListDiscussionsLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListDiscussionsLegacyEndpoint]
  }
}

