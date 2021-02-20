package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GitDeleteRefEndpoint
import typings.octokitTypes.endpointsMod.GitDeleteRefRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGitDeleteRefEndpoint extends StObject {
  
  var parameters: GitDeleteRefEndpoint = js.native
  
  var request: GitDeleteRefRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersGitDeleteRefEndpoint {
  
  @scala.inline
  def apply(
    parameters: GitDeleteRefEndpoint,
    request: GitDeleteRefRequestOptions,
    response: OctokitResponse[_]
  ): ParametersGitDeleteRefEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitDeleteRefEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGitDeleteRefEndpointMutableBuilder[Self <: ParametersGitDeleteRefEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: GitDeleteRefEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GitDeleteRefRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
