package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsListInstallationsEndpoint
import typings.octokitTypes.endpointsMod.AppsListInstallationsRequestOptions
import typings.octokitTypes.endpointsMod.AppsListInstallationsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersAppsListInstallationsEndpoint extends StObject {
  
  var parameters: AppsListInstallationsEndpoint
  
  var request: AppsListInstallationsRequestOptions
  
  var response: OctokitResponse[AppsListInstallationsResponseData]
}
object ParametersAppsListInstallationsEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsListInstallationsEndpoint,
    request: AppsListInstallationsRequestOptions,
    response: OctokitResponse[AppsListInstallationsResponseData]
  ): ParametersAppsListInstallationsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListInstallationsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsListInstallationsEndpointMutableBuilder[Self <: ParametersAppsListInstallationsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsListInstallationsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsListInstallationsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsListInstallationsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
