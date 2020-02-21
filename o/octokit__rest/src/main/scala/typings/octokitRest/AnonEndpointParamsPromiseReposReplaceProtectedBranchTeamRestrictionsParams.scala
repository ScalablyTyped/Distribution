package typings.octokitRest

import typings.octokitRest.mod.Octokit.Endpoint
import typings.octokitRest.mod.Octokit.EndpointOptions
import typings.octokitRest.mod.Octokit.ReposReplaceProtectedBranchTeamRestrictionsParams
import typings.octokitRest.mod.Octokit.ReposReplaceProtectedBranchTeamRestrictionsResponse
import typings.octokitRest.mod.Octokit.RequestOptions
import typings.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndpointParamsPromiseReposReplaceProtectedBranchTeamRestrictionsParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[ReposReplaceProtectedBranchTeamRestrictionsResponse]] = js.native
  def apply(params: RequestOptions with ReposReplaceProtectedBranchTeamRestrictionsParams): js.Promise[Response[ReposReplaceProtectedBranchTeamRestrictionsResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

