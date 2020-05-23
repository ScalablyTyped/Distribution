package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.IssuesListMilestonesForRepoEndpoint
import typings.octokitTypes.endpointsMod.IssuesListMilestonesForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesListMilestonesForRepoEndpoint extends js.Object {
  var parameters: IssuesListMilestonesForRepoEndpoint
  var response: OctokitResponse[IssuesListMilestonesForRepoResponseData]
}

object ParametersIssuesListMilestonesForRepoEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesListMilestonesForRepoEndpoint,
    response: OctokitResponse[IssuesListMilestonesForRepoResponseData]
  ): ParametersIssuesListMilestonesForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListMilestonesForRepoEndpoint]
  }
}

