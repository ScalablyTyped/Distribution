package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityGetRepoSubscriptionEndpoint
import typings.octokitTypes.endpointsMod.ActivityGetRepoSubscriptionRequestOptions
import typings.octokitTypes.endpointsMod.ActivityGetRepoSubscriptionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActivityGetRepoSubscriptionEndpoint extends StObject {
  
  var parameters: ActivityGetRepoSubscriptionEndpoint
  
  var request: ActivityGetRepoSubscriptionRequestOptions
  
  var response: OctokitResponse[ActivityGetRepoSubscriptionResponseData]
}
object ParametersActivityGetRepoSubscriptionEndpoint {
  
  inline def apply(
    parameters: ActivityGetRepoSubscriptionEndpoint,
    request: ActivityGetRepoSubscriptionRequestOptions,
    response: OctokitResponse[ActivityGetRepoSubscriptionResponseData]
  ): ParametersActivityGetRepoSubscriptionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityGetRepoSubscriptionEndpoint]
  }
  
  extension [Self <: ParametersActivityGetRepoSubscriptionEndpoint](x: Self) {
    
    inline def setParameters(value: ActivityGetRepoSubscriptionEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActivityGetRepoSubscriptionRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActivityGetRepoSubscriptionResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
