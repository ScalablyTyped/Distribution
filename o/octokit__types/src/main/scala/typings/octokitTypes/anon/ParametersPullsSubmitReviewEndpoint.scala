package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsSubmitReviewEndpoint
import typings.octokitTypes.endpointsMod.PullsSubmitReviewRequestOptions
import typings.octokitTypes.endpointsMod.PullsSubmitReviewResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersPullsSubmitReviewEndpoint extends js.Object {
  var parameters: PullsSubmitReviewEndpoint
  var request: PullsSubmitReviewRequestOptions
  var response: OctokitResponse[PullsSubmitReviewResponseData]
}

object ParametersPullsSubmitReviewEndpoint {
  @scala.inline
  def apply(
    parameters: PullsSubmitReviewEndpoint,
    request: PullsSubmitReviewRequestOptions,
    response: OctokitResponse[PullsSubmitReviewResponseData]
  ): ParametersPullsSubmitReviewEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsSubmitReviewEndpoint]
  }
}

