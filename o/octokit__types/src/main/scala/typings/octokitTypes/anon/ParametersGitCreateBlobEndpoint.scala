package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GitCreateBlobEndpoint
import typings.octokitTypes.endpointsMod.GitCreateBlobRequestOptions
import typings.octokitTypes.endpointsMod.GitCreateBlobResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGitCreateBlobEndpoint extends StObject {
  
  var parameters: GitCreateBlobEndpoint = js.native
  
  var request: GitCreateBlobRequestOptions = js.native
  
  var response: OctokitResponse[GitCreateBlobResponseData] = js.native
}
object ParametersGitCreateBlobEndpoint {
  
  @scala.inline
  def apply(
    parameters: GitCreateBlobEndpoint,
    request: GitCreateBlobRequestOptions,
    response: OctokitResponse[GitCreateBlobResponseData]
  ): ParametersGitCreateBlobEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitCreateBlobEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGitCreateBlobEndpointMutableBuilder[Self <: ParametersGitCreateBlobEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: GitCreateBlobEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GitCreateBlobRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GitCreateBlobResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
