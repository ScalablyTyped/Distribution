package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionCommentInOrgEndpoint
import typings.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionCommentInOrgRequestOptions
import typings.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionCommentInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReactionsCreateForTeamDiscussionCommentInOrgEndpoint extends js.Object {
  var parameters: ReactionsCreateForTeamDiscussionCommentInOrgEndpoint
  var request: ReactionsCreateForTeamDiscussionCommentInOrgRequestOptions
  var response: OctokitResponse[ReactionsCreateForTeamDiscussionCommentInOrgResponseData]
}

object ParametersReactionsCreateForTeamDiscussionCommentInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: ReactionsCreateForTeamDiscussionCommentInOrgEndpoint,
    request: ReactionsCreateForTeamDiscussionCommentInOrgRequestOptions,
    response: OctokitResponse[ReactionsCreateForTeamDiscussionCommentInOrgResponseData]
  ): ParametersReactionsCreateForTeamDiscussionCommentInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsCreateForTeamDiscussionCommentInOrgEndpoint]
  }
}

