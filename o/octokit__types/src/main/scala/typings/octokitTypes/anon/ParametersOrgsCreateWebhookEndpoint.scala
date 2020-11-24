package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsCreateWebhookEndpoint
import typings.octokitTypes.endpointsMod.OrgsCreateWebhookRequestOptions
import typings.octokitTypes.endpointsMod.OrgsCreateWebhookResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOrgsCreateWebhookEndpoint extends js.Object {
  
  var parameters: OrgsCreateWebhookEndpoint = js.native
  
  var request: OrgsCreateWebhookRequestOptions = js.native
  
  var response: OctokitResponse[OrgsCreateWebhookResponseData] = js.native
}
object ParametersOrgsCreateWebhookEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsCreateWebhookEndpoint,
    request: OrgsCreateWebhookRequestOptions,
    response: OctokitResponse[OrgsCreateWebhookResponseData]
  ): ParametersOrgsCreateWebhookEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsCreateWebhookEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsCreateWebhookEndpointOps[Self <: ParametersOrgsCreateWebhookEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: OrgsCreateWebhookEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsCreateWebhookRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsCreateWebhookResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
