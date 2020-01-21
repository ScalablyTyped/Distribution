package typings.octokitRest

import typings.octokitRest.mod.Endpoint
import typings.octokitRest.mod.EndpointOptions
import typings.octokitRest.mod.PullsSubmitReviewParams
import typings.octokitRest.mod.PullsSubmitReviewParamsDeprecatedNumber
import typings.octokitRest.mod.PullsSubmitReviewResponse
import typings.octokitRest.mod.RequestOptions
import typings.octokitRest.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndpointParamsPromisePullsSubmitReviewParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[PullsSubmitReviewResponse]] = js.native
  def apply(params: RequestOptions with PullsSubmitReviewParamsDeprecatedNumber with PullsSubmitReviewParams): js.Promise[Response[PullsSubmitReviewResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

