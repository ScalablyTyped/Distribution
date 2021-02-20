package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsListChildLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsListChildLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsListChildLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsListChildLegacyEndpoint extends StObject {
  
  var parameters: TeamsListChildLegacyEndpoint = js.native
  
  var request: TeamsListChildLegacyRequestOptions = js.native
  
  var response: OctokitResponse[TeamsListChildLegacyResponseData] = js.native
}
object ParametersTeamsListChildLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsListChildLegacyEndpoint,
    request: TeamsListChildLegacyRequestOptions,
    response: OctokitResponse[TeamsListChildLegacyResponseData]
  ): ParametersTeamsListChildLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListChildLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsListChildLegacyEndpointMutableBuilder[Self <: ParametersTeamsListChildLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsListChildLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsListChildLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListChildLegacyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
