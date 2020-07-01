package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsDeleteWebhookEndpoint
import typings.octokitTypes.endpointsMod.OrgsDeleteWebhookRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsDeleteWebhookEndpoint extends js.Object {
  var parameters: OrgsDeleteWebhookEndpoint
  var request: OrgsDeleteWebhookRequestOptions
  var response: OctokitResponse[_]
}

object ParametersOrgsDeleteWebhookEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsDeleteWebhookEndpoint,
    request: OrgsDeleteWebhookRequestOptions,
    response: OctokitResponse[_]
  ): ParametersOrgsDeleteWebhookEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsDeleteWebhookEndpoint]
  }
}

