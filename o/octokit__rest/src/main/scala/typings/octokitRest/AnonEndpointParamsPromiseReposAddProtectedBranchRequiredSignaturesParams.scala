package typings.octokitRest

import typings.octokitRest.mod.Octokit.Endpoint
import typings.octokitRest.mod.Octokit.EndpointOptions
import typings.octokitRest.mod.Octokit.ReposAddProtectedBranchRequiredSignaturesParams
import typings.octokitRest.mod.Octokit.ReposAddProtectedBranchRequiredSignaturesResponse
import typings.octokitRest.mod.Octokit.RequestOptions
import typings.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndpointParamsPromiseReposAddProtectedBranchRequiredSignaturesParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[ReposAddProtectedBranchRequiredSignaturesResponse]] = js.native
  def apply(params: RequestOptions with ReposAddProtectedBranchRequiredSignaturesParams): js.Promise[Response[ReposAddProtectedBranchRequiredSignaturesResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

