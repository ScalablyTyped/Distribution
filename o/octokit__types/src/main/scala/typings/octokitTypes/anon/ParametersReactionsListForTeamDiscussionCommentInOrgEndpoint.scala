package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionCommentInOrgEndpoint
import typings.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionCommentInOrgRequestOptions
import typings.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionCommentInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReactionsListForTeamDiscussionCommentInOrgEndpoint extends js.Object {
  var parameters: ReactionsListForTeamDiscussionCommentInOrgEndpoint
  var request: ReactionsListForTeamDiscussionCommentInOrgRequestOptions
  var response: OctokitResponse[ReactionsListForTeamDiscussionCommentInOrgResponseData]
}

object ParametersReactionsListForTeamDiscussionCommentInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: ReactionsListForTeamDiscussionCommentInOrgEndpoint,
    request: ReactionsListForTeamDiscussionCommentInOrgRequestOptions,
    response: OctokitResponse[ReactionsListForTeamDiscussionCommentInOrgResponseData]
  ): ParametersReactionsListForTeamDiscussionCommentInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsListForTeamDiscussionCommentInOrgEndpoint]
  }
}

