package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsDeleteDiscussionCommentInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsDeleteDiscussionCommentInOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsDeleteDiscussionCommentInOrgEndpoint extends js.Object {
  var parameters: TeamsDeleteDiscussionCommentInOrgEndpoint
  var request: TeamsDeleteDiscussionCommentInOrgRequestOptions
  var response: OctokitResponse[_]
}

object ParametersTeamsDeleteDiscussionCommentInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsDeleteDiscussionCommentInOrgEndpoint,
    request: TeamsDeleteDiscussionCommentInOrgRequestOptions,
    response: OctokitResponse[_]
  ): ParametersTeamsDeleteDiscussionCommentInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsDeleteDiscussionCommentInOrgEndpoint]
  }
}

