package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminProvisionAndInviteEnterpriseUserEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminProvisionAndInviteEnterpriseUserRequestOptions
import typings.octokitTypes.endpointsMod.EnterpriseAdminProvisionAndInviteEnterpriseUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersEnterpriseAdminProvisionAndInviteEnterpriseUserEndpoint extends StObject {
  
  var parameters: EnterpriseAdminProvisionAndInviteEnterpriseUserEndpoint
  
  var request: EnterpriseAdminProvisionAndInviteEnterpriseUserRequestOptions
  
  var response: OctokitResponse[EnterpriseAdminProvisionAndInviteEnterpriseUserResponseData]
}
object ParametersEnterpriseAdminProvisionAndInviteEnterpriseUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminProvisionAndInviteEnterpriseUserEndpoint,
    request: EnterpriseAdminProvisionAndInviteEnterpriseUserRequestOptions,
    response: OctokitResponse[EnterpriseAdminProvisionAndInviteEnterpriseUserResponseData]
  ): ParametersEnterpriseAdminProvisionAndInviteEnterpriseUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminProvisionAndInviteEnterpriseUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminProvisionAndInviteEnterpriseUserEndpointMutableBuilder[Self <: ParametersEnterpriseAdminProvisionAndInviteEnterpriseUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: EnterpriseAdminProvisionAndInviteEnterpriseUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminProvisionAndInviteEnterpriseUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminProvisionAndInviteEnterpriseUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
