package typings.atOctokitRest

import typings.atOctokitRest.atOctokitRestMod.Endpoint
import typings.atOctokitRest.atOctokitRestMod.EndpointOptions
import typings.atOctokitRest.atOctokitRestMod.IssuesLockParams
import typings.atOctokitRest.atOctokitRestMod.IssuesLockParamsDeprecatedNumber
import typings.atOctokitRest.atOctokitRestMod.IssuesLockResponse
import typings.atOctokitRest.atOctokitRestMod.RequestOptions
import typings.atOctokitRest.atOctokitRestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EndpointParamsIssuesLockParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[IssuesLockResponse]] = js.native
  def apply(params: IssuesLockParams): js.Promise[Response[IssuesLockResponse]] = js.native
  def apply(params: IssuesLockParamsDeprecatedNumber): js.Promise[Response[IssuesLockResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

