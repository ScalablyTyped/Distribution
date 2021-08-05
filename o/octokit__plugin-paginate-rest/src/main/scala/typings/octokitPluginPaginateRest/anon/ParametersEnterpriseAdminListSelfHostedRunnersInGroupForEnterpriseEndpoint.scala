package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersEnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseEndpoint extends StObject {
  
  var parameters: EnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseEndpoint
  
  var response: OctokitResponse[EnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseResponseData] & `0`
}
object ParametersEnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseEndpoint {
  
  inline def apply(
    parameters: EnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseEndpoint,
    response: OctokitResponse[EnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseResponseData] & `0`
  ): ParametersEnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseEndpoint]
  }
  
  extension [Self <: ParametersEnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseEndpoint](x: Self) {
    
    inline def setParameters(value: EnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[EnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseResponseData] & `0`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
