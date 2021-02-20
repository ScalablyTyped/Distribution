package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesListLabelsForRepoEndpoint
import typings.octokitTypes.endpointsMod.IssuesListLabelsForRepoRequestOptions
import typings.octokitTypes.endpointsMod.IssuesListLabelsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesListLabelsForRepoEndpoint extends StObject {
  
  var parameters: IssuesListLabelsForRepoEndpoint = js.native
  
  var request: IssuesListLabelsForRepoRequestOptions = js.native
  
  var response: OctokitResponse[IssuesListLabelsForRepoResponseData] = js.native
}
object ParametersIssuesListLabelsForRepoEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesListLabelsForRepoEndpoint,
    request: IssuesListLabelsForRepoRequestOptions,
    response: OctokitResponse[IssuesListLabelsForRepoResponseData]
  ): ParametersIssuesListLabelsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListLabelsForRepoEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesListLabelsForRepoEndpointMutableBuilder[Self <: ParametersIssuesListLabelsForRepoEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesListLabelsForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesListLabelsForRepoRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListLabelsForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
