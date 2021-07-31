package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsCreateDiscussionLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsCreateDiscussionLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsCreateDiscussionLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsCreateDiscussionLegacyEndpoint extends StObject {
  
  var parameters: TeamsCreateDiscussionLegacyEndpoint
  
  var request: TeamsCreateDiscussionLegacyRequestOptions
  
  var response: OctokitResponse[TeamsCreateDiscussionLegacyResponseData]
}
object ParametersTeamsCreateDiscussionLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsCreateDiscussionLegacyEndpoint,
    request: TeamsCreateDiscussionLegacyRequestOptions,
    response: OctokitResponse[TeamsCreateDiscussionLegacyResponseData]
  ): ParametersTeamsCreateDiscussionLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsCreateDiscussionLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsCreateDiscussionLegacyEndpointMutableBuilder[Self <: ParametersTeamsCreateDiscussionLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsCreateDiscussionLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsCreateDiscussionLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsCreateDiscussionLegacyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
