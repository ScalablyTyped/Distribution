package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.CodeScanningGetAlertEndpoint
import typings.octokitTypes.endpointsMod.CodeScanningGetAlertRequestOptions
import typings.octokitTypes.endpointsMod.CodeScanningGetAlertResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersCodeScanningGetAlertEndpoint extends StObject {
  
  var parameters: CodeScanningGetAlertEndpoint
  
  var request: CodeScanningGetAlertRequestOptions
  
  var response: OctokitResponse[CodeScanningGetAlertResponseData]
}
object ParametersCodeScanningGetAlertEndpoint {
  
  inline def apply(
    parameters: CodeScanningGetAlertEndpoint,
    request: CodeScanningGetAlertRequestOptions,
    response: OctokitResponse[CodeScanningGetAlertResponseData]
  ): ParametersCodeScanningGetAlertEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersCodeScanningGetAlertEndpoint]
  }
  
  extension [Self <: ParametersCodeScanningGetAlertEndpoint](x: Self) {
    
    inline def setParameters(value: CodeScanningGetAlertEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: CodeScanningGetAlertRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[CodeScanningGetAlertResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
