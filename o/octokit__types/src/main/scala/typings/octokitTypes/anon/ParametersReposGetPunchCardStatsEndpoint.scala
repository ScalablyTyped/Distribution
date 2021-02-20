package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetPunchCardStatsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetPunchCardStatsRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetPunchCardStatsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetPunchCardStatsEndpoint extends StObject {
  
  var parameters: ReposGetPunchCardStatsEndpoint = js.native
  
  var request: ReposGetPunchCardStatsRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetPunchCardStatsResponseData] = js.native
}
object ParametersReposGetPunchCardStatsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetPunchCardStatsEndpoint,
    request: ReposGetPunchCardStatsRequestOptions,
    response: OctokitResponse[ReposGetPunchCardStatsResponseData]
  ): ParametersReposGetPunchCardStatsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetPunchCardStatsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetPunchCardStatsEndpointMutableBuilder[Self <: ParametersReposGetPunchCardStatsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetPunchCardStatsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetPunchCardStatsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetPunchCardStatsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
