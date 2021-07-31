package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminCreateSelfHostedRunnerGroupForEnterpriseEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminCreateSelfHostedRunnerGroupForEnterpriseRequestOptions
import typings.octokitTypes.endpointsMod.EnterpriseAdminCreateSelfHostedRunnerGroupForEnterpriseResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersEnterpriseAdminCreateSelfHostedRunnerGroupForEnterpriseEndpoint extends StObject {
  
  var parameters: EnterpriseAdminCreateSelfHostedRunnerGroupForEnterpriseEndpoint
  
  var request: EnterpriseAdminCreateSelfHostedRunnerGroupForEnterpriseRequestOptions
  
  var response: OctokitResponse[EnterpriseAdminCreateSelfHostedRunnerGroupForEnterpriseResponseData]
}
object ParametersEnterpriseAdminCreateSelfHostedRunnerGroupForEnterpriseEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminCreateSelfHostedRunnerGroupForEnterpriseEndpoint,
    request: EnterpriseAdminCreateSelfHostedRunnerGroupForEnterpriseRequestOptions,
    response: OctokitResponse[EnterpriseAdminCreateSelfHostedRunnerGroupForEnterpriseResponseData]
  ): ParametersEnterpriseAdminCreateSelfHostedRunnerGroupForEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminCreateSelfHostedRunnerGroupForEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminCreateSelfHostedRunnerGroupForEnterpriseEndpointMutableBuilder[Self <: ParametersEnterpriseAdminCreateSelfHostedRunnerGroupForEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: EnterpriseAdminCreateSelfHostedRunnerGroupForEnterpriseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminCreateSelfHostedRunnerGroupForEnterpriseRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminCreateSelfHostedRunnerGroupForEnterpriseResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
