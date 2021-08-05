package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityGetFeedsEndpoint
import typings.octokitTypes.endpointsMod.ActivityGetFeedsRequestOptions
import typings.octokitTypes.endpointsMod.ActivityGetFeedsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActivityGetFeedsEndpoint extends StObject {
  
  var parameters: ActivityGetFeedsEndpoint
  
  var request: ActivityGetFeedsRequestOptions
  
  var response: OctokitResponse[ActivityGetFeedsResponseData]
}
object ParametersActivityGetFeedsEndpoint {
  
  inline def apply(
    parameters: ActivityGetFeedsEndpoint,
    request: ActivityGetFeedsRequestOptions,
    response: OctokitResponse[ActivityGetFeedsResponseData]
  ): ParametersActivityGetFeedsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityGetFeedsEndpoint]
  }
  
  extension [Self <: ParametersActivityGetFeedsEndpoint](x: Self) {
    
    inline def setParameters(value: ActivityGetFeedsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActivityGetFeedsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActivityGetFeedsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
