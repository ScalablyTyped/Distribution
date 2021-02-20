package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposUpdateCommitCommentEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdateCommitCommentRequestOptions
import typings.octokitTypes.endpointsMod.ReposUpdateCommitCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposUpdateCommitCommentEndpoint extends StObject {
  
  var parameters: ReposUpdateCommitCommentEndpoint = js.native
  
  var request: ReposUpdateCommitCommentRequestOptions = js.native
  
  var response: OctokitResponse[ReposUpdateCommitCommentResponseData] = js.native
}
object ParametersReposUpdateCommitCommentEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposUpdateCommitCommentEndpoint,
    request: ReposUpdateCommitCommentRequestOptions,
    response: OctokitResponse[ReposUpdateCommitCommentResponseData]
  ): ParametersReposUpdateCommitCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposUpdateCommitCommentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposUpdateCommitCommentEndpointMutableBuilder[Self <: ParametersReposUpdateCommitCommentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposUpdateCommitCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposUpdateCommitCommentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposUpdateCommitCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
