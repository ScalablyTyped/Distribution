package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminListProvisionedGroupsEnterpriseEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminListProvisionedGroupsEnterpriseResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersEnterpriseAdminListProvisionedGroupsEnterpriseEndpoint extends StObject {
  
  var parameters: EnterpriseAdminListProvisionedGroupsEnterpriseEndpoint
  
  var response: OctokitResponse[EnterpriseAdminListProvisionedGroupsEnterpriseResponseData] & `16`
}
object ParametersEnterpriseAdminListProvisionedGroupsEnterpriseEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminListProvisionedGroupsEnterpriseEndpoint,
    response: OctokitResponse[EnterpriseAdminListProvisionedGroupsEnterpriseResponseData] & `16`
  ): ParametersEnterpriseAdminListProvisionedGroupsEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminListProvisionedGroupsEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminListProvisionedGroupsEnterpriseEndpointMutableBuilder[Self <: ParametersEnterpriseAdminListProvisionedGroupsEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: EnterpriseAdminListProvisionedGroupsEnterpriseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminListProvisionedGroupsEnterpriseResponseData] & `16`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
