package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetProtectedBranchPullRequestReviewEnforcementEndpoint
import typings.octokitTypes.endpointsMod.ReposGetProtectedBranchPullRequestReviewEnforcementRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetProtectedBranchPullRequestReviewEnforcementResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetProtectedBranchPullRequestReviewEnforcementEndpoint extends js.Object {
  var parameters: ReposGetProtectedBranchPullRequestReviewEnforcementEndpoint
  var request: ReposGetProtectedBranchPullRequestReviewEnforcementRequestOptions
  var response: OctokitResponse[ReposGetProtectedBranchPullRequestReviewEnforcementResponseData]
}

object ParametersReposGetProtectedBranchPullRequestReviewEnforcementEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetProtectedBranchPullRequestReviewEnforcementEndpoint,
    request: ReposGetProtectedBranchPullRequestReviewEnforcementRequestOptions,
    response: OctokitResponse[ReposGetProtectedBranchPullRequestReviewEnforcementResponseData]
  ): ParametersReposGetProtectedBranchPullRequestReviewEnforcementEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetProtectedBranchPullRequestReviewEnforcementEndpoint]
  }
}

