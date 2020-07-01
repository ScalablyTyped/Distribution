package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposPingWebhookEndpoint
import typings.octokitTypes.endpointsMod.ReposPingWebhookRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposPingWebhookEndpoint extends js.Object {
  var parameters: ReposPingWebhookEndpoint
  var request: ReposPingWebhookRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReposPingWebhookEndpoint {
  @scala.inline
  def apply(
    parameters: ReposPingWebhookEndpoint,
    request: ReposPingWebhookRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposPingWebhookEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposPingWebhookEndpoint]
  }
}

