package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminSetOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminSetOrgAccessToSelfHostedRunnerGroupInEnterpriseRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersEnterpriseAdminSetOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint extends StObject {
  
  var parameters: EnterpriseAdminSetOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint
  
  var request: EnterpriseAdminSetOrgAccessToSelfHostedRunnerGroupInEnterpriseRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersEnterpriseAdminSetOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint {
  
  inline def apply(
    parameters: EnterpriseAdminSetOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint,
    request: EnterpriseAdminSetOrgAccessToSelfHostedRunnerGroupInEnterpriseRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersEnterpriseAdminSetOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminSetOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint]
  }
  
  extension [Self <: ParametersEnterpriseAdminSetOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint](x: Self) {
    
    inline def setParameters(value: EnterpriseAdminSetOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: EnterpriseAdminSetOrgAccessToSelfHostedRunnerGroupInEnterpriseRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
