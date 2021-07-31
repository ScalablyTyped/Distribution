package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCreateCommitCommentEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateCommitCommentRequestOptions
import typings.octokitTypes.endpointsMod.ReposCreateCommitCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposCreateCommitCommentEndpoint extends StObject {
  
  var parameters: ReposCreateCommitCommentEndpoint
  
  var request: ReposCreateCommitCommentRequestOptions
  
  var response: OctokitResponse[ReposCreateCommitCommentResponseData]
}
object ParametersReposCreateCommitCommentEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposCreateCommitCommentEndpoint,
    request: ReposCreateCommitCommentRequestOptions,
    response: OctokitResponse[ReposCreateCommitCommentResponseData]
  ): ParametersReposCreateCommitCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateCommitCommentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposCreateCommitCommentEndpointMutableBuilder[Self <: ParametersReposCreateCommitCommentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposCreateCommitCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposCreateCommitCommentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposCreateCommitCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
