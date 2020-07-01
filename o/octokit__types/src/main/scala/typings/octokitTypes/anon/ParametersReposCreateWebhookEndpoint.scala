package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCreateWebhookEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateWebhookRequestOptions
import typings.octokitTypes.endpointsMod.ReposCreateWebhookResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposCreateWebhookEndpoint extends js.Object {
  var parameters: ReposCreateWebhookEndpoint
  var request: ReposCreateWebhookRequestOptions
  var response: OctokitResponse[ReposCreateWebhookResponseData]
}

object ParametersReposCreateWebhookEndpoint {
  @scala.inline
  def apply(
    parameters: ReposCreateWebhookEndpoint,
    request: ReposCreateWebhookRequestOptions,
    response: OctokitResponse[ReposCreateWebhookResponseData]
  ): ParametersReposCreateWebhookEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateWebhookEndpoint]
  }
}

