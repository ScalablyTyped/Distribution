package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ScimGetProvisioningInformationForUserEndpoint
import typings.octokitTypes.endpointsMod.ScimGetProvisioningInformationForUserRequestOptions
import typings.octokitTypes.endpointsMod.ScimGetProvisioningInformationForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersScimGetProvisioningInformationForUserEndpoint extends js.Object {
  
  var parameters: ScimGetProvisioningInformationForUserEndpoint = js.native
  
  var request: ScimGetProvisioningInformationForUserRequestOptions = js.native
  
  var response: OctokitResponse[ScimGetProvisioningInformationForUserResponseData] = js.native
}
object ParametersScimGetProvisioningInformationForUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: ScimGetProvisioningInformationForUserEndpoint,
    request: ScimGetProvisioningInformationForUserRequestOptions,
    response: OctokitResponse[ScimGetProvisioningInformationForUserResponseData]
  ): ParametersScimGetProvisioningInformationForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersScimGetProvisioningInformationForUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersScimGetProvisioningInformationForUserEndpointOps[Self <: ParametersScimGetProvisioningInformationForUserEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ScimGetProvisioningInformationForUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ScimGetProvisioningInformationForUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ScimGetProvisioningInformationForUserResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
