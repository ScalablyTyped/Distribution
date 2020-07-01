package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForProjectInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForProjectInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForProjectInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsCheckPermissionsForProjectInOrgEndpoint extends js.Object {
  var parameters: TeamsCheckPermissionsForProjectInOrgEndpoint
  var request: TeamsCheckPermissionsForProjectInOrgRequestOptions
  var response: OctokitResponse[TeamsCheckPermissionsForProjectInOrgResponseData]
}

object ParametersTeamsCheckPermissionsForProjectInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsCheckPermissionsForProjectInOrgEndpoint,
    request: TeamsCheckPermissionsForProjectInOrgRequestOptions,
    response: OctokitResponse[TeamsCheckPermissionsForProjectInOrgResponseData]
  ): ParametersTeamsCheckPermissionsForProjectInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsCheckPermissionsForProjectInOrgEndpoint]
  }
}

