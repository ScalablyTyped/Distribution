package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GitCreateRefEndpoint
import typings.octokitTypes.endpointsMod.GitCreateRefRequestOptions
import typings.octokitTypes.endpointsMod.GitCreateRefResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGitCreateRefEndpoint extends StObject {
  
  var parameters: GitCreateRefEndpoint = js.native
  
  var request: GitCreateRefRequestOptions = js.native
  
  var response: OctokitResponse[GitCreateRefResponseData] = js.native
}
object ParametersGitCreateRefEndpoint {
  
  @scala.inline
  def apply(
    parameters: GitCreateRefEndpoint,
    request: GitCreateRefRequestOptions,
    response: OctokitResponse[GitCreateRefResponseData]
  ): ParametersGitCreateRefEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitCreateRefEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGitCreateRefEndpointMutableBuilder[Self <: ParametersGitCreateRefEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: GitCreateRefEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GitCreateRefRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GitCreateRefResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
