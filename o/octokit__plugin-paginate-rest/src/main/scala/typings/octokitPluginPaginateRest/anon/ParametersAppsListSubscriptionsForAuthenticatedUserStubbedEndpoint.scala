package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.AppsListSubscriptionsForAuthenticatedUserStubbedEndpoint
import typings.octokitTypes.endpointsMod.AppsListSubscriptionsForAuthenticatedUserStubbedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersAppsListSubscriptionsForAuthenticatedUserStubbedEndpoint extends StObject {
  
  var parameters: AppsListSubscriptionsForAuthenticatedUserStubbedEndpoint
  
  var response: OctokitResponse[AppsListSubscriptionsForAuthenticatedUserStubbedResponseData]
}
object ParametersAppsListSubscriptionsForAuthenticatedUserStubbedEndpoint {
  
  inline def apply(
    parameters: AppsListSubscriptionsForAuthenticatedUserStubbedEndpoint,
    response: OctokitResponse[AppsListSubscriptionsForAuthenticatedUserStubbedResponseData]
  ): ParametersAppsListSubscriptionsForAuthenticatedUserStubbedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListSubscriptionsForAuthenticatedUserStubbedEndpoint]
  }
  
  extension [Self <: ParametersAppsListSubscriptionsForAuthenticatedUserStubbedEndpoint](x: Self) {
    
    inline def setParameters(value: AppsListSubscriptionsForAuthenticatedUserStubbedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[AppsListSubscriptionsForAuthenticatedUserStubbedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
