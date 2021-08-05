package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.AppsListInstallationsForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.AppsListInstallationsForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersAppsListInstallationsForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: AppsListInstallationsForAuthenticatedUserEndpoint
  
  var response: OctokitResponse[AppsListInstallationsForAuthenticatedUserResponseData] & `24`
}
object ParametersAppsListInstallationsForAuthenticatedUserEndpoint {
  
  inline def apply(
    parameters: AppsListInstallationsForAuthenticatedUserEndpoint,
    response: OctokitResponse[AppsListInstallationsForAuthenticatedUserResponseData] & `24`
  ): ParametersAppsListInstallationsForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListInstallationsForAuthenticatedUserEndpoint]
  }
  
  extension [Self <: ParametersAppsListInstallationsForAuthenticatedUserEndpoint](x: Self) {
    
    inline def setParameters(value: AppsListInstallationsForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[AppsListInstallationsForAuthenticatedUserResponseData] & `24`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
