package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityListRepoEventsEndpoint
import typings.octokitTypes.endpointsMod.ActivityListRepoEventsRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActivityListRepoEventsEndpoint extends StObject {
  
  var parameters: ActivityListRepoEventsEndpoint = js.native
  
  var request: ActivityListRepoEventsRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersActivityListRepoEventsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivityListRepoEventsEndpoint,
    request: ActivityListRepoEventsRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActivityListRepoEventsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListRepoEventsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActivityListRepoEventsEndpointMutableBuilder[Self <: ParametersActivityListRepoEventsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActivityListRepoEventsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActivityListRepoEventsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
