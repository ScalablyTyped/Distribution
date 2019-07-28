package typings.atOctokitRest

import typings.atOctokitRest.atOctokitRestMod.Endpoint
import typings.atOctokitRest.atOctokitRestMod.EndpointOptions
import typings.atOctokitRest.atOctokitRestMod.IssuesListEventsForTimelineParams
import typings.atOctokitRest.atOctokitRestMod.IssuesListEventsForTimelineParamsDeprecatedNumber
import typings.atOctokitRest.atOctokitRestMod.IssuesListEventsForTimelineResponse
import typings.atOctokitRest.atOctokitRestMod.RequestOptions
import typings.atOctokitRest.atOctokitRestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EndpointParamsIssuesListEventsForTimelineParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[IssuesListEventsForTimelineResponse]] = js.native
  def apply(params: IssuesListEventsForTimelineParams): js.Promise[Response[IssuesListEventsForTimelineResponse]] = js.native
  def apply(params: IssuesListEventsForTimelineParamsDeprecatedNumber): js.Promise[Response[IssuesListEventsForTimelineResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

