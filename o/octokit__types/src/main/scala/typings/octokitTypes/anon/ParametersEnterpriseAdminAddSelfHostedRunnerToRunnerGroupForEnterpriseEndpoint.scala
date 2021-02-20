package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminAddSelfHostedRunnerToRunnerGroupForEnterpriseEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminAddSelfHostedRunnerToRunnerGroupForEnterpriseRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEnterpriseAdminAddSelfHostedRunnerToRunnerGroupForEnterpriseEndpoint extends StObject {
  
  var parameters: EnterpriseAdminAddSelfHostedRunnerToRunnerGroupForEnterpriseEndpoint = js.native
  
  var request: EnterpriseAdminAddSelfHostedRunnerToRunnerGroupForEnterpriseRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersEnterpriseAdminAddSelfHostedRunnerToRunnerGroupForEnterpriseEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminAddSelfHostedRunnerToRunnerGroupForEnterpriseEndpoint,
    request: EnterpriseAdminAddSelfHostedRunnerToRunnerGroupForEnterpriseRequestOptions,
    response: OctokitResponse[_]
  ): ParametersEnterpriseAdminAddSelfHostedRunnerToRunnerGroupForEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminAddSelfHostedRunnerToRunnerGroupForEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminAddSelfHostedRunnerToRunnerGroupForEnterpriseEndpointMutableBuilder[Self <: ParametersEnterpriseAdminAddSelfHostedRunnerToRunnerGroupForEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: EnterpriseAdminAddSelfHostedRunnerToRunnerGroupForEnterpriseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminAddSelfHostedRunnerToRunnerGroupForEnterpriseRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
