package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListPullRequestsAssociatedWithCommitEndpoint
import typings.octokitTypes.endpointsMod.ReposListPullRequestsAssociatedWithCommitRequestOptions
import typings.octokitTypes.endpointsMod.ReposListPullRequestsAssociatedWithCommitResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposListPullRequestsAssociatedWithCommitEndpoint extends StObject {
  
  var parameters: ReposListPullRequestsAssociatedWithCommitEndpoint = js.native
  
  var request: ReposListPullRequestsAssociatedWithCommitRequestOptions = js.native
  
  var response: OctokitResponse[ReposListPullRequestsAssociatedWithCommitResponseData] = js.native
}
object ParametersReposListPullRequestsAssociatedWithCommitEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposListPullRequestsAssociatedWithCommitEndpoint,
    request: ReposListPullRequestsAssociatedWithCommitRequestOptions,
    response: OctokitResponse[ReposListPullRequestsAssociatedWithCommitResponseData]
  ): ParametersReposListPullRequestsAssociatedWithCommitEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListPullRequestsAssociatedWithCommitEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposListPullRequestsAssociatedWithCommitEndpointMutableBuilder[Self <: ParametersReposListPullRequestsAssociatedWithCommitEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposListPullRequestsAssociatedWithCommitEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposListPullRequestsAssociatedWithCommitRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListPullRequestsAssociatedWithCommitResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
