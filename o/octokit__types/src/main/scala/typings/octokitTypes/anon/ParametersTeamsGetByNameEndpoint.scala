package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsGetByNameEndpoint
import typings.octokitTypes.endpointsMod.TeamsGetByNameRequestOptions
import typings.octokitTypes.endpointsMod.TeamsGetByNameResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsGetByNameEndpoint extends js.Object {
  var parameters: TeamsGetByNameEndpoint
  var request: TeamsGetByNameRequestOptions
  var response: OctokitResponse[TeamsGetByNameResponseData]
}

object ParametersTeamsGetByNameEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsGetByNameEndpoint,
    request: TeamsGetByNameRequestOptions,
    response: OctokitResponse[TeamsGetByNameResponseData]
  ): ParametersTeamsGetByNameEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsGetByNameEndpoint]
  }
}

