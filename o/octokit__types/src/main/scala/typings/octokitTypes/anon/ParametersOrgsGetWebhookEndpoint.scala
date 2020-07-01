package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsGetWebhookEndpoint
import typings.octokitTypes.endpointsMod.OrgsGetWebhookRequestOptions
import typings.octokitTypes.endpointsMod.OrgsGetWebhookResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsGetWebhookEndpoint extends js.Object {
  var parameters: OrgsGetWebhookEndpoint
  var request: OrgsGetWebhookRequestOptions
  var response: OctokitResponse[OrgsGetWebhookResponseData]
}

object ParametersOrgsGetWebhookEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsGetWebhookEndpoint,
    request: OrgsGetWebhookRequestOptions,
    response: OctokitResponse[OrgsGetWebhookResponseData]
  ): ParametersOrgsGetWebhookEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsGetWebhookEndpoint]
  }
}

