package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersEnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint extends StObject {
  
  var parameters: EnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint
  
  var response: OctokitResponse[EnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseResponseData] & DataArray
}
object ParametersEnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint {
  
  inline def apply(
    parameters: EnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint,
    response: OctokitResponse[EnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseResponseData] & DataArray
  ): ParametersEnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint]
  }
  
  extension [Self <: ParametersEnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint](x: Self) {
    
    inline def setParameters(value: EnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(
      value: OctokitResponse[EnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseResponseData] & DataArray
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
