package typings.octokitRest

import typings.octokitRest.mod.Endpoint
import typings.octokitRest.mod.EndpointOptions
import typings.octokitRest.mod.IssuesUpdateMilestoneParams
import typings.octokitRest.mod.IssuesUpdateMilestoneParamsDeprecatedNumber
import typings.octokitRest.mod.IssuesUpdateMilestoneResponse
import typings.octokitRest.mod.RequestOptions
import typings.octokitRest.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndpointParamsIssuesUpdateMilestoneParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[IssuesUpdateMilestoneResponse]] = js.native
  def apply(
    params: RequestOptions with IssuesUpdateMilestoneParamsDeprecatedNumber with IssuesUpdateMilestoneParams
  ): js.Promise[Response[IssuesUpdateMilestoneResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

