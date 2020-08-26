package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsUpdateEndpoint
import typings.octokitTypes.endpointsMod.OrgsUpdateRequestOptions
import typings.octokitTypes.endpointsMod.OrgsUpdateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersOrgsUpdateEndpoint extends js.Object {
  var parameters: OrgsUpdateEndpoint = js.native
  var request: OrgsUpdateRequestOptions = js.native
  var response: OctokitResponse[OrgsUpdateResponseData] = js.native
}

object ParametersOrgsUpdateEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsUpdateEndpoint,
    request: OrgsUpdateRequestOptions,
    response: OctokitResponse[OrgsUpdateResponseData]
  ): ParametersOrgsUpdateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsUpdateEndpoint]
  }
  @scala.inline
  implicit class ParametersOrgsUpdateEndpointOps[Self <: ParametersOrgsUpdateEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: OrgsUpdateEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: OrgsUpdateRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsUpdateResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

