package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ChecksListSuitesForRefEndpoint
import typings.octokitTypes.endpointsMod.ChecksListSuitesForRefResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `664` extends StObject {
  
  var parameters: RequestParameters & (Omit[ChecksListSuitesForRefEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ChecksListSuitesForRefResponseData]
}
object `664` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ChecksListSuitesForRefEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ChecksListSuitesForRefResponseData]
  ): `664` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`664`]
  }
  
  extension [Self <: `664`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[ChecksListSuitesForRefEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ChecksListSuitesForRefResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
