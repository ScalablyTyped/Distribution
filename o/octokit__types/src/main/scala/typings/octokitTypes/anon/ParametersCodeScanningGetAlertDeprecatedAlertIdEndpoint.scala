package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.CodeScanningGetAlertDeprecatedAlertIdEndpoint
import typings.octokitTypes.endpointsMod.CodeScanningGetAlertRequestOptions
import typings.octokitTypes.endpointsMod.CodeScanningGetAlertResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersCodeScanningGetAlertDeprecatedAlertIdEndpoint extends js.Object {
  
  var parameters: CodeScanningGetAlertDeprecatedAlertIdEndpoint = js.native
  
  var request: CodeScanningGetAlertRequestOptions = js.native
  
  var response: OctokitResponse[CodeScanningGetAlertResponseData] = js.native
}
object ParametersCodeScanningGetAlertDeprecatedAlertIdEndpoint {
  
  @scala.inline
  def apply(
    parameters: CodeScanningGetAlertDeprecatedAlertIdEndpoint,
    request: CodeScanningGetAlertRequestOptions,
    response: OctokitResponse[CodeScanningGetAlertResponseData]
  ): ParametersCodeScanningGetAlertDeprecatedAlertIdEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersCodeScanningGetAlertDeprecatedAlertIdEndpoint]
  }
  
  @scala.inline
  implicit class ParametersCodeScanningGetAlertDeprecatedAlertIdEndpointOps[Self <: ParametersCodeScanningGetAlertDeprecatedAlertIdEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: CodeScanningGetAlertDeprecatedAlertIdEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: CodeScanningGetAlertRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[CodeScanningGetAlertResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
