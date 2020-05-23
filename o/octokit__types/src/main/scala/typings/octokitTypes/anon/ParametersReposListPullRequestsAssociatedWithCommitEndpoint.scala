package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListPullRequestsAssociatedWithCommitEndpoint
import typings.octokitTypes.endpointsMod.ReposListPullRequestsAssociatedWithCommitRequestOptions
import typings.octokitTypes.endpointsMod.ReposListPullRequestsAssociatedWithCommitResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposListPullRequestsAssociatedWithCommitEndpoint extends js.Object {
  var parameters: ReposListPullRequestsAssociatedWithCommitEndpoint
  var request: ReposListPullRequestsAssociatedWithCommitRequestOptions
  var response: OctokitResponse[ReposListPullRequestsAssociatedWithCommitResponseData]
}

object ParametersReposListPullRequestsAssociatedWithCommitEndpoint {
  @scala.inline
  def apply(
    parameters: ReposListPullRequestsAssociatedWithCommitEndpoint,
    request: ReposListPullRequestsAssociatedWithCommitRequestOptions,
    response: OctokitResponse[ReposListPullRequestsAssociatedWithCommitResponseData]
  ): ParametersReposListPullRequestsAssociatedWithCommitEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListPullRequestsAssociatedWithCommitEndpoint]
  }
}

