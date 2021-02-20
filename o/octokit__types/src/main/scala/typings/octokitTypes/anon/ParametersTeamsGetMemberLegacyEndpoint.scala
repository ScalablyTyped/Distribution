package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsGetMemberLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsGetMemberLegacyRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsGetMemberLegacyEndpoint extends StObject {
  
  var parameters: TeamsGetMemberLegacyEndpoint = js.native
  
  var request: TeamsGetMemberLegacyRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersTeamsGetMemberLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsGetMemberLegacyEndpoint,
    request: TeamsGetMemberLegacyRequestOptions,
    response: OctokitResponse[_]
  ): ParametersTeamsGetMemberLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsGetMemberLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsGetMemberLegacyEndpointMutableBuilder[Self <: ParametersTeamsGetMemberLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsGetMemberLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsGetMemberLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
