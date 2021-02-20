package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GitGetBlobEndpoint
import typings.octokitTypes.endpointsMod.GitGetBlobRequestOptions
import typings.octokitTypes.endpointsMod.GitGetBlobResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGitGetBlobEndpoint extends StObject {
  
  var parameters: GitGetBlobEndpoint = js.native
  
  var request: GitGetBlobRequestOptions = js.native
  
  var response: OctokitResponse[GitGetBlobResponseData] = js.native
}
object ParametersGitGetBlobEndpoint {
  
  @scala.inline
  def apply(
    parameters: GitGetBlobEndpoint,
    request: GitGetBlobRequestOptions,
    response: OctokitResponse[GitGetBlobResponseData]
  ): ParametersGitGetBlobEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitGetBlobEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGitGetBlobEndpointMutableBuilder[Self <: ParametersGitGetBlobEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: GitGetBlobEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GitGetBlobRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GitGetBlobResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
