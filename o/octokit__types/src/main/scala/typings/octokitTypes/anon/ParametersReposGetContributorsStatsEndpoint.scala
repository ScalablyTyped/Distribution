package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetContributorsStatsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetContributorsStatsRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetContributorsStatsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposGetContributorsStatsEndpoint extends StObject {
  
  var parameters: ReposGetContributorsStatsEndpoint
  
  var request: ReposGetContributorsStatsRequestOptions
  
  var response: OctokitResponse[ReposGetContributorsStatsResponseData]
}
object ParametersReposGetContributorsStatsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetContributorsStatsEndpoint,
    request: ReposGetContributorsStatsRequestOptions,
    response: OctokitResponse[ReposGetContributorsStatsResponseData]
  ): ParametersReposGetContributorsStatsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetContributorsStatsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetContributorsStatsEndpointMutableBuilder[Self <: ParametersReposGetContributorsStatsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetContributorsStatsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetContributorsStatsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetContributorsStatsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
