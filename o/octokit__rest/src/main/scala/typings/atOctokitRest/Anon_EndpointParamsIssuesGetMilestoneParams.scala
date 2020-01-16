package typings.atOctokitRest

import typings.atOctokitRest.atOctokitRestMod.Endpoint
import typings.atOctokitRest.atOctokitRestMod.EndpointOptions
import typings.atOctokitRest.atOctokitRestMod.IssuesGetMilestoneParams
import typings.atOctokitRest.atOctokitRestMod.IssuesGetMilestoneParamsDeprecatedNumber
import typings.atOctokitRest.atOctokitRestMod.IssuesGetMilestoneResponse
import typings.atOctokitRest.atOctokitRestMod.RequestOptions
import typings.atOctokitRest.atOctokitRestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EndpointParamsIssuesGetMilestoneParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[IssuesGetMilestoneResponse]] = js.native
  def apply(params: RequestOptions with IssuesGetMilestoneParamsDeprecatedNumber with IssuesGetMilestoneParams): js.Promise[Response[IssuesGetMilestoneResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

