package typings.octokitRest

import typings.octokitRest.mod.Endpoint
import typings.octokitRest.mod.EndpointOptions
import typings.octokitRest.mod.ReposReplaceProtectedBranchRequiredStatusChecksContextsParams
import typings.octokitRest.mod.ReposReplaceProtectedBranchRequiredStatusChecksContextsResponse
import typings.octokitRest.mod.RequestOptions
import typings.octokitRest.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndpointParamsPromiseReposReplaceProtectedBranchRequiredStatusChecksContextsParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[ReposReplaceProtectedBranchRequiredStatusChecksContextsResponse]] = js.native
  def apply(params: RequestOptions with ReposReplaceProtectedBranchRequiredStatusChecksContextsParams): js.Promise[Response[ReposReplaceProtectedBranchRequiredStatusChecksContextsResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

