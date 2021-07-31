package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.TeamsListDiscussionCommentsInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsListDiscussionCommentsInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsListDiscussionCommentsInOrgEndpoint extends StObject {
  
  var parameters: TeamsListDiscussionCommentsInOrgEndpoint
  
  var response: OctokitResponse[TeamsListDiscussionCommentsInOrgResponseData]
}
object ParametersTeamsListDiscussionCommentsInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsListDiscussionCommentsInOrgEndpoint,
    response: OctokitResponse[TeamsListDiscussionCommentsInOrgResponseData]
  ): ParametersTeamsListDiscussionCommentsInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListDiscussionCommentsInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsListDiscussionCommentsInOrgEndpointMutableBuilder[Self <: ParametersTeamsListDiscussionCommentsInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsListDiscussionCommentsInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListDiscussionCommentsInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
