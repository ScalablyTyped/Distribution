package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsDeleteInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsDeleteInOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsDeleteInOrgEndpoint extends StObject {
  
  var parameters: TeamsDeleteInOrgEndpoint
  
  var request: TeamsDeleteInOrgRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersTeamsDeleteInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsDeleteInOrgEndpoint,
    request: TeamsDeleteInOrgRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersTeamsDeleteInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsDeleteInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsDeleteInOrgEndpointMutableBuilder[Self <: ParametersTeamsDeleteInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsDeleteInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsDeleteInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
