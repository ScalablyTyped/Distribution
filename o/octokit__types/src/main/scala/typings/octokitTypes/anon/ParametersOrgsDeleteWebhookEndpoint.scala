package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsDeleteWebhookEndpoint
import typings.octokitTypes.endpointsMod.OrgsDeleteWebhookRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOrgsDeleteWebhookEndpoint extends js.Object {
  
  var parameters: OrgsDeleteWebhookEndpoint = js.native
  
  var request: OrgsDeleteWebhookRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersOrgsDeleteWebhookEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsDeleteWebhookEndpoint,
    request: OrgsDeleteWebhookRequestOptions,
    response: OctokitResponse[_]
  ): ParametersOrgsDeleteWebhookEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsDeleteWebhookEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsDeleteWebhookEndpointOps[Self <: ParametersOrgsDeleteWebhookEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: OrgsDeleteWebhookEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsDeleteWebhookRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
