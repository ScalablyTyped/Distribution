package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.PullsListReviewsEndpoint
import typings.octokitTypes.endpointsMod.PullsListReviewsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersPullsListReviewsEndpoint extends js.Object {
  var parameters: PullsListReviewsEndpoint
  var response: OctokitResponse[PullsListReviewsResponseData]
}

object ParametersPullsListReviewsEndpoint {
  @scala.inline
  def apply(parameters: PullsListReviewsEndpoint, response: OctokitResponse[PullsListReviewsResponseData]): ParametersPullsListReviewsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsListReviewsEndpoint]
  }
}

