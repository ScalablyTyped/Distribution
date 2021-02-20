package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseRequestOptions
import typings.octokitTypes.endpointsMod.EnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseEndpoint extends StObject {
  
  var parameters: EnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseEndpoint = js.native
  
  var request: EnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseRequestOptions = js.native
  
  var response: OctokitResponse[EnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseResponseData] = js.native
}
object ParametersEnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseEndpoint,
    request: EnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseRequestOptions,
    response: OctokitResponse[EnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseResponseData]
  ): ParametersEnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseEndpointMutableBuilder[Self <: ParametersEnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: EnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
