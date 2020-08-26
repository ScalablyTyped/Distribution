package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsUpdateEndpoint
import typings.octokitTypes.endpointsMod.GistsUpdateRequestOptions
import typings.octokitTypes.endpointsMod.GistsUpdateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersGistsUpdateEndpoint extends js.Object {
  var parameters: GistsUpdateEndpoint = js.native
  var request: GistsUpdateRequestOptions = js.native
  var response: OctokitResponse[GistsUpdateResponseData] = js.native
}

object ParametersGistsUpdateEndpoint {
  @scala.inline
  def apply(
    parameters: GistsUpdateEndpoint,
    request: GistsUpdateRequestOptions,
    response: OctokitResponse[GistsUpdateResponseData]
  ): ParametersGistsUpdateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsUpdateEndpoint]
  }
  @scala.inline
  implicit class ParametersGistsUpdateEndpointOps[Self <: ParametersGistsUpdateEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: GistsUpdateEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: GistsUpdateRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[GistsUpdateResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

