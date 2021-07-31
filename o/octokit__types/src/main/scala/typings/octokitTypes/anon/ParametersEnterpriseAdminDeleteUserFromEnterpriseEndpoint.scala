package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminDeleteUserFromEnterpriseEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminDeleteUserFromEnterpriseRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersEnterpriseAdminDeleteUserFromEnterpriseEndpoint extends StObject {
  
  var parameters: EnterpriseAdminDeleteUserFromEnterpriseEndpoint
  
  var request: EnterpriseAdminDeleteUserFromEnterpriseRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersEnterpriseAdminDeleteUserFromEnterpriseEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminDeleteUserFromEnterpriseEndpoint,
    request: EnterpriseAdminDeleteUserFromEnterpriseRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersEnterpriseAdminDeleteUserFromEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminDeleteUserFromEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminDeleteUserFromEnterpriseEndpointMutableBuilder[Self <: ParametersEnterpriseAdminDeleteUserFromEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: EnterpriseAdminDeleteUserFromEnterpriseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminDeleteUserFromEnterpriseRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
