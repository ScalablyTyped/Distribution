package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityCheckRepoIsStarredByAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityCheckRepoIsStarredByAuthenticatedUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActivityCheckRepoIsStarredByAuthenticatedUserEndpoint extends StObject {
  
  var parameters: ActivityCheckRepoIsStarredByAuthenticatedUserEndpoint
  
  var request: ActivityCheckRepoIsStarredByAuthenticatedUserRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersActivityCheckRepoIsStarredByAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivityCheckRepoIsStarredByAuthenticatedUserEndpoint,
    request: ActivityCheckRepoIsStarredByAuthenticatedUserRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersActivityCheckRepoIsStarredByAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityCheckRepoIsStarredByAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActivityCheckRepoIsStarredByAuthenticatedUserEndpointMutableBuilder[Self <: ParametersActivityCheckRepoIsStarredByAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActivityCheckRepoIsStarredByAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActivityCheckRepoIsStarredByAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
