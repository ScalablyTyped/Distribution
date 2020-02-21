package typings.octokitRest

import typings.octokitRest.mod.Octokit.Endpoint
import typings.octokitRest.mod.Octokit.EndpointOptions
import typings.octokitRest.mod.Octokit.IssuesUpdateParams
import typings.octokitRest.mod.Octokit.IssuesUpdateParamsDeprecatedAssignee
import typings.octokitRest.mod.Octokit.IssuesUpdateParamsDeprecatedNumber
import typings.octokitRest.mod.Octokit.IssuesUpdateResponse
import typings.octokitRest.mod.Octokit.RequestOptions
import typings.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndpointParamsIssuesUpdateParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[IssuesUpdateResponse]] = js.native
  def apply(
    params: RequestOptions with IssuesUpdateParamsDeprecatedNumber with IssuesUpdateParamsDeprecatedAssignee with IssuesUpdateParams
  ): js.Promise[Response[IssuesUpdateResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

