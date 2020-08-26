package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsGetSubscriptionPlanForAccountStubbedEndpoint
import typings.octokitTypes.endpointsMod.AppsGetSubscriptionPlanForAccountStubbedRequestOptions
import typings.octokitTypes.endpointsMod.AppsGetSubscriptionPlanForAccountStubbedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersAppsGetSubscriptionPlanForAccountStubbedEndpoint extends js.Object {
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
  implicit class ParametersAppsGetSubscriptionPlanForAccountStubbedEndpointOps[Self <: ParametersAppsGetSubscriptionPlanForAccountStubbedEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: AppsGetSubscriptionPlanForAccountStubbedEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: AppsGetSubscriptionPlanForAccountStubbedRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[AppsGetSubscriptionPlanForAccountStubbedResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

