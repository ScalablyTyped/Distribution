package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetReleaseAssetEndpoint
import typings.octokitTypes.endpointsMod.ReposGetReleaseAssetRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetReleaseAssetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposGetReleaseAssetEndpoint extends js.Object {
  var parameters: ReposGetReleaseAssetEndpoint = js.native
  var request: ReposGetReleaseAssetRequestOptions = js.native
  var response: OctokitResponse[ReposGetReleaseAssetResponseData] = js.native
}

object ParametersReposGetReleaseAssetEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetReleaseAssetEndpoint,
    request: ReposGetReleaseAssetRequestOptions,
    response: OctokitResponse[ReposGetReleaseAssetResponseData]
  ): ParametersReposGetReleaseAssetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetReleaseAssetEndpoint]
  }
  @scala.inline
  implicit class ParametersReposGetReleaseAssetEndpointOps[Self <: ParametersReposGetReleaseAssetEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposGetReleaseAssetEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposGetReleaseAssetRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetReleaseAssetResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

