package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsGetLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsGetLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsGetLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsGetLegacyEndpoint extends js.Object {
  var parameters: TeamsGetLegacyEndpoint
  var request: TeamsGetLegacyRequestOptions
  var response: OctokitResponse[TeamsGetLegacyResponseData]
}

object ParametersTeamsGetLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsGetLegacyEndpoint,
    request: TeamsGetLegacyRequestOptions,
    response: OctokitResponse[TeamsGetLegacyResponseData]
  ): ParametersTeamsGetLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsGetLegacyEndpoint]
  }
}

