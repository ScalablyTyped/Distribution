package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityListPublicOrgEventsEndpoint
import typings.octokitTypes.endpointsMod.ActivityListPublicOrgEventsRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActivityListPublicOrgEventsEndpoint extends StObject {
  
  var parameters: ActivityListPublicOrgEventsEndpoint
  
  var request: ActivityListPublicOrgEventsRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersActivityListPublicOrgEventsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivityListPublicOrgEventsEndpoint,
    request: ActivityListPublicOrgEventsRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersActivityListPublicOrgEventsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListPublicOrgEventsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActivityListPublicOrgEventsEndpointMutableBuilder[Self <: ParametersActivityListPublicOrgEventsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActivityListPublicOrgEventsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActivityListPublicOrgEventsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
