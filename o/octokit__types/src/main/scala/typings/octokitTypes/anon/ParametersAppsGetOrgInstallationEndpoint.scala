package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsGetOrgInstallationEndpoint
import typings.octokitTypes.endpointsMod.AppsGetOrgInstallationRequestOptions
import typings.octokitTypes.endpointsMod.AppsGetOrgInstallationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersAppsGetOrgInstallationEndpoint extends StObject {
  
  var parameters: AppsGetOrgInstallationEndpoint
  
  var request: AppsGetOrgInstallationRequestOptions
  
  var response: OctokitResponse[AppsGetOrgInstallationResponseData]
}
object ParametersAppsGetOrgInstallationEndpoint {
  
  inline def apply(
    parameters: AppsGetOrgInstallationEndpoint,
    request: AppsGetOrgInstallationRequestOptions,
    response: OctokitResponse[AppsGetOrgInstallationResponseData]
  ): ParametersAppsGetOrgInstallationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsGetOrgInstallationEndpoint]
  }
  
  extension [Self <: ParametersAppsGetOrgInstallationEndpoint](x: Self) {
    
    inline def setParameters(value: AppsGetOrgInstallationEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: AppsGetOrgInstallationRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[AppsGetOrgInstallationResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
