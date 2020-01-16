package typings.atOctokitRest

import typings.atOctokitRest.atOctokitRestMod.Endpoint
import typings.atOctokitRest.atOctokitRestMod.EndpointOptions
import typings.atOctokitRest.atOctokitRestMod.ReposGetCommitParams
import typings.atOctokitRest.atOctokitRestMod.ReposGetCommitParamsDeprecatedCommitSha
import typings.atOctokitRest.atOctokitRestMod.ReposGetCommitParamsDeprecatedSha
import typings.atOctokitRest.atOctokitRestMod.ReposGetCommitResponse
import typings.atOctokitRest.atOctokitRestMod.RequestOptions
import typings.atOctokitRest.atOctokitRestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EndpointParamsPromiseReposGetCommitParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[ReposGetCommitResponse]] = js.native
  def apply(
    params: RequestOptions with ReposGetCommitParamsDeprecatedSha with ReposGetCommitParamsDeprecatedCommitSha with ReposGetCommitParams
  ): js.Promise[Response[ReposGetCommitResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

