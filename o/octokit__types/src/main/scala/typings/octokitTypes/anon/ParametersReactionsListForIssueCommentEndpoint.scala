package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsListForIssueCommentEndpoint
import typings.octokitTypes.endpointsMod.ReactionsListForIssueCommentRequestOptions
import typings.octokitTypes.endpointsMod.ReactionsListForIssueCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReactionsListForIssueCommentEndpoint extends js.Object {
  var parameters: ReactionsListForIssueCommentEndpoint
  var request: ReactionsListForIssueCommentRequestOptions
  var response: OctokitResponse[ReactionsListForIssueCommentResponseData]
}

object ParametersReactionsListForIssueCommentEndpoint {
  @scala.inline
  def apply(
    parameters: ReactionsListForIssueCommentEndpoint,
    request: ReactionsListForIssueCommentRequestOptions,
    response: OctokitResponse[ReactionsListForIssueCommentResponseData]
  ): ParametersReactionsListForIssueCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsListForIssueCommentEndpoint]
  }
}

