package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeleteReleaseEndpoint
import typings.octokitTypes.endpointsMod.ReposDeleteReleaseRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposDeleteReleaseEndpoint extends StObject {
  
  var parameters: ReposDeleteReleaseEndpoint
  
  var request: ReposDeleteReleaseRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersReposDeleteReleaseEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposDeleteReleaseEndpoint,
    request: ReposDeleteReleaseRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersReposDeleteReleaseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteReleaseEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposDeleteReleaseEndpointMutableBuilder[Self <: ParametersReposDeleteReleaseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposDeleteReleaseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposDeleteReleaseRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
