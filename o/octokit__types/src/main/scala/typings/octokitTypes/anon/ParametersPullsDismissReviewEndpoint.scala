package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsDismissReviewEndpoint
import typings.octokitTypes.endpointsMod.PullsDismissReviewRequestOptions
import typings.octokitTypes.endpointsMod.PullsDismissReviewResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersPullsDismissReviewEndpoint extends js.Object {
  var parameters: PullsDismissReviewEndpoint
  var request: PullsDismissReviewRequestOptions
  var response: OctokitResponse[PullsDismissReviewResponseData]
}

object ParametersPullsDismissReviewEndpoint {
  @scala.inline
  def apply(
    parameters: PullsDismissReviewEndpoint,
    request: PullsDismissReviewRequestOptions,
    response: OctokitResponse[PullsDismissReviewResponseData]
  ): ParametersPullsDismissReviewEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsDismissReviewEndpoint]
  }
}

