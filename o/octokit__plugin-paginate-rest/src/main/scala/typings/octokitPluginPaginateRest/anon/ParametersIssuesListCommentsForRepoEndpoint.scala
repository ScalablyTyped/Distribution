package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.IssuesListCommentsForRepoEndpoint
import typings.octokitTypes.endpointsMod.IssuesListCommentsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersIssuesListCommentsForRepoEndpoint extends StObject {
  
  var parameters: IssuesListCommentsForRepoEndpoint
  
  var response: OctokitResponse[IssuesListCommentsForRepoResponseData]
}
object ParametersIssuesListCommentsForRepoEndpoint {
  
  inline def apply(
    parameters: IssuesListCommentsForRepoEndpoint,
    response: OctokitResponse[IssuesListCommentsForRepoResponseData]
  ): ParametersIssuesListCommentsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListCommentsForRepoEndpoint]
  }
  
  extension [Self <: ParametersIssuesListCommentsForRepoEndpoint](x: Self) {
    
    inline def setParameters(value: IssuesListCommentsForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[IssuesListCommentsForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
