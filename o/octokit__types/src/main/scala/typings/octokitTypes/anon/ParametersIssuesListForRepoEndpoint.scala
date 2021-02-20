package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesListForRepoEndpoint
import typings.octokitTypes.endpointsMod.IssuesListForRepoRequestOptions
import typings.octokitTypes.endpointsMod.IssuesListForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesListForRepoEndpoint extends StObject {
  
  var parameters: IssuesListForRepoEndpoint = js.native
  
  var request: IssuesListForRepoRequestOptions = js.native
  
  var response: OctokitResponse[IssuesListForRepoResponseData] = js.native
}
object ParametersIssuesListForRepoEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesListForRepoEndpoint,
    request: IssuesListForRepoRequestOptions,
    response: OctokitResponse[IssuesListForRepoResponseData]
  ): ParametersIssuesListForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListForRepoEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesListForRepoEndpointMutableBuilder[Self <: ParametersIssuesListForRepoEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesListForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesListForRepoRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
