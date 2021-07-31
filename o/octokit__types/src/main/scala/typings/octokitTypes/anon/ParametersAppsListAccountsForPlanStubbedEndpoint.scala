package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsListAccountsForPlanStubbedEndpoint
import typings.octokitTypes.endpointsMod.AppsListAccountsForPlanStubbedRequestOptions
import typings.octokitTypes.endpointsMod.AppsListAccountsForPlanStubbedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersAppsListAccountsForPlanStubbedEndpoint extends StObject {
  
  var parameters: AppsListAccountsForPlanStubbedEndpoint
  
  var request: AppsListAccountsForPlanStubbedRequestOptions
  
  var response: OctokitResponse[AppsListAccountsForPlanStubbedResponseData]
}
object ParametersAppsListAccountsForPlanStubbedEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsListAccountsForPlanStubbedEndpoint,
    request: AppsListAccountsForPlanStubbedRequestOptions,
    response: OctokitResponse[AppsListAccountsForPlanStubbedResponseData]
  ): ParametersAppsListAccountsForPlanStubbedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListAccountsForPlanStubbedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsListAccountsForPlanStubbedEndpointMutableBuilder[Self <: ParametersAppsListAccountsForPlanStubbedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsListAccountsForPlanStubbedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsListAccountsForPlanStubbedRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsListAccountsForPlanStubbedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
