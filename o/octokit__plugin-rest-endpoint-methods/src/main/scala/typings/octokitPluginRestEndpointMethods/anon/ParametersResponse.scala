package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActionsCreateOrUpdateOrgSecretEndpoint
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersResponse extends StObject {
  
  var parameters: RequestParameters & (Omit[ActionsCreateOrUpdateOrgSecretEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[js.Any]
}
object ParametersResponse {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ActionsCreateOrUpdateOrgSecretEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[js.Any]
  ): ParametersResponse = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersResponse]
  }
  
  extension [Self <: ParametersResponse](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[ActionsCreateOrUpdateOrgSecretEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
