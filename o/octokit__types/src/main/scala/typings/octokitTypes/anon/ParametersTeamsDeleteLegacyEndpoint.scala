package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsDeleteLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsDeleteLegacyRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsDeleteLegacyEndpoint extends js.Object {
  var parameters: TeamsDeleteLegacyEndpoint
  var request: TeamsDeleteLegacyRequestOptions
  var response: OctokitResponse[_]
}

object ParametersTeamsDeleteLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsDeleteLegacyEndpoint,
    request: TeamsDeleteLegacyRequestOptions,
    response: OctokitResponse[_]
  ): ParametersTeamsDeleteLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsDeleteLegacyEndpoint]
  }
}

