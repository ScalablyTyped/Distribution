package typings.octokitRest

import typings.octokitRest.mod.Octokit.ChecksSetSuitesPreferencesParams
import typings.octokitRest.mod.Octokit.ChecksSetSuitesPreferencesResponse
import typings.octokitRest.mod.Octokit.Endpoint
import typings.octokitRest.mod.Octokit.EndpointOptions
import typings.octokitRest.mod.Octokit.RequestOptions
import typings.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndpointParamsChecksSetSuitesPreferencesParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[ChecksSetSuitesPreferencesResponse]] = js.native
  def apply(params: RequestOptions with ChecksSetSuitesPreferencesParams): js.Promise[Response[ChecksSetSuitesPreferencesResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

