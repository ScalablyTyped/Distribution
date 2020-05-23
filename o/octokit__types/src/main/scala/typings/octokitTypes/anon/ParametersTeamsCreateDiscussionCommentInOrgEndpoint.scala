package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsCreateDiscussionCommentInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsCreateDiscussionCommentInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsCreateDiscussionCommentInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsCreateDiscussionCommentInOrgEndpoint extends js.Object {
  var parameters: TeamsCreateDiscussionCommentInOrgEndpoint
  var request: TeamsCreateDiscussionCommentInOrgRequestOptions
  var response: OctokitResponse[TeamsCreateDiscussionCommentInOrgResponseData]
}

object ParametersTeamsCreateDiscussionCommentInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsCreateDiscussionCommentInOrgEndpoint,
    request: TeamsCreateDiscussionCommentInOrgRequestOptions,
    response: OctokitResponse[TeamsCreateDiscussionCommentInOrgResponseData]
  ): ParametersTeamsCreateDiscussionCommentInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsCreateDiscussionCommentInOrgEndpoint]
  }
}

