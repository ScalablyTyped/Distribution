package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.RateLimitGetEndpoint
import typings.octokitTypes.endpointsMod.RateLimitGetRequestOptions
import typings.octokitTypes.endpointsMod.RateLimitGetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersRateLimitGetEndpoint extends js.Object {
  var parameters: RateLimitGetEndpoint = js.native
  var request: RateLimitGetRequestOptions = js.native
  var response: OctokitResponse[RateLimitGetResponseData] = js.native
}

object ParametersRateLimitGetEndpoint {
  @scala.inline
  def apply(
    parameters: RateLimitGetEndpoint,
    request: RateLimitGetRequestOptions,
    response: OctokitResponse[RateLimitGetResponseData]
  ): ParametersRateLimitGetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersRateLimitGetEndpoint]
  }
  @scala.inline
  implicit class ParametersRateLimitGetEndpointOps[Self <: ParametersRateLimitGetEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: RateLimitGetEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: RateLimitGetRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[RateLimitGetResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

