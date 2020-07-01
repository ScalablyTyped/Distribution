package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsUpdateReviewCommentEndpoint
import typings.octokitTypes.endpointsMod.PullsUpdateReviewCommentRequestOptions
import typings.octokitTypes.endpointsMod.PullsUpdateReviewCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersPullsUpdateReviewCommentEndpoint extends js.Object {
  var parameters: PullsUpdateReviewCommentEndpoint
  var request: PullsUpdateReviewCommentRequestOptions
  var response: OctokitResponse[PullsUpdateReviewCommentResponseData]
}

object ParametersPullsUpdateReviewCommentEndpoint {
  @scala.inline
  def apply(
    parameters: PullsUpdateReviewCommentEndpoint,
    request: PullsUpdateReviewCommentRequestOptions,
    response: OctokitResponse[PullsUpdateReviewCommentResponseData]
  ): ParametersPullsUpdateReviewCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsUpdateReviewCommentEndpoint]
  }
}

