package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForProjectLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForProjectLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForProjectLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsCheckPermissionsForProjectLegacyEndpoint extends js.Object {
  var parameters: TeamsCheckPermissionsForProjectLegacyEndpoint
  var request: TeamsCheckPermissionsForProjectLegacyRequestOptions
  var response: OctokitResponse[TeamsCheckPermissionsForProjectLegacyResponseData]
}

object ParametersTeamsCheckPermissionsForProjectLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsCheckPermissionsForProjectLegacyEndpoint,
    request: TeamsCheckPermissionsForProjectLegacyRequestOptions,
    response: OctokitResponse[TeamsCheckPermissionsForProjectLegacyResponseData]
  ): ParametersTeamsCheckPermissionsForProjectLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsCheckPermissionsForProjectLegacyEndpoint]
  }
}

