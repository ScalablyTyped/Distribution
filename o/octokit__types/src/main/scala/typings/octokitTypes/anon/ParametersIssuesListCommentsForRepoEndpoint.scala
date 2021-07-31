package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesListCommentsForRepoEndpoint
import typings.octokitTypes.endpointsMod.IssuesListCommentsForRepoRequestOptions
import typings.octokitTypes.endpointsMod.IssuesListCommentsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersIssuesListCommentsForRepoEndpoint extends StObject {
  
  var parameters: IssuesListCommentsForRepoEndpoint
  
  var request: IssuesListCommentsForRepoRequestOptions
  
  var response: OctokitResponse[IssuesListCommentsForRepoResponseData]
}
object ParametersIssuesListCommentsForRepoEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesListCommentsForRepoEndpoint,
    request: IssuesListCommentsForRepoRequestOptions,
    response: OctokitResponse[IssuesListCommentsForRepoResponseData]
  ): ParametersIssuesListCommentsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListCommentsForRepoEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesListCommentsForRepoEndpointMutableBuilder[Self <: ParametersIssuesListCommentsForRepoEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesListCommentsForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesListCommentsForRepoRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListCommentsForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
