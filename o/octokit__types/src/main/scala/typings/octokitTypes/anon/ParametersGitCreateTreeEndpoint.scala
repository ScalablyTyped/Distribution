package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GitCreateTreeEndpoint
import typings.octokitTypes.endpointsMod.GitCreateTreeRequestOptions
import typings.octokitTypes.endpointsMod.GitCreateTreeResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersGitCreateTreeEndpoint extends StObject {
  
  var parameters: GitCreateTreeEndpoint
  
  var request: GitCreateTreeRequestOptions
  
  var response: OctokitResponse[GitCreateTreeResponseData]
}
object ParametersGitCreateTreeEndpoint {
  
  @scala.inline
  def apply(
    parameters: GitCreateTreeEndpoint,
    request: GitCreateTreeRequestOptions,
    response: OctokitResponse[GitCreateTreeResponseData]
  ): ParametersGitCreateTreeEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitCreateTreeEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGitCreateTreeEndpointMutableBuilder[Self <: ParametersGitCreateTreeEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: GitCreateTreeEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GitCreateTreeRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GitCreateTreeResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
