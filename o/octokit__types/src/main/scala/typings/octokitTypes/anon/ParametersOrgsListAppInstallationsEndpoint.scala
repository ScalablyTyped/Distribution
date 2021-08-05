package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsListAppInstallationsEndpoint
import typings.octokitTypes.endpointsMod.OrgsListAppInstallationsRequestOptions
import typings.octokitTypes.endpointsMod.OrgsListAppInstallationsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOrgsListAppInstallationsEndpoint extends StObject {
  
  var parameters: OrgsListAppInstallationsEndpoint
  
  var request: OrgsListAppInstallationsRequestOptions
  
  var response: OctokitResponse[OrgsListAppInstallationsResponseData]
}
object ParametersOrgsListAppInstallationsEndpoint {
  
  inline def apply(
    parameters: OrgsListAppInstallationsEndpoint,
    request: OrgsListAppInstallationsRequestOptions,
    response: OctokitResponse[OrgsListAppInstallationsResponseData]
  ): ParametersOrgsListAppInstallationsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListAppInstallationsEndpoint]
  }
  
  extension [Self <: ParametersOrgsListAppInstallationsEndpoint](x: Self) {
    
    inline def setParameters(value: OrgsListAppInstallationsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: OrgsListAppInstallationsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[OrgsListAppInstallationsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
