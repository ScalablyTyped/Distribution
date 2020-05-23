package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesListEventsForTimelineEndpoint
import typings.octokitTypes.endpointsMod.IssuesListEventsForTimelineRequestOptions
import typings.octokitTypes.endpointsMod.IssuesListEventsForTimelineResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesListEventsForTimelineEndpoint extends js.Object {
  var parameters: IssuesListEventsForTimelineEndpoint
  var request: IssuesListEventsForTimelineRequestOptions
  var response: OctokitResponse[IssuesListEventsForTimelineResponseData]
}

object ParametersIssuesListEventsForTimelineEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesListEventsForTimelineEndpoint,
    request: IssuesListEventsForTimelineRequestOptions,
    response: OctokitResponse[IssuesListEventsForTimelineResponseData]
  ): ParametersIssuesListEventsForTimelineEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListEventsForTimelineEndpoint]
  }
}

