package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsListReviewCommentsForRepoEndpoint
import typings.octokitTypes.endpointsMod.PullsListReviewCommentsForRepoRequestOptions
import typings.octokitTypes.endpointsMod.PullsListReviewCommentsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersPullsListReviewCommentsForRepoEndpoint extends js.Object {
  var parameters: PullsListReviewCommentsForRepoEndpoint
  var request: PullsListReviewCommentsForRepoRequestOptions
  var response: OctokitResponse[PullsListReviewCommentsForRepoResponseData]
}

object ParametersPullsListReviewCommentsForRepoEndpoint {
  @scala.inline
  def apply(
    parameters: PullsListReviewCommentsForRepoEndpoint,
    request: PullsListReviewCommentsForRepoRequestOptions,
    response: OctokitResponse[PullsListReviewCommentsForRepoResponseData]
  ): ParametersPullsListReviewCommentsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsListReviewCommentsForRepoEndpoint]
  }
}

