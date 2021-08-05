package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetAllTopicsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetAllTopicsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `941` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposGetAllTopicsEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposGetAllTopicsResponseData]
}
object `941` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ReposGetAllTopicsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetAllTopicsResponseData]
  ): `941` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`941`]
  }
  
  extension [Self <: `941`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[ReposGetAllTopicsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposGetAllTopicsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
