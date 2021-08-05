package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.PullsCreateEndpoint
import typings.octokitTypes.endpointsMod.PullsCreateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `846` extends StObject {
  
  var parameters: RequestParameters & (Omit[PullsCreateEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[PullsCreateResponseData]
}
object `846` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[PullsCreateEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsCreateResponseData]
  ): `846` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`846`]
  }
  
  extension [Self <: `846`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[PullsCreateEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[PullsCreateResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
