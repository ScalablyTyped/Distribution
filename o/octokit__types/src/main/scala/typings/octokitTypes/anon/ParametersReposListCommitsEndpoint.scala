package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListCommitsEndpoint
import typings.octokitTypes.endpointsMod.ReposListCommitsRequestOptions
import typings.octokitTypes.endpointsMod.ReposListCommitsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposListCommitsEndpoint extends StObject {
  
  var parameters: ReposListCommitsEndpoint
  
  var request: ReposListCommitsRequestOptions
  
  var response: OctokitResponse[ReposListCommitsResponseData]
}
object ParametersReposListCommitsEndpoint {
  
  inline def apply(
    parameters: ReposListCommitsEndpoint,
    request: ReposListCommitsRequestOptions,
    response: OctokitResponse[ReposListCommitsResponseData]
  ): ParametersReposListCommitsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListCommitsEndpoint]
  }
  
  extension [Self <: ParametersReposListCommitsEndpoint](x: Self) {
    
    inline def setParameters(value: ReposListCommitsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposListCommitsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposListCommitsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
