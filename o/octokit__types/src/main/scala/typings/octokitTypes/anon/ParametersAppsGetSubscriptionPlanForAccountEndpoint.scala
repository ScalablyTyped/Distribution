package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsGetSubscriptionPlanForAccountEndpoint
import typings.octokitTypes.endpointsMod.AppsGetSubscriptionPlanForAccountRequestOptions
import typings.octokitTypes.endpointsMod.AppsGetSubscriptionPlanForAccountResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersAppsGetSubscriptionPlanForAccountEndpoint extends js.Object {
  var parameters: AppsGetSubscriptionPlanForAccountEndpoint
  var request: AppsGetSubscriptionPlanForAccountRequestOptions
  var response: OctokitResponse[AppsGetSubscriptionPlanForAccountResponseData]
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
}

