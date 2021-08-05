package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetPunchCardStatsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetPunchCardStatsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `965` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposGetPunchCardStatsEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposGetPunchCardStatsResponseData]
}
object `965` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ReposGetPunchCardStatsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetPunchCardStatsResponseData]
  ): `965` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`965`]
  }
  
  extension [Self <: `965`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[ReposGetPunchCardStatsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposGetPunchCardStatsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
