package typings.atOctokitRest

import typings.atOctokitRest.atOctokitRestMod.Endpoint
import typings.atOctokitRest.atOctokitRestMod.EndpointOptions
import typings.atOctokitRest.atOctokitRestMod.IssuesDeleteMilestoneParams
import typings.atOctokitRest.atOctokitRestMod.IssuesDeleteMilestoneParamsDeprecatedNumber
import typings.atOctokitRest.atOctokitRestMod.IssuesDeleteMilestoneResponse
import typings.atOctokitRest.atOctokitRestMod.RequestOptions
import typings.atOctokitRest.atOctokitRestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EndpointParamsIssuesDeleteMilestoneParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[IssuesDeleteMilestoneResponse]] = js.native
  def apply(params: IssuesDeleteMilestoneParams): js.Promise[Response[IssuesDeleteMilestoneResponse]] = js.native
  def apply(params: IssuesDeleteMilestoneParamsDeprecatedNumber): js.Promise[Response[IssuesDeleteMilestoneResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

