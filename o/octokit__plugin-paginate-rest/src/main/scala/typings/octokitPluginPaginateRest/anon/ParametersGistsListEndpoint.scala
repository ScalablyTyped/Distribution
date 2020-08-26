package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.GistsListEndpoint
import typings.octokitTypes.endpointsMod.GistsListResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersGistsListEndpoint extends js.Object {
  var parameters: GistsListEndpoint = js.native
  var response: OctokitResponse[GistsListResponseData] = js.native
}

object ParametersGistsListEndpoint {
  @scala.inline
  def apply(parameters: GistsListEndpoint, response: OctokitResponse[GistsListResponseData]): ParametersGistsListEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsListEndpoint]
  }
  @scala.inline
  implicit class ParametersGistsListEndpointOps[Self <: ParametersGistsListEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: GistsListEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[GistsListResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

