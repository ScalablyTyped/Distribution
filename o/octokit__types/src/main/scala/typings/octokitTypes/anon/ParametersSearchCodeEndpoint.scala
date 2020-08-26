package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.SearchCodeEndpoint
import typings.octokitTypes.endpointsMod.SearchCodeRequestOptions
import typings.octokitTypes.endpointsMod.SearchCodeResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersSearchCodeEndpoint extends js.Object {
  var parameters: SearchCodeEndpoint = js.native
  var request: SearchCodeRequestOptions = js.native
  var response: OctokitResponse[SearchCodeResponseData] = js.native
}

object ParametersSearchCodeEndpoint {
  @scala.inline
  def apply(
    parameters: SearchCodeEndpoint,
    request: SearchCodeRequestOptions,
    response: OctokitResponse[SearchCodeResponseData]
  ): ParametersSearchCodeEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersSearchCodeEndpoint]
  }
  @scala.inline
  implicit class ParametersSearchCodeEndpointOps[Self <: ParametersSearchCodeEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: SearchCodeEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: SearchCodeRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[SearchCodeResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

