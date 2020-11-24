package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminSetInformationForProvisionedEnterpriseGroupEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminSetInformationForProvisionedEnterpriseGroupRequestOptions
import typings.octokitTypes.endpointsMod.EnterpriseAdminSetInformationForProvisionedEnterpriseGroupResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEnterpriseAdminSetInformationForProvisionedEnterpriseGroupEndpoint extends js.Object {
  
  var parameters: EnterpriseAdminSetInformationForProvisionedEnterpriseGroupEndpoint = js.native
  
  var request: EnterpriseAdminSetInformationForProvisionedEnterpriseGroupRequestOptions = js.native
  
  var response: OctokitResponse[EnterpriseAdminSetInformationForProvisionedEnterpriseGroupResponseData] = js.native
}
object ParametersEnterpriseAdminSetInformationForProvisionedEnterpriseGroupEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminSetInformationForProvisionedEnterpriseGroupEndpoint,
    request: EnterpriseAdminSetInformationForProvisionedEnterpriseGroupRequestOptions,
    response: OctokitResponse[EnterpriseAdminSetInformationForProvisionedEnterpriseGroupResponseData]
  ): ParametersEnterpriseAdminSetInformationForProvisionedEnterpriseGroupEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminSetInformationForProvisionedEnterpriseGroupEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminSetInformationForProvisionedEnterpriseGroupEndpointOps[Self <: ParametersEnterpriseAdminSetInformationForProvisionedEnterpriseGroupEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: EnterpriseAdminSetInformationForProvisionedEnterpriseGroupEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminSetInformationForProvisionedEnterpriseGroupRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminSetInformationForProvisionedEnterpriseGroupResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
