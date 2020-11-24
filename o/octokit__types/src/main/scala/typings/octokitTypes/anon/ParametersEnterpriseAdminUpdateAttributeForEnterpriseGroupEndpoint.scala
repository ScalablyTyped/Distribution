package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminUpdateAttributeForEnterpriseGroupEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminUpdateAttributeForEnterpriseGroupRequestOptions
import typings.octokitTypes.endpointsMod.EnterpriseAdminUpdateAttributeForEnterpriseGroupResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEnterpriseAdminUpdateAttributeForEnterpriseGroupEndpoint extends js.Object {
  
  var parameters: EnterpriseAdminUpdateAttributeForEnterpriseGroupEndpoint = js.native
  
  var request: EnterpriseAdminUpdateAttributeForEnterpriseGroupRequestOptions = js.native
  
  var response: OctokitResponse[EnterpriseAdminUpdateAttributeForEnterpriseGroupResponseData] = js.native
}
object ParametersEnterpriseAdminUpdateAttributeForEnterpriseGroupEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminUpdateAttributeForEnterpriseGroupEndpoint,
    request: EnterpriseAdminUpdateAttributeForEnterpriseGroupRequestOptions,
    response: OctokitResponse[EnterpriseAdminUpdateAttributeForEnterpriseGroupResponseData]
  ): ParametersEnterpriseAdminUpdateAttributeForEnterpriseGroupEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminUpdateAttributeForEnterpriseGroupEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminUpdateAttributeForEnterpriseGroupEndpointOps[Self <: ParametersEnterpriseAdminUpdateAttributeForEnterpriseGroupEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: EnterpriseAdminUpdateAttributeForEnterpriseGroupEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminUpdateAttributeForEnterpriseGroupRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminUpdateAttributeForEnterpriseGroupResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
