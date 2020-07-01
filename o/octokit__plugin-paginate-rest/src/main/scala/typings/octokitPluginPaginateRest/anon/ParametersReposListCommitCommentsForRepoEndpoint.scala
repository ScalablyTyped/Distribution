package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListCommitCommentsForRepoEndpoint
import typings.octokitTypes.endpointsMod.ReposListCommitCommentsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposListCommitCommentsForRepoEndpoint extends js.Object {
  var parameters: ReposListCommitCommentsForRepoEndpoint
  var response: OctokitResponse[ReposListCommitCommentsForRepoResponseData]
}

object ParametersReposListCommitCommentsForRepoEndpoint {
  @scala.inline
  def apply(
    parameters: ReposListCommitCommentsForRepoEndpoint,
    response: OctokitResponse[ReposListCommitCommentsForRepoResponseData]
  ): ParametersReposListCommitCommentsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListCommitCommentsForRepoEndpoint]
  }
}

