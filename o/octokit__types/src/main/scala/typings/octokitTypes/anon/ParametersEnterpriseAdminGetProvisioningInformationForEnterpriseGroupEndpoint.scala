package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminGetProvisioningInformationForEnterpriseGroupEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminGetProvisioningInformationForEnterpriseGroupRequestOptions
import typings.octokitTypes.endpointsMod.EnterpriseAdminGetProvisioningInformationForEnterpriseGroupResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersEnterpriseAdminGetProvisioningInformationForEnterpriseGroupEndpoint extends StObject {
  
  var parameters: EnterpriseAdminGetProvisioningInformationForEnterpriseGroupEndpoint
  
  var request: EnterpriseAdminGetProvisioningInformationForEnterpriseGroupRequestOptions
  
  var response: OctokitResponse[EnterpriseAdminGetProvisioningInformationForEnterpriseGroupResponseData]
}
object ParametersEnterpriseAdminGetProvisioningInformationForEnterpriseGroupEndpoint {
  
  inline def apply(
    parameters: EnterpriseAdminGetProvisioningInformationForEnterpriseGroupEndpoint,
    request: EnterpriseAdminGetProvisioningInformationForEnterpriseGroupRequestOptions,
    response: OctokitResponse[EnterpriseAdminGetProvisioningInformationForEnterpriseGroupResponseData]
  ): ParametersEnterpriseAdminGetProvisioningInformationForEnterpriseGroupEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminGetProvisioningInformationForEnterpriseGroupEndpoint]
  }
  
  extension [Self <: ParametersEnterpriseAdminGetProvisioningInformationForEnterpriseGroupEndpoint](x: Self) {
    
    inline def setParameters(value: EnterpriseAdminGetProvisioningInformationForEnterpriseGroupEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: EnterpriseAdminGetProvisioningInformationForEnterpriseGroupRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[EnterpriseAdminGetProvisioningInformationForEnterpriseGroupResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
