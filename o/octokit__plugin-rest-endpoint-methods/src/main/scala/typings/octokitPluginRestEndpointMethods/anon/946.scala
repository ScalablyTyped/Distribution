package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetCodeFrequencyStatsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetCodeFrequencyStatsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `946` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposGetCodeFrequencyStatsEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposGetCodeFrequencyStatsResponseData]
}
object `946` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ReposGetCodeFrequencyStatsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetCodeFrequencyStatsResponseData]
  ): `946` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`946`]
  }
  
  extension [Self <: `946`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[ReposGetCodeFrequencyStatsEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposGetCodeFrequencyStatsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
