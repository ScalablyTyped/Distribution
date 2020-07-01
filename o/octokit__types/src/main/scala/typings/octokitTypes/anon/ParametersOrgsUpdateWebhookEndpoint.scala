package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsUpdateWebhookEndpoint
import typings.octokitTypes.endpointsMod.OrgsUpdateWebhookRequestOptions
import typings.octokitTypes.endpointsMod.OrgsUpdateWebhookResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsUpdateWebhookEndpoint extends js.Object {
  var parameters: OrgsUpdateWebhookEndpoint
  var request: OrgsUpdateWebhookRequestOptions
  var response: OctokitResponse[OrgsUpdateWebhookResponseData]
}

object ParametersOrgsUpdateWebhookEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsUpdateWebhookEndpoint,
    request: OrgsUpdateWebhookRequestOptions,
    response: OctokitResponse[OrgsUpdateWebhookResponseData]
  ): ParametersOrgsUpdateWebhookEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsUpdateWebhookEndpoint]
  }
}

