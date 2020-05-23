package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListCommitCommentsEndpoint
import typings.octokitTypes.endpointsMod.ReposListCommitCommentsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposListCommitCommentsEndpoint extends js.Object {
  var parameters: ReposListCommitCommentsEndpoint
  var response: OctokitResponse[ReposListCommitCommentsResponseData]
}

object ParametersReposListCommitCommentsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposListCommitCommentsEndpoint,
    response: OctokitResponse[ReposListCommitCommentsResponseData]
  ): ParametersReposListCommitCommentsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListCommitCommentsEndpoint]
  }
}

