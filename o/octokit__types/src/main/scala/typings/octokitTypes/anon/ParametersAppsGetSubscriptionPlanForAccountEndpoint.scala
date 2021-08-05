package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsGetSubscriptionPlanForAccountEndpoint
import typings.octokitTypes.endpointsMod.AppsGetSubscriptionPlanForAccountRequestOptions
import typings.octokitTypes.endpointsMod.AppsGetSubscriptionPlanForAccountResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersAppsGetSubscriptionPlanForAccountEndpoint extends StObject {
  
  var parameters: AppsGetSubscriptionPlanForAccountEndpoint
  
  var request: AppsGetSubscriptionPlanForAccountRequestOptions
  
  var response: OctokitResponse[AppsGetSubscriptionPlanForAccountResponseData]
}
object ParametersAppsGetSubscriptionPlanForAccountEndpoint {
  
  inline def apply(
    parameters: AppsGetSubscriptionPlanForAccountEndpoint,
    request: AppsGetSubscriptionPlanForAccountRequestOptions,
    response: OctokitResponse[AppsGetSubscriptionPlanForAccountResponseData]
  ): ParametersAppsGetSubscriptionPlanForAccountEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsGetSubscriptionPlanForAccountEndpoint]
  }
  
  extension [Self <: ParametersAppsGetSubscriptionPlanForAccountEndpoint](x: Self) {
    
    inline def setParameters(value: AppsGetSubscriptionPlanForAccountEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: AppsGetSubscriptionPlanForAccountRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[AppsGetSubscriptionPlanForAccountResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
