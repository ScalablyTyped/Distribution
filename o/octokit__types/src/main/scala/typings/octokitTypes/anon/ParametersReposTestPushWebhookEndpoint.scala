package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposTestPushWebhookEndpoint
import typings.octokitTypes.endpointsMod.ReposTestPushWebhookRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposTestPushWebhookEndpoint extends js.Object {
  var parameters: ReposTestPushWebhookEndpoint
  var request: ReposTestPushWebhookRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReposTestPushWebhookEndpoint {
  @scala.inline
  def apply(
    parameters: ReposTestPushWebhookEndpoint,
    request: ReposTestPushWebhookRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposTestPushWebhookEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposTestPushWebhookEndpoint]
  }
}

