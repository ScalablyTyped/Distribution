package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetWebhookEndpoint
import typings.octokitTypes.endpointsMod.ReposGetWebhookRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetWebhookResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetWebhookEndpoint extends js.Object {
  var parameters: ReposGetWebhookEndpoint
  var request: ReposGetWebhookRequestOptions
  var response: OctokitResponse[ReposGetWebhookResponseData]
}

object ParametersReposGetWebhookEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetWebhookEndpoint,
    request: ReposGetWebhookRequestOptions,
    response: OctokitResponse[ReposGetWebhookResponseData]
  ): ParametersReposGetWebhookEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetWebhookEndpoint]
  }
}

