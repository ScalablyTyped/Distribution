package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionCommentLegacyEndpoint
import typings.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionCommentLegacyRequestOptions
import typings.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionCommentLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReactionsCreateForTeamDiscussionCommentLegacyEndpoint extends js.Object {
  var parameters: ReactionsCreateForTeamDiscussionCommentLegacyEndpoint
  var request: ReactionsCreateForTeamDiscussionCommentLegacyRequestOptions
  var response: OctokitResponse[ReactionsCreateForTeamDiscussionCommentLegacyResponseData]
}

object ParametersReactionsCreateForTeamDiscussionCommentLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: ReactionsCreateForTeamDiscussionCommentLegacyEndpoint,
    request: ReactionsCreateForTeamDiscussionCommentLegacyRequestOptions,
    response: OctokitResponse[ReactionsCreateForTeamDiscussionCommentLegacyResponseData]
  ): ParametersReactionsCreateForTeamDiscussionCommentLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsCreateForTeamDiscussionCommentLegacyEndpoint]
  }
}

