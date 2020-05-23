package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsCheckManagesRepoInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsCheckManagesRepoInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsCheckManagesRepoInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsCheckManagesRepoInOrgEndpoint extends js.Object {
  var parameters: TeamsCheckManagesRepoInOrgEndpoint
  var request: TeamsCheckManagesRepoInOrgRequestOptions
  var response: OctokitResponse[TeamsCheckManagesRepoInOrgResponseData]
}

object ParametersTeamsCheckManagesRepoInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsCheckManagesRepoInOrgEndpoint,
    request: TeamsCheckManagesRepoInOrgRequestOptions,
    response: OctokitResponse[TeamsCheckManagesRepoInOrgResponseData]
  ): ParametersTeamsCheckManagesRepoInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsCheckManagesRepoInOrgEndpoint]
  }
}

