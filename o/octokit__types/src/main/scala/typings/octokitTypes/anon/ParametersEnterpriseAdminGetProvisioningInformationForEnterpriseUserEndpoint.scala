package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminGetProvisioningInformationForEnterpriseUserEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminGetProvisioningInformationForEnterpriseUserRequestOptions
import typings.octokitTypes.endpointsMod.EnterpriseAdminGetProvisioningInformationForEnterpriseUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersEnterpriseAdminGetProvisioningInformationForEnterpriseUserEndpoint extends StObject {
  
  var parameters: EnterpriseAdminGetProvisioningInformationForEnterpriseUserEndpoint
  
  var request: EnterpriseAdminGetProvisioningInformationForEnterpriseUserRequestOptions
  
  var response: OctokitResponse[EnterpriseAdminGetProvisioningInformationForEnterpriseUserResponseData]
}
object ParametersEnterpriseAdminGetProvisioningInformationForEnterpriseUserEndpoint {
  
  inline def apply(
    parameters: EnterpriseAdminGetProvisioningInformationForEnterpriseUserEndpoint,
    request: EnterpriseAdminGetProvisioningInformationForEnterpriseUserRequestOptions,
    response: OctokitResponse[EnterpriseAdminGetProvisioningInformationForEnterpriseUserResponseData]
  ): ParametersEnterpriseAdminGetProvisioningInformationForEnterpriseUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminGetProvisioningInformationForEnterpriseUserEndpoint]
  }
  
  extension [Self <: ParametersEnterpriseAdminGetProvisioningInformationForEnterpriseUserEndpoint](x: Self) {
    
    inline def setParameters(value: EnterpriseAdminGetProvisioningInformationForEnterpriseUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: EnterpriseAdminGetProvisioningInformationForEnterpriseUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[EnterpriseAdminGetProvisioningInformationForEnterpriseUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
