package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.SearchTopicsEndpoint
import typings.octokitTypes.endpointsMod.SearchTopicsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersSearchTopicsEndpoint extends js.Object {
  var parameters: SearchTopicsEndpoint = js.native
  var response: OctokitResponse[SearchTopicsResponseData] with `18` = js.native
}

object ParametersSearchTopicsEndpoint {
  @scala.inline
  def apply(parameters: SearchTopicsEndpoint, response: OctokitResponse[SearchTopicsResponseData] with `18`): ParametersSearchTopicsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersSearchTopicsEndpoint]
  }
  @scala.inline
  implicit class ParametersSearchTopicsEndpointOps[Self <: ParametersSearchTopicsEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: SearchTopicsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[SearchTopicsResponseData] with `18`): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

