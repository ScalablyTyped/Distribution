package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetDownloadEndpoint
import typings.octokitTypes.endpointsMod.ReposGetDownloadRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetDownloadResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetDownloadEndpoint extends js.Object {
  var parameters: ReposGetDownloadEndpoint
  var request: ReposGetDownloadRequestOptions
  var response: OctokitResponse[ReposGetDownloadResponseData]
}

object ParametersReposGetDownloadEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetDownloadEndpoint,
    request: ReposGetDownloadRequestOptions,
    response: OctokitResponse[ReposGetDownloadResponseData]
  ): ParametersReposGetDownloadEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetDownloadEndpoint]
  }
}

