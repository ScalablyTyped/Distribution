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
  
  inline def apply(
    parameters: ReactionsDeleteForIssueEndpoint,
    request: ReactionsDeleteForIssueRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersReactionsDeleteForIssueEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsDeleteForIssueEndpoint]
  }
  
  extension [Self <: ParametersReactionsDeleteForIssueEndpoint](x: Self) {
    
    inline def setParameters(value: ReactionsDeleteForIssueEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReactionsDeleteForIssueRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
