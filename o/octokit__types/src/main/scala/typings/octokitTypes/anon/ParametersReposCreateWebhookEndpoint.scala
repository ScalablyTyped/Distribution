package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCreateWebhookEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateWebhookRequestOptions
import typings.octokitTypes.endpointsMod.ReposCreateWebhookResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposCreateWebhookEndpoint extends js.Object {
  
  var parameters: ReposCreateWebhookEndpoint = js.native
  
  var request: ReposCreateWebhookRequestOptions = js.native
  
  var response: OctokitResponse[ReposCreateWebhookResponseData] = js.native
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
  
  @scala.inline
  implicit class ParametersReposCreateWebhookEndpointOps[Self <: ParametersReposCreateWebhookEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposCreateWebhookEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposCreateWebhookRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposCreateWebhookResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
