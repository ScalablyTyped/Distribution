package typings.atOctokitRest

import typings.atOctokitRest.atOctokitRestMod.Endpoint
import typings.atOctokitRest.atOctokitRestMod.EndpointOptions
import typings.atOctokitRest.atOctokitRestMod.PullsUpdateReviewParams
import typings.atOctokitRest.atOctokitRestMod.PullsUpdateReviewParamsDeprecatedNumber
import typings.atOctokitRest.atOctokitRestMod.PullsUpdateReviewResponse
import typings.atOctokitRest.atOctokitRestMod.RequestOptions
import typings.atOctokitRest.atOctokitRestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EndpointParamsPromisePullsUpdateReviewParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[PullsUpdateReviewResponse]] = js.native
  def apply(params: RequestOptions with PullsUpdateReviewParamsDeprecatedNumber with PullsUpdateReviewParams): js.Promise[Response[PullsUpdateReviewResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

