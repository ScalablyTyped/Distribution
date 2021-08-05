package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReactionsListForIssueCommentEndpoint
import typings.octokitTypes.endpointsMod.ReactionsListForIssueCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReactionsListForIssueCommentEndpoint extends StObject {
  
  var parameters: ReactionsListForIssueCommentEndpoint
  
  var response: OctokitResponse[ReactionsListForIssueCommentResponseData]
}
object ParametersReactionsListForIssueCommentEndpoint {
  
  inline def apply(
    parameters: ReactionsListForIssueCommentEndpoint,
    response: OctokitResponse[ReactionsListForIssueCommentResponseData]
  ): ParametersReactionsListForIssueCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsListForIssueCommentEndpoint]
  }
  
  extension [Self <: ParametersReactionsListForIssueCommentEndpoint](x: Self) {
    
    inline def setParameters(value: ReactionsListForIssueCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReactionsListForIssueCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
