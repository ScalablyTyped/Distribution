package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForRepoLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForRepoLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForRepoLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsCheckPermissionsForRepoLegacyEndpoint extends js.Object {
  var parameters: TeamsCheckPermissionsForRepoLegacyEndpoint
  var request: TeamsCheckPermissionsForRepoLegacyRequestOptions
  var response: OctokitResponse[TeamsCheckPermissionsForRepoLegacyResponseData]
}

object ParametersTeamsCheckPermissionsForRepoLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsCheckPermissionsForRepoLegacyEndpoint,
    request: TeamsCheckPermissionsForRepoLegacyRequestOptions,
    response: OctokitResponse[TeamsCheckPermissionsForRepoLegacyResponseData]
  ): ParametersTeamsCheckPermissionsForRepoLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsCheckPermissionsForRepoLegacyEndpoint]
  }
}

