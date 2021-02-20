package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityMarkRepoNotificationsAsReadEndpoint
import typings.octokitTypes.endpointsMod.ActivityMarkRepoNotificationsAsReadRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActivityMarkRepoNotificationsAsReadEndpoint extends StObject {
  
  var parameters: ActivityMarkRepoNotificationsAsReadEndpoint = js.native
  
  var request: ActivityMarkRepoNotificationsAsReadRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersActivityMarkRepoNotificationsAsReadEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivityMarkRepoNotificationsAsReadEndpoint,
    request: ActivityMarkRepoNotificationsAsReadRequestOptions,
    response: OctokitResponse[_]
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
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
