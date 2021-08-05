package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ChecksSetSuitesPreferencesEndpoint
import typings.octokitTypes.endpointsMod.ChecksSetSuitesPreferencesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `666` extends StObject {
  
  var parameters: RequestParameters & (Omit[ChecksSetSuitesPreferencesEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ChecksSetSuitesPreferencesResponseData]
}
object `666` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ChecksSetSuitesPreferencesEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ChecksSetSuitesPreferencesResponseData]
  ): `666` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`666`]
  }
  
  extension [Self <: `666`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[ChecksSetSuitesPreferencesEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ChecksSetSuitesPreferencesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
