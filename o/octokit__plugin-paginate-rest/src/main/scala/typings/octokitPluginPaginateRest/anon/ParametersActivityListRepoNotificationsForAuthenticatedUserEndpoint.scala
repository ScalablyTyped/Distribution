package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActivityListRepoNotificationsForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityListRepoNotificationsForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActivityListRepoNotificationsForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: ActivityListRepoNotificationsForAuthenticatedUserEndpoint = js.native
  
  var response: OctokitResponse[ActivityListRepoNotificationsForAuthenticatedUserResponseData] = js.native
}
object ParametersActivityListRepoNotificationsForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivityListRepoNotificationsForAuthenticatedUserEndpoint,
    response: OctokitResponse[ActivityListRepoNotificationsForAuthenticatedUserResponseData]
  ): ParametersActivityListRepoNotificationsForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListRepoNotificationsForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActivityListRepoNotificationsForAuthenticatedUserEndpointMutableBuilder[Self <: ParametersActivityListRepoNotificationsForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActivityListRepoNotificationsForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActivityListRepoNotificationsForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
