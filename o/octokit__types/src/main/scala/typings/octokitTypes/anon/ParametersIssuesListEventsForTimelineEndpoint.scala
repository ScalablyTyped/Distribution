package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesListEventsForTimelineEndpoint
import typings.octokitTypes.endpointsMod.IssuesListEventsForTimelineRequestOptions
import typings.octokitTypes.endpointsMod.IssuesListEventsForTimelineResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesListEventsForTimelineEndpoint extends StObject {
  
  var parameters: IssuesListEventsForTimelineEndpoint = js.native
  
  var request: IssuesListEventsForTimelineRequestOptions = js.native
  
  var response: OctokitResponse[IssuesListEventsForTimelineResponseData] = js.native
}
object ParametersIssuesListEventsForTimelineEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesListEventsForTimelineEndpoint,
    request: IssuesListEventsForTimelineRequestOptions,
    response: OctokitResponse[IssuesListEventsForTimelineResponseData]
  ): ParametersIssuesListEventsForTimelineEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListEventsForTimelineEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesListEventsForTimelineEndpointMutableBuilder[Self <: ParametersIssuesListEventsForTimelineEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesListEventsForTimelineEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesListEventsForTimelineRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListEventsForTimelineResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
