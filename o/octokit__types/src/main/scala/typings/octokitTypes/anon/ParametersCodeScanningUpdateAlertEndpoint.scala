package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.CodeScanningUpdateAlertEndpoint
import typings.octokitTypes.endpointsMod.CodeScanningUpdateAlertRequestOptions
import typings.octokitTypes.endpointsMod.CodeScanningUpdateAlertResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersCodeScanningUpdateAlertEndpoint extends js.Object {
  
  var parameters: CodeScanningUpdateAlertEndpoint = js.native
  
  var request: CodeScanningUpdateAlertRequestOptions = js.native
  
  var response: OctokitResponse[CodeScanningUpdateAlertResponseData] = js.native
}
object ParametersCodeScanningUpdateAlertEndpoint {
  
  @scala.inline
  def apply(
    parameters: CodeScanningUpdateAlertEndpoint,
    request: CodeScanningUpdateAlertRequestOptions,
    response: OctokitResponse[CodeScanningUpdateAlertResponseData]
  ): ParametersCodeScanningUpdateAlertEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersCodeScanningUpdateAlertEndpoint]
  }
  
  @scala.inline
  implicit class ParametersCodeScanningUpdateAlertEndpointOps[Self <: ParametersCodeScanningUpdateAlertEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: CodeScanningUpdateAlertEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: CodeScanningUpdateAlertRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[CodeScanningUpdateAlertResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
