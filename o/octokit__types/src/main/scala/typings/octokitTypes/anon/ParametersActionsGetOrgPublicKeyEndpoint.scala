package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsGetOrgPublicKeyEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetOrgPublicKeyRequestOptions
import typings.octokitTypes.endpointsMod.ActionsGetOrgPublicKeyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsGetOrgPublicKeyEndpoint extends js.Object {
  
  var parameters: ActionsGetOrgPublicKeyEndpoint = js.native
  
  var request: ActionsGetOrgPublicKeyRequestOptions = js.native
  
  var response: OctokitResponse[ActionsGetOrgPublicKeyResponseData] = js.native
}
object ParametersActionsGetOrgPublicKeyEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsGetOrgPublicKeyEndpoint,
    request: ActionsGetOrgPublicKeyRequestOptions,
    response: OctokitResponse[ActionsGetOrgPublicKeyResponseData]
  ): ParametersActionsGetOrgPublicKeyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetOrgPublicKeyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsGetOrgPublicKeyEndpointOps[Self <: ParametersActionsGetOrgPublicKeyEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ActionsGetOrgPublicKeyEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsGetOrgPublicKeyRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsGetOrgPublicKeyResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
