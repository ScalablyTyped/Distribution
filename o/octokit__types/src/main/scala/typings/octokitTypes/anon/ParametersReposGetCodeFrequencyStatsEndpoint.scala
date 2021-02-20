package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetCodeFrequencyStatsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetCodeFrequencyStatsRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetCodeFrequencyStatsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetCodeFrequencyStatsEndpoint extends StObject {
  
  var parameters: ReposGetCodeFrequencyStatsEndpoint = js.native
  
  var request: ReposGetCodeFrequencyStatsRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetCodeFrequencyStatsResponseData] = js.native
}
object ParametersReposGetCodeFrequencyStatsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetCodeFrequencyStatsEndpoint,
    request: ReposGetCodeFrequencyStatsRequestOptions,
    response: OctokitResponse[ReposGetCodeFrequencyStatsResponseData]
  ): ParametersReposGetCodeFrequencyStatsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetCodeFrequencyStatsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetCodeFrequencyStatsEndpointMutableBuilder[Self <: ParametersReposGetCodeFrequencyStatsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetCodeFrequencyStatsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetCodeFrequencyStatsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetCodeFrequencyStatsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
