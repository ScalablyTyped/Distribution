package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActivityListNotificationsForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityListNotificationsForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActivityListNotificationsForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: ActivityListNotificationsForAuthenticatedUserEndpoint
  
  var response: OctokitResponse[ActivityListNotificationsForAuthenticatedUserResponseData]
}
object ParametersActivityListNotificationsForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivityListNotificationsForAuthenticatedUserEndpoint,
    response: OctokitResponse[ActivityListNotificationsForAuthenticatedUserResponseData]
  ): ParametersActivityListNotificationsForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListNotificationsForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActivityListNotificationsForAuthenticatedUserEndpointMutableBuilder[Self <: ParametersActivityListNotificationsForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActivityListNotificationsForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActivityListNotificationsForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
