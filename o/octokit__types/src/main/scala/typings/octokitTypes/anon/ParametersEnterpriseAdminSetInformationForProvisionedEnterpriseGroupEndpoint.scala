package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminSetInformationForProvisionedEnterpriseGroupEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminSetInformationForProvisionedEnterpriseGroupRequestOptions
import typings.octokitTypes.endpointsMod.EnterpriseAdminSetInformationForProvisionedEnterpriseGroupResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersEnterpriseAdminSetInformationForProvisionedEnterpriseGroupEndpoint extends StObject {
  
  var parameters: EnterpriseAdminSetInformationForProvisionedEnterpriseGroupEndpoint
  
  var request: EnterpriseAdminSetInformationForProvisionedEnterpriseGroupRequestOptions
  
  var response: OctokitResponse[EnterpriseAdminSetInformationForProvisionedEnterpriseGroupResponseData]
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
  implicit class ParametersEnterpriseAdminSetInformationForProvisionedEnterpriseGroupEndpointMutableBuilder[Self <: ParametersEnterpriseAdminSetInformationForProvisionedEnterpriseGroupEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: EnterpriseAdminSetInformationForProvisionedEnterpriseGroupEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminSetInformationForProvisionedEnterpriseGroupRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminSetInformationForProvisionedEnterpriseGroupResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
