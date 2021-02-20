package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.AppsListReposAccessibleToInstallationEndpoint
import typings.octokitTypes.endpointsMod.AppsListReposAccessibleToInstallationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsListReposAccessibleToInstallationEndpoint extends StObject {
  
  var parameters: AppsListReposAccessibleToInstallationEndpoint = js.native
  
  var response: OctokitResponse[AppsListReposAccessibleToInstallationResponseData] with `1` = js.native
}
object ParametersAppsListReposAccessibleToInstallationEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsListReposAccessibleToInstallationEndpoint,
    response: OctokitResponse[AppsListReposAccessibleToInstallationResponseData] with `1`
  ): ParametersAppsListReposAccessibleToInstallationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListReposAccessibleToInstallationEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsListReposAccessibleToInstallationEndpointMutableBuilder[Self <: ParametersAppsListReposAccessibleToInstallationEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsListReposAccessibleToInstallationEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsListReposAccessibleToInstallationResponseData] with `1`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
