package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsListForIssueEndpoint
import typings.octokitTypes.endpointsMod.ReactionsListForIssueRequestOptions
import typings.octokitTypes.endpointsMod.ReactionsListForIssueResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReactionsListForIssueEndpoint extends StObject {
  
  var parameters: ReactionsListForIssueEndpoint
  
  var request: ReactionsListForIssueRequestOptions
  
  var response: OctokitResponse[ReactionsListForIssueResponseData]
}
object ParametersReactionsListForIssueEndpoint {
  
  inline def apply(
    parameters: ReactionsListForIssueEndpoint,
    request: ReactionsListForIssueRequestOptions,
    response: OctokitResponse[ReactionsListForIssueResponseData]
  ): ParametersReactionsListForIssueEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsListForIssueEndpoint]
  }
  
  extension [Self <: ParametersReactionsListForIssueEndpoint](x: Self) {
    
    inline def setParameters(value: ReactionsListForIssueEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReactionsListForIssueRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReactionsListForIssueResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
