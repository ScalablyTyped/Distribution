package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.IssuesListForRepoEndpoint
import typings.octokitTypes.endpointsMod.IssuesListForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersIssuesListForRepoEndpoint extends StObject {
  
  var parameters: IssuesListForRepoEndpoint
  
  var response: OctokitResponse[IssuesListForRepoResponseData]
}
object ParametersIssuesListForRepoEndpoint {
  
  inline def apply(parameters: IssuesListForRepoEndpoint, response: OctokitResponse[IssuesListForRepoResponseData]): ParametersIssuesListForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListForRepoEndpoint]
  }
  
  extension [Self <: ParametersIssuesListForRepoEndpoint](x: Self) {
    
    inline def setParameters(value: IssuesListForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[IssuesListForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
