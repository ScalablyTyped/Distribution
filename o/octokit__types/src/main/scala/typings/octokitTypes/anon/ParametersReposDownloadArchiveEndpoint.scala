package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDownloadArchiveEndpoint
import typings.octokitTypes.endpointsMod.ReposDownloadArchiveRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposDownloadArchiveEndpoint extends js.Object {
  var parameters: ReposDownloadArchiveEndpoint
  var request: ReposDownloadArchiveRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReposDownloadArchiveEndpoint {
  @scala.inline
  def apply(
    parameters: ReposDownloadArchiveEndpoint,
    request: ReposDownloadArchiveRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposDownloadArchiveEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDownloadArchiveEndpoint]
  }
}

