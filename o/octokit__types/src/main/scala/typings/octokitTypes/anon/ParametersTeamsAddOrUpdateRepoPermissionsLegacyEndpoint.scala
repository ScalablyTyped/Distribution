package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateRepoPermissionsLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateRepoPermissionsLegacyRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsAddOrUpdateRepoPermissionsLegacyEndpoint extends js.Object {
  var parameters: TeamsAddOrUpdateRepoPermissionsLegacyEndpoint
  var request: TeamsAddOrUpdateRepoPermissionsLegacyRequestOptions
  var response: OctokitResponse[_]
}

object ParametersTeamsAddOrUpdateRepoPermissionsLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsAddOrUpdateRepoPermissionsLegacyEndpoint,
    request: TeamsAddOrUpdateRepoPermissionsLegacyRequestOptions,
    response: OctokitResponse[_]
  ): ParametersTeamsAddOrUpdateRepoPermissionsLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsAddOrUpdateRepoPermissionsLegacyEndpoint]
  }
}

