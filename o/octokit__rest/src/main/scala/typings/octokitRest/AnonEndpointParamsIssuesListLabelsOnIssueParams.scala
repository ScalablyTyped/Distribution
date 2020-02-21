package typings.octokitRest

import typings.octokitRest.mod.Octokit.Endpoint
import typings.octokitRest.mod.Octokit.EndpointOptions
import typings.octokitRest.mod.Octokit.IssuesListLabelsOnIssueParams
import typings.octokitRest.mod.Octokit.IssuesListLabelsOnIssueParamsDeprecatedNumber
import typings.octokitRest.mod.Octokit.IssuesListLabelsOnIssueResponse
import typings.octokitRest.mod.Octokit.RequestOptions
import typings.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndpointParamsIssuesListLabelsOnIssueParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[IssuesListLabelsOnIssueResponse]] = js.native
  def apply(
    params: RequestOptions with IssuesListLabelsOnIssueParamsDeprecatedNumber with IssuesListLabelsOnIssueParams
  ): js.Promise[Response[IssuesListLabelsOnIssueResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

