package typings.octokitRest

import typings.octokitRest.mod.Endpoint
import typings.octokitRest.mod.EndpointOptions
import typings.octokitRest.mod.RequestOptions
import typings.octokitRest.mod.Response
import typings.octokitRest.mod.UsersGetByUsernameParams
import typings.octokitRest.mod.UsersGetByUsernameResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndpointParamsPromiseRequestOptionsResponseUsersGetByUsernameParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[UsersGetByUsernameResponse]] = js.native
  def apply(params: RequestOptions with UsersGetByUsernameParams): js.Promise[Response[UsersGetByUsernameResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

