package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesUpdateCommentEndpoint
import typings.octokitTypes.endpointsMod.IssuesUpdateCommentRequestOptions
import typings.octokitTypes.endpointsMod.IssuesUpdateCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesUpdateCommentEndpoint extends StObject {
  
  var parameters: IssuesUpdateCommentEndpoint = js.native
  
  var request: IssuesUpdateCommentRequestOptions = js.native
  
  var response: OctokitResponse[IssuesUpdateCommentResponseData] = js.native
}
object ParametersIssuesUpdateCommentEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesUpdateCommentEndpoint,
    request: IssuesUpdateCommentRequestOptions,
    response: OctokitResponse[IssuesUpdateCommentResponseData]
  ): ParametersIssuesUpdateCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesUpdateCommentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesUpdateCommentEndpointMutableBuilder[Self <: ParametersIssuesUpdateCommentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesUpdateCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesUpdateCommentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesUpdateCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
