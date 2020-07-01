package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetPullRequestReviewProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposGetPullRequestReviewProtectionRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetPullRequestReviewProtectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetPullRequestReviewProtectionEndpoint extends js.Object {
  var parameters: ReposGetPullRequestReviewProtectionEndpoint
  var request: ReposGetPullRequestReviewProtectionRequestOptions
  var response: OctokitResponse[ReposGetPullRequestReviewProtectionResponseData]
}

object ParametersReposGetPullRequestReviewProtectionEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetPullRequestReviewProtectionEndpoint,
    request: ReposGetPullRequestReviewProtectionRequestOptions,
    response: OctokitResponse[ReposGetPullRequestReviewProtectionResponseData]
  ): ParametersReposGetPullRequestReviewProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetPullRequestReviewProtectionEndpoint]
  }
}

