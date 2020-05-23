package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsCreateForIssueCommentEndpoint
import typings.octokitTypes.endpointsMod.ReactionsCreateForIssueCommentRequestOptions
import typings.octokitTypes.endpointsMod.ReactionsCreateForIssueCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReactionsCreateForIssueCommentEndpoint extends js.Object {
  var parameters: ReactionsCreateForIssueCommentEndpoint
  var request: ReactionsCreateForIssueCommentRequestOptions
  var response: OctokitResponse[ReactionsCreateForIssueCommentResponseData]
}

object ParametersReactionsCreateForIssueCommentEndpoint {
  @scala.inline
  def apply(
    parameters: ReactionsCreateForIssueCommentEndpoint,
    request: ReactionsCreateForIssueCommentRequestOptions,
    response: OctokitResponse[ReactionsCreateForIssueCommentResponseData]
  ): ParametersReactionsCreateForIssueCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsCreateForIssueCommentEndpoint]
  }
}

