package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsUpdateDiscussionCommentLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsUpdateDiscussionCommentLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsUpdateDiscussionCommentLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsUpdateDiscussionCommentLegacyEndpoint extends js.Object {
  var parameters: TeamsUpdateDiscussionCommentLegacyEndpoint
  var request: TeamsUpdateDiscussionCommentLegacyRequestOptions
  var response: OctokitResponse[TeamsUpdateDiscussionCommentLegacyResponseData]
}

object ParametersTeamsUpdateDiscussionCommentLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsUpdateDiscussionCommentLegacyEndpoint,
    request: TeamsUpdateDiscussionCommentLegacyRequestOptions,
    response: OctokitResponse[TeamsUpdateDiscussionCommentLegacyResponseData]
  ): ParametersTeamsUpdateDiscussionCommentLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsUpdateDiscussionCommentLegacyEndpoint]
  }
}

