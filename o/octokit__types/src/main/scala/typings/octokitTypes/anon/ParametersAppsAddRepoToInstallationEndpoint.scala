package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsAddRepoToInstallationEndpoint
import typings.octokitTypes.endpointsMod.AppsAddRepoToInstallationRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersAppsAddRepoToInstallationEndpoint extends StObject {
  
  var parameters: AppsAddRepoToInstallationEndpoint
  
  var request: AppsAddRepoToInstallationRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersAppsAddRepoToInstallationEndpoint {
  
  inline def apply(
    parameters: AppsAddRepoToInstallationEndpoint,
    request: AppsAddRepoToInstallationRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersAppsAddRepoToInstallationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsAddRepoToInstallationEndpoint]
  }
  
  extension [Self <: ParametersAppsAddRepoToInstallationEndpoint](x: Self) {
    
    inline def setParameters(value: AppsAddRepoToInstallationEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: AppsAddRepoToInstallationRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
