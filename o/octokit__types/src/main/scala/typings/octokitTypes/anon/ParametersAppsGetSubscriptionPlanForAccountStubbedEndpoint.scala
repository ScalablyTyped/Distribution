package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsGetSubscriptionPlanForAccountStubbedEndpoint
import typings.octokitTypes.endpointsMod.AppsGetSubscriptionPlanForAccountStubbedRequestOptions
import typings.octokitTypes.endpointsMod.AppsGetSubscriptionPlanForAccountStubbedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsGetSubscriptionPlanForAccountStubbedEndpoint extends StObject {
  
  var parameters: AppsGetSubscriptionPlanForAccountStubbedEndpoint = js.native
  
  var request: AppsGetSubscriptionPlanForAccountStubbedRequestOptions = js.native
  
  var response: OctokitResponse[AppsGetSubscriptionPlanForAccountStubbedResponseData] = js.native
}
object ParametersAppsGetSubscriptionPlanForAccountStubbedEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsGetSubscriptionPlanForAccountStubbedEndpoint,
    request: AppsGetSubscriptionPlanForAccountStubbedRequestOptions,
    response: OctokitResponse[AppsGetSubscriptionPlanForAccountStubbedResponseData]
  ): ParametersAppsGetSubscriptionPlanForAccountStubbedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsGetSubscriptionPlanForAccountStubbedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsGetSubscriptionPlanForAccountStubbedEndpointMutableBuilder[Self <: ParametersAppsGetSubscriptionPlanForAccountStubbedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsGetSubscriptionPlanForAccountStubbedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsGetSubscriptionPlanForAccountStubbedRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsGetSubscriptionPlanForAccountStubbedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
