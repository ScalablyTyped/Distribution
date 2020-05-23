package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsCreateEndpoint
import typings.octokitTypes.endpointsMod.TeamsCreateRequestOptions
import typings.octokitTypes.endpointsMod.TeamsCreateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsCreateEndpoint extends js.Object {
  var parameters: TeamsCreateEndpoint
  var request: TeamsCreateRequestOptions
  var response: OctokitResponse[TeamsCreateResponseData]
}

object ParametersTeamsCreateEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsCreateEndpoint,
    request: TeamsCreateRequestOptions,
    response: OctokitResponse[TeamsCreateResponseData]
  ): ParametersTeamsCreateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsCreateEndpoint]
  }
}

