package typings.octokitRest

import typings.octokitRest.mod.Octokit.Endpoint
import typings.octokitRest.mod.Octokit.EndpointOptions
import typings.octokitRest.mod.Octokit.OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintParams
import typings.octokitRest.mod.Octokit.OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintResponse
import typings.octokitRest.mod.Octokit.RequestOptions
import typings.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndpointParamsOauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[
    Response[OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintResponse]
  ] = js.native
  def apply(params: RequestOptions with OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintParams): js.Promise[
    Response[OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintResponse]
  ] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

