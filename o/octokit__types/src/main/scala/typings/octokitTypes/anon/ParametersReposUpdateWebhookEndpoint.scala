package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposUpdateWebhookEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdateWebhookRequestOptions
import typings.octokitTypes.endpointsMod.ReposUpdateWebhookResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposUpdateWebhookEndpoint extends js.Object {
  var parameters: ReposUpdateWebhookEndpoint = js.native
  var request: ReposUpdateWebhookRequestOptions = js.native
  var response: OctokitResponse[ReposUpdateWebhookResponseData] = js.native
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
  @scala.inline
  implicit class ParametersReposUpdateWebhookEndpointOps[Self <: ParametersReposUpdateWebhookEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposUpdateWebhookEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposUpdateWebhookRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposUpdateWebhookResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

