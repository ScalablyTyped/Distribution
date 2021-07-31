package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityStarRepoForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityStarRepoForAuthenticatedUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActivityStarRepoForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: ActivityStarRepoForAuthenticatedUserEndpoint
  
  var request: ActivityStarRepoForAuthenticatedUserRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersActivityStarRepoForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivityStarRepoForAuthenticatedUserEndpoint,
    request: ActivityStarRepoForAuthenticatedUserRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersActivityStarRepoForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityStarRepoForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActivityStarRepoForAuthenticatedUserEndpointMutableBuilder[Self <: ParametersActivityStarRepoForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActivityStarRepoForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActivityStarRepoForAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
