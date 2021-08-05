package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.IssuesListEventsForTimelineEndpoint
import typings.octokitTypes.endpointsMod.IssuesListEventsForTimelineResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersIssuesListEventsForTimelineEndpoint extends StObject {
  
  var parameters: IssuesListEventsForTimelineEndpoint
  
  var response: OctokitResponse[IssuesListEventsForTimelineResponseData]
}
object ParametersIssuesListEventsForTimelineEndpoint {
  
  inline def apply(
    parameters: IssuesListEventsForTimelineEndpoint,
    response: OctokitResponse[IssuesListEventsForTimelineResponseData]
  ): ParametersIssuesListEventsForTimelineEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListEventsForTimelineEndpoint]
  }
  
  extension [Self <: ParametersIssuesListEventsForTimelineEndpoint](x: Self) {
    
    inline def setParameters(value: IssuesListEventsForTimelineEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[IssuesListEventsForTimelineResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
