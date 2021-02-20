package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseRequestOptions
import typings.octokitTypes.endpointsMod.EnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseEndpoint extends StObject {
  
  var parameters: EnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseEndpoint = js.native
  
  var request: EnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseRequestOptions = js.native
  
  var response: OctokitResponse[EnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseResponseData] = js.native
}
object ParametersEnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseEndpoint,
    request: EnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseRequestOptions,
    response: OctokitResponse[EnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseResponseData]
  ): ParametersEnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseEndpointMutableBuilder[Self <: ParametersEnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: EnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
