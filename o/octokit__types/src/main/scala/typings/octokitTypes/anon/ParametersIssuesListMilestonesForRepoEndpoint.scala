package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesListMilestonesForRepoEndpoint
import typings.octokitTypes.endpointsMod.IssuesListMilestonesForRepoRequestOptions
import typings.octokitTypes.endpointsMod.IssuesListMilestonesForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesListMilestonesForRepoEndpoint extends js.Object {
  var parameters: IssuesListMilestonesForRepoEndpoint
  var request: IssuesListMilestonesForRepoRequestOptions
  var response: OctokitResponse[IssuesListMilestonesForRepoResponseData]
}

object ParametersIssuesListMilestonesForRepoEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesListMilestonesForRepoEndpoint,
    request: IssuesListMilestonesForRepoRequestOptions,
    response: OctokitResponse[IssuesListMilestonesForRepoResponseData]
  ): ParametersIssuesListMilestonesForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListMilestonesForRepoEndpoint]
  }
}

