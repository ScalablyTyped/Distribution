package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityUnstarRepoForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityUnstarRepoForAuthenticatedUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActivityUnstarRepoForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: ActivityUnstarRepoForAuthenticatedUserEndpoint = js.native
  
  var request: ActivityUnstarRepoForAuthenticatedUserRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersActivityUnstarRepoForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivityUnstarRepoForAuthenticatedUserEndpoint,
    request: ActivityUnstarRepoForAuthenticatedUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActivityUnstarRepoForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityUnstarRepoForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActivityUnstarRepoForAuthenticatedUserEndpointMutableBuilder[Self <: ParametersActivityUnstarRepoForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActivityUnstarRepoForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActivityUnstarRepoForAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
