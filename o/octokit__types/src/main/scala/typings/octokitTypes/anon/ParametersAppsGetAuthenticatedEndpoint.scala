package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsGetAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.AppsGetAuthenticatedRequestOptions
import typings.octokitTypes.endpointsMod.AppsGetAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersAppsGetAuthenticatedEndpoint extends StObject {
  
  var parameters: AppsGetAuthenticatedEndpoint
  
  var request: AppsGetAuthenticatedRequestOptions
  
  var response: OctokitResponse[AppsGetAuthenticatedResponseData]
}
object ParametersAppsGetAuthenticatedEndpoint {
  
  inline def apply(
    parameters: AppsGetAuthenticatedEndpoint,
    request: AppsGetAuthenticatedRequestOptions,
    response: OctokitResponse[AppsGetAuthenticatedResponseData]
  ): ParametersAppsGetAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsGetAuthenticatedEndpoint]
  }
  
  extension [Self <: ParametersAppsGetAuthenticatedEndpoint](x: Self) {
    
    inline def setParameters(value: AppsGetAuthenticatedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: AppsGetAuthenticatedRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[AppsGetAuthenticatedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
