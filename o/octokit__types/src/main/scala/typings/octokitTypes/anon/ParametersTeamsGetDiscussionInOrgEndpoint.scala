package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsGetDiscussionInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsGetDiscussionInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsGetDiscussionInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsGetDiscussionInOrgEndpoint extends StObject {
  
  var parameters: TeamsGetDiscussionInOrgEndpoint
  
  var request: TeamsGetDiscussionInOrgRequestOptions
  
  var response: OctokitResponse[TeamsGetDiscussionInOrgResponseData]
}
object ParametersTeamsGetDiscussionInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsGetDiscussionInOrgEndpoint,
    request: TeamsGetDiscussionInOrgRequestOptions,
    response: OctokitResponse[TeamsGetDiscussionInOrgResponseData]
  ): ParametersTeamsGetDiscussionInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsGetDiscussionInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsGetDiscussionInOrgEndpointMutableBuilder[Self <: ParametersTeamsGetDiscussionInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsGetDiscussionInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsGetDiscussionInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsGetDiscussionInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
