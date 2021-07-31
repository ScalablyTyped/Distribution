package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.AppsListPlansStubbedEndpoint
import typings.octokitTypes.endpointsMod.AppsListPlansStubbedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersAppsListPlansStubbedEndpoint extends StObject {
  
  var parameters: AppsListPlansStubbedEndpoint
  
  var response: OctokitResponse[AppsListPlansStubbedResponseData]
}
object ParametersAppsListPlansStubbedEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsListPlansStubbedEndpoint,
    response: OctokitResponse[AppsListPlansStubbedResponseData]
  ): ParametersAppsListPlansStubbedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListPlansStubbedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsListPlansStubbedEndpointMutableBuilder[Self <: ParametersAppsListPlansStubbedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsListPlansStubbedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsListPlansStubbedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
