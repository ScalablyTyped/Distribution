package typings.atOctokitRest

import typings.atOctokitRest.atOctokitRestMod.Endpoint
import typings.atOctokitRest.atOctokitRestMod.EndpointOptions
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsUpdateAuthorizationParams
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsUpdateAuthorizationResponse
import typings.atOctokitRest.atOctokitRestMod.RequestOptions
import typings.atOctokitRest.atOctokitRestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EndpointParamsOauthAuthorizationsUpdateAuthorizationParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[OauthAuthorizationsUpdateAuthorizationResponse]] = js.native
  def apply(params: RequestOptions with OauthAuthorizationsUpdateAuthorizationParams): js.Promise[Response[OauthAuthorizationsUpdateAuthorizationResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

