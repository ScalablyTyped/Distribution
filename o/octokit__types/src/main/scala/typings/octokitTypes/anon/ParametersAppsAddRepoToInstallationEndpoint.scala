package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsAddRepoToInstallationEndpoint
import typings.octokitTypes.endpointsMod.AppsAddRepoToInstallationRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsAddRepoToInstallationEndpoint extends StObject {
  
  var parameters: AppsAddRepoToInstallationEndpoint = js.native
  
  var request: AppsAddRepoToInstallationRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersAppsAddRepoToInstallationEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsAddRepoToInstallationEndpoint,
    request: AppsAddRepoToInstallationRequestOptions,
    response: OctokitResponse[_]
  ): ParametersAppsAddRepoToInstallationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsAddRepoToInstallationEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsAddRepoToInstallationEndpointMutableBuilder[Self <: ParametersAppsAddRepoToInstallationEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsAddRepoToInstallationEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsAddRepoToInstallationRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
