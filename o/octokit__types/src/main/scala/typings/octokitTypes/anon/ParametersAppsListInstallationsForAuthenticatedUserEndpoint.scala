package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsListInstallationsForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.AppsListInstallationsForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.AppsListInstallationsForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersAppsListInstallationsForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: AppsListInstallationsForAuthenticatedUserEndpoint
  
  var request: AppsListInstallationsForAuthenticatedUserRequestOptions
  
  var response: OctokitResponse[AppsListInstallationsForAuthenticatedUserResponseData]
}
object ParametersAppsListInstallationsForAuthenticatedUserEndpoint {
  
  inline def apply(
    parameters: AppsListInstallationsForAuthenticatedUserEndpoint,
    request: AppsListInstallationsForAuthenticatedUserRequestOptions,
    response: OctokitResponse[AppsListInstallationsForAuthenticatedUserResponseData]
  ): ParametersAppsListInstallationsForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListInstallationsForAuthenticatedUserEndpoint]
  }
  
  extension [Self <: ParametersAppsListInstallationsForAuthenticatedUserEndpoint](x: Self) {
    
    inline def setParameters(value: AppsListInstallationsForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: AppsListInstallationsForAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[AppsListInstallationsForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
