package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.IssuesListEventsEndpoint
import typings.octokitTypes.endpointsMod.IssuesListEventsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesListEventsEndpoint extends js.Object {
  var parameters: IssuesListEventsEndpoint
  var response: OctokitResponse[IssuesListEventsResponseData]
}

object ParametersIssuesListEventsEndpoint {
  @scala.inline
  def apply(parameters: IssuesListEventsEndpoint, response: OctokitResponse[IssuesListEventsResponseData]): ParametersIssuesListEventsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListEventsEndpoint]
  }
}

