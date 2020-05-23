package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsUpdateLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsUpdateLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsUpdateLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsUpdateLegacyEndpoint extends js.Object {
  var parameters: TeamsUpdateLegacyEndpoint
  var request: TeamsUpdateLegacyRequestOptions
  var response: OctokitResponse[TeamsUpdateLegacyResponseData]
}

object ParametersTeamsUpdateLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsUpdateLegacyEndpoint,
    request: TeamsUpdateLegacyRequestOptions,
    response: OctokitResponse[TeamsUpdateLegacyResponseData]
  ): ParametersTeamsUpdateLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsUpdateLegacyEndpoint]
  }
}

