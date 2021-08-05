package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.BillingGetSharedStorageBillingUserEndpoint
import typings.octokitTypes.endpointsMod.BillingGetSharedStorageBillingUserRequestOptions
import typings.octokitTypes.endpointsMod.BillingGetSharedStorageBillingUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersBillingGetSharedStorageBillingUserEndpoint extends StObject {
  
  var parameters: BillingGetSharedStorageBillingUserEndpoint
  
  var request: BillingGetSharedStorageBillingUserRequestOptions
  
  var response: OctokitResponse[BillingGetSharedStorageBillingUserResponseData]
}
object ParametersBillingGetSharedStorageBillingUserEndpoint {
  
  inline def apply(
    parameters: BillingGetSharedStorageBillingUserEndpoint,
    request: BillingGetSharedStorageBillingUserRequestOptions,
    response: OctokitResponse[BillingGetSharedStorageBillingUserResponseData]
  ): ParametersBillingGetSharedStorageBillingUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersBillingGetSharedStorageBillingUserEndpoint]
  }
  
  extension [Self <: ParametersBillingGetSharedStorageBillingUserEndpoint](x: Self) {
    
    inline def setParameters(value: BillingGetSharedStorageBillingUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: BillingGetSharedStorageBillingUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[BillingGetSharedStorageBillingUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
