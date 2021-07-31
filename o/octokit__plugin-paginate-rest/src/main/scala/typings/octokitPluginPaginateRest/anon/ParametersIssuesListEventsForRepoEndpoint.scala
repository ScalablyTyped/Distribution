package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.IssuesListEventsForRepoEndpoint
import typings.octokitTypes.endpointsMod.IssuesListEventsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersIssuesListEventsForRepoEndpoint extends StObject {
  
  var parameters: IssuesListEventsForRepoEndpoint
  
  var response: OctokitResponse[IssuesListEventsForRepoResponseData]
}
object ParametersIssuesListEventsForRepoEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesListEventsForRepoEndpoint,
    response: OctokitResponse[IssuesListEventsForRepoResponseData]
  ): ParametersIssuesListEventsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListEventsForRepoEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesListEventsForRepoEndpointMutableBuilder[Self <: ParametersIssuesListEventsForRepoEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesListEventsForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListEventsForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
