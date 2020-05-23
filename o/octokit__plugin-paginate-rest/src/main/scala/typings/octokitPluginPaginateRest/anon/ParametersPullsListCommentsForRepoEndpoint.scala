package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.PullsListCommentsForRepoEndpoint
import typings.octokitTypes.endpointsMod.PullsListCommentsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersPullsListCommentsForRepoEndpoint extends js.Object {
  var parameters: PullsListCommentsForRepoEndpoint
  var response: OctokitResponse[PullsListCommentsForRepoResponseData]
}

object ParametersPullsListCommentsForRepoEndpoint {
  @scala.inline
  def apply(
    parameters: PullsListCommentsForRepoEndpoint,
    response: OctokitResponse[PullsListCommentsForRepoResponseData]
  ): ParametersPullsListCommentsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsListCommentsForRepoEndpoint]
  }
}

