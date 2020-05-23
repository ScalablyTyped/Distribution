package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.PullsListReviewRequestsEndpoint
import typings.octokitTypes.endpointsMod.PullsListReviewRequestsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersPullsListReviewRequestsEndpoint extends js.Object {
  var parameters: PullsListReviewRequestsEndpoint
  var response: OctokitResponse[PullsListReviewRequestsResponseData] with `9`
}

object ParametersPullsListReviewRequestsEndpoint {
  @scala.inline
  def apply(
    parameters: PullsListReviewRequestsEndpoint,
    response: OctokitResponse[PullsListReviewRequestsResponseData] with `9`
  ): ParametersPullsListReviewRequestsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsListReviewRequestsEndpoint]
  }
}

