package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsListDiscussionsInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsListDiscussionsInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsListDiscussionsInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsListDiscussionsInOrgEndpoint extends js.Object {
  var parameters: TeamsListDiscussionsInOrgEndpoint
  var request: TeamsListDiscussionsInOrgRequestOptions
  var response: OctokitResponse[TeamsListDiscussionsInOrgResponseData]
}

object ParametersTeamsListDiscussionsInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsListDiscussionsInOrgEndpoint,
    request: TeamsListDiscussionsInOrgRequestOptions,
    response: OctokitResponse[TeamsListDiscussionsInOrgResponseData]
  ): ParametersTeamsListDiscussionsInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListDiscussionsInOrgEndpoint]
  }
}

