package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeletePullRequestReviewProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposDeletePullRequestReviewProtectionRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposDeletePullRequestReviewProtectionEndpoint extends js.Object {
  var parameters: ReposDeletePullRequestReviewProtectionEndpoint
  var request: ReposDeletePullRequestReviewProtectionRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReposDeletePullRequestReviewProtectionEndpoint {
  @scala.inline
  def apply(
    parameters: ReposDeletePullRequestReviewProtectionEndpoint,
    request: ReposDeletePullRequestReviewProtectionRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposDeletePullRequestReviewProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeletePullRequestReviewProtectionEndpoint]
  }
}

