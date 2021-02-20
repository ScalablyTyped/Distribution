package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsListReposLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsListReposLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsListReposLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsListReposLegacyEndpoint extends StObject {
  
  var parameters: TeamsListReposLegacyEndpoint = js.native
  
  var request: TeamsListReposLegacyRequestOptions = js.native
  
  var response: OctokitResponse[TeamsListReposLegacyResponseData] = js.native
}
object ParametersTeamsListReposLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsListReposLegacyEndpoint,
    request: TeamsListReposLegacyRequestOptions,
    response: OctokitResponse[TeamsListReposLegacyResponseData]
  ): ParametersTeamsListReposLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListReposLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsListReposLegacyEndpointMutableBuilder[Self <: ParametersTeamsListReposLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsListReposLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsListReposLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListReposLegacyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
