package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.AppsListReposAccessibleToInstallationEndpoint
import typings.octokitTypes.endpointsMod.AppsListReposAccessibleToInstallationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersAppsListReposAccessibleToInstallationEndpoint extends StObject {
  
  var parameters: AppsListReposAccessibleToInstallationEndpoint
  
  var response: OctokitResponse[AppsListReposAccessibleToInstallationResponseData] & `1`
}
object ParametersAppsListReposAccessibleToInstallationEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsListReposAccessibleToInstallationEndpoint,
    response: OctokitResponse[AppsListReposAccessibleToInstallationResponseData] & `1`
  ): ParametersAppsListReposAccessibleToInstallationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListReposAccessibleToInstallationEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsListReposAccessibleToInstallationEndpointMutableBuilder[Self <: ParametersAppsListReposAccessibleToInstallationEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsListReposAccessibleToInstallationEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsListReposAccessibleToInstallationResponseData] & `1`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
