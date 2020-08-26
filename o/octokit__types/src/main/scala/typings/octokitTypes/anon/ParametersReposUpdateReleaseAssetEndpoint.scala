package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposUpdateReleaseAssetEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdateReleaseAssetRequestOptions
import typings.octokitTypes.endpointsMod.ReposUpdateReleaseAssetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposUpdateReleaseAssetEndpoint extends js.Object {
  var parameters: ReposUpdateReleaseAssetEndpoint = js.native
  var request: ReposUpdateReleaseAssetRequestOptions = js.native
  var response: OctokitResponse[ReposUpdateReleaseAssetResponseData] = js.native
}

object ParametersReposUpdateReleaseAssetEndpoint {
  @scala.inline
  def apply(
    parameters: ReposUpdateReleaseAssetEndpoint,
    request: ReposUpdateReleaseAssetRequestOptions,
    response: OctokitResponse[ReposUpdateReleaseAssetResponseData]
  ): ParametersReposUpdateReleaseAssetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposUpdateReleaseAssetEndpoint]
  }
  @scala.inline
  implicit class ParametersReposUpdateReleaseAssetEndpointOps[Self <: ParametersReposUpdateReleaseAssetEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposUpdateReleaseAssetEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposUpdateReleaseAssetRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposUpdateReleaseAssetResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

