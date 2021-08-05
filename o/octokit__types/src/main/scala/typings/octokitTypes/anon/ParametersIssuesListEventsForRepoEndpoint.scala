package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesListEventsForRepoEndpoint
import typings.octokitTypes.endpointsMod.IssuesListEventsForRepoRequestOptions
import typings.octokitTypes.endpointsMod.IssuesListEventsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersIssuesListEventsForRepoEndpoint extends StObject {
  
  var parameters: IssuesListEventsForRepoEndpoint
  
  var request: IssuesListEventsForRepoRequestOptions
  
  var response: OctokitResponse[IssuesListEventsForRepoResponseData]
}
object ParametersIssuesListEventsForRepoEndpoint {
  
  inline def apply(
    parameters: IssuesListEventsForRepoEndpoint,
    request: IssuesListEventsForRepoRequestOptions,
    response: OctokitResponse[IssuesListEventsForRepoResponseData]
  ): ParametersIssuesListEventsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListEventsForRepoEndpoint]
  }
  
  extension [Self <: ParametersIssuesListEventsForRepoEndpoint](x: Self) {
    
    inline def setParameters(value: IssuesListEventsForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: IssuesListEventsForRepoRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[IssuesListEventsForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
