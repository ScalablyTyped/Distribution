package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetCommunityProfileMetricsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetCommunityProfileMetricsRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetCommunityProfileMetricsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposGetCommunityProfileMetricsEndpoint extends StObject {
  
  var parameters: ReposGetCommunityProfileMetricsEndpoint
  
  var request: ReposGetCommunityProfileMetricsRequestOptions
  
  var response: OctokitResponse[ReposGetCommunityProfileMetricsResponseData]
}
object ParametersReposGetCommunityProfileMetricsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetCommunityProfileMetricsEndpoint,
    request: ReposGetCommunityProfileMetricsRequestOptions,
    response: OctokitResponse[ReposGetCommunityProfileMetricsResponseData]
  ): ParametersReposGetCommunityProfileMetricsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetCommunityProfileMetricsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetCommunityProfileMetricsEndpointMutableBuilder[Self <: ParametersReposGetCommunityProfileMetricsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetCommunityProfileMetricsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetCommunityProfileMetricsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetCommunityProfileMetricsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
