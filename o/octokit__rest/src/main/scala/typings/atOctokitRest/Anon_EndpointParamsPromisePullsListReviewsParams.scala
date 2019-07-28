package typings.atOctokitRest

import typings.atOctokitRest.atOctokitRestMod.Endpoint
import typings.atOctokitRest.atOctokitRestMod.EndpointOptions
import typings.atOctokitRest.atOctokitRestMod.PullsListReviewsParams
import typings.atOctokitRest.atOctokitRestMod.PullsListReviewsParamsDeprecatedNumber
import typings.atOctokitRest.atOctokitRestMod.PullsListReviewsResponse
import typings.atOctokitRest.atOctokitRestMod.RequestOptions
import typings.atOctokitRest.atOctokitRestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EndpointParamsPromisePullsListReviewsParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[PullsListReviewsResponse]] = js.native
  def apply(params: PullsListReviewsParams): js.Promise[Response[PullsListReviewsResponse]] = js.native
  def apply(params: PullsListReviewsParamsDeprecatedNumber): js.Promise[Response[PullsListReviewsResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

