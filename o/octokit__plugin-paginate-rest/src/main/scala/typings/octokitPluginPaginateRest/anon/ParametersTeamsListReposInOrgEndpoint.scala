package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.TeamsListReposInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsListReposInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsListReposInOrgEndpoint extends js.Object {
  var parameters: TeamsListReposInOrgEndpoint
  var response: OctokitResponse[TeamsListReposInOrgResponseData]
}

object ParametersTeamsListReposInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsListReposInOrgEndpoint,
    response: OctokitResponse[TeamsListReposInOrgResponseData]
  ): ParametersTeamsListReposInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListReposInOrgEndpoint]
  }
}

