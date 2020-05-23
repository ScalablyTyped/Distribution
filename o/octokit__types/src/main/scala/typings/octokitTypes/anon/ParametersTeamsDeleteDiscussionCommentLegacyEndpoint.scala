package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsDeleteDiscussionCommentLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsDeleteDiscussionCommentLegacyRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsDeleteDiscussionCommentLegacyEndpoint extends js.Object {
  var parameters: TeamsDeleteDiscussionCommentLegacyEndpoint
  var request: TeamsDeleteDiscussionCommentLegacyRequestOptions
  var response: OctokitResponse[_]
}

object ParametersTeamsDeleteDiscussionCommentLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsDeleteDiscussionCommentLegacyEndpoint,
    request: TeamsDeleteDiscussionCommentLegacyRequestOptions,
    response: OctokitResponse[_]
  ): ParametersTeamsDeleteDiscussionCommentLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsDeleteDiscussionCommentLegacyEndpoint]
  }
}

