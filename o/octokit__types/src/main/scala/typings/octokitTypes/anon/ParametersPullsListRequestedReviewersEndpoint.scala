package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsListRequestedReviewersEndpoint
import typings.octokitTypes.endpointsMod.PullsListRequestedReviewersRequestOptions
import typings.octokitTypes.endpointsMod.PullsListRequestedReviewersResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersPullsListRequestedReviewersEndpoint extends js.Object {
  var parameters: PullsListRequestedReviewersEndpoint
  var request: PullsListRequestedReviewersRequestOptions
  var response: OctokitResponse[PullsListRequestedReviewersResponseData]
}

object ParametersPullsListRequestedReviewersEndpoint {
  @scala.inline
  def apply(
    parameters: PullsListRequestedReviewersEndpoint,
    request: PullsListRequestedReviewersRequestOptions,
    response: OctokitResponse[PullsListRequestedReviewersResponseData]
  ): ParametersPullsListRequestedReviewersEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsListRequestedReviewersEndpoint]
  }
}

