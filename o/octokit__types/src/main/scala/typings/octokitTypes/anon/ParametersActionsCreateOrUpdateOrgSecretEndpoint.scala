package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsCreateOrUpdateOrgSecretEndpoint
import typings.octokitTypes.endpointsMod.ActionsCreateOrUpdateOrgSecretRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsCreateOrUpdateOrgSecretEndpoint extends js.Object {
  
  var parameters: ActionsCreateOrUpdateOrgSecretEndpoint = js.native
  
  var request: ActionsCreateOrUpdateOrgSecretRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersActionsCreateOrUpdateOrgSecretEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsCreateOrUpdateOrgSecretEndpoint,
    request: ActionsCreateOrUpdateOrgSecretRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsCreateOrUpdateOrgSecretEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsCreateOrUpdateOrgSecretEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsCreateOrUpdateOrgSecretEndpointOps[Self <: ParametersActionsCreateOrUpdateOrgSecretEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ActionsCreateOrUpdateOrgSecretEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsCreateOrUpdateOrgSecretRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
