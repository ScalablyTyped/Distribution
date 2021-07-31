package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminListProvisionedIdentitiesEnterpriseEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminListProvisionedIdentitiesEnterpriseResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersEnterpriseAdminListProvisionedIdentitiesEnterpriseEndpoint extends StObject {
  
  var parameters: EnterpriseAdminListProvisionedIdentitiesEnterpriseEndpoint
  
  var response: OctokitResponse[EnterpriseAdminListProvisionedIdentitiesEnterpriseResponseData] & `16`
}
object ParametersEnterpriseAdminListProvisionedIdentitiesEnterpriseEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminListProvisionedIdentitiesEnterpriseEndpoint,
    response: OctokitResponse[EnterpriseAdminListProvisionedIdentitiesEnterpriseResponseData] & `16`
  ): ParametersEnterpriseAdminListProvisionedIdentitiesEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminListProvisionedIdentitiesEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminListProvisionedIdentitiesEnterpriseEndpointMutableBuilder[Self <: ParametersEnterpriseAdminListProvisionedIdentitiesEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: EnterpriseAdminListProvisionedIdentitiesEnterpriseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminListProvisionedIdentitiesEnterpriseResponseData] & `16`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
