package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposUpdatePullRequestReviewProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdatePullRequestReviewProtectionRequestOptions
import typings.octokitTypes.endpointsMod.ReposUpdatePullRequestReviewProtectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposUpdatePullRequestReviewProtectionEndpoint extends js.Object {
  var parameters: ReposUpdatePullRequestReviewProtectionEndpoint
  var request: ReposUpdatePullRequestReviewProtectionRequestOptions
  var response: OctokitResponse[ReposUpdatePullRequestReviewProtectionResponseData]
}

object ParametersReposUpdatePullRequestReviewProtectionEndpoint {
  @scala.inline
  def apply(
    parameters: ReposUpdatePullRequestReviewProtectionEndpoint,
    request: ReposUpdatePullRequestReviewProtectionRequestOptions,
    response: OctokitResponse[ReposUpdatePullRequestReviewProtectionResponseData]
  ): ParametersReposUpdatePullRequestReviewProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposUpdatePullRequestReviewProtectionEndpoint]
  }
}

