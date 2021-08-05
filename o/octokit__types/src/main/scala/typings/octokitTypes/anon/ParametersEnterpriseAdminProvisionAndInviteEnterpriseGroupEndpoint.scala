package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminProvisionAndInviteEnterpriseGroupEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminProvisionAndInviteEnterpriseGroupRequestOptions
import typings.octokitTypes.endpointsMod.EnterpriseAdminProvisionAndInviteEnterpriseGroupResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersEnterpriseAdminProvisionAndInviteEnterpriseGroupEndpoint extends StObject {
  
  var parameters: EnterpriseAdminProvisionAndInviteEnterpriseGroupEndpoint
  
  var request: EnterpriseAdminProvisionAndInviteEnterpriseGroupRequestOptions
  
  var response: OctokitResponse[EnterpriseAdminProvisionAndInviteEnterpriseGroupResponseData]
}
object ParametersEnterpriseAdminProvisionAndInviteEnterpriseGroupEndpoint {
  
  inline def apply(
    parameters: EnterpriseAdminProvisionAndInviteEnterpriseGroupEndpoint,
    request: EnterpriseAdminProvisionAndInviteEnterpriseGroupRequestOptions,
    response: OctokitResponse[EnterpriseAdminProvisionAndInviteEnterpriseGroupResponseData]
  ): ParametersEnterpriseAdminProvisionAndInviteEnterpriseGroupEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminProvisionAndInviteEnterpriseGroupEndpoint]
  }
  
  extension [Self <: ParametersEnterpriseAdminProvisionAndInviteEnterpriseGroupEndpoint](x: Self) {
    
    inline def setParameters(value: EnterpriseAdminProvisionAndInviteEnterpriseGroupEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: EnterpriseAdminProvisionAndInviteEnterpriseGroupRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[EnterpriseAdminProvisionAndInviteEnterpriseGroupResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
