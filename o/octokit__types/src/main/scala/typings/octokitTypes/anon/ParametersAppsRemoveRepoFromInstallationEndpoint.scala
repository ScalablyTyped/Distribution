package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsRemoveRepoFromInstallationEndpoint
import typings.octokitTypes.endpointsMod.AppsRemoveRepoFromInstallationRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersAppsRemoveRepoFromInstallationEndpoint extends StObject {
  
  var parameters: AppsRemoveRepoFromInstallationEndpoint
  
  var request: AppsRemoveRepoFromInstallationRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersAppsRemoveRepoFromInstallationEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsRemoveRepoFromInstallationEndpoint,
    request: AppsRemoveRepoFromInstallationRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersAppsRemoveRepoFromInstallationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsRemoveRepoFromInstallationEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsRemoveRepoFromInstallationEndpointMutableBuilder[Self <: ParametersAppsRemoveRepoFromInstallationEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsRemoveRepoFromInstallationEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsRemoveRepoFromInstallationRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
