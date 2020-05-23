package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsCreateReviewEndpoint
import typings.octokitTypes.endpointsMod.PullsCreateReviewRequestOptions
import typings.octokitTypes.endpointsMod.PullsCreateReviewResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersPullsCreateReviewEndpoint extends js.Object {
  var parameters: PullsCreateReviewEndpoint
  var request: PullsCreateReviewRequestOptions
  var response: OctokitResponse[PullsCreateReviewResponseData]
}

object ParametersPullsCreateReviewEndpoint {
  @scala.inline
  def apply(
    parameters: PullsCreateReviewEndpoint,
    request: PullsCreateReviewRequestOptions,
    response: OctokitResponse[PullsCreateReviewResponseData]
  ): ParametersPullsCreateReviewEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsCreateReviewEndpoint]
  }
}

