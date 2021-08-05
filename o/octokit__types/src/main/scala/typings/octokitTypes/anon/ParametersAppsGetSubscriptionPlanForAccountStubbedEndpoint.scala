package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsGetSubscriptionPlanForAccountStubbedEndpoint
import typings.octokitTypes.endpointsMod.AppsGetSubscriptionPlanForAccountStubbedRequestOptions
import typings.octokitTypes.endpointsMod.AppsGetSubscriptionPlanForAccountStubbedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersAppsGetSubscriptionPlanForAccountStubbedEndpoint extends StObject {
  
  var parameters: AppsGetSubscriptionPlanForAccountStubbedEndpoint
  
  var request: AppsGetSubscriptionPlanForAccountStubbedRequestOptions
  
  var response: OctokitResponse[AppsGetSubscriptionPlanForAccountStubbedResponseData]
}
object ParametersAppsGetSubscriptionPlanForAccountStubbedEndpoint {
  
  inline def apply(
    parameters: AppsGetSubscriptionPlanForAccountStubbedEndpoint,
    request: AppsGetSubscriptionPlanForAccountStubbedRequestOptions,
    response: OctokitResponse[AppsGetSubscriptionPlanForAccountStubbedResponseData]
  ): ParametersAppsGetSubscriptionPlanForAccountStubbedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsGetSubscriptionPlanForAccountStubbedEndpoint]
  }
  
  extension [Self <: ParametersAppsGetSubscriptionPlanForAccountStubbedEndpoint](x: Self) {
    
    inline def setParameters(value: AppsGetSubscriptionPlanForAccountStubbedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: AppsGetSubscriptionPlanForAccountStubbedRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[AppsGetSubscriptionPlanForAccountStubbedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
