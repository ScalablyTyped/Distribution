package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateProjectLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateProjectLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateProjectLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsAddOrUpdateProjectLegacyEndpoint extends js.Object {
  var parameters: TeamsAddOrUpdateProjectLegacyEndpoint
  var request: TeamsAddOrUpdateProjectLegacyRequestOptions
  var response: OctokitResponse[TeamsAddOrUpdateProjectLegacyResponseData]
}

object ParametersTeamsAddOrUpdateProjectLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsAddOrUpdateProjectLegacyEndpoint,
    request: TeamsAddOrUpdateProjectLegacyRequestOptions,
    response: OctokitResponse[TeamsAddOrUpdateProjectLegacyResponseData]
  ): ParametersTeamsAddOrUpdateProjectLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsAddOrUpdateProjectLegacyEndpoint]
  }
}

