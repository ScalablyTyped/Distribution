package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminGetProvisioningInformationForEnterpriseUserEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminGetProvisioningInformationForEnterpriseUserRequestOptions
import typings.octokitTypes.endpointsMod.EnterpriseAdminGetProvisioningInformationForEnterpriseUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEnterpriseAdminGetProvisioningInformationForEnterpriseUserEndpoint extends js.Object {
  
  var parameters: EnterpriseAdminGetProvisioningInformationForEnterpriseUserEndpoint = js.native
  
  var request: EnterpriseAdminGetProvisioningInformationForEnterpriseUserRequestOptions = js.native
  
  var response: OctokitResponse[EnterpriseAdminGetProvisioningInformationForEnterpriseUserResponseData] = js.native
}
object ParametersEnterpriseAdminGetProvisioningInformationForEnterpriseUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminGetProvisioningInformationForEnterpriseUserEndpoint,
    request: EnterpriseAdminGetProvisioningInformationForEnterpriseUserRequestOptions,
    response: OctokitResponse[EnterpriseAdminGetProvisioningInformationForEnterpriseUserResponseData]
  ): ParametersEnterpriseAdminGetProvisioningInformationForEnterpriseUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminGetProvisioningInformationForEnterpriseUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminGetProvisioningInformationForEnterpriseUserEndpointOps[Self <: ParametersEnterpriseAdminGetProvisioningInformationForEnterpriseUserEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: EnterpriseAdminGetProvisioningInformationForEnterpriseUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminGetProvisioningInformationForEnterpriseUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminGetProvisioningInformationForEnterpriseUserResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
