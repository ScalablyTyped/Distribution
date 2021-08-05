package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsDeleteInstallationEndpoint
import typings.octokitTypes.endpointsMod.AppsDeleteInstallationRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters extends StObject {
  
  var parameters: AppsDeleteInstallationEndpoint
  
  var request: AppsDeleteInstallationRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object Parameters {
  
  inline def apply(
    parameters: AppsDeleteInstallationEndpoint,
    request: AppsDeleteInstallationRequestOptions,
    response: OctokitResponse[js.Any]
  ): Parameters = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters]
  }
  
  extension [Self <: Parameters](x: Self) {
    
    inline def setParameters(value: AppsDeleteInstallationEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: AppsDeleteInstallationRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
