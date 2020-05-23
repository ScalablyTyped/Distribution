package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsCreateForPullRequestReviewCommentEndpoint
import typings.octokitTypes.endpointsMod.ReactionsCreateForPullRequestReviewCommentRequestOptions
import typings.octokitTypes.endpointsMod.ReactionsCreateForPullRequestReviewCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReactionsCreateForPullRequestReviewCommentEndpoint extends js.Object {
  var parameters: ReactionsCreateForPullRequestReviewCommentEndpoint
  var request: ReactionsCreateForPullRequestReviewCommentRequestOptions
  var response: OctokitResponse[ReactionsCreateForPullRequestReviewCommentResponseData]
}

object ParametersReactionsCreateForPullRequestReviewCommentEndpoint {
  @scala.inline
  def apply(
    parameters: ReactionsCreateForPullRequestReviewCommentEndpoint,
    request: ReactionsCreateForPullRequestReviewCommentRequestOptions,
    response: OctokitResponse[ReactionsCreateForPullRequestReviewCommentResponseData]
  ): ParametersReactionsCreateForPullRequestReviewCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsCreateForPullRequestReviewCommentEndpoint]
  }
}

