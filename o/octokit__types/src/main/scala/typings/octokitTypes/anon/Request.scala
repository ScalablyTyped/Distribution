package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsUnsuspendInstallationEndpoint
import typings.octokitTypes.endpointsMod.AppsUnsuspendInstallationRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Request extends StObject {
  
  var parameters: AppsUnsuspendInstallationEndpoint
  
  var request: AppsUnsuspendInstallationRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object Request {
  
  inline def apply(
    parameters: AppsUnsuspendInstallationEndpoint,
    request: AppsUnsuspendInstallationRequestOptions,
    response: OctokitResponse[js.Any]
  ): Request = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  
  extension [Self <: Request](x: Self) {
    
    inline def setParameters(value: AppsUnsuspendInstallationEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: AppsUnsuspendInstallationRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
