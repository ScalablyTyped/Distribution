package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.PullsListCommentsForReviewEndpoint
import typings.octokitTypes.endpointsMod.PullsListCommentsForReviewResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersPullsListCommentsForReviewEndpoint extends js.Object {
  var parameters: PullsListCommentsForReviewEndpoint
  var response: OctokitResponse[PullsListCommentsForReviewResponseData]
}

object ParametersPullsListCommentsForReviewEndpoint {
  @scala.inline
  def apply(
    parameters: PullsListCommentsForReviewEndpoint,
    response: OctokitResponse[PullsListCommentsForReviewResponseData]
  ): ParametersPullsListCommentsForReviewEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsListCommentsForReviewEndpoint]
  }
}

