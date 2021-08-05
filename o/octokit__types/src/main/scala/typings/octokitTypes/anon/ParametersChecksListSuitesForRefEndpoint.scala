package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ChecksListSuitesForRefEndpoint
import typings.octokitTypes.endpointsMod.ChecksListSuitesForRefRequestOptions
import typings.octokitTypes.endpointsMod.ChecksListSuitesForRefResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersChecksListSuitesForRefEndpoint extends StObject {
  
  var parameters: ChecksListSuitesForRefEndpoint
  
  var request: ChecksListSuitesForRefRequestOptions
  
  var response: OctokitResponse[ChecksListSuitesForRefResponseData]
}
object ParametersChecksListSuitesForRefEndpoint {
  
  inline def apply(
    parameters: ChecksListSuitesForRefEndpoint,
    request: ChecksListSuitesForRefRequestOptions,
    response: OctokitResponse[ChecksListSuitesForRefResponseData]
  ): ParametersChecksListSuitesForRefEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksListSuitesForRefEndpoint]
  }
  
  extension [Self <: ParametersChecksListSuitesForRefEndpoint](x: Self) {
    
    inline def setParameters(value: ChecksListSuitesForRefEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ChecksListSuitesForRefRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ChecksListSuitesForRefResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
