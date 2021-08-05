package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ChecksCreateSuiteEndpoint
import typings.octokitTypes.endpointsMod.ChecksCreateSuiteRequestOptions
import typings.octokitTypes.endpointsMod.ChecksCreateSuiteResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersChecksCreateSuiteEndpoint extends StObject {
  
  var parameters: ChecksCreateSuiteEndpoint
  
  var request: ChecksCreateSuiteRequestOptions
  
  var response: OctokitResponse[ChecksCreateSuiteResponseData]
}
object ParametersChecksCreateSuiteEndpoint {
  
  inline def apply(
    parameters: ChecksCreateSuiteEndpoint,
    request: ChecksCreateSuiteRequestOptions,
    response: OctokitResponse[ChecksCreateSuiteResponseData]
  ): ParametersChecksCreateSuiteEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksCreateSuiteEndpoint]
  }
  
  extension [Self <: ParametersChecksCreateSuiteEndpoint](x: Self) {
    
    inline def setParameters(value: ChecksCreateSuiteEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ChecksCreateSuiteRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ChecksCreateSuiteResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
