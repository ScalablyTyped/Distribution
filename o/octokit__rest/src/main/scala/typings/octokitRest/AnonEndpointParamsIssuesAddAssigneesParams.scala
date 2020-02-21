package typings.octokitRest

import typings.octokitRest.mod.Octokit.Endpoint
import typings.octokitRest.mod.Octokit.EndpointOptions
import typings.octokitRest.mod.Octokit.IssuesAddAssigneesParams
import typings.octokitRest.mod.Octokit.IssuesAddAssigneesParamsDeprecatedNumber
import typings.octokitRest.mod.Octokit.IssuesAddAssigneesResponse
import typings.octokitRest.mod.Octokit.RequestOptions
import typings.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndpointParamsIssuesAddAssigneesParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[IssuesAddAssigneesResponse]] = js.native
  def apply(params: RequestOptions with IssuesAddAssigneesParamsDeprecatedNumber with IssuesAddAssigneesParams): js.Promise[Response[IssuesAddAssigneesResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

