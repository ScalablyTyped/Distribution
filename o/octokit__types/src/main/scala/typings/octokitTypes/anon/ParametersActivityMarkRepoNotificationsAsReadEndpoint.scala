package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityMarkRepoNotificationsAsReadEndpoint
import typings.octokitTypes.endpointsMod.ActivityMarkRepoNotificationsAsReadRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActivityMarkRepoNotificationsAsReadEndpoint extends StObject {
  
  var parameters: ActivityMarkRepoNotificationsAsReadEndpoint
  
  var request: ActivityMarkRepoNotificationsAsReadRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersActivityMarkRepoNotificationsAsReadEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivityMarkRepoNotificationsAsReadEndpoint,
    request: ActivityMarkRepoNotificationsAsReadRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersActivityMarkRepoNotificationsAsReadEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityMarkRepoNotificationsAsReadEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActivityMarkRepoNotificationsAsReadEndpointMutableBuilder[Self <: ParametersActivityMarkRepoNotificationsAsReadEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActivityMarkRepoNotificationsAsReadEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActivityMarkRepoNotificationsAsReadRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
