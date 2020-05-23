package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.TeamsListProjectsInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsListProjectsInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsListProjectsInOrgEndpoint extends js.Object {
  var parameters: TeamsListProjectsInOrgEndpoint
  var response: OctokitResponse[TeamsListProjectsInOrgResponseData]
}

object ParametersTeamsListProjectsInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsListProjectsInOrgEndpoint,
    response: OctokitResponse[TeamsListProjectsInOrgResponseData]
  ): ParametersTeamsListProjectsInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListProjectsInOrgEndpoint]
  }
}

