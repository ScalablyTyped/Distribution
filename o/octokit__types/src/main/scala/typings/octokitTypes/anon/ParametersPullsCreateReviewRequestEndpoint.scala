package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsCreateReviewRequestEndpoint
import typings.octokitTypes.endpointsMod.PullsCreateReviewRequestRequestOptions
import typings.octokitTypes.endpointsMod.PullsCreateReviewRequestResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersPullsCreateReviewRequestEndpoint extends js.Object {
  var parameters: PullsCreateReviewRequestEndpoint
  var request: PullsCreateReviewRequestRequestOptions
  var response: OctokitResponse[PullsCreateReviewRequestResponseData]
}

object ParametersPullsCreateReviewRequestEndpoint {
  @scala.inline
  def apply(
    parameters: PullsCreateReviewRequestEndpoint,
    request: PullsCreateReviewRequestRequestOptions,
    response: OctokitResponse[PullsCreateReviewRequestResponseData]
  ): ParametersPullsCreateReviewRequestEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsCreateReviewRequestEndpoint]
  }
}

