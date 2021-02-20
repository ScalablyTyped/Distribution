package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityListRepoNotificationsForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityListRepoNotificationsForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.ActivityListRepoNotificationsForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActivityListRepoNotificationsForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: ActivityListRepoNotificationsForAuthenticatedUserEndpoint = js.native
  
  var request: ActivityListRepoNotificationsForAuthenticatedUserRequestOptions = js.native
  
  var response: OctokitResponse[ActivityListRepoNotificationsForAuthenticatedUserResponseData] = js.native
}
object ParametersActivityListRepoNotificationsForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivityListRepoNotificationsForAuthenticatedUserEndpoint,
    request: ActivityListRepoNotificationsForAuthenticatedUserRequestOptions,
    response: OctokitResponse[ActivityListRepoNotificationsForAuthenticatedUserResponseData]
  ): ParametersActivityListRepoNotificationsForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListRepoNotificationsForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActivityListRepoNotificationsForAuthenticatedUserEndpointMutableBuilder[Self <: ParametersActivityListRepoNotificationsForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActivityListRepoNotificationsForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActivityListRepoNotificationsForAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActivityListRepoNotificationsForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
