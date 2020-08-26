package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsListForksEndpoint
import typings.octokitTypes.endpointsMod.GistsListForksRequestOptions
import typings.octokitTypes.endpointsMod.GistsListForksResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersGistsListForksEndpoint extends js.Object {
  var parameters: GistsListForksEndpoint = js.native
  var request: GistsListForksRequestOptions = js.native
  var response: OctokitResponse[GistsListForksResponseData] = js.native
}

object ParametersGistsListForksEndpoint {
  @scala.inline
  def apply(
    parameters: GistsListForksEndpoint,
    request: GistsListForksRequestOptions,
    response: OctokitResponse[GistsListForksResponseData]
  ): ParametersGistsListForksEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsListForksEndpoint]
  }
  @scala.inline
  implicit class ParametersGistsListForksEndpointOps[Self <: ParametersGistsListForksEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: GistsListForksEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: GistsListForksRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[GistsListForksResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

