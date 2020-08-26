package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ChecksListSuitesForRefEndpoint
import typings.octokitTypes.endpointsMod.ChecksListSuitesForRefRequestOptions
import typings.octokitTypes.endpointsMod.ChecksListSuitesForRefResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersChecksListSuitesForRefEndpoint extends js.Object {
  var parameters: ChecksListSuitesForRefEndpoint = js.native
  var request: ChecksListSuitesForRefRequestOptions = js.native
  var response: OctokitResponse[ChecksListSuitesForRefResponseData] = js.native
}

object ParametersChecksListSuitesForRefEndpoint {
  @scala.inline
  def apply(
    parameters: ChecksListSuitesForRefEndpoint,
    request: ChecksListSuitesForRefRequestOptions,
    response: OctokitResponse[ChecksListSuitesForRefResponseData]
  ): ParametersChecksListSuitesForRefEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksListSuitesForRefEndpoint]
  }
  @scala.inline
  implicit class ParametersChecksListSuitesForRefEndpointOps[Self <: ParametersChecksListSuitesForRefEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ChecksListSuitesForRefEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ChecksListSuitesForRefRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ChecksListSuitesForRefResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

