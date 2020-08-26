package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ChecksCreateSuiteEndpoint
import typings.octokitTypes.endpointsMod.ChecksCreateSuiteRequestOptions
import typings.octokitTypes.endpointsMod.ChecksCreateSuiteResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersChecksCreateSuiteEndpoint extends js.Object {
  var parameters: ChecksCreateSuiteEndpoint = js.native
  var request: ChecksCreateSuiteRequestOptions = js.native
  var response: OctokitResponse[ChecksCreateSuiteResponseData] = js.native
}

object ParametersChecksCreateSuiteEndpoint {
  @scala.inline
  def apply(
    parameters: ChecksCreateSuiteEndpoint,
    request: ChecksCreateSuiteRequestOptions,
    response: OctokitResponse[ChecksCreateSuiteResponseData]
  ): ParametersChecksCreateSuiteEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksCreateSuiteEndpoint]
  }
  @scala.inline
  implicit class ParametersChecksCreateSuiteEndpointOps[Self <: ParametersChecksCreateSuiteEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ChecksCreateSuiteEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ChecksCreateSuiteRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ChecksCreateSuiteResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

