package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateProjectPermissionsInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateProjectPermissionsInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateProjectPermissionsInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsAddOrUpdateProjectPermissionsInOrgEndpoint extends js.Object {
  var parameters: TeamsAddOrUpdateProjectPermissionsInOrgEndpoint
  var request: TeamsAddOrUpdateProjectPermissionsInOrgRequestOptions
  var response: OctokitResponse[TeamsAddOrUpdateProjectPermissionsInOrgResponseData]
}

object ParametersTeamsAddOrUpdateProjectPermissionsInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsAddOrUpdateProjectPermissionsInOrgEndpoint,
    request: TeamsAddOrUpdateProjectPermissionsInOrgRequestOptions,
    response: OctokitResponse[TeamsAddOrUpdateProjectPermissionsInOrgResponseData]
  ): ParametersTeamsAddOrUpdateProjectPermissionsInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsAddOrUpdateProjectPermissionsInOrgEndpoint]
  }
}

