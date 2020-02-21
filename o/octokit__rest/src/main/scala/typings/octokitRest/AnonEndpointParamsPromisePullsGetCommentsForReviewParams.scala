package typings.octokitRest

import typings.octokitRest.mod.Octokit.Endpoint
import typings.octokitRest.mod.Octokit.EndpointOptions
import typings.octokitRest.mod.Octokit.PullsGetCommentsForReviewParams
import typings.octokitRest.mod.Octokit.PullsGetCommentsForReviewParamsDeprecatedNumber
import typings.octokitRest.mod.Octokit.PullsGetCommentsForReviewResponse
import typings.octokitRest.mod.Octokit.RequestOptions
import typings.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndpointParamsPromisePullsGetCommentsForReviewParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[PullsGetCommentsForReviewResponse]] = js.native
  def apply(
    params: RequestOptions with PullsGetCommentsForReviewParamsDeprecatedNumber with PullsGetCommentsForReviewParams
  ): js.Promise[Response[PullsGetCommentsForReviewResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

