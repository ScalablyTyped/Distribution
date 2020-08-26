package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsCreateEndpoint
import typings.octokitTypes.endpointsMod.GistsCreateRequestOptions
import typings.octokitTypes.endpointsMod.GistsCreateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersGistsCreateEndpoint extends js.Object {
  var parameters: GistsCreateEndpoint = js.native
  var request: GistsCreateRequestOptions = js.native
  var response: OctokitResponse[GistsCreateResponseData] = js.native
}

object ParametersGistsCreateEndpoint {
  @scala.inline
  def apply(
    parameters: GistsCreateEndpoint,
    request: GistsCreateRequestOptions,
    response: OctokitResponse[GistsCreateResponseData]
  ): ParametersGistsCreateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsCreateEndpoint]
  }
  @scala.inline
  implicit class ParametersGistsCreateEndpointOps[Self <: ParametersGistsCreateEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: GistsCreateEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: GistsCreateRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[GistsCreateResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

