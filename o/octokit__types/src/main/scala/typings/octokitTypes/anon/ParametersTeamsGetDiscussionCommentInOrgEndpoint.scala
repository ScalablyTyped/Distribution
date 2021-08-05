package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsGetDiscussionCommentInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsGetDiscussionCommentInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsGetDiscussionCommentInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsGetDiscussionCommentInOrgEndpoint extends StObject {
  
  var parameters: TeamsGetDiscussionCommentInOrgEndpoint
  
  var request: TeamsGetDiscussionCommentInOrgRequestOptions
  
  var response: OctokitResponse[TeamsGetDiscussionCommentInOrgResponseData]
}
object ParametersTeamsGetDiscussionCommentInOrgEndpoint {
  
  inline def apply(
    parameters: TeamsGetDiscussionCommentInOrgEndpoint,
    request: TeamsGetDiscussionCommentInOrgRequestOptions,
    response: OctokitResponse[TeamsGetDiscussionCommentInOrgResponseData]
  ): ParametersTeamsGetDiscussionCommentInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsGetDiscussionCommentInOrgEndpoint]
  }
  
  extension [Self <: ParametersTeamsGetDiscussionCommentInOrgEndpoint](x: Self) {
    
    inline def setParameters(value: TeamsGetDiscussionCommentInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: TeamsGetDiscussionCommentInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[TeamsGetDiscussionCommentInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
