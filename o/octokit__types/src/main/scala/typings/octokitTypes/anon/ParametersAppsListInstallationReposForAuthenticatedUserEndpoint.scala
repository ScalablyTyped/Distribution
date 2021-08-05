package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsListInstallationReposForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.AppsListInstallationReposForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.AppsListInstallationReposForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersAppsListInstallationReposForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: AppsListInstallationReposForAuthenticatedUserEndpoint
  
  var request: AppsListInstallationReposForAuthenticatedUserRequestOptions
  
  var response: OctokitResponse[AppsListInstallationReposForAuthenticatedUserResponseData]
}
object ParametersAppsListInstallationReposForAuthenticatedUserEndpoint {
  
  inline def apply(
    parameters: AppsListInstallationReposForAuthenticatedUserEndpoint,
    request: AppsListInstallationReposForAuthenticatedUserRequestOptions,
    response: OctokitResponse[AppsListInstallationReposForAuthenticatedUserResponseData]
  ): ParametersAppsListInstallationReposForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListInstallationReposForAuthenticatedUserEndpoint]
  }
  
  extension [Self <: ParametersAppsListInstallationReposForAuthenticatedUserEndpoint](x: Self) {
    
    inline def setParameters(value: AppsListInstallationReposForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: AppsListInstallationReposForAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[AppsListInstallationReposForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
