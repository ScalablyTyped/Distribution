package typings.atOctokitRest

import typings.atOctokitRest.atOctokitRestMod.Endpoint
import typings.atOctokitRest.atOctokitRestMod.EndpointOptions
import typings.atOctokitRest.atOctokitRestMod.IssuesRemoveLabelsParams
import typings.atOctokitRest.atOctokitRestMod.IssuesRemoveLabelsParamsDeprecatedNumber
import typings.atOctokitRest.atOctokitRestMod.IssuesRemoveLabelsResponse
import typings.atOctokitRest.atOctokitRestMod.RequestOptions
import typings.atOctokitRest.atOctokitRestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EndpointParamsIssuesRemoveLabelsParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[IssuesRemoveLabelsResponse]] = js.native
  def apply(params: IssuesRemoveLabelsParams): js.Promise[Response[IssuesRemoveLabelsResponse]] = js.native
  def apply(params: IssuesRemoveLabelsParamsDeprecatedNumber): js.Promise[Response[IssuesRemoveLabelsResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

