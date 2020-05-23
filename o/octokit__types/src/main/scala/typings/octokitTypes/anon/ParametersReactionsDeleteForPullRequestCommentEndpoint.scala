package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsDeleteForPullRequestCommentEndpoint
import typings.octokitTypes.endpointsMod.ReactionsDeleteForPullRequestCommentRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReactionsDeleteForPullRequestCommentEndpoint extends js.Object {
  var parameters: ReactionsDeleteForPullRequestCommentEndpoint
  var request: ReactionsDeleteForPullRequestCommentRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReactionsDeleteForPullRequestCommentEndpoint {
  @scala.inline
  def apply(
    parameters: ReactionsDeleteForPullRequestCommentEndpoint,
    request: ReactionsDeleteForPullRequestCommentRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReactionsDeleteForPullRequestCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsDeleteForPullRequestCommentEndpoint]
  }
}

