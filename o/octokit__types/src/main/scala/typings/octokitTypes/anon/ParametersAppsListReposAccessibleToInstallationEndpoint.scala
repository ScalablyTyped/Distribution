package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsListReposAccessibleToInstallationEndpoint
import typings.octokitTypes.endpointsMod.AppsListReposAccessibleToInstallationRequestOptions
import typings.octokitTypes.endpointsMod.AppsListReposAccessibleToInstallationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsListReposAccessibleToInstallationEndpoint extends StObject {
  
  var parameters: AppsListReposAccessibleToInstallationEndpoint = js.native
  
  var request: AppsListReposAccessibleToInstallationRequestOptions = js.native
  
  var response: OctokitResponse[AppsListReposAccessibleToInstallationResponseData] = js.native
}
object ParametersAppsListReposAccessibleToInstallationEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsListReposAccessibleToInstallationEndpoint,
    request: AppsListReposAccessibleToInstallationRequestOptions,
    response: OctokitResponse[AppsListReposAccessibleToInstallationResponseData]
  ): ParametersAppsListReposAccessibleToInstallationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListReposAccessibleToInstallationEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsListReposAccessibleToInstallationEndpointMutableBuilder[Self <: ParametersAppsListReposAccessibleToInstallationEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsListReposAccessibleToInstallationEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsListReposAccessibleToInstallationRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsListReposAccessibleToInstallationResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
