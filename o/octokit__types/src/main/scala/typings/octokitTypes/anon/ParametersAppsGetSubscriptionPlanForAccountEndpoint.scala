package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsGetSubscriptionPlanForAccountEndpoint
import typings.octokitTypes.endpointsMod.AppsGetSubscriptionPlanForAccountRequestOptions
import typings.octokitTypes.endpointsMod.AppsGetSubscriptionPlanForAccountResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsGetSubscriptionPlanForAccountEndpoint extends js.Object {
  
  var parameters: AppsGetSubscriptionPlanForAccountEndpoint = js.native
  
  var request: AppsGetSubscriptionPlanForAccountRequestOptions = js.native
  
  var response: OctokitResponse[AppsGetSubscriptionPlanForAccountResponseData] = js.native
}
object ParametersAppsGetSubscriptionPlanForAccountEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsGetSubscriptionPlanForAccountEndpoint,
    request: AppsGetSubscriptionPlanForAccountRequestOptions,
    response: OctokitResponse[AppsGetSubscriptionPlanForAccountResponseData]
  ): ParametersAppsGetSubscriptionPlanForAccountEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsGetSubscriptionPlanForAccountEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsGetSubscriptionPlanForAccountEndpointOps[Self <: ParametersAppsGetSubscriptionPlanForAccountEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParameters(value: AppsGetSubscriptionPlanForAccountEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsGetSubscriptionPlanForAccountRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsGetSubscriptionPlanForAccountResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
