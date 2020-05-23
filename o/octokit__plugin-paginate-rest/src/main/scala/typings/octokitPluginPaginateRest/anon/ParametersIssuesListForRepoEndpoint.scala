package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.IssuesListForRepoEndpoint
import typings.octokitTypes.endpointsMod.IssuesListForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesListForRepoEndpoint extends js.Object {
  var parameters: IssuesListForRepoEndpoint
  var response: OctokitResponse[IssuesListForRepoResponseData]
}

object ParametersIssuesListForRepoEndpoint {
  @scala.inline
  def apply(parameters: IssuesListForRepoEndpoint, response: OctokitResponse[IssuesListForRepoResponseData]): ParametersIssuesListForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListForRepoEndpoint]
  }
}

