package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsDeleteReviewCommentEndpoint
import typings.octokitTypes.endpointsMod.PullsDeleteReviewCommentRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersPullsDeleteReviewCommentEndpoint extends js.Object {
  var parameters: PullsDeleteReviewCommentEndpoint
  var request: PullsDeleteReviewCommentRequestOptions
  var response: OctokitResponse[_]
}

object ParametersPullsDeleteReviewCommentEndpoint {
  @scala.inline
  def apply(
    parameters: PullsDeleteReviewCommentEndpoint,
    request: PullsDeleteReviewCommentRequestOptions,
    response: OctokitResponse[_]
  ): ParametersPullsDeleteReviewCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsDeleteReviewCommentEndpoint]
  }
}

