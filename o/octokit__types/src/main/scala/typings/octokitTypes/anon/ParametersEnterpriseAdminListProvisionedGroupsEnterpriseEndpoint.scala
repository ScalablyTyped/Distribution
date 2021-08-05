package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminListProvisionedGroupsEnterpriseEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminListProvisionedGroupsEnterpriseRequestOptions
import typings.octokitTypes.endpointsMod.EnterpriseAdminListProvisionedGroupsEnterpriseResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersEnterpriseAdminListProvisionedGroupsEnterpriseEndpoint extends StObject {
  
  var parameters: EnterpriseAdminListProvisionedGroupsEnterpriseEndpoint
  
  var request: EnterpriseAdminListProvisionedGroupsEnterpriseRequestOptions
  
  var response: OctokitResponse[EnterpriseAdminListProvisionedGroupsEnterpriseResponseData]
}
object ParametersEnterpriseAdminListProvisionedGroupsEnterpriseEndpoint {
  
  inline def apply(
    parameters: EnterpriseAdminListProvisionedGroupsEnterpriseEndpoint,
    request: EnterpriseAdminListProvisionedGroupsEnterpriseRequestOptions,
    response: OctokitResponse[EnterpriseAdminListProvisionedGroupsEnterpriseResponseData]
  ): ParametersEnterpriseAdminListProvisionedGroupsEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminListProvisionedGroupsEnterpriseEndpoint]
  }
  
  extension [Self <: ParametersEnterpriseAdminListProvisionedGroupsEnterpriseEndpoint](x: Self) {
    
    inline def setParameters(value: EnterpriseAdminListProvisionedGroupsEnterpriseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: EnterpriseAdminListProvisionedGroupsEnterpriseRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[EnterpriseAdminListProvisionedGroupsEnterpriseResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
