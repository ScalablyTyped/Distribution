package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsDeleteForIssueCommentEndpoint
import typings.octokitTypes.endpointsMod.ReactionsDeleteForIssueCommentRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReactionsDeleteForIssueCommentEndpoint extends js.Object {
  var parameters: ReactionsDeleteForIssueCommentEndpoint
  var request: ReactionsDeleteForIssueCommentRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReactionsDeleteForIssueCommentEndpoint {
  @scala.inline
  def apply(
    parameters: ReactionsDeleteForIssueCommentEndpoint,
    request: ReactionsDeleteForIssueCommentRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReactionsDeleteForIssueCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsDeleteForIssueCommentEndpoint]
  }
}

