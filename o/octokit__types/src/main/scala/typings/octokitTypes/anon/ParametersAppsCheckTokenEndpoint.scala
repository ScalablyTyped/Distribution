package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsCheckTokenEndpoint
import typings.octokitTypes.endpointsMod.AppsCheckTokenRequestOptions
import typings.octokitTypes.endpointsMod.AppsCheckTokenResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersAppsCheckTokenEndpoint extends StObject {
  
  var parameters: AppsCheckTokenEndpoint
  
  var request: AppsCheckTokenRequestOptions
  
  var response: OctokitResponse[AppsCheckTokenResponseData]
}
object ParametersAppsCheckTokenEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsCheckTokenEndpoint,
    request: AppsCheckTokenRequestOptions,
    response: OctokitResponse[AppsCheckTokenResponseData]
  ): ParametersAppsCheckTokenEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsCheckTokenEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsCheckTokenEndpointMutableBuilder[Self <: ParametersAppsCheckTokenEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsCheckTokenEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsCheckTokenRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsCheckTokenResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
