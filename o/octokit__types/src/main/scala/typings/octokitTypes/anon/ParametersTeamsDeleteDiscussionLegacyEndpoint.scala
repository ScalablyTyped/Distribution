package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsDeleteDiscussionLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsDeleteDiscussionLegacyRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsDeleteDiscussionLegacyEndpoint extends StObject {
  
  var parameters: TeamsDeleteDiscussionLegacyEndpoint = js.native
  
  var request: TeamsDeleteDiscussionLegacyRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersTeamsDeleteDiscussionLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsDeleteDiscussionLegacyEndpoint,
    request: TeamsDeleteDiscussionLegacyRequestOptions,
    response: OctokitResponse[_]
  ): ParametersTeamsDeleteDiscussionLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsDeleteDiscussionLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsDeleteDiscussionLegacyEndpointMutableBuilder[Self <: ParametersTeamsDeleteDiscussionLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsDeleteDiscussionLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsDeleteDiscussionLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
