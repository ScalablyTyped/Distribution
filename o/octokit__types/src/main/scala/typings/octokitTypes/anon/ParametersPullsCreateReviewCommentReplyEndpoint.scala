package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsCreateReviewCommentReplyEndpoint
import typings.octokitTypes.endpointsMod.PullsCreateReviewCommentReplyRequestOptions
import typings.octokitTypes.endpointsMod.PullsCreateReviewCommentReplyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersPullsCreateReviewCommentReplyEndpoint extends js.Object {
  var parameters: PullsCreateReviewCommentReplyEndpoint
  var request: PullsCreateReviewCommentReplyRequestOptions
  var response: OctokitResponse[PullsCreateReviewCommentReplyResponseData]
}

object ParametersPullsCreateReviewCommentReplyEndpoint {
  @scala.inline
  def apply(
    parameters: PullsCreateReviewCommentReplyEndpoint,
    request: PullsCreateReviewCommentReplyRequestOptions,
    response: OctokitResponse[PullsCreateReviewCommentReplyResponseData]
  ): ParametersPullsCreateReviewCommentReplyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsCreateReviewCommentReplyEndpoint]
  }
}

