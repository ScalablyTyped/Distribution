package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateProjectPermissionsLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateProjectPermissionsLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateProjectPermissionsLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsAddOrUpdateProjectPermissionsLegacyEndpoint extends js.Object {
  var parameters: TeamsAddOrUpdateProjectPermissionsLegacyEndpoint
  var request: TeamsAddOrUpdateProjectPermissionsLegacyRequestOptions
  var response: OctokitResponse[TeamsAddOrUpdateProjectPermissionsLegacyResponseData]
}

object ParametersTeamsAddOrUpdateProjectPermissionsLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsAddOrUpdateProjectPermissionsLegacyEndpoint,
    request: TeamsAddOrUpdateProjectPermissionsLegacyRequestOptions,
    response: OctokitResponse[TeamsAddOrUpdateProjectPermissionsLegacyResponseData]
  ): ParametersTeamsAddOrUpdateProjectPermissionsLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsAddOrUpdateProjectPermissionsLegacyEndpoint]
  }
}

