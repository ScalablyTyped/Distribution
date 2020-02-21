package typings.octokitRest

import typings.octokitRest.mod.Octokit.Endpoint
import typings.octokitRest.mod.Octokit.EndpointOptions
import typings.octokitRest.mod.Octokit.IssuesListEventsForTimelineParams
import typings.octokitRest.mod.Octokit.IssuesListEventsForTimelineParamsDeprecatedNumber
import typings.octokitRest.mod.Octokit.IssuesListEventsForTimelineResponse
import typings.octokitRest.mod.Octokit.RequestOptions
import typings.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndpointParamsIssuesListEventsForTimelineParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[IssuesListEventsForTimelineResponse]] = js.native
  def apply(
    params: RequestOptions with IssuesListEventsForTimelineParamsDeprecatedNumber with IssuesListEventsForTimelineParams
  ): js.Promise[Response[IssuesListEventsForTimelineResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

