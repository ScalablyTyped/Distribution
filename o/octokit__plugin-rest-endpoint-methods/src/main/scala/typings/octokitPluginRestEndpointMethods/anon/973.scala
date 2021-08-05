package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetTopReferrersEndpoint
import typings.octokitTypes.endpointsMod.ReposGetTopReferrersResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `973` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposGetTopReferrersEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposGetTopReferrersResponseData]
}
object `973` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ReposGetTopReferrersEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetTopReferrersResponseData]
  ): `973` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`973`]
  }
  
  extension [Self <: `973`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[ReposGetTopReferrersEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposGetTopReferrersResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
