package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsRemoveMemberLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsRemoveMemberLegacyRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsRemoveMemberLegacyEndpoint extends StObject {
  
  var parameters: TeamsRemoveMemberLegacyEndpoint = js.native
  
  var request: TeamsRemoveMemberLegacyRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersTeamsRemoveMemberLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsRemoveMemberLegacyEndpoint,
    request: TeamsRemoveMemberLegacyRequestOptions,
    response: OctokitResponse[_]
  ): ParametersTeamsRemoveMemberLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsRemoveMemberLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsRemoveMemberLegacyEndpointMutableBuilder[Self <: ParametersTeamsRemoveMemberLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsRemoveMemberLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsRemoveMemberLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
