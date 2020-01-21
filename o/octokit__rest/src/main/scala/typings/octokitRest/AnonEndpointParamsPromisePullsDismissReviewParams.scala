package typings.octokitRest

import typings.octokitRest.mod.Endpoint
import typings.octokitRest.mod.EndpointOptions
import typings.octokitRest.mod.PullsDismissReviewParams
import typings.octokitRest.mod.PullsDismissReviewParamsDeprecatedNumber
import typings.octokitRest.mod.PullsDismissReviewResponse
import typings.octokitRest.mod.RequestOptions
import typings.octokitRest.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndpointParamsPromisePullsDismissReviewParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[PullsDismissReviewResponse]] = js.native
  def apply(params: RequestOptions with PullsDismissReviewParamsDeprecatedNumber with PullsDismissReviewParams): js.Promise[Response[PullsDismissReviewResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

