package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetWebhookEndpoint
import typings.octokitTypes.endpointsMod.ReposGetWebhookRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetWebhookResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetWebhookEndpoint extends js.Object {
  
  var parameters: ReposGetWebhookEndpoint = js.native
  
  var request: ReposGetWebhookRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetWebhookResponseData] = js.native
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
  
  @scala.inline
  implicit class ParametersReposGetWebhookEndpointOps[Self <: ParametersReposGetWebhookEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposGetWebhookEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetWebhookRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetWebhookResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
