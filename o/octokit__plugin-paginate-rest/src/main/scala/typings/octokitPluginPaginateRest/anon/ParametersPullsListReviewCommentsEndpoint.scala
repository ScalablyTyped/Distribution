package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.PullsListReviewCommentsEndpoint
import typings.octokitTypes.endpointsMod.PullsListReviewCommentsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersPullsListReviewCommentsEndpoint extends js.Object {
  var parameters: PullsListReviewCommentsEndpoint
  var response: OctokitResponse[PullsListReviewCommentsResponseData]
}

object ParametersPullsListReviewCommentsEndpoint {
  @scala.inline
  def apply(
    parameters: PullsListReviewCommentsEndpoint,
    response: OctokitResponse[PullsListReviewCommentsResponseData]
  ): ParametersPullsListReviewCommentsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsListReviewCommentsEndpoint]
  }
}

