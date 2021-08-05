package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsGetUserInstallationEndpoint
import typings.octokitTypes.endpointsMod.AppsGetUserInstallationRequestOptions
import typings.octokitTypes.endpointsMod.AppsGetUserInstallationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersAppsGetUserInstallationEndpoint extends StObject {
  
  var parameters: AppsGetUserInstallationEndpoint
  
  var request: AppsGetUserInstallationRequestOptions
  
  var response: OctokitResponse[AppsGetUserInstallationResponseData]
}
object ParametersAppsGetUserInstallationEndpoint {
  
  inline def apply(
    parameters: AppsGetUserInstallationEndpoint,
    request: AppsGetUserInstallationRequestOptions,
    response: OctokitResponse[AppsGetUserInstallationResponseData]
  ): ParametersAppsGetUserInstallationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsGetUserInstallationEndpoint]
  }
  
  extension [Self <: ParametersAppsGetUserInstallationEndpoint](x: Self) {
    
    inline def setParameters(value: AppsGetUserInstallationEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: AppsGetUserInstallationRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[AppsGetUserInstallationResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
