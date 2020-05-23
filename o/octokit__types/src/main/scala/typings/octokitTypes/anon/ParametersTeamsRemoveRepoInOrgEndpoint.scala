package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsRemoveRepoInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsRemoveRepoInOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsRemoveRepoInOrgEndpoint extends js.Object {
  var parameters: TeamsRemoveRepoInOrgEndpoint
  var request: TeamsRemoveRepoInOrgRequestOptions
  var response: OctokitResponse[_]
}

object ParametersTeamsRemoveRepoInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsRemoveRepoInOrgEndpoint,
    request: TeamsRemoveRepoInOrgRequestOptions,
    response: OctokitResponse[_]
  ): ParametersTeamsRemoveRepoInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsRemoveRepoInOrgEndpoint]
  }
}

