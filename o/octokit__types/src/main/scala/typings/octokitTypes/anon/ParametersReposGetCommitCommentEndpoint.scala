package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetCommitCommentEndpoint
import typings.octokitTypes.endpointsMod.ReposGetCommitCommentRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetCommitCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposGetCommitCommentEndpoint extends StObject {
  
  var parameters: ReposGetCommitCommentEndpoint
  
  var request: ReposGetCommitCommentRequestOptions
  
  var response: OctokitResponse[ReposGetCommitCommentResponseData]
}
object ParametersReposGetCommitCommentEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetCommitCommentEndpoint,
    request: ReposGetCommitCommentRequestOptions,
    response: OctokitResponse[ReposGetCommitCommentResponseData]
  ): ParametersReposGetCommitCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetCommitCommentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetCommitCommentEndpointMutableBuilder[Self <: ParametersReposGetCommitCommentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetCommitCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetCommitCommentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetCommitCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
