package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.PullsListReviewCommentsForRepoEndpoint
import typings.octokitTypes.endpointsMod.PullsListReviewCommentsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersPullsListReviewCommentsForRepoEndpoint extends js.Object {
  var parameters: PullsListReviewCommentsForRepoEndpoint
  var response: OctokitResponse[PullsListReviewCommentsForRepoResponseData]
}

object ParametersPullsListReviewCommentsForRepoEndpoint {
  @scala.inline
  def apply(
    parameters: PullsListReviewCommentsForRepoEndpoint,
    response: OctokitResponse[PullsListReviewCommentsForRepoResponseData]
  ): ParametersPullsListReviewCommentsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsListReviewCommentsForRepoEndpoint]
  }
}

