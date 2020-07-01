package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsPingWebhookEndpoint
import typings.octokitTypes.endpointsMod.OrgsPingWebhookRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsPingWebhookEndpoint extends js.Object {
  var parameters: OrgsPingWebhookEndpoint
  var request: OrgsPingWebhookRequestOptions
  var response: OctokitResponse[_]
}

object ParametersOrgsPingWebhookEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsPingWebhookEndpoint,
    request: OrgsPingWebhookRequestOptions,
    response: OctokitResponse[_]
  ): ParametersOrgsPingWebhookEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsPingWebhookEndpoint]
  }
}

