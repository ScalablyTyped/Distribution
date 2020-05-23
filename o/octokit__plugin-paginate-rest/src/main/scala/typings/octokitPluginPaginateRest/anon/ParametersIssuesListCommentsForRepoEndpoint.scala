package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.IssuesListCommentsForRepoEndpoint
import typings.octokitTypes.endpointsMod.IssuesListCommentsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesListCommentsForRepoEndpoint extends js.Object {
  var parameters: IssuesListCommentsForRepoEndpoint
  var response: OctokitResponse[IssuesListCommentsForRepoResponseData]
}

object ParametersIssuesListCommentsForRepoEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesListCommentsForRepoEndpoint,
    response: OctokitResponse[IssuesListCommentsForRepoResponseData]
  ): ParametersIssuesListCommentsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListCommentsForRepoEndpoint]
  }
}

