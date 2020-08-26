package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsGetEndpoint
import typings.octokitTypes.endpointsMod.OrgsGetRequestOptions
import typings.octokitTypes.endpointsMod.OrgsGetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersOrgsGetEndpoint extends js.Object {
  var parameters: OrgsGetEndpoint = js.native
  var request: OrgsGetRequestOptions = js.native
  var response: OctokitResponse[OrgsGetResponseData] = js.native
}

object ParametersOrgsGetEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsGetEndpoint,
    request: OrgsGetRequestOptions,
    response: OctokitResponse[OrgsGetResponseData]
  ): ParametersOrgsGetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsGetEndpoint]
  }
  @scala.inline
  implicit class ParametersOrgsGetEndpointOps[Self <: ParametersOrgsGetEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: OrgsGetEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: OrgsGetRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsGetResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

