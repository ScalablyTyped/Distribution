package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsDeleteForTeamDiscussionCommentEndpoint
import typings.octokitTypes.endpointsMod.ReactionsDeleteForTeamDiscussionCommentRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReactionsDeleteForTeamDiscussionCommentEndpoint extends js.Object {
  var parameters: ReactionsDeleteForTeamDiscussionCommentEndpoint
  var request: ReactionsDeleteForTeamDiscussionCommentRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReactionsDeleteForTeamDiscussionCommentEndpoint {
  @scala.inline
  def apply(
    parameters: ReactionsDeleteForTeamDiscussionCommentEndpoint,
    request: ReactionsDeleteForTeamDiscussionCommentRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReactionsDeleteForTeamDiscussionCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsDeleteForTeamDiscussionCommentEndpoint]
  }
}

