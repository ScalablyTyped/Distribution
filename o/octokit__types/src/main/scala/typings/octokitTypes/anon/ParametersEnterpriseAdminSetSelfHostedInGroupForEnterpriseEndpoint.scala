package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminSetSelfHostedInGroupForEnterpriseEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminSetSelfHostedInGroupForEnterpriseRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEnterpriseAdminSetSelfHostedInGroupForEnterpriseEndpoint extends StObject {
  
  var parameters: EnterpriseAdminSetSelfHostedInGroupForEnterpriseEndpoint = js.native
  
  var request: EnterpriseAdminSetSelfHostedInGroupForEnterpriseRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersEnterpriseAdminSetSelfHostedInGroupForEnterpriseEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminSetSelfHostedInGroupForEnterpriseEndpoint,
    request: EnterpriseAdminSetSelfHostedInGroupForEnterpriseRequestOptions,
    response: OctokitResponse[_]
  ): ParametersEnterpriseAdminSetSelfHostedInGroupForEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminSetSelfHostedInGroupForEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminSetSelfHostedInGroupForEnterpriseEndpointMutableBuilder[Self <: ParametersEnterpriseAdminSetSelfHostedInGroupForEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: EnterpriseAdminSetSelfHostedInGroupForEnterpriseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminSetSelfHostedInGroupForEnterpriseRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
