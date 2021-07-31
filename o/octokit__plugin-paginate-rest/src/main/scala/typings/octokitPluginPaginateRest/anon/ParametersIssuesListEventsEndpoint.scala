package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.IssuesListEventsEndpoint
import typings.octokitTypes.endpointsMod.IssuesListEventsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersIssuesListEventsEndpoint extends StObject {
  
  var parameters: IssuesListEventsEndpoint
  
  var response: OctokitResponse[IssuesListEventsResponseData]
}
object ParametersIssuesListEventsEndpoint {
  
  @scala.inline
  def apply(parameters: IssuesListEventsEndpoint, response: OctokitResponse[IssuesListEventsResponseData]): ParametersIssuesListEventsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListEventsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesListEventsEndpointMutableBuilder[Self <: ParametersIssuesListEventsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesListEventsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListEventsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
