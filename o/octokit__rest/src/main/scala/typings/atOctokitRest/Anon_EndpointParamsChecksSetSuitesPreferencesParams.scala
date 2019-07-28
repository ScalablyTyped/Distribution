package typings.atOctokitRest

import typings.atOctokitRest.atOctokitRestMod.ChecksSetSuitesPreferencesParams
import typings.atOctokitRest.atOctokitRestMod.ChecksSetSuitesPreferencesResponse
import typings.atOctokitRest.atOctokitRestMod.Endpoint
import typings.atOctokitRest.atOctokitRestMod.EndpointOptions
import typings.atOctokitRest.atOctokitRestMod.RequestOptions
import typings.atOctokitRest.atOctokitRestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EndpointParamsChecksSetSuitesPreferencesParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[ChecksSetSuitesPreferencesResponse]] = js.native
  def apply(params: ChecksSetSuitesPreferencesParams): js.Promise[Response[ChecksSetSuitesPreferencesResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

