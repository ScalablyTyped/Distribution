package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsGetReviewCommentEndpoint
import typings.octokitTypes.endpointsMod.PullsGetReviewCommentRequestOptions
import typings.octokitTypes.endpointsMod.PullsGetReviewCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersPullsGetReviewCommentEndpoint extends js.Object {
  var parameters: PullsGetReviewCommentEndpoint
  var request: PullsGetReviewCommentRequestOptions
  var response: OctokitResponse[PullsGetReviewCommentResponseData]
}

object ParametersPullsGetReviewCommentEndpoint {
  @scala.inline
  def apply(
    parameters: PullsGetReviewCommentEndpoint,
    request: PullsGetReviewCommentRequestOptions,
    response: OctokitResponse[PullsGetReviewCommentResponseData]
  ): ParametersPullsGetReviewCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsGetReviewCommentEndpoint]
  }
}

