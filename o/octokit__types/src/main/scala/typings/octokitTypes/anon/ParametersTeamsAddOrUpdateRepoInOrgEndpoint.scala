package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateRepoInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateRepoInOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsAddOrUpdateRepoInOrgEndpoint extends js.Object {
  var parameters: TeamsAddOrUpdateRepoInOrgEndpoint
  var request: TeamsAddOrUpdateRepoInOrgRequestOptions
  var response: OctokitResponse[_]
}

object ParametersTeamsAddOrUpdateRepoInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsAddOrUpdateRepoInOrgEndpoint,
    request: TeamsAddOrUpdateRepoInOrgRequestOptions,
    response: OctokitResponse[_]
  ): ParametersTeamsAddOrUpdateRepoInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsAddOrUpdateRepoInOrgEndpoint]
  }
}

