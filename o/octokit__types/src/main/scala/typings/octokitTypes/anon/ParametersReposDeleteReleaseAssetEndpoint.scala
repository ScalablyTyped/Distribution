package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeleteReleaseAssetEndpoint
import typings.octokitTypes.endpointsMod.ReposDeleteReleaseAssetRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposDeleteReleaseAssetEndpoint extends js.Object {
  var parameters: ReposDeleteReleaseAssetEndpoint = js.native
  var request: ReposDeleteReleaseAssetRequestOptions = js.native
  var response: OctokitResponse[_] = js.native
}

object ParametersReposDeleteReleaseAssetEndpoint {
  @scala.inline
  def apply(
    parameters: ReposDeleteReleaseAssetEndpoint,
    request: ReposDeleteReleaseAssetRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposDeleteReleaseAssetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteReleaseAssetEndpoint]
  }
  @scala.inline
  implicit class ParametersReposDeleteReleaseAssetEndpointOps[Self <: ParametersReposDeleteReleaseAssetEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposDeleteReleaseAssetEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposDeleteReleaseAssetRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

