package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetParticipationStatsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetParticipationStatsRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetParticipationStatsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposGetParticipationStatsEndpoint extends StObject {
  
  var parameters: ReposGetParticipationStatsEndpoint
  
  var request: ReposGetParticipationStatsRequestOptions
  
  var response: OctokitResponse[ReposGetParticipationStatsResponseData]
}
object ParametersReposGetParticipationStatsEndpoint {
  
  inline def apply(
    parameters: ReposGetParticipationStatsEndpoint,
    request: ReposGetParticipationStatsRequestOptions,
    response: OctokitResponse[ReposGetParticipationStatsResponseData]
  ): ParametersReposGetParticipationStatsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetParticipationStatsEndpoint]
  }
  
  extension [Self <: ParametersReposGetParticipationStatsEndpoint](x: Self) {
    
    inline def setParameters(value: ReposGetParticipationStatsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposGetParticipationStatsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposGetParticipationStatsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
