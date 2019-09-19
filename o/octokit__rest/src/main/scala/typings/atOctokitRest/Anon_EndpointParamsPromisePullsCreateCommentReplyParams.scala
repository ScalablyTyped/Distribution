package typings.atOctokitRest

import typings.atOctokitRest.atOctokitRestMod.Endpoint
import typings.atOctokitRest.atOctokitRestMod.EndpointOptions
import typings.atOctokitRest.atOctokitRestMod.PullsCreateCommentReplyParams
import typings.atOctokitRest.atOctokitRestMod.PullsCreateCommentReplyParamsDeprecatedInReplyTo
import typings.atOctokitRest.atOctokitRestMod.PullsCreateCommentReplyParamsDeprecatedNumber
import typings.atOctokitRest.atOctokitRestMod.PullsCreateCommentReplyResponse
import typings.atOctokitRest.atOctokitRestMod.RequestOptions
import typings.atOctokitRest.atOctokitRestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EndpointParamsPromisePullsCreateCommentReplyParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[PullsCreateCommentReplyResponse]] = js.native
  def apply(params: PullsCreateCommentReplyParams): js.Promise[Response[PullsCreateCommentReplyResponse]] = js.native
  def apply(params: PullsCreateCommentReplyParamsDeprecatedInReplyTo): js.Promise[Response[PullsCreateCommentReplyResponse]] = js.native
  def apply(params: PullsCreateCommentReplyParamsDeprecatedNumber): js.Promise[Response[PullsCreateCommentReplyResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

