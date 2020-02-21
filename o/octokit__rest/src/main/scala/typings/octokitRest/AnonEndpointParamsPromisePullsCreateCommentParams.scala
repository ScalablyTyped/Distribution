package typings.octokitRest

import typings.octokitRest.mod.Octokit.Endpoint
import typings.octokitRest.mod.Octokit.EndpointOptions
import typings.octokitRest.mod.Octokit.PullsCreateCommentParams
import typings.octokitRest.mod.Octokit.PullsCreateCommentParamsDeprecatedInReplyTo
import typings.octokitRest.mod.Octokit.PullsCreateCommentParamsDeprecatedNumber
import typings.octokitRest.mod.Octokit.PullsCreateCommentResponse
import typings.octokitRest.mod.Octokit.RequestOptions
import typings.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndpointParamsPromisePullsCreateCommentParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[PullsCreateCommentResponse]] = js.native
  def apply(
    params: RequestOptions with PullsCreateCommentParamsDeprecatedNumber with PullsCreateCommentParamsDeprecatedInReplyTo with PullsCreateCommentParams
  ): js.Promise[Response[PullsCreateCommentResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

