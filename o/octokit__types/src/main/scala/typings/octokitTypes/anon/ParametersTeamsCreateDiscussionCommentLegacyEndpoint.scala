package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsCreateDiscussionCommentLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsCreateDiscussionCommentLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsCreateDiscussionCommentLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsCreateDiscussionCommentLegacyEndpoint extends js.Object {
  var parameters: TeamsCreateDiscussionCommentLegacyEndpoint
  var request: TeamsCreateDiscussionCommentLegacyRequestOptions
  var response: OctokitResponse[TeamsCreateDiscussionCommentLegacyResponseData]
}

object ParametersTeamsCreateDiscussionCommentLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsCreateDiscussionCommentLegacyEndpoint,
    request: TeamsCreateDiscussionCommentLegacyRequestOptions,
    response: OctokitResponse[TeamsCreateDiscussionCommentLegacyResponseData]
  ): ParametersTeamsCreateDiscussionCommentLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsCreateDiscussionCommentLegacyEndpoint]
  }
}

