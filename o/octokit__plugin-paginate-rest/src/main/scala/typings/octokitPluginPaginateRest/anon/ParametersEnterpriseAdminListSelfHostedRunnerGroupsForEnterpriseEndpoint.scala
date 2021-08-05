package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersEnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseEndpoint extends StObject {
  
  var parameters: EnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseEndpoint
  
  var response: OctokitResponse[EnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseResponseData] & Data
}
object ParametersEnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseEndpoint {
  
  inline def apply(
    parameters: EnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseEndpoint,
    response: OctokitResponse[EnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseResponseData] & Data
  ): ParametersEnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseEndpoint]
  }
  
  extension [Self <: ParametersEnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseEndpoint](x: Self) {
    
    inline def setParameters(value: EnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[EnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseResponseData] & Data): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
