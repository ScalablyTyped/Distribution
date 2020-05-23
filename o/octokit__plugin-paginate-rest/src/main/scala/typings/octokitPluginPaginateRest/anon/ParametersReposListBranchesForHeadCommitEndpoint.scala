package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListBranchesForHeadCommitEndpoint
import typings.octokitTypes.endpointsMod.ReposListBranchesForHeadCommitResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposListBranchesForHeadCommitEndpoint extends js.Object {
  var parameters: ReposListBranchesForHeadCommitEndpoint
  var response: OctokitResponse[ReposListBranchesForHeadCommitResponseData]
}

object ParametersReposListBranchesForHeadCommitEndpoint {
  @scala.inline
  def apply(
    parameters: ReposListBranchesForHeadCommitEndpoint,
    response: OctokitResponse[ReposListBranchesForHeadCommitResponseData]
  ): ParametersReposListBranchesForHeadCommitEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListBranchesForHeadCommitEndpoint]
  }
}

