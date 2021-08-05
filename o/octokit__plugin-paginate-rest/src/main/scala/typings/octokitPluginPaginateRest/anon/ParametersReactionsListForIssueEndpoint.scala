package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReactionsListForIssueEndpoint
import typings.octokitTypes.endpointsMod.ReactionsListForIssueResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReactionsListForIssueEndpoint extends StObject {
  
  var parameters: ReactionsListForIssueEndpoint
  
  var response: OctokitResponse[ReactionsListForIssueResponseData]
}
object ParametersReactionsListForIssueEndpoint {
  
  inline def apply(
    parameters: ReactionsListForIssueEndpoint,
    response: OctokitResponse[ReactionsListForIssueResponseData]
  ): ParametersReactionsListForIssueEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsListForIssueEndpoint]
  }
  
  extension [Self <: ParametersReactionsListForIssueEndpoint](x: Self) {
    
    inline def setParameters(value: ReactionsListForIssueEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReactionsListForIssueResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
