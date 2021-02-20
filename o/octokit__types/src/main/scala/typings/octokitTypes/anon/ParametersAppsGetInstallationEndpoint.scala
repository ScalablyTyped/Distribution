package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsGetInstallationEndpoint
import typings.octokitTypes.endpointsMod.AppsGetInstallationRequestOptions
import typings.octokitTypes.endpointsMod.AppsGetInstallationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsGetInstallationEndpoint extends StObject {
  
  var parameters: AppsGetInstallationEndpoint = js.native
  
  var request: AppsGetInstallationRequestOptions = js.native
  
  var response: OctokitResponse[AppsGetInstallationResponseData] = js.native
}
object ParametersAppsGetInstallationEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsGetInstallationEndpoint,
    request: AppsGetInstallationRequestOptions,
    response: OctokitResponse[AppsGetInstallationResponseData]
  ): ParametersAppsGetInstallationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsGetInstallationEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsGetInstallationEndpointMutableBuilder[Self <: ParametersAppsGetInstallationEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsGetInstallationEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsGetInstallationRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsGetInstallationResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
