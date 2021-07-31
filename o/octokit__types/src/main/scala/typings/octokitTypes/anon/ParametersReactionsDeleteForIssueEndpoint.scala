package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsDeleteForIssueEndpoint
import typings.octokitTypes.endpointsMod.ReactionsDeleteForIssueRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReactionsDeleteForIssueEndpoint extends StObject {
  
  var parameters: ReactionsDeleteForIssueEndpoint
  
  var request: ReactionsDeleteForIssueRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersReactionsDeleteForIssueEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReactionsDeleteForIssueEndpoint,
    request: ReactionsDeleteForIssueRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersReactionsDeleteForIssueEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsDeleteForIssueEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReactionsDeleteForIssueEndpointMutableBuilder[Self <: ParametersReactionsDeleteForIssueEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReactionsDeleteForIssueEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReactionsDeleteForIssueRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
