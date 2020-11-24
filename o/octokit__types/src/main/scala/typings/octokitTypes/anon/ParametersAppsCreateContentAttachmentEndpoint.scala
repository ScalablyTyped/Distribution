package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsCreateContentAttachmentEndpoint
import typings.octokitTypes.endpointsMod.AppsCreateContentAttachmentRequestOptions
import typings.octokitTypes.endpointsMod.AppsCreateContentAttachmentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsCreateContentAttachmentEndpoint extends js.Object {
  
  var parameters: AppsCreateContentAttachmentEndpoint = js.native
  
  var request: AppsCreateContentAttachmentRequestOptions = js.native
  
  var response: OctokitResponse[AppsCreateContentAttachmentResponseData] = js.native
}
object ParametersAppsCreateContentAttachmentEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsCreateContentAttachmentEndpoint,
    request: AppsCreateContentAttachmentRequestOptions,
    response: OctokitResponse[AppsCreateContentAttachmentResponseData]
  ): ParametersAppsCreateContentAttachmentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsCreateContentAttachmentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsCreateContentAttachmentEndpointOps[Self <: ParametersAppsCreateContentAttachmentEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: AppsCreateContentAttachmentEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsCreateContentAttachmentRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsCreateContentAttachmentResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
