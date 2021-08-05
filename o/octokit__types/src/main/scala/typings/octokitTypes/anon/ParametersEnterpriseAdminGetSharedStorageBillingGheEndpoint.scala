package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminGetSharedStorageBillingGheEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminGetSharedStorageBillingGheRequestOptions
import typings.octokitTypes.endpointsMod.EnterpriseAdminGetSharedStorageBillingGheResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersEnterpriseAdminGetSharedStorageBillingGheEndpoint extends StObject {
  
  var parameters: EnterpriseAdminGetSharedStorageBillingGheEndpoint
  
  var request: EnterpriseAdminGetSharedStorageBillingGheRequestOptions
  
  var response: OctokitResponse[EnterpriseAdminGetSharedStorageBillingGheResponseData]
}
object ParametersEnterpriseAdminGetSharedStorageBillingGheEndpoint {
  
  inline def apply(
    parameters: EnterpriseAdminGetSharedStorageBillingGheEndpoint,
    request: EnterpriseAdminGetSharedStorageBillingGheRequestOptions,
    response: OctokitResponse[EnterpriseAdminGetSharedStorageBillingGheResponseData]
  ): ParametersEnterpriseAdminGetSharedStorageBillingGheEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminGetSharedStorageBillingGheEndpoint]
  }
  
  extension [Self <: ParametersEnterpriseAdminGetSharedStorageBillingGheEndpoint](x: Self) {
    
    inline def setParameters(value: EnterpriseAdminGetSharedStorageBillingGheEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: EnterpriseAdminGetSharedStorageBillingGheRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[EnterpriseAdminGetSharedStorageBillingGheResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
