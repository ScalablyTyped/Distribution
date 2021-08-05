package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityListRepoEventsEndpoint
import typings.octokitTypes.endpointsMod.ActivityListRepoEventsRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActivityListRepoEventsEndpoint extends StObject {
  
  var parameters: ActivityListRepoEventsEndpoint
  
  var request: ActivityListRepoEventsRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersActivityListRepoEventsEndpoint {
  
  inline def apply(
    parameters: ActivityListRepoEventsEndpoint,
    request: ActivityListRepoEventsRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersActivityListRepoEventsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListRepoEventsEndpoint]
  }
  
  extension [Self <: ParametersActivityListRepoEventsEndpoint](x: Self) {
    
    inline def setParameters(value: ActivityListRepoEventsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActivityListRepoEventsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
