package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsCreateForCommitCommentEndpoint
import typings.octokitTypes.endpointsMod.ReactionsCreateForCommitCommentRequestOptions
import typings.octokitTypes.endpointsMod.ReactionsCreateForCommitCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReactionsCreateForCommitCommentEndpoint extends StObject {
  
  var parameters: ReactionsCreateForCommitCommentEndpoint
  
  var request: ReactionsCreateForCommitCommentRequestOptions
  
  var response: OctokitResponse[ReactionsCreateForCommitCommentResponseData]
}
object ParametersReactionsCreateForCommitCommentEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReactionsCreateForCommitCommentEndpoint,
    request: ReactionsCreateForCommitCommentRequestOptions,
    response: OctokitResponse[ReactionsCreateForCommitCommentResponseData]
  ): ParametersReactionsCreateForCommitCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsCreateForCommitCommentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReactionsCreateForCommitCommentEndpointMutableBuilder[Self <: ParametersReactionsCreateForCommitCommentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReactionsCreateForCommitCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReactionsCreateForCommitCommentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReactionsCreateForCommitCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
