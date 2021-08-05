package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetCommitActivityStatsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetCommitActivityStatsRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetCommitActivityStatsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposGetCommitActivityStatsEndpoint extends StObject {
  
  var parameters: ReposGetCommitActivityStatsEndpoint
  
  var request: ReposGetCommitActivityStatsRequestOptions
  
  var response: OctokitResponse[ReposGetCommitActivityStatsResponseData]
}
object ParametersReposGetCommitActivityStatsEndpoint {
  
  inline def apply(
    parameters: ReposGetCommitActivityStatsEndpoint,
    request: ReposGetCommitActivityStatsRequestOptions,
    response: OctokitResponse[ReposGetCommitActivityStatsResponseData]
  ): ParametersReposGetCommitActivityStatsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetCommitActivityStatsEndpoint]
  }
  
  extension [Self <: ParametersReposGetCommitActivityStatsEndpoint](x: Self) {
    
    inline def setParameters(value: ReposGetCommitActivityStatsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposGetCommitActivityStatsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposGetCommitActivityStatsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
