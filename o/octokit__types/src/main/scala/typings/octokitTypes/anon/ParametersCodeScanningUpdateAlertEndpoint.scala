package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.CodeScanningUpdateAlertEndpoint
import typings.octokitTypes.endpointsMod.CodeScanningUpdateAlertRequestOptions
import typings.octokitTypes.endpointsMod.CodeScanningUpdateAlertResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersCodeScanningUpdateAlertEndpoint extends StObject {
  
  var parameters: CodeScanningUpdateAlertEndpoint
  
  var request: CodeScanningUpdateAlertRequestOptions
  
  var response: OctokitResponse[CodeScanningUpdateAlertResponseData]
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
  implicit class ParametersCodeScanningUpdateAlertEndpointMutableBuilder[Self <: ParametersCodeScanningUpdateAlertEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: CodeScanningUpdateAlertEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: CodeScanningUpdateAlertRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[CodeScanningUpdateAlertResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
