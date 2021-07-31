package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminDeleteSelfHostedRunnerFromEnterpriseEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminDeleteSelfHostedRunnerFromEnterpriseRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersEnterpriseAdminDeleteSelfHostedRunnerFromEnterpriseEndpoint extends StObject {
  
  var parameters: EnterpriseAdminDeleteSelfHostedRunnerFromEnterpriseEndpoint
  
  var request: EnterpriseAdminDeleteSelfHostedRunnerFromEnterpriseRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersEnterpriseAdminDeleteSelfHostedRunnerFromEnterpriseEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminDeleteSelfHostedRunnerFromEnterpriseEndpoint,
    request: EnterpriseAdminDeleteSelfHostedRunnerFromEnterpriseRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersEnterpriseAdminDeleteSelfHostedRunnerFromEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminDeleteSelfHostedRunnerFromEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminDeleteSelfHostedRunnerFromEnterpriseEndpointMutableBuilder[Self <: ParametersEnterpriseAdminDeleteSelfHostedRunnerFromEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: EnterpriseAdminDeleteSelfHostedRunnerFromEnterpriseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminDeleteSelfHostedRunnerFromEnterpriseRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
