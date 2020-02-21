package typings.octokitRest

import typings.octokitRest.mod.Octokit.Endpoint
import typings.octokitRest.mod.Octokit.EndpointOptions
import typings.octokitRest.mod.Octokit.IssuesAddLabelsParams
import typings.octokitRest.mod.Octokit.IssuesAddLabelsParamsDeprecatedNumber
import typings.octokitRest.mod.Octokit.IssuesAddLabelsResponse
import typings.octokitRest.mod.Octokit.RequestOptions
import typings.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndpointParamsIssuesAddLabelsParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[IssuesAddLabelsResponse]] = js.native
  def apply(params: RequestOptions with IssuesAddLabelsParamsDeprecatedNumber with IssuesAddLabelsParams): js.Promise[Response[IssuesAddLabelsResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

