package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListPullRequestsAssociatedWithCommitEndpoint
import typings.octokitTypes.endpointsMod.ReposListPullRequestsAssociatedWithCommitResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposListPullRequestsAssociatedWithCommitEndpoint extends StObject {
  
  var parameters: ReposListPullRequestsAssociatedWithCommitEndpoint
  
  var response: OctokitResponse[ReposListPullRequestsAssociatedWithCommitResponseData]
}
object ParametersReposListPullRequestsAssociatedWithCommitEndpoint {
  
  inline def apply(
    parameters: ReposListPullRequestsAssociatedWithCommitEndpoint,
    response: OctokitResponse[ReposListPullRequestsAssociatedWithCommitResponseData]
  ): ParametersReposListPullRequestsAssociatedWithCommitEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListPullRequestsAssociatedWithCommitEndpoint]
  }
  
  extension [Self <: ParametersReposListPullRequestsAssociatedWithCommitEndpoint](x: Self) {
    
    inline def setParameters(value: ReposListPullRequestsAssociatedWithCommitEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposListPullRequestsAssociatedWithCommitResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
