package typings.octokitRest

import typings.octokitRest.mod.Octokit.Endpoint
import typings.octokitRest.mod.Octokit.EndpointOptions
import typings.octokitRest.mod.Octokit.ReposUploadReleaseAssetParams
import typings.octokitRest.mod.Octokit.ReposUploadReleaseAssetParamsDeprecatedFile
import typings.octokitRest.mod.Octokit.ReposUploadReleaseAssetResponse
import typings.octokitRest.mod.Octokit.RequestOptions
import typings.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndpointParamsPromiseReposUploadReleaseAssetParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[ReposUploadReleaseAssetResponse]] = js.native
  def apply(
    params: RequestOptions with ReposUploadReleaseAssetParamsDeprecatedFile with ReposUploadReleaseAssetParams
  ): js.Promise[Response[ReposUploadReleaseAssetResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

