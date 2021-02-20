package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsCreateInstallationAccessTokenEndpoint
import typings.octokitTypes.endpointsMod.AppsCreateInstallationAccessTokenRequestOptions
import typings.octokitTypes.endpointsMod.AppsCreateInstallationAccessTokenResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsCreateInstallationAccessTokenEndpoint extends StObject {
  
  var parameters: AppsCreateInstallationAccessTokenEndpoint = js.native
  
  var request: AppsCreateInstallationAccessTokenRequestOptions = js.native
  
  var response: OctokitResponse[AppsCreateInstallationAccessTokenResponseData] = js.native
}
object ParametersAppsCreateInstallationAccessTokenEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsCreateInstallationAccessTokenEndpoint,
    request: AppsCreateInstallationAccessTokenRequestOptions,
    response: OctokitResponse[AppsCreateInstallationAccessTokenResponseData]
  ): ParametersAppsCreateInstallationAccessTokenEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsCreateInstallationAccessTokenEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsCreateInstallationAccessTokenEndpointMutableBuilder[Self <: ParametersAppsCreateInstallationAccessTokenEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsCreateInstallationAccessTokenEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsCreateInstallationAccessTokenRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsCreateInstallationAccessTokenResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
