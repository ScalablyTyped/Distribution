package typings.octokitRest

import typings.octokitRest.mod.Octokit.Endpoint
import typings.octokitRest.mod.Octokit.EndpointOptions
import typings.octokitRest.mod.Octokit.ReposCreateCommitCommentParams
import typings.octokitRest.mod.Octokit.ReposCreateCommitCommentParamsDeprecatedLine
import typings.octokitRest.mod.Octokit.ReposCreateCommitCommentParamsDeprecatedSha
import typings.octokitRest.mod.Octokit.ReposCreateCommitCommentResponse
import typings.octokitRest.mod.Octokit.RequestOptions
import typings.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndpointParamsPromiseReposCreateCommitCommentParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[ReposCreateCommitCommentResponse]] = js.native
  def apply(
    params: RequestOptions with ReposCreateCommitCommentParamsDeprecatedSha with ReposCreateCommitCommentParamsDeprecatedLine with ReposCreateCommitCommentParams
  ): js.Promise[Response[ReposCreateCommitCommentResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

