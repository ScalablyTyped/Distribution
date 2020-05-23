package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsListEndpoint
import typings.octokitTypes.endpointsMod.TeamsListRequestOptions
import typings.octokitTypes.endpointsMod.TeamsListResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsListEndpoint extends js.Object {
  var parameters: TeamsListEndpoint
  var request: TeamsListRequestOptions
  var response: OctokitResponse[TeamsListResponseData]
}

object ParametersTeamsListEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsListEndpoint,
    request: TeamsListRequestOptions,
    response: OctokitResponse[TeamsListResponseData]
  ): ParametersTeamsListEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListEndpoint]
  }
}

