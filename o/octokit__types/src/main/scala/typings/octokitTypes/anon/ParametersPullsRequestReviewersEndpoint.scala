package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsRequestReviewersEndpoint
import typings.octokitTypes.endpointsMod.PullsRequestReviewersRequestOptions
import typings.octokitTypes.endpointsMod.PullsRequestReviewersResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersPullsRequestReviewersEndpoint extends js.Object {
  var parameters: PullsRequestReviewersEndpoint
  var request: PullsRequestReviewersRequestOptions
  var response: OctokitResponse[PullsRequestReviewersResponseData]
}

object ParametersPullsRequestReviewersEndpoint {
  @scala.inline
  def apply(
    parameters: PullsRequestReviewersEndpoint,
    request: PullsRequestReviewersRequestOptions,
    response: OctokitResponse[PullsRequestReviewersResponseData]
  ): ParametersPullsRequestReviewersEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsRequestReviewersEndpoint]
  }
}

