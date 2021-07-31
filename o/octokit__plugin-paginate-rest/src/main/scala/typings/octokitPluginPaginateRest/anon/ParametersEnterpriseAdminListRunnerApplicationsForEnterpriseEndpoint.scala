package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminListRunnerApplicationsForEnterpriseEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminListRunnerApplicationsForEnterpriseResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersEnterpriseAdminListRunnerApplicationsForEnterpriseEndpoint extends StObject {
  
  var parameters: EnterpriseAdminListRunnerApplicationsForEnterpriseEndpoint
  
  var response: OctokitResponse[EnterpriseAdminListRunnerApplicationsForEnterpriseResponseData]
}
object ParametersEnterpriseAdminListRunnerApplicationsForEnterpriseEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminListRunnerApplicationsForEnterpriseEndpoint,
    response: OctokitResponse[EnterpriseAdminListRunnerApplicationsForEnterpriseResponseData]
  ): ParametersEnterpriseAdminListRunnerApplicationsForEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminListRunnerApplicationsForEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminListRunnerApplicationsForEnterpriseEndpointMutableBuilder[Self <: ParametersEnterpriseAdminListRunnerApplicationsForEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: EnterpriseAdminListRunnerApplicationsForEnterpriseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminListRunnerApplicationsForEnterpriseResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
