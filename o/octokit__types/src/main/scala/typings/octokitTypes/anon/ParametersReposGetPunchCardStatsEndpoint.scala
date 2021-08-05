package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetPunchCardStatsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetPunchCardStatsRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetPunchCardStatsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposGetPunchCardStatsEndpoint extends StObject {
  
  var parameters: ReposGetPunchCardStatsEndpoint
  
  var request: ReposGetPunchCardStatsRequestOptions
  
  var response: OctokitResponse[ReposGetPunchCardStatsResponseData]
}
object ParametersReposGetPunchCardStatsEndpoint {
  
  inline def apply(
    parameters: ReposGetPunchCardStatsEndpoint,
    request: ReposGetPunchCardStatsRequestOptions,
    response: OctokitResponse[ReposGetPunchCardStatsResponseData]
  ): ParametersReposGetPunchCardStatsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetPunchCardStatsEndpoint]
  }
  
  extension [Self <: ParametersReposGetPunchCardStatsEndpoint](x: Self) {
    
    inline def setParameters(value: ReposGetPunchCardStatsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposGetPunchCardStatsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposGetPunchCardStatsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
