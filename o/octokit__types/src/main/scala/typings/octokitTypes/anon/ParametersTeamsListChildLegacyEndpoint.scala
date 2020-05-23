package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsListChildLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsListChildLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsListChildLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsListChildLegacyEndpoint extends js.Object {
  var parameters: TeamsListChildLegacyEndpoint
  var request: TeamsListChildLegacyRequestOptions
  var response: OctokitResponse[TeamsListChildLegacyResponseData]
}

object ParametersTeamsListChildLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsListChildLegacyEndpoint,
    request: TeamsListChildLegacyRequestOptions,
    response: OctokitResponse[TeamsListChildLegacyResponseData]
  ): ParametersTeamsListChildLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListChildLegacyEndpoint]
  }
}

