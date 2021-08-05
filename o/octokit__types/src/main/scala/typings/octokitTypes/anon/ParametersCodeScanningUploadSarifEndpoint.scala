package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.CodeScanningUploadSarifEndpoint
import typings.octokitTypes.endpointsMod.CodeScanningUploadSarifRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersCodeScanningUploadSarifEndpoint extends StObject {
  
  var parameters: CodeScanningUploadSarifEndpoint
  
  var request: CodeScanningUploadSarifRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersCodeScanningUploadSarifEndpoint {
  
  inline def apply(
    parameters: CodeScanningUploadSarifEndpoint,
    request: CodeScanningUploadSarifRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersCodeScanningUploadSarifEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersCodeScanningUploadSarifEndpoint]
  }
  
  extension [Self <: ParametersCodeScanningUploadSarifEndpoint](x: Self) {
    
    inline def setParameters(value: CodeScanningUploadSarifEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: CodeScanningUploadSarifRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
