package typings.atOctokitRest

import typings.atOctokitRest.atOctokitRestMod.Endpoint
import typings.atOctokitRest.atOctokitRestMod.EndpointOptions
import typings.atOctokitRest.atOctokitRestMod.PullsListFilesParams
import typings.atOctokitRest.atOctokitRestMod.PullsListFilesParamsDeprecatedNumber
import typings.atOctokitRest.atOctokitRestMod.PullsListFilesResponse
import typings.atOctokitRest.atOctokitRestMod.RequestOptions
import typings.atOctokitRest.atOctokitRestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EndpointParamsPromisePullsListFilesParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[PullsListFilesResponse]] = js.native
  def apply(params: PullsListFilesParams): js.Promise[Response[PullsListFilesResponse]] = js.native
  def apply(params: PullsListFilesParamsDeprecatedNumber): js.Promise[Response[PullsListFilesResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

