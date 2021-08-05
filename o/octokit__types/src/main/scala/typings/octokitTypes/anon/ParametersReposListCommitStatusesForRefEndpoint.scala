package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListCommitStatusesForRefEndpoint
import typings.octokitTypes.endpointsMod.ReposListCommitStatusesForRefRequestOptions
import typings.octokitTypes.endpointsMod.ReposListCommitStatusesForRefResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposListCommitStatusesForRefEndpoint extends StObject {
  
  var parameters: ReposListCommitStatusesForRefEndpoint
  
  var request: ReposListCommitStatusesForRefRequestOptions
  
  var response: OctokitResponse[ReposListCommitStatusesForRefResponseData]
}
object ParametersReposListCommitStatusesForRefEndpoint {
  
  inline def apply(
    parameters: ReposListCommitStatusesForRefEndpoint,
    request: ReposListCommitStatusesForRefRequestOptions,
    response: OctokitResponse[ReposListCommitStatusesForRefResponseData]
  ): ParametersReposListCommitStatusesForRefEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListCommitStatusesForRefEndpoint]
  }
  
  extension [Self <: ParametersReposListCommitStatusesForRefEndpoint](x: Self) {
    
    inline def setParameters(value: ReposListCommitStatusesForRefEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposListCommitStatusesForRefRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposListCommitStatusesForRefResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
