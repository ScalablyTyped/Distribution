package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.CodeScanningGetAlertEndpoint
import typings.octokitTypes.endpointsMod.CodeScanningGetAlertRequestOptions
import typings.octokitTypes.endpointsMod.CodeScanningGetAlertResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersCodeScanningGetAlertEndpoint extends js.Object {
  var parameters: CodeScanningGetAlertEndpoint = js.native
  var request: CodeScanningGetAlertRequestOptions = js.native
  var response: OctokitResponse[CodeScanningGetAlertResponseData] = js.native
}

object ParametersCodeScanningGetAlertEndpoint {
  @scala.inline
  def apply(
    parameters: CodeScanningGetAlertEndpoint,
    request: CodeScanningGetAlertRequestOptions,
    response: OctokitResponse[CodeScanningGetAlertResponseData]
  ): ParametersCodeScanningGetAlertEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersCodeScanningGetAlertEndpoint]
  }
  @scala.inline
  implicit class ParametersCodeScanningGetAlertEndpointOps[Self <: ParametersCodeScanningGetAlertEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: CodeScanningGetAlertEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: CodeScanningGetAlertRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[CodeScanningGetAlertResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

