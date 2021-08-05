package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityListOrgEventsForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityListOrgEventsForAuthenticatedUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActivityListOrgEventsForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: ActivityListOrgEventsForAuthenticatedUserEndpoint
  
  var request: ActivityListOrgEventsForAuthenticatedUserRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersActivityListOrgEventsForAuthenticatedUserEndpoint {
  
  inline def apply(
    parameters: ActivityListOrgEventsForAuthenticatedUserEndpoint,
    request: ActivityListOrgEventsForAuthenticatedUserRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersActivityListOrgEventsForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListOrgEventsForAuthenticatedUserEndpoint]
  }
  
  extension [Self <: ParametersActivityListOrgEventsForAuthenticatedUserEndpoint](x: Self) {
    
    inline def setParameters(value: ActivityListOrgEventsForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActivityListOrgEventsForAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
