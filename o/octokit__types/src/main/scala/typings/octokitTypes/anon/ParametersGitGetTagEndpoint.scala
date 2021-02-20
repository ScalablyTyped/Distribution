package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GitGetTagEndpoint
import typings.octokitTypes.endpointsMod.GitGetTagRequestOptions
import typings.octokitTypes.endpointsMod.GitGetTagResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGitGetTagEndpoint extends StObject {
  
  var parameters: GitGetTagEndpoint = js.native
  
  var request: GitGetTagRequestOptions = js.native
  
  var response: OctokitResponse[GitGetTagResponseData] = js.native
}
object ParametersGitGetTagEndpoint {
  
  @scala.inline
  def apply(
    parameters: GitGetTagEndpoint,
    request: GitGetTagRequestOptions,
    response: OctokitResponse[GitGetTagResponseData]
  ): ParametersGitGetTagEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitGetTagEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGitGetTagEndpointMutableBuilder[Self <: ParametersGitGetTagEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: GitGetTagEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GitGetTagRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GitGetTagResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
