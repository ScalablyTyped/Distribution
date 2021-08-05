package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsListPlansEndpoint
import typings.octokitTypes.endpointsMod.AppsListPlansRequestOptions
import typings.octokitTypes.endpointsMod.AppsListPlansResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersAppsListPlansEndpoint extends StObject {
  
  var parameters: AppsListPlansEndpoint
  
  var request: AppsListPlansRequestOptions
  
  var response: OctokitResponse[AppsListPlansResponseData]
}
object ParametersAppsListPlansEndpoint {
  
  inline def apply(
    parameters: AppsListPlansEndpoint,
    request: AppsListPlansRequestOptions,
    response: OctokitResponse[AppsListPlansResponseData]
  ): ParametersAppsListPlansEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListPlansEndpoint]
  }
  
  extension [Self <: ParametersAppsListPlansEndpoint](x: Self) {
    
    inline def setParameters(value: AppsListPlansEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: AppsListPlansRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[AppsListPlansResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
