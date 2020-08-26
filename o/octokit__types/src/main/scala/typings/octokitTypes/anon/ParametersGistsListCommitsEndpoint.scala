package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsListCommitsEndpoint
import typings.octokitTypes.endpointsMod.GistsListCommitsRequestOptions
import typings.octokitTypes.endpointsMod.GistsListCommitsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersGistsListCommitsEndpoint extends js.Object {
  var parameters: GistsListCommitsEndpoint = js.native
  var request: GistsListCommitsRequestOptions = js.native
  var response: OctokitResponse[GistsListCommitsResponseData] = js.native
}

object ParametersGistsListCommitsEndpoint {
  @scala.inline
  def apply(
    parameters: GistsListCommitsEndpoint,
    request: GistsListCommitsRequestOptions,
    response: OctokitResponse[GistsListCommitsResponseData]
  ): ParametersGistsListCommitsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsListCommitsEndpoint]
  }
  @scala.inline
  implicit class ParametersGistsListCommitsEndpointOps[Self <: ParametersGistsListCommitsEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: GistsListCommitsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: GistsListCommitsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[GistsListCommitsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

