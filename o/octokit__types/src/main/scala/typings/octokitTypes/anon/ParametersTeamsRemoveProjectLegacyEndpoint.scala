package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsRemoveProjectLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsRemoveProjectLegacyRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsRemoveProjectLegacyEndpoint extends StObject {
  
  var parameters: TeamsRemoveProjectLegacyEndpoint = js.native
  
  var request: TeamsRemoveProjectLegacyRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersTeamsRemoveProjectLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsRemoveProjectLegacyEndpoint,
    request: TeamsRemoveProjectLegacyRequestOptions,
    response: OctokitResponse[_]
  ): ParametersTeamsRemoveProjectLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsRemoveProjectLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsRemoveProjectLegacyEndpointMutableBuilder[Self <: ParametersTeamsRemoveProjectLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsRemoveProjectLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsRemoveProjectLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
