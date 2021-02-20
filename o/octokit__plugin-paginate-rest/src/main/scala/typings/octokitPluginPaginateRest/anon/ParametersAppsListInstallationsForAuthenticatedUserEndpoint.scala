package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.AppsListInstallationsForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.AppsListInstallationsForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsListInstallationsForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: AppsListInstallationsForAuthenticatedUserEndpoint = js.native
  
  var response: OctokitResponse[AppsListInstallationsForAuthenticatedUserResponseData] with `24` = js.native
}
object ParametersAppsListInstallationsForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsListInstallationsForAuthenticatedUserEndpoint,
    response: OctokitResponse[AppsListInstallationsForAuthenticatedUserResponseData] with `24`
  ): ParametersAppsListInstallationsForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListInstallationsForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsListInstallationsForAuthenticatedUserEndpointMutableBuilder[Self <: ParametersAppsListInstallationsForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsListInstallationsForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsListInstallationsForAuthenticatedUserResponseData] with `24`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
