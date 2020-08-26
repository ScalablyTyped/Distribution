package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposUploadReleaseAssetEndpoint
import typings.octokitTypes.endpointsMod.ReposUploadReleaseAssetRequestOptions
import typings.octokitTypes.endpointsMod.ReposUploadReleaseAssetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposUploadReleaseAssetEndpoint extends js.Object {
  var parameters: ReposUploadReleaseAssetEndpoint = js.native
  var request: ReposUploadReleaseAssetRequestOptions = js.native
  var response: OctokitResponse[ReposUploadReleaseAssetResponseData] = js.native
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
  @scala.inline
  implicit class ParametersReposUploadReleaseAssetEndpointOps[Self <: ParametersReposUploadReleaseAssetEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParameters(value: ReposUploadReleaseAssetEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposUploadReleaseAssetRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposUploadReleaseAssetResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

