package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsGetCommentsForReviewEndpoint
import typings.octokitTypes.endpointsMod.PullsGetCommentsForReviewRequestOptions
import typings.octokitTypes.endpointsMod.PullsGetCommentsForReviewResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersPullsGetCommentsForReviewEndpoint extends js.Object {
  var parameters: PullsGetCommentsForReviewEndpoint
  var request: PullsGetCommentsForReviewRequestOptions
  var response: OctokitResponse[PullsGetCommentsForReviewResponseData]
}

object ParametersPullsGetCommentsForReviewEndpoint {
  @scala.inline
  def apply(
    parameters: PullsGetCommentsForReviewEndpoint,
    request: PullsGetCommentsForReviewRequestOptions,
    response: OctokitResponse[PullsGetCommentsForReviewResponseData]
  ): ParametersPullsGetCommentsForReviewEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsGetCommentsForReviewEndpoint]
  }
}

