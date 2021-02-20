package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsListMembersLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsListMembersLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsListMembersLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsListMembersLegacyEndpoint extends StObject {
  
  var parameters: TeamsListMembersLegacyEndpoint = js.native
  
  var request: TeamsListMembersLegacyRequestOptions = js.native
  
  var response: OctokitResponse[TeamsListMembersLegacyResponseData] = js.native
}
object ParametersTeamsListMembersLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsListMembersLegacyEndpoint,
    request: TeamsListMembersLegacyRequestOptions,
    response: OctokitResponse[TeamsListMembersLegacyResponseData]
  ): ParametersTeamsListMembersLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListMembersLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsListMembersLegacyEndpointMutableBuilder[Self <: ParametersTeamsListMembersLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsListMembersLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsListMembersLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListMembersLegacyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
