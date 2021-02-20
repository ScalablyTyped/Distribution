package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminListRunnerApplicationsForEnterpriseEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminListRunnerApplicationsForEnterpriseRequestOptions
import typings.octokitTypes.endpointsMod.EnterpriseAdminListRunnerApplicationsForEnterpriseResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEnterpriseAdminListRunnerApplicationsForEnterpriseEndpoint extends StObject {
  
  var parameters: EnterpriseAdminListRunnerApplicationsForEnterpriseEndpoint = js.native
  
  var request: EnterpriseAdminListRunnerApplicationsForEnterpriseRequestOptions = js.native
  
  var response: OctokitResponse[EnterpriseAdminListRunnerApplicationsForEnterpriseResponseData] = js.native
}
object ParametersEnterpriseAdminListRunnerApplicationsForEnterpriseEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminListRunnerApplicationsForEnterpriseEndpoint,
    request: EnterpriseAdminListRunnerApplicationsForEnterpriseRequestOptions,
    response: OctokitResponse[EnterpriseAdminListRunnerApplicationsForEnterpriseResponseData]
  ): ParametersEnterpriseAdminListRunnerApplicationsForEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminListRunnerApplicationsForEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminListRunnerApplicationsForEnterpriseEndpointMutableBuilder[Self <: ParametersEnterpriseAdminListRunnerApplicationsForEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: EnterpriseAdminListRunnerApplicationsForEnterpriseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminListRunnerApplicationsForEnterpriseRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminListRunnerApplicationsForEnterpriseResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
