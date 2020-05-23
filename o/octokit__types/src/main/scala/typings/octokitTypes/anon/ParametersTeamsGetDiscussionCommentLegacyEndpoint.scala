package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsGetDiscussionCommentLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsGetDiscussionCommentLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsGetDiscussionCommentLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsGetDiscussionCommentLegacyEndpoint extends js.Object {
  var parameters: TeamsGetDiscussionCommentLegacyEndpoint
  var request: TeamsGetDiscussionCommentLegacyRequestOptions
  var response: OctokitResponse[TeamsGetDiscussionCommentLegacyResponseData]
}

object ParametersTeamsGetDiscussionCommentLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsGetDiscussionCommentLegacyEndpoint,
    request: TeamsGetDiscussionCommentLegacyRequestOptions,
    response: OctokitResponse[TeamsGetDiscussionCommentLegacyResponseData]
  ): ParametersTeamsGetDiscussionCommentLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsGetDiscussionCommentLegacyEndpoint]
  }
}

