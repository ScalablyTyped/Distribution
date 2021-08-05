package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsCreateFromManifestEndpoint
import typings.octokitTypes.endpointsMod.AppsCreateFromManifestRequestOptions
import typings.octokitTypes.endpointsMod.AppsCreateFromManifestResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersAppsCreateFromManifestEndpoint extends StObject {
  
  var parameters: AppsCreateFromManifestEndpoint
  
  var request: AppsCreateFromManifestRequestOptions
  
  var response: OctokitResponse[AppsCreateFromManifestResponseData]
}
object ParametersAppsCreateFromManifestEndpoint {
  
  inline def apply(
    parameters: AppsCreateFromManifestEndpoint,
    request: AppsCreateFromManifestRequestOptions,
    response: OctokitResponse[AppsCreateFromManifestResponseData]
  ): ParametersAppsCreateFromManifestEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsCreateFromManifestEndpoint]
  }
  
  extension [Self <: ParametersAppsCreateFromManifestEndpoint](x: Self) {
    
    inline def setParameters(value: AppsCreateFromManifestEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: AppsCreateFromManifestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[AppsCreateFromManifestResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
