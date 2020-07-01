package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsCreateWebhookEndpoint
import typings.octokitTypes.endpointsMod.OrgsCreateWebhookRequestOptions
import typings.octokitTypes.endpointsMod.OrgsCreateWebhookResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsCreateWebhookEndpoint extends js.Object {
  var parameters: OrgsCreateWebhookEndpoint
  var request: OrgsCreateWebhookRequestOptions
  var response: OctokitResponse[OrgsCreateWebhookResponseData]
}

object ParametersOrgsCreateWebhookEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsCreateWebhookEndpoint,
    request: OrgsCreateWebhookRequestOptions,
    response: OctokitResponse[OrgsCreateWebhookResponseData]
  ): ParametersOrgsCreateWebhookEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsCreateWebhookEndpoint]
  }
}

