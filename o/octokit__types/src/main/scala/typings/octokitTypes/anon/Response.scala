package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsDeleteAuthorizationEndpoint
import typings.octokitTypes.endpointsMod.AppsDeleteAuthorizationRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Response extends StObject {
  
  var parameters: AppsDeleteAuthorizationEndpoint
  
  var request: AppsDeleteAuthorizationRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object Response {
  
  @scala.inline
  def apply(
    parameters: AppsDeleteAuthorizationEndpoint,
    request: AppsDeleteAuthorizationRequestOptions,
    response: OctokitResponse[js.Any]
  ): Response = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  
  @scala.inline
  implicit class ResponseMutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsDeleteAuthorizationEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsDeleteAuthorizationRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
