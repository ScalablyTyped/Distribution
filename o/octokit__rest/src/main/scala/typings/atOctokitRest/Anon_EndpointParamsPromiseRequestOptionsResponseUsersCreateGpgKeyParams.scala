package typings.atOctokitRest

import typings.atOctokitRest.atOctokitRestMod.Endpoint
import typings.atOctokitRest.atOctokitRestMod.EndpointOptions
import typings.atOctokitRest.atOctokitRestMod.RequestOptions
import typings.atOctokitRest.atOctokitRestMod.Response
import typings.atOctokitRest.atOctokitRestMod.UsersCreateGpgKeyParams
import typings.atOctokitRest.atOctokitRestMod.UsersCreateGpgKeyResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EndpointParamsPromiseRequestOptionsResponseUsersCreateGpgKeyParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[UsersCreateGpgKeyResponse]] = js.native
  def apply(params: RequestOptions with UsersCreateGpgKeyParams): js.Promise[Response[UsersCreateGpgKeyResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

