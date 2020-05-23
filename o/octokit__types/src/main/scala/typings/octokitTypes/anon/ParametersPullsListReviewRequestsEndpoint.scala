package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsListReviewRequestsEndpoint
import typings.octokitTypes.endpointsMod.PullsListReviewRequestsRequestOptions
import typings.octokitTypes.endpointsMod.PullsListReviewRequestsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersPullsListReviewRequestsEndpoint extends js.Object {
  var parameters: PullsListReviewRequestsEndpoint
  var request: PullsListReviewRequestsRequestOptions
  var response: OctokitResponse[PullsListReviewRequestsResponseData]
}

object ParametersPullsListReviewRequestsEndpoint {
  @scala.inline
  def apply(
    parameters: PullsListReviewRequestsEndpoint,
    request: PullsListReviewRequestsRequestOptions,
    response: OctokitResponse[PullsListReviewRequestsResponseData]
  ): ParametersPullsListReviewRequestsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsListReviewRequestsEndpoint]
  }
}

