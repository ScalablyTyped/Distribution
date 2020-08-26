package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsListPublicEndpoint
import typings.octokitTypes.endpointsMod.GistsListPublicRequestOptions
import typings.octokitTypes.endpointsMod.GistsListPublicResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersGistsListPublicEndpoint extends js.Object {
  var parameters: GistsListPublicEndpoint = js.native
  var request: GistsListPublicRequestOptions = js.native
  var response: OctokitResponse[GistsListPublicResponseData] = js.native
}

object ParametersGistsListPublicEndpoint {
  @scala.inline
  def apply(
    parameters: GistsListPublicEndpoint,
    request: GistsListPublicRequestOptions,
    response: OctokitResponse[GistsListPublicResponseData]
  ): ParametersGistsListPublicEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsListPublicEndpoint]
  }
  @scala.inline
  implicit class ParametersGistsListPublicEndpointOps[Self <: ParametersGistsListPublicEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: GistsListPublicEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: GistsListPublicRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[GistsListPublicResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

