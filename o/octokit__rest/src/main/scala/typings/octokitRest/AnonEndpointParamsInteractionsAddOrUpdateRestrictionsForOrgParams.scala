package typings.octokitRest

import typings.octokitRest.mod.Octokit.Endpoint
import typings.octokitRest.mod.Octokit.EndpointOptions
import typings.octokitRest.mod.Octokit.InteractionsAddOrUpdateRestrictionsForOrgParams
import typings.octokitRest.mod.Octokit.InteractionsAddOrUpdateRestrictionsForOrgResponse
import typings.octokitRest.mod.Octokit.RequestOptions
import typings.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndpointParamsInteractionsAddOrUpdateRestrictionsForOrgParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[InteractionsAddOrUpdateRestrictionsForOrgResponse]] = js.native
  def apply(params: RequestOptions with InteractionsAddOrUpdateRestrictionsForOrgParams): js.Promise[Response[InteractionsAddOrUpdateRestrictionsForOrgResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

