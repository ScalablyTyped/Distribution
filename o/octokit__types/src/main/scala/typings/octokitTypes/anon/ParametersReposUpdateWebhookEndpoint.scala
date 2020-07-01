package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposUpdateWebhookEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdateWebhookRequestOptions
import typings.octokitTypes.endpointsMod.ReposUpdateWebhookResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposUpdateWebhookEndpoint extends js.Object {
  var parameters: ReposUpdateWebhookEndpoint
  var request: ReposUpdateWebhookRequestOptions
  var response: OctokitResponse[ReposUpdateWebhookResponseData]
}

object ParametersReposUpdateWebhookEndpoint {
  @scala.inline
  def apply(
    parameters: ReposUpdateWebhookEndpoint,
    request: ReposUpdateWebhookRequestOptions,
    response: OctokitResponse[ReposUpdateWebhookResponseData]
  ): ParametersReposUpdateWebhookEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposUpdateWebhookEndpoint]
  }
}

