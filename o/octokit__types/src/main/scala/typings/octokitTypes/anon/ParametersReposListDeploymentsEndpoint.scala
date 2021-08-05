package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListDeploymentsEndpoint
import typings.octokitTypes.endpointsMod.ReposListDeploymentsRequestOptions
import typings.octokitTypes.endpointsMod.ReposListDeploymentsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposListDeploymentsEndpoint extends StObject {
  
  var parameters: ReposListDeploymentsEndpoint
  
  var request: ReposListDeploymentsRequestOptions
  
  var response: OctokitResponse[ReposListDeploymentsResponseData]
}
object ParametersReposListDeploymentsEndpoint {
  
  inline def apply(
    parameters: ReposListDeploymentsEndpoint,
    request: ReposListDeploymentsRequestOptions,
    response: OctokitResponse[ReposListDeploymentsResponseData]
  ): ParametersReposListDeploymentsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListDeploymentsEndpoint]
  }
  
  extension [Self <: ParametersReposListDeploymentsEndpoint](x: Self) {
    
    inline def setParameters(value: ReposListDeploymentsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposListDeploymentsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposListDeploymentsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
