package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsDeleteDiscussionInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsDeleteDiscussionInOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsDeleteDiscussionInOrgEndpoint extends StObject {
  
  var parameters: TeamsDeleteDiscussionInOrgEndpoint
  
  var request: TeamsDeleteDiscussionInOrgRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersTeamsDeleteDiscussionInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsDeleteDiscussionInOrgEndpoint,
    request: TeamsDeleteDiscussionInOrgRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersTeamsDeleteDiscussionInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsDeleteDiscussionInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsDeleteDiscussionInOrgEndpointMutableBuilder[Self <: ParametersTeamsDeleteDiscussionInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsDeleteDiscussionInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsDeleteDiscussionInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
