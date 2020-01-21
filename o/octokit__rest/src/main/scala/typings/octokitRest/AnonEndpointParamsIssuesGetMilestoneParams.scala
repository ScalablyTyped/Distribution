package typings.octokitRest

import typings.octokitRest.mod.Endpoint
import typings.octokitRest.mod.EndpointOptions
import typings.octokitRest.mod.IssuesGetMilestoneParams
import typings.octokitRest.mod.IssuesGetMilestoneParamsDeprecatedNumber
import typings.octokitRest.mod.IssuesGetMilestoneResponse
import typings.octokitRest.mod.RequestOptions
import typings.octokitRest.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndpointParamsIssuesGetMilestoneParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[IssuesGetMilestoneResponse]] = js.native
  def apply(params: RequestOptions with IssuesGetMilestoneParamsDeprecatedNumber with IssuesGetMilestoneParams): js.Promise[Response[IssuesGetMilestoneResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

