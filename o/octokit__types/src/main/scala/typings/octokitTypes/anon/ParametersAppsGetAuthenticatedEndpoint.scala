package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsGetAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.AppsGetAuthenticatedRequestOptions
import typings.octokitTypes.endpointsMod.AppsGetAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsGetAuthenticatedEndpoint extends StObject {
  
  var parameters: AppsGetAuthenticatedEndpoint = js.native
  
  var request: AppsGetAuthenticatedRequestOptions = js.native
  
  var response: OctokitResponse[AppsGetAuthenticatedResponseData] = js.native
}
object ParametersAppsGetAuthenticatedEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsGetAuthenticatedEndpoint,
    request: AppsGetAuthenticatedRequestOptions,
    response: OctokitResponse[AppsGetAuthenticatedResponseData]
  ): ParametersAppsGetAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsGetAuthenticatedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsGetAuthenticatedEndpointMutableBuilder[Self <: ParametersAppsGetAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsGetAuthenticatedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsGetAuthenticatedRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsGetAuthenticatedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
