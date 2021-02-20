package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesListForOrgEndpoint
import typings.octokitTypes.endpointsMod.IssuesListForOrgRequestOptions
import typings.octokitTypes.endpointsMod.IssuesListForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesListForOrgEndpoint extends StObject {
  
  var parameters: IssuesListForOrgEndpoint = js.native
  
  var request: IssuesListForOrgRequestOptions = js.native
  
  var response: OctokitResponse[IssuesListForOrgResponseData] = js.native
}
object ParametersIssuesListForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesListForOrgEndpoint,
    request: IssuesListForOrgRequestOptions,
    response: OctokitResponse[IssuesListForOrgResponseData]
  ): ParametersIssuesListForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesListForOrgEndpointMutableBuilder[Self <: ParametersIssuesListForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesListForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesListForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
