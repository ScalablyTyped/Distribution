package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.SearchCommitsEndpoint
import typings.octokitTypes.endpointsMod.SearchCommitsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersSearchCommitsEndpoint extends js.Object {
  var parameters: SearchCommitsEndpoint = js.native
  var response: OctokitResponse[SearchCommitsResponseData] with `14` = js.native
}

object ParametersSearchCommitsEndpoint {
  @scala.inline
  def apply(parameters: SearchCommitsEndpoint, response: OctokitResponse[SearchCommitsResponseData] with `14`): ParametersSearchCommitsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersSearchCommitsEndpoint]
  }
  @scala.inline
  implicit class ParametersSearchCommitsEndpointOps[Self <: ParametersSearchCommitsEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: SearchCommitsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[SearchCommitsResponseData] with `14`): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

