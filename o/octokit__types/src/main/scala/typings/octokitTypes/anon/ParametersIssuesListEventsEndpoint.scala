package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesListEventsEndpoint
import typings.octokitTypes.endpointsMod.IssuesListEventsRequestOptions
import typings.octokitTypes.endpointsMod.IssuesListEventsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesListEventsEndpoint extends js.Object {
  var parameters: IssuesListEventsEndpoint
  var request: IssuesListEventsRequestOptions
  var response: OctokitResponse[IssuesListEventsResponseData]
}

object ParametersIssuesListEventsEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesListEventsEndpoint,
    request: IssuesListEventsRequestOptions,
    response: OctokitResponse[IssuesListEventsResponseData]
  ): ParametersIssuesListEventsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListEventsEndpoint]
  }
}

