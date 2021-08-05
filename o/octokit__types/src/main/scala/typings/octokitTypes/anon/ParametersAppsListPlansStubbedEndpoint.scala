package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsListPlansStubbedEndpoint
import typings.octokitTypes.endpointsMod.AppsListPlansStubbedRequestOptions
import typings.octokitTypes.endpointsMod.AppsListPlansStubbedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersAppsListPlansStubbedEndpoint extends StObject {
  
  var parameters: AppsListPlansStubbedEndpoint
  
  var request: AppsListPlansStubbedRequestOptions
  
  var response: OctokitResponse[AppsListPlansStubbedResponseData]
}
object ParametersAppsListPlansStubbedEndpoint {
  
  inline def apply(
    parameters: AppsListPlansStubbedEndpoint,
    request: AppsListPlansStubbedRequestOptions,
    response: OctokitResponse[AppsListPlansStubbedResponseData]
  ): ParametersAppsListPlansStubbedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListPlansStubbedEndpoint]
  }
  
  extension [Self <: ParametersAppsListPlansStubbedEndpoint](x: Self) {
    
    inline def setParameters(value: AppsListPlansStubbedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: AppsListPlansStubbedRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[AppsListPlansStubbedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
