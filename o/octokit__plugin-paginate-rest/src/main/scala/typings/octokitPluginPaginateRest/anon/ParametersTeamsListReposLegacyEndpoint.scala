package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.TeamsListReposLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsListReposLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsListReposLegacyEndpoint extends StObject {
  
  var parameters: TeamsListReposLegacyEndpoint = js.native
  
  var response: OctokitResponse[TeamsListReposLegacyResponseData] = js.native
}
object ParametersTeamsListReposLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsListReposLegacyEndpoint,
    response: OctokitResponse[TeamsListReposLegacyResponseData]
  ): ParametersTeamsListReposLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListReposLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsListReposLegacyEndpointMutableBuilder[Self <: ParametersTeamsListReposLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsListReposLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListReposLegacyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
