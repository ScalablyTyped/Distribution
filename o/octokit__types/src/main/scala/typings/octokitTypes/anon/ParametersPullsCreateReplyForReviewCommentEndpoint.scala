package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsCreateReplyForReviewCommentEndpoint
import typings.octokitTypes.endpointsMod.PullsCreateReplyForReviewCommentRequestOptions
import typings.octokitTypes.endpointsMod.PullsCreateReplyForReviewCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersPullsCreateReplyForReviewCommentEndpoint extends js.Object {
  var parameters: PullsCreateReplyForReviewCommentEndpoint
  var request: PullsCreateReplyForReviewCommentRequestOptions
  var response: OctokitResponse[PullsCreateReplyForReviewCommentResponseData]
}

object ParametersPullsCreateReplyForReviewCommentEndpoint {
  @scala.inline
  def apply(
    parameters: PullsCreateReplyForReviewCommentEndpoint,
    request: PullsCreateReplyForReviewCommentRequestOptions,
    response: OctokitResponse[PullsCreateReplyForReviewCommentResponseData]
  ): ParametersPullsCreateReplyForReviewCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsCreateReplyForReviewCommentEndpoint]
  }
}

