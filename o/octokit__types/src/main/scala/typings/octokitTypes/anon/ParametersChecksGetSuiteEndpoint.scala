package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ChecksGetSuiteEndpoint
import typings.octokitTypes.endpointsMod.ChecksGetSuiteRequestOptions
import typings.octokitTypes.endpointsMod.ChecksGetSuiteResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersChecksGetSuiteEndpoint extends js.Object {
  var parameters: ChecksGetSuiteEndpoint = js.native
  var request: ChecksGetSuiteRequestOptions = js.native
  var response: OctokitResponse[ChecksGetSuiteResponseData] = js.native
}

object ParametersChecksGetSuiteEndpoint {
  @scala.inline
  def apply(
    parameters: ChecksGetSuiteEndpoint,
    request: ChecksGetSuiteRequestOptions,
    response: OctokitResponse[ChecksGetSuiteResponseData]
  ): ParametersChecksGetSuiteEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksGetSuiteEndpoint]
  }
  @scala.inline
  implicit class ParametersChecksGetSuiteEndpointOps[Self <: ParametersChecksGetSuiteEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ChecksGetSuiteEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ChecksGetSuiteRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ChecksGetSuiteResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

