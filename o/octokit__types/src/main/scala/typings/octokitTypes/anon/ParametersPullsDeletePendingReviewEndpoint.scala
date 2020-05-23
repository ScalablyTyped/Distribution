package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsDeletePendingReviewEndpoint
import typings.octokitTypes.endpointsMod.PullsDeletePendingReviewRequestOptions
import typings.octokitTypes.endpointsMod.PullsDeletePendingReviewResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersPullsDeletePendingReviewEndpoint extends js.Object {
  var parameters: PullsDeletePendingReviewEndpoint
  var request: PullsDeletePendingReviewRequestOptions
  var response: OctokitResponse[PullsDeletePendingReviewResponseData]
}

object ParametersPullsDeletePendingReviewEndpoint {
  @scala.inline
  def apply(
    parameters: PullsDeletePendingReviewEndpoint,
    request: PullsDeletePendingReviewRequestOptions,
    response: OctokitResponse[PullsDeletePendingReviewResponseData]
  ): ParametersPullsDeletePendingReviewEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsDeletePendingReviewEndpoint]
  }
}

