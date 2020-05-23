package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposRemoveProtectedBranchPullRequestReviewEnforcementEndpoint
import typings.octokitTypes.endpointsMod.ReposRemoveProtectedBranchPullRequestReviewEnforcementRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposRemoveProtectedBranchPullRequestReviewEnforcementEndpoint extends js.Object {
  var parameters: ReposRemoveProtectedBranchPullRequestReviewEnforcementEndpoint
  var request: ReposRemoveProtectedBranchPullRequestReviewEnforcementRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReposRemoveProtectedBranchPullRequestReviewEnforcementEndpoint {
  @scala.inline
  def apply(
    parameters: ReposRemoveProtectedBranchPullRequestReviewEnforcementEndpoint,
    request: ReposRemoveProtectedBranchPullRequestReviewEnforcementRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposRemoveProtectedBranchPullRequestReviewEnforcementEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposRemoveProtectedBranchPullRequestReviewEnforcementEndpoint]
  }
}

