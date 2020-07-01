package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.PullsListRequestedReviewersEndpoint
import typings.octokitTypes.endpointsMod.PullsListRequestedReviewersResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersPullsListRequestedReviewersEndpoint extends js.Object {
  var parameters: PullsListRequestedReviewersEndpoint
  var response: OctokitResponse[PullsListRequestedReviewersResponseData] with `11`
}

object ParametersPullsListRequestedReviewersEndpoint {
  @scala.inline
  def apply(
    parameters: PullsListRequestedReviewersEndpoint,
    response: OctokitResponse[PullsListRequestedReviewersResponseData] with `11`
  ): ParametersPullsListRequestedReviewersEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsListRequestedReviewersEndpoint]
  }
}

