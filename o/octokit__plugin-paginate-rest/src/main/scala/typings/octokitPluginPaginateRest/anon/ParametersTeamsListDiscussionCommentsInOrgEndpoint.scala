package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.TeamsListDiscussionCommentsInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsListDiscussionCommentsInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsListDiscussionCommentsInOrgEndpoint extends js.Object {
  var parameters: TeamsListDiscussionCommentsInOrgEndpoint
  var response: OctokitResponse[TeamsListDiscussionCommentsInOrgResponseData]
}

object ParametersTeamsListDiscussionCommentsInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsListDiscussionCommentsInOrgEndpoint,
    response: OctokitResponse[TeamsListDiscussionCommentsInOrgResponseData]
  ): ParametersTeamsListDiscussionCommentsInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListDiscussionCommentsInOrgEndpoint]
  }
}

