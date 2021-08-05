package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ChecksRerequestSuiteEndpoint
import typings.octokitTypes.endpointsMod.ChecksRerequestSuiteRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersChecksRerequestSuiteEndpoint extends StObject {
  
  var parameters: ChecksRerequestSuiteEndpoint
  
  var request: ChecksRerequestSuiteRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersChecksRerequestSuiteEndpoint {
  
  inline def apply(
    parameters: ChecksRerequestSuiteEndpoint,
    request: ChecksRerequestSuiteRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersChecksRerequestSuiteEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksRerequestSuiteEndpoint]
  }
  
  extension [Self <: ParametersChecksRerequestSuiteEndpoint](x: Self) {
    
    inline def setParameters(value: ChecksRerequestSuiteEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ChecksRerequestSuiteRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
