package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminDeleteScimGroupFromEnterpriseEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminDeleteScimGroupFromEnterpriseRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersEnterpriseAdminDeleteScimGroupFromEnterpriseEndpoint extends StObject {
  
  var parameters: EnterpriseAdminDeleteScimGroupFromEnterpriseEndpoint
  
  var request: EnterpriseAdminDeleteScimGroupFromEnterpriseRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersEnterpriseAdminDeleteScimGroupFromEnterpriseEndpoint {
  
  inline def apply(
    parameters: EnterpriseAdminDeleteScimGroupFromEnterpriseEndpoint,
    request: EnterpriseAdminDeleteScimGroupFromEnterpriseRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersEnterpriseAdminDeleteScimGroupFromEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminDeleteScimGroupFromEnterpriseEndpoint]
  }
  
  extension [Self <: ParametersEnterpriseAdminDeleteScimGroupFromEnterpriseEndpoint](x: Self) {
    
    inline def setParameters(value: EnterpriseAdminDeleteScimGroupFromEnterpriseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: EnterpriseAdminDeleteScimGroupFromEnterpriseRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
