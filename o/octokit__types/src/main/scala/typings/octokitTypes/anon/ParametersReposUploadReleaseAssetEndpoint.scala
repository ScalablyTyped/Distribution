package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposUploadReleaseAssetEndpoint
import typings.octokitTypes.endpointsMod.ReposUploadReleaseAssetRequestOptions
import typings.octokitTypes.endpointsMod.ReposUploadReleaseAssetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposUploadReleaseAssetEndpoint extends js.Object {
  var parameters: ReposUploadReleaseAssetEndpoint
  var request: ReposUploadReleaseAssetRequestOptions
  var response: OctokitResponse[ReposUploadReleaseAssetResponseData]
}

object ParametersReposUploadReleaseAssetEndpoint {
  @scala.inline
  def apply(
    parameters: ReposUploadReleaseAssetEndpoint,
    request: ReposUploadReleaseAssetRequestOptions,
    response: OctokitResponse[ReposUploadReleaseAssetResponseData]
  ): ParametersReposUploadReleaseAssetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposUploadReleaseAssetEndpoint]
  }
}

