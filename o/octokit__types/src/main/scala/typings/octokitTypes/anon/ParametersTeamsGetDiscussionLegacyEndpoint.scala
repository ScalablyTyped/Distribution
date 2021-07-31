package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsGetDiscussionLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsGetDiscussionLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsGetDiscussionLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsGetDiscussionLegacyEndpoint extends StObject {
  
  var parameters: TeamsGetDiscussionLegacyEndpoint
  
  var request: TeamsGetDiscussionLegacyRequestOptions
  
  var response: OctokitResponse[TeamsGetDiscussionLegacyResponseData]
}
object ParametersTeamsGetDiscussionLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsGetDiscussionLegacyEndpoint,
    request: TeamsGetDiscussionLegacyRequestOptions,
    response: OctokitResponse[TeamsGetDiscussionLegacyResponseData]
  ): ParametersTeamsGetDiscussionLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsGetDiscussionLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsGetDiscussionLegacyEndpointMutableBuilder[Self <: ParametersTeamsGetDiscussionLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsGetDiscussionLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsGetDiscussionLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsGetDiscussionLegacyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
