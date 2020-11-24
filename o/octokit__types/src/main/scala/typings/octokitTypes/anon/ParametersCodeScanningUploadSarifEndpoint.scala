package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.CodeScanningUploadSarifEndpoint
import typings.octokitTypes.endpointsMod.CodeScanningUploadSarifRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersCodeScanningUploadSarifEndpoint extends js.Object {
  
  var parameters: CodeScanningUploadSarifEndpoint = js.native
  
  var request: CodeScanningUploadSarifRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersCodeScanningUploadSarifEndpoint {
  
  @scala.inline
  def apply(
    parameters: CodeScanningUploadSarifEndpoint,
    request: CodeScanningUploadSarifRequestOptions,
    response: OctokitResponse[_]
  ): ParametersCodeScanningUploadSarifEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersCodeScanningUploadSarifEndpoint]
  }
  
  @scala.inline
  implicit class ParametersCodeScanningUploadSarifEndpointOps[Self <: ParametersCodeScanningUploadSarifEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: CodeScanningUploadSarifEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: CodeScanningUploadSarifRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
