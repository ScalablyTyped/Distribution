package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesListEventsForRepoEndpoint
import typings.octokitTypes.endpointsMod.IssuesListEventsForRepoRequestOptions
import typings.octokitTypes.endpointsMod.IssuesListEventsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesListEventsForRepoEndpoint extends js.Object {
  var parameters: IssuesListEventsForRepoEndpoint
  var request: IssuesListEventsForRepoRequestOptions
  var response: OctokitResponse[IssuesListEventsForRepoResponseData]
}

object ParametersIssuesListEventsForRepoEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesListEventsForRepoEndpoint,
    request: IssuesListEventsForRepoRequestOptions,
    response: OctokitResponse[IssuesListEventsForRepoResponseData]
  ): ParametersIssuesListEventsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListEventsForRepoEndpoint]
  }
}

