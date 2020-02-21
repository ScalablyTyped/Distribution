package typings.octokitRest

import typings.octokitRest.mod.Octokit.Endpoint
import typings.octokitRest.mod.Octokit.EndpointOptions
import typings.octokitRest.mod.Octokit.RequestOptions
import typings.octokitRest.mod.Octokit.Response
import typings.octokitRest.mod.Octokit.TeamsUpdateDiscussionCommentInOrgParams
import typings.octokitRest.mod.Octokit.TeamsUpdateDiscussionCommentInOrgResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndpointParamsPromiseRequestOptionsResponseTeamsUpdateDiscussionCommentInOrgParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[TeamsUpdateDiscussionCommentInOrgResponse]] = js.native
  def apply(params: RequestOptions with TeamsUpdateDiscussionCommentInOrgParams): js.Promise[Response[TeamsUpdateDiscussionCommentInOrgResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

