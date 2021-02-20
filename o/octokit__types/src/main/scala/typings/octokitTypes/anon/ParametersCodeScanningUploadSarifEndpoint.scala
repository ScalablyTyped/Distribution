package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.CodeScanningUploadSarifEndpoint
import typings.octokitTypes.endpointsMod.CodeScanningUploadSarifRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersCodeScanningUploadSarifEndpoint extends StObject {
  
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
  implicit class ParametersCodeScanningUploadSarifEndpointMutableBuilder[Self <: ParametersCodeScanningUploadSarifEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: CodeScanningUploadSarifEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: CodeScanningUploadSarifRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
