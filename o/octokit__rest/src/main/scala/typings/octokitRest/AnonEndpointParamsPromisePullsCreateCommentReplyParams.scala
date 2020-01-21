package typings.octokitRest

import typings.octokitRest.mod.Endpoint
import typings.octokitRest.mod.EndpointOptions
import typings.octokitRest.mod.PullsCreateCommentReplyParams
import typings.octokitRest.mod.PullsCreateCommentReplyParamsDeprecatedInReplyTo
import typings.octokitRest.mod.PullsCreateCommentReplyParamsDeprecatedNumber
import typings.octokitRest.mod.PullsCreateCommentReplyResponse
import typings.octokitRest.mod.RequestOptions
import typings.octokitRest.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndpointParamsPromisePullsCreateCommentReplyParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[PullsCreateCommentReplyResponse]] = js.native
  def apply(
    params: RequestOptions with PullsCreateCommentReplyParamsDeprecatedNumber with PullsCreateCommentReplyParamsDeprecatedInReplyTo with PullsCreateCommentReplyParams
  ): js.Promise[Response[PullsCreateCommentReplyResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

