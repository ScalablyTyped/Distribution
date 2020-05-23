package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsGetSubscriptionPlanForAccountStubbedEndpoint
import typings.octokitTypes.endpointsMod.AppsGetSubscriptionPlanForAccountStubbedRequestOptions
import typings.octokitTypes.endpointsMod.AppsGetSubscriptionPlanForAccountStubbedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersAppsGetSubscriptionPlanForAccountStubbedEndpoint extends js.Object {
  var parameters: AppsGetSubscriptionPlanForAccountStubbedEndpoint
  var request: AppsGetSubscriptionPlanForAccountStubbedRequestOptions
  var response: OctokitResponse[AppsGetSubscriptionPlanForAccountStubbedResponseData]
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
}

