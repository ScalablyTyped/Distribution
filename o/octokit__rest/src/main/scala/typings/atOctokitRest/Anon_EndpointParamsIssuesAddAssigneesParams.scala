package typings.atOctokitRest

import typings.atOctokitRest.atOctokitRestMod.Endpoint
import typings.atOctokitRest.atOctokitRestMod.EndpointOptions
import typings.atOctokitRest.atOctokitRestMod.IssuesAddAssigneesParams
import typings.atOctokitRest.atOctokitRestMod.IssuesAddAssigneesParamsDeprecatedNumber
import typings.atOctokitRest.atOctokitRestMod.IssuesAddAssigneesResponse
import typings.atOctokitRest.atOctokitRestMod.RequestOptions
import typings.atOctokitRest.atOctokitRestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EndpointParamsIssuesAddAssigneesParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[IssuesAddAssigneesResponse]] = js.native
  def apply(params: IssuesAddAssigneesParams): js.Promise[Response[IssuesAddAssigneesResponse]] = js.native
  def apply(params: IssuesAddAssigneesParamsDeprecatedNumber): js.Promise[Response[IssuesAddAssigneesResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

