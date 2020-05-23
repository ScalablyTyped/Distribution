package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsGetReviewEndpoint
import typings.octokitTypes.endpointsMod.PullsGetReviewRequestOptions
import typings.octokitTypes.endpointsMod.PullsGetReviewResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersPullsGetReviewEndpoint extends js.Object {
  var parameters: PullsGetReviewEndpoint
  var request: PullsGetReviewRequestOptions
  var response: OctokitResponse[PullsGetReviewResponseData]
}

object ParametersPullsGetReviewEndpoint {
  @scala.inline
  def apply(
    parameters: PullsGetReviewEndpoint,
    request: PullsGetReviewRequestOptions,
    response: OctokitResponse[PullsGetReviewResponseData]
  ): ParametersPullsGetReviewEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsGetReviewEndpoint]
  }
}

