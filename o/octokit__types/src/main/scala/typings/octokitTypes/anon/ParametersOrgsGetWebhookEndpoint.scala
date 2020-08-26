package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsGetWebhookEndpoint
import typings.octokitTypes.endpointsMod.OrgsGetWebhookRequestOptions
import typings.octokitTypes.endpointsMod.OrgsGetWebhookResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersOrgsGetWebhookEndpoint extends js.Object {
  var parameters: OrgsGetWebhookEndpoint = js.native
  var request: OrgsGetWebhookRequestOptions = js.native
  var response: OctokitResponse[OrgsGetWebhookResponseData] = js.native
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
  @scala.inline
  implicit class ParametersOrgsGetWebhookEndpointOps[Self <: ParametersOrgsGetWebhookEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParameters(value: OrgsGetWebhookEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: OrgsGetWebhookRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsGetWebhookResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

