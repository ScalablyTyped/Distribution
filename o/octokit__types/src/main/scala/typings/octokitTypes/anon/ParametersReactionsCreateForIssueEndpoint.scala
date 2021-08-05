package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsCreateForIssueEndpoint
import typings.octokitTypes.endpointsMod.ReactionsCreateForIssueRequestOptions
import typings.octokitTypes.endpointsMod.ReactionsCreateForIssueResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReactionsCreateForIssueEndpoint extends StObject {
  
  var parameters: ReactionsCreateForIssueEndpoint
  
  var request: ReactionsCreateForIssueRequestOptions
  
  var response: OctokitResponse[ReactionsCreateForIssueResponseData]
}
object ParametersReactionsCreateForIssueEndpoint {
  
  inline def apply(
    parameters: ReactionsCreateForIssueEndpoint,
    request: ReactionsCreateForIssueRequestOptions,
    response: OctokitResponse[ReactionsCreateForIssueResponseData]
  ): ParametersReactionsCreateForIssueEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsCreateForIssueEndpoint]
  }
  
  extension [Self <: ParametersReactionsCreateForIssueEndpoint](x: Self) {
    
    inline def setParameters(value: ReactionsCreateForIssueEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReactionsCreateForIssueRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReactionsCreateForIssueResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
