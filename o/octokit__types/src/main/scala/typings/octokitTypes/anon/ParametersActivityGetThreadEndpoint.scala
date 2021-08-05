package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityGetThreadEndpoint
import typings.octokitTypes.endpointsMod.ActivityGetThreadRequestOptions
import typings.octokitTypes.endpointsMod.ActivityGetThreadResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActivityGetThreadEndpoint extends StObject {
  
  var parameters: ActivityGetThreadEndpoint
  
  var request: ActivityGetThreadRequestOptions
  
  var response: OctokitResponse[ActivityGetThreadResponseData]
}
object ParametersActivityGetThreadEndpoint {
  
  inline def apply(
    parameters: ActivityGetThreadEndpoint,
    request: ActivityGetThreadRequestOptions,
    response: OctokitResponse[ActivityGetThreadResponseData]
  ): ParametersActivityGetThreadEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityGetThreadEndpoint]
  }
  
  extension [Self <: ParametersActivityGetThreadEndpoint](x: Self) {
    
    inline def setParameters(value: ActivityGetThreadEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActivityGetThreadRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActivityGetThreadResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
