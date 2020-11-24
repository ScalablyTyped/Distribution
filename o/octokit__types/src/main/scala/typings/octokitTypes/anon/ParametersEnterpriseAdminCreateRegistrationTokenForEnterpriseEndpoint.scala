package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminCreateRegistrationTokenForEnterpriseEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminCreateRegistrationTokenForEnterpriseRequestOptions
import typings.octokitTypes.endpointsMod.EnterpriseAdminCreateRegistrationTokenForEnterpriseResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEnterpriseAdminCreateRegistrationTokenForEnterpriseEndpoint extends js.Object {
  
  var parameters: EnterpriseAdminCreateRegistrationTokenForEnterpriseEndpoint = js.native
  
  var request: EnterpriseAdminCreateRegistrationTokenForEnterpriseRequestOptions = js.native
  
  var response: OctokitResponse[EnterpriseAdminCreateRegistrationTokenForEnterpriseResponseData] = js.native
}
object ParametersEnterpriseAdminCreateRegistrationTokenForEnterpriseEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminCreateRegistrationTokenForEnterpriseEndpoint,
    request: EnterpriseAdminCreateRegistrationTokenForEnterpriseRequestOptions,
    response: OctokitResponse[EnterpriseAdminCreateRegistrationTokenForEnterpriseResponseData]
  ): ParametersEnterpriseAdminCreateRegistrationTokenForEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminCreateRegistrationTokenForEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminCreateRegistrationTokenForEnterpriseEndpointOps[Self <: ParametersEnterpriseAdminCreateRegistrationTokenForEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: EnterpriseAdminCreateRegistrationTokenForEnterpriseEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminCreateRegistrationTokenForEnterpriseRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminCreateRegistrationTokenForEnterpriseResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
