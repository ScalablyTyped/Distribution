package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeleteDownloadEndpoint
import typings.octokitTypes.endpointsMod.ReposDeleteDownloadRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposDeleteDownloadEndpoint extends js.Object {
  var parameters: ReposDeleteDownloadEndpoint
  var request: ReposDeleteDownloadRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReposDeleteDownloadEndpoint {
  @scala.inline
  def apply(
    parameters: ReposDeleteDownloadEndpoint,
    request: ReposDeleteDownloadRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposDeleteDownloadEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteDownloadEndpoint]
  }
}

