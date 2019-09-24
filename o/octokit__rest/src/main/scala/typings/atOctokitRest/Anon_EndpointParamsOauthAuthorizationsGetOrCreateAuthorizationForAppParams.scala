package typings.atOctokitRest

import typings.atOctokitRest.atOctokitRestMod.Endpoint
import typings.atOctokitRest.atOctokitRestMod.EndpointOptions
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsGetOrCreateAuthorizationForAppParams
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsGetOrCreateAuthorizationForAppResponse
import typings.atOctokitRest.atOctokitRestMod.RequestOptions
import typings.atOctokitRest.atOctokitRestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EndpointParamsOauthAuthorizationsGetOrCreateAuthorizationForAppParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[OauthAuthorizationsGetOrCreateAuthorizationForAppResponse]] = js.native
  def apply(params: RequestOptions with OauthAuthorizationsGetOrCreateAuthorizationForAppParams): js.Promise[Response[OauthAuthorizationsGetOrCreateAuthorizationForAppResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

