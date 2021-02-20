package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsCreateOrUpdateIdPGroupConnectionsInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsCreateOrUpdateIdPGroupConnectionsInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpoint extends StObject {
  
  var parameters: TeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpoint = js.native
  
  var request: TeamsCreateOrUpdateIdPGroupConnectionsInOrgRequestOptions = js.native
  
  var response: OctokitResponse[TeamsCreateOrUpdateIdPGroupConnectionsInOrgResponseData] = js.native
}
object ParametersTeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpoint,
    request: TeamsCreateOrUpdateIdPGroupConnectionsInOrgRequestOptions,
    response: OctokitResponse[TeamsCreateOrUpdateIdPGroupConnectionsInOrgResponseData]
  ): ParametersTeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpointMutableBuilder[Self <: ParametersTeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsCreateOrUpdateIdPGroupConnectionsInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsCreateOrUpdateIdPGroupConnectionsInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
