package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminGetSharedStorageBillingGheDeprecatedEnterpriseIdEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminGetSharedStorageBillingGheRequestOptions
import typings.octokitTypes.endpointsMod.EnterpriseAdminGetSharedStorageBillingGheResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersEnterpriseAdminGetSharedStorageBillingGheDeprecatedEnterpriseIdEndpoint extends StObject {
  
  var parameters: EnterpriseAdminGetSharedStorageBillingGheDeprecatedEnterpriseIdEndpoint
  
  var request: EnterpriseAdminGetSharedStorageBillingGheRequestOptions
  
  var response: OctokitResponse[EnterpriseAdminGetSharedStorageBillingGheResponseData]
}
object ParametersEnterpriseAdminGetSharedStorageBillingGheDeprecatedEnterpriseIdEndpoint {
  
  inline def apply(
    parameters: EnterpriseAdminGetSharedStorageBillingGheDeprecatedEnterpriseIdEndpoint,
    request: EnterpriseAdminGetSharedStorageBillingGheRequestOptions,
    response: OctokitResponse[EnterpriseAdminGetSharedStorageBillingGheResponseData]
  ): ParametersEnterpriseAdminGetSharedStorageBillingGheDeprecatedEnterpriseIdEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminGetSharedStorageBillingGheDeprecatedEnterpriseIdEndpoint]
  }
  
  extension [Self <: ParametersEnterpriseAdminGetSharedStorageBillingGheDeprecatedEnterpriseIdEndpoint](x: Self) {
    
    inline def setParameters(value: EnterpriseAdminGetSharedStorageBillingGheDeprecatedEnterpriseIdEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: EnterpriseAdminGetSharedStorageBillingGheRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[EnterpriseAdminGetSharedStorageBillingGheResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
