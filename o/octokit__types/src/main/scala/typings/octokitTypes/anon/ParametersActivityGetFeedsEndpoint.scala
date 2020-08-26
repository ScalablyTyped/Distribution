package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityGetFeedsEndpoint
import typings.octokitTypes.endpointsMod.ActivityGetFeedsRequestOptions
import typings.octokitTypes.endpointsMod.ActivityGetFeedsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersActivityGetFeedsEndpoint extends js.Object {
  var parameters: ActivityGetFeedsEndpoint = js.native
  var request: ActivityGetFeedsRequestOptions = js.native
  var response: OctokitResponse[ActivityGetFeedsResponseData] = js.native
}

object ParametersActivityGetFeedsEndpoint {
  @scala.inline
  def apply(
    parameters: ActivityGetFeedsEndpoint,
    request: ActivityGetFeedsRequestOptions,
    response: OctokitResponse[ActivityGetFeedsResponseData]
  ): ParametersActivityGetFeedsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityGetFeedsEndpoint]
  }
  @scala.inline
  implicit class ParametersActivityGetFeedsEndpointOps[Self <: ParametersActivityGetFeedsEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ActivityGetFeedsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ActivityGetFeedsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ActivityGetFeedsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

