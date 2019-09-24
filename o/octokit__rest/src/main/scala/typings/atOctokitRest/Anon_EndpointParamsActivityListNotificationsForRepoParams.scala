package typings.atOctokitRest

import typings.atOctokitRest.atOctokitRestMod.ActivityListNotificationsForRepoParams
import typings.atOctokitRest.atOctokitRestMod.ActivityListNotificationsForRepoResponse
import typings.atOctokitRest.atOctokitRestMod.Endpoint
import typings.atOctokitRest.atOctokitRestMod.EndpointOptions
import typings.atOctokitRest.atOctokitRestMod.RequestOptions
import typings.atOctokitRest.atOctokitRestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EndpointParamsActivityListNotificationsForRepoParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[ActivityListNotificationsForRepoResponse]] = js.native
  def apply(params: RequestOptions with ActivityListNotificationsForRepoParams): js.Promise[Response[ActivityListNotificationsForRepoResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

