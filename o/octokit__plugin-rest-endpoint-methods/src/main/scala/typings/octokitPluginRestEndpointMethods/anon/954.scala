package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetContentEndpoint
import typings.octokitTypes.endpointsMod.ReposGetContentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `954` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposGetContentEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposGetContentResponseData]
}
object `954` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ReposGetContentEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetContentResponseData]
  ): `954` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`954`]
  }
  
  extension [Self <: `954`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[ReposGetContentEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposGetContentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
