package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForRepoInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForRepoInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForRepoInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsCheckPermissionsForRepoInOrgEndpoint extends js.Object {
  var parameters: TeamsCheckPermissionsForRepoInOrgEndpoint
  var request: TeamsCheckPermissionsForRepoInOrgRequestOptions
  var response: OctokitResponse[TeamsCheckPermissionsForRepoInOrgResponseData]
}

object ParametersTeamsCheckPermissionsForRepoInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsCheckPermissionsForRepoInOrgEndpoint,
    request: TeamsCheckPermissionsForRepoInOrgRequestOptions,
    response: OctokitResponse[TeamsCheckPermissionsForRepoInOrgResponseData]
  ): ParametersTeamsCheckPermissionsForRepoInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsCheckPermissionsForRepoInOrgEndpoint]
  }
}

