package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminDeleteSelfHostedRunnerGroupFromEnterpriseEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminDeleteSelfHostedRunnerGroupFromEnterpriseRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEnterpriseAdminDeleteSelfHostedRunnerGroupFromEnterpriseEndpoint extends StObject {
  
  var parameters: EnterpriseAdminDeleteSelfHostedRunnerGroupFromEnterpriseEndpoint = js.native
  
  var request: EnterpriseAdminDeleteSelfHostedRunnerGroupFromEnterpriseRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersEnterpriseAdminDeleteSelfHostedRunnerGroupFromEnterpriseEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminDeleteSelfHostedRunnerGroupFromEnterpriseEndpoint,
    request: EnterpriseAdminDeleteSelfHostedRunnerGroupFromEnterpriseRequestOptions,
    response: OctokitResponse[_]
  ): ParametersEnterpriseAdminDeleteSelfHostedRunnerGroupFromEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminDeleteSelfHostedRunnerGroupFromEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminDeleteSelfHostedRunnerGroupFromEnterpriseEndpointMutableBuilder[Self <: ParametersEnterpriseAdminDeleteSelfHostedRunnerGroupFromEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: EnterpriseAdminDeleteSelfHostedRunnerGroupFromEnterpriseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminDeleteSelfHostedRunnerGroupFromEnterpriseRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
