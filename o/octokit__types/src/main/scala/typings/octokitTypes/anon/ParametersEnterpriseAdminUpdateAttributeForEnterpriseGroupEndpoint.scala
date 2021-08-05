package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminUpdateAttributeForEnterpriseGroupEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminUpdateAttributeForEnterpriseGroupRequestOptions
import typings.octokitTypes.endpointsMod.EnterpriseAdminUpdateAttributeForEnterpriseGroupResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersEnterpriseAdminUpdateAttributeForEnterpriseGroupEndpoint extends StObject {
  
  var parameters: EnterpriseAdminUpdateAttributeForEnterpriseGroupEndpoint
  
  var request: EnterpriseAdminUpdateAttributeForEnterpriseGroupRequestOptions
  
  var response: OctokitResponse[EnterpriseAdminUpdateAttributeForEnterpriseGroupResponseData]
}
object ParametersEnterpriseAdminUpdateAttributeForEnterpriseGroupEndpoint {
  
  inline def apply(
    parameters: EnterpriseAdminUpdateAttributeForEnterpriseGroupEndpoint,
    request: EnterpriseAdminUpdateAttributeForEnterpriseGroupRequestOptions,
    response: OctokitResponse[EnterpriseAdminUpdateAttributeForEnterpriseGroupResponseData]
  ): ParametersEnterpriseAdminUpdateAttributeForEnterpriseGroupEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminUpdateAttributeForEnterpriseGroupEndpoint]
  }
  
  extension [Self <: ParametersEnterpriseAdminUpdateAttributeForEnterpriseGroupEndpoint](x: Self) {
    
    inline def setParameters(value: EnterpriseAdminUpdateAttributeForEnterpriseGroupEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: EnterpriseAdminUpdateAttributeForEnterpriseGroupRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[EnterpriseAdminUpdateAttributeForEnterpriseGroupResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
