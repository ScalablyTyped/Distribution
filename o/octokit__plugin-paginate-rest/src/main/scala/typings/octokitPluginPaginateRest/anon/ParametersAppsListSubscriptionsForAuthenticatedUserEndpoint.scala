package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.AppsListSubscriptionsForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.AppsListSubscriptionsForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersAppsListSubscriptionsForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: AppsListSubscriptionsForAuthenticatedUserEndpoint
  
  var response: OctokitResponse[AppsListSubscriptionsForAuthenticatedUserResponseData]
}
object ParametersAppsListSubscriptionsForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsListSubscriptionsForAuthenticatedUserEndpoint,
    response: OctokitResponse[AppsListSubscriptionsForAuthenticatedUserResponseData]
  ): ParametersAppsListSubscriptionsForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListSubscriptionsForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsListSubscriptionsForAuthenticatedUserEndpointMutableBuilder[Self <: ParametersAppsListSubscriptionsForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsListSubscriptionsForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsListSubscriptionsForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
