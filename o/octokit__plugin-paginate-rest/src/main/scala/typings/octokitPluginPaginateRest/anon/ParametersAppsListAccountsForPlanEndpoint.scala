package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.AppsListAccountsForPlanEndpoint
import typings.octokitTypes.endpointsMod.AppsListAccountsForPlanResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersAppsListAccountsForPlanEndpoint extends StObject {
  
  var parameters: AppsListAccountsForPlanEndpoint
  
  var response: OctokitResponse[AppsListAccountsForPlanResponseData]
}
object ParametersAppsListAccountsForPlanEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsListAccountsForPlanEndpoint,
    response: OctokitResponse[AppsListAccountsForPlanResponseData]
  ): ParametersAppsListAccountsForPlanEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListAccountsForPlanEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsListAccountsForPlanEndpointMutableBuilder[Self <: ParametersAppsListAccountsForPlanEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsListAccountsForPlanEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsListAccountsForPlanResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
