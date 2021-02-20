package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GitGetRefEndpoint
import typings.octokitTypes.endpointsMod.GitGetRefRequestOptions
import typings.octokitTypes.endpointsMod.GitGetRefResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGitGetRefEndpoint extends StObject {
  
  var parameters: GitGetRefEndpoint = js.native
  
  var request: GitGetRefRequestOptions = js.native
  
  var response: OctokitResponse[GitGetRefResponseData] = js.native
}
object ParametersGitGetRefEndpoint {
  
  @scala.inline
  def apply(
    parameters: GitGetRefEndpoint,
    request: GitGetRefRequestOptions,
    response: OctokitResponse[GitGetRefResponseData]
  ): ParametersGitGetRefEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitGetRefEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGitGetRefEndpointMutableBuilder[Self <: ParametersGitGetRefEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: GitGetRefEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GitGetRefRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GitGetRefResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
