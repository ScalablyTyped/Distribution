package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateProjectInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateProjectInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateProjectInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsAddOrUpdateProjectInOrgEndpoint extends js.Object {
  var parameters: TeamsAddOrUpdateProjectInOrgEndpoint
  var request: TeamsAddOrUpdateProjectInOrgRequestOptions
  var response: OctokitResponse[TeamsAddOrUpdateProjectInOrgResponseData]
}

object ParametersTeamsAddOrUpdateProjectInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsAddOrUpdateProjectInOrgEndpoint,
    request: TeamsAddOrUpdateProjectInOrgRequestOptions,
    response: OctokitResponse[TeamsAddOrUpdateProjectInOrgResponseData]
  ): ParametersTeamsAddOrUpdateProjectInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsAddOrUpdateProjectInOrgEndpoint]
  }
}

