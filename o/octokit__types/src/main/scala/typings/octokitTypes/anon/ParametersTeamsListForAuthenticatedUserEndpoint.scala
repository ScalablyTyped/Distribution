package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsListForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.TeamsListForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.TeamsListForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsListForAuthenticatedUserEndpoint extends js.Object {
  var parameters: TeamsListForAuthenticatedUserEndpoint
  var request: TeamsListForAuthenticatedUserRequestOptions
  var response: OctokitResponse[TeamsListForAuthenticatedUserResponseData]
}

object ParametersTeamsListForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsListForAuthenticatedUserEndpoint,
    request: TeamsListForAuthenticatedUserRequestOptions,
    response: OctokitResponse[TeamsListForAuthenticatedUserResponseData]
  ): ParametersTeamsListForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListForAuthenticatedUserEndpoint]
  }
}

