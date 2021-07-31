package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsDeleteTokenEndpoint
import typings.octokitTypes.endpointsMod.AppsDeleteTokenRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestResponse extends StObject {
  
  var parameters: AppsDeleteTokenEndpoint
  
  var request: AppsDeleteTokenRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object RequestResponse {
  
  @scala.inline
  def apply(
    parameters: AppsDeleteTokenEndpoint,
    request: AppsDeleteTokenRequestOptions,
    response: OctokitResponse[js.Any]
  ): RequestResponse = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestResponse]
  }
  
  @scala.inline
  implicit class RequestResponseMutableBuilder[Self <: RequestResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsDeleteTokenEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsDeleteTokenRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
