package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeleteCommitCommentEndpoint
import typings.octokitTypes.endpointsMod.ReposDeleteCommitCommentRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposDeleteCommitCommentEndpoint extends StObject {
  
  var parameters: ReposDeleteCommitCommentEndpoint = js.native
  
  var request: ReposDeleteCommitCommentRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersReposDeleteCommitCommentEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposDeleteCommitCommentEndpoint,
    request: ReposDeleteCommitCommentRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposDeleteCommitCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteCommitCommentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposDeleteCommitCommentEndpointMutableBuilder[Self <: ParametersReposDeleteCommitCommentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposDeleteCommitCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposDeleteCommitCommentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
