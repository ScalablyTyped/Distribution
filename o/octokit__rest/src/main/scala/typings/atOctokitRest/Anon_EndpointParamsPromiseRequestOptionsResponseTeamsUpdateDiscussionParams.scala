package typings.atOctokitRest

import typings.atOctokitRest.atOctokitRestMod.Endpoint
import typings.atOctokitRest.atOctokitRestMod.EndpointOptions
import typings.atOctokitRest.atOctokitRestMod.RequestOptions
import typings.atOctokitRest.atOctokitRestMod.Response
import typings.atOctokitRest.atOctokitRestMod.TeamsUpdateDiscussionParams
import typings.atOctokitRest.atOctokitRestMod.TeamsUpdateDiscussionResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EndpointParamsPromiseRequestOptionsResponseTeamsUpdateDiscussionParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[TeamsUpdateDiscussionResponse]] = js.native
  def apply(params: RequestOptions with TeamsUpdateDiscussionParams): js.Promise[Response[TeamsUpdateDiscussionResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

