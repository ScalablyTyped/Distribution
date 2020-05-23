package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsUpdateReviewEndpoint
import typings.octokitTypes.endpointsMod.PullsUpdateReviewRequestOptions
import typings.octokitTypes.endpointsMod.PullsUpdateReviewResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersPullsUpdateReviewEndpoint extends js.Object {
  var parameters: PullsUpdateReviewEndpoint
  var request: PullsUpdateReviewRequestOptions
  var response: OctokitResponse[PullsUpdateReviewResponseData]
}

object ParametersPullsUpdateReviewEndpoint {
  @scala.inline
  def apply(
    parameters: PullsUpdateReviewEndpoint,
    request: PullsUpdateReviewRequestOptions,
    response: OctokitResponse[PullsUpdateReviewResponseData]
  ): ParametersPullsUpdateReviewEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsUpdateReviewEndpoint]
  }
}

