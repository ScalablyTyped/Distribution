package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateRepoPermissionsInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateRepoPermissionsInOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsAddOrUpdateRepoPermissionsInOrgEndpoint extends js.Object {
  var parameters: TeamsAddOrUpdateRepoPermissionsInOrgEndpoint
  var request: TeamsAddOrUpdateRepoPermissionsInOrgRequestOptions
  var response: OctokitResponse[_]
}

object ParametersTeamsAddOrUpdateRepoPermissionsInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsAddOrUpdateRepoPermissionsInOrgEndpoint,
    request: TeamsAddOrUpdateRepoPermissionsInOrgRequestOptions,
    response: OctokitResponse[_]
  ): ParametersTeamsAddOrUpdateRepoPermissionsInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsAddOrUpdateRepoPermissionsInOrgEndpoint]
  }
}

