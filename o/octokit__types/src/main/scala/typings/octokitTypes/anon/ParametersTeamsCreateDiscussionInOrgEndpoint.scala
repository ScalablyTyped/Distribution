package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsCreateDiscussionInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsCreateDiscussionInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsCreateDiscussionInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsCreateDiscussionInOrgEndpoint extends StObject {
  
  var parameters: TeamsCreateDiscussionInOrgEndpoint = js.native
  
  var request: TeamsCreateDiscussionInOrgRequestOptions = js.native
  
  var response: OctokitResponse[TeamsCreateDiscussionInOrgResponseData] = js.native
}
object ParametersTeamsCreateDiscussionInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsCreateDiscussionInOrgEndpoint,
    request: TeamsCreateDiscussionInOrgRequestOptions,
    response: OctokitResponse[TeamsCreateDiscussionInOrgResponseData]
  ): ParametersTeamsCreateDiscussionInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsCreateDiscussionInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsCreateDiscussionInOrgEndpointMutableBuilder[Self <: ParametersTeamsCreateDiscussionInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsCreateDiscussionInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsCreateDiscussionInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsCreateDiscussionInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
