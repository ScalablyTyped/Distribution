package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposUpdateProtectedBranchPullRequestReviewEnforcementEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdateProtectedBranchPullRequestReviewEnforcementRequestOptions
import typings.octokitTypes.endpointsMod.ReposUpdateProtectedBranchPullRequestReviewEnforcementResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposUpdateProtectedBranchPullRequestReviewEnforcementEndpoint extends js.Object {
  var parameters: ReposUpdateProtectedBranchPullRequestReviewEnforcementEndpoint
  var request: ReposUpdateProtectedBranchPullRequestReviewEnforcementRequestOptions
  var response: OctokitResponse[ReposUpdateProtectedBranchPullRequestReviewEnforcementResponseData]
}

object ParametersReposUpdateProtectedBranchPullRequestReviewEnforcementEndpoint {
  @scala.inline
  def apply(
    parameters: ReposUpdateProtectedBranchPullRequestReviewEnforcementEndpoint,
    request: ReposUpdateProtectedBranchPullRequestReviewEnforcementRequestOptions,
    response: OctokitResponse[ReposUpdateProtectedBranchPullRequestReviewEnforcementResponseData]
  ): ParametersReposUpdateProtectedBranchPullRequestReviewEnforcementEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposUpdateProtectedBranchPullRequestReviewEnforcementEndpoint]
  }
}

