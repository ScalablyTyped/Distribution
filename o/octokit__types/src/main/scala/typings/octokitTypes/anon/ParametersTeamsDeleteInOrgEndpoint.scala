package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsDeleteInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsDeleteInOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsDeleteInOrgEndpoint extends js.Object {
  var parameters: TeamsDeleteInOrgEndpoint
  var request: TeamsDeleteInOrgRequestOptions
  var response: OctokitResponse[_]
}

object ParametersTeamsDeleteInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsDeleteInOrgEndpoint,
    request: TeamsDeleteInOrgRequestOptions,
    response: OctokitResponse[_]
  ): ParametersTeamsDeleteInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsDeleteInOrgEndpoint]
  }
}

