package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsDeleteForCommitCommentEndpoint
import typings.octokitTypes.endpointsMod.ReactionsDeleteForCommitCommentRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReactionsDeleteForCommitCommentEndpoint extends StObject {
  
  var parameters: ReactionsDeleteForCommitCommentEndpoint = js.native
  
  var request: ReactionsDeleteForCommitCommentRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersReactionsDeleteForCommitCommentEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReactionsDeleteForCommitCommentEndpoint,
    request: ReactionsDeleteForCommitCommentRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReactionsDeleteForCommitCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsDeleteForCommitCommentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReactionsDeleteForCommitCommentEndpointMutableBuilder[Self <: ParametersReactionsDeleteForCommitCommentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReactionsDeleteForCommitCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReactionsDeleteForCommitCommentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
