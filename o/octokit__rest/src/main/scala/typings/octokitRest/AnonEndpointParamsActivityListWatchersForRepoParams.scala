package typings.octokitRest

import typings.octokitRest.mod.Octokit.ActivityListWatchersForRepoParams
import typings.octokitRest.mod.Octokit.ActivityListWatchersForRepoResponse
import typings.octokitRest.mod.Octokit.Endpoint
import typings.octokitRest.mod.Octokit.EndpointOptions
import typings.octokitRest.mod.Octokit.RequestOptions
import typings.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndpointParamsActivityListWatchersForRepoParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[ActivityListWatchersForRepoResponse]] = js.native
  def apply(params: RequestOptions with ActivityListWatchersForRepoParams): js.Promise[Response[ActivityListWatchersForRepoResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

