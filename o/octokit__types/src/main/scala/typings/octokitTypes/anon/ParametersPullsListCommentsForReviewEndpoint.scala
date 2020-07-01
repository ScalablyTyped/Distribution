package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsListCommentsForReviewEndpoint
import typings.octokitTypes.endpointsMod.PullsListCommentsForReviewRequestOptions
import typings.octokitTypes.endpointsMod.PullsListCommentsForReviewResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersPullsListCommentsForReviewEndpoint extends js.Object {
  var parameters: PullsListCommentsForReviewEndpoint
  var request: PullsListCommentsForReviewRequestOptions
  var response: OctokitResponse[PullsListCommentsForReviewResponseData]
}

object ParametersPullsListCommentsForReviewEndpoint {
  @scala.inline
  def apply(
    parameters: PullsListCommentsForReviewEndpoint,
    request: PullsListCommentsForReviewRequestOptions,
    response: OctokitResponse[PullsListCommentsForReviewResponseData]
  ): ParametersPullsListCommentsForReviewEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsListCommentsForReviewEndpoint]
  }
}

