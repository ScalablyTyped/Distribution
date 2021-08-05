package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsUpdateDiscussionCommentInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsUpdateDiscussionCommentInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsUpdateDiscussionCommentInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsUpdateDiscussionCommentInOrgEndpoint extends StObject {
  
  var parameters: TeamsUpdateDiscussionCommentInOrgEndpoint
  
  var request: TeamsUpdateDiscussionCommentInOrgRequestOptions
  
  var response: OctokitResponse[TeamsUpdateDiscussionCommentInOrgResponseData]
}
object ParametersTeamsUpdateDiscussionCommentInOrgEndpoint {
  
  inline def apply(
    parameters: TeamsUpdateDiscussionCommentInOrgEndpoint,
    request: TeamsUpdateDiscussionCommentInOrgRequestOptions,
    response: OctokitResponse[TeamsUpdateDiscussionCommentInOrgResponseData]
  ): ParametersTeamsUpdateDiscussionCommentInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsUpdateDiscussionCommentInOrgEndpoint]
  }
  
  extension [Self <: ParametersTeamsUpdateDiscussionCommentInOrgEndpoint](x: Self) {
    
    inline def setParameters(value: TeamsUpdateDiscussionCommentInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: TeamsUpdateDiscussionCommentInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[TeamsUpdateDiscussionCommentInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
