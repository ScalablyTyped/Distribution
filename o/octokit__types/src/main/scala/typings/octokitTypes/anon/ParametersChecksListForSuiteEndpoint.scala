package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ChecksListForSuiteEndpoint
import typings.octokitTypes.endpointsMod.ChecksListForSuiteRequestOptions
import typings.octokitTypes.endpointsMod.ChecksListForSuiteResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersChecksListForSuiteEndpoint extends StObject {
  
  var parameters: ChecksListForSuiteEndpoint
  
  var request: ChecksListForSuiteRequestOptions
  
  var response: OctokitResponse[ChecksListForSuiteResponseData]
}
object ParametersChecksListForSuiteEndpoint {
  
  inline def apply(
    parameters: ChecksListForSuiteEndpoint,
    request: ChecksListForSuiteRequestOptions,
    response: OctokitResponse[ChecksListForSuiteResponseData]
  ): ParametersChecksListForSuiteEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksListForSuiteEndpoint]
  }
  
  extension [Self <: ParametersChecksListForSuiteEndpoint](x: Self) {
    
    inline def setParameters(value: ChecksListForSuiteEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ChecksListForSuiteRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ChecksListForSuiteResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
