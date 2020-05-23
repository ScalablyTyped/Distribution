package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsListProjectsInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsListProjectsInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsListProjectsInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsListProjectsInOrgEndpoint extends js.Object {
  var parameters: TeamsListProjectsInOrgEndpoint
  var request: TeamsListProjectsInOrgRequestOptions
  var response: OctokitResponse[TeamsListProjectsInOrgResponseData]
}

object ParametersTeamsListProjectsInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsListProjectsInOrgEndpoint,
    request: TeamsListProjectsInOrgRequestOptions,
    response: OctokitResponse[TeamsListProjectsInOrgResponseData]
  ): ParametersTeamsListProjectsInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListProjectsInOrgEndpoint]
  }
}

