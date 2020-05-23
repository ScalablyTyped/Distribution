package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.IssuesListEventsForRepoEndpoint
import typings.octokitTypes.endpointsMod.IssuesListEventsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesListEventsForRepoEndpoint extends js.Object {
  var parameters: IssuesListEventsForRepoEndpoint
  var response: OctokitResponse[IssuesListEventsForRepoResponseData]
}

object ParametersIssuesListEventsForRepoEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesListEventsForRepoEndpoint,
    response: OctokitResponse[IssuesListEventsForRepoResponseData]
  ): ParametersIssuesListEventsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListEventsForRepoEndpoint]
  }
}

