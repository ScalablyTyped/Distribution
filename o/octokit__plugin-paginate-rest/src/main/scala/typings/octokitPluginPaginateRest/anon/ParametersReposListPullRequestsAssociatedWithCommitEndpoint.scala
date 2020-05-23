package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListPullRequestsAssociatedWithCommitEndpoint
import typings.octokitTypes.endpointsMod.ReposListPullRequestsAssociatedWithCommitResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposListPullRequestsAssociatedWithCommitEndpoint extends js.Object {
  var parameters: ReposListPullRequestsAssociatedWithCommitEndpoint
  var response: OctokitResponse[ReposListPullRequestsAssociatedWithCommitResponseData]
}

object ParametersReposListPullRequestsAssociatedWithCommitEndpoint {
  @scala.inline
  def apply(
    parameters: ReposListPullRequestsAssociatedWithCommitEndpoint,
    response: OctokitResponse[ReposListPullRequestsAssociatedWithCommitResponseData]
  ): ParametersReposListPullRequestsAssociatedWithCommitEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListPullRequestsAssociatedWithCommitEndpoint]
  }
}

