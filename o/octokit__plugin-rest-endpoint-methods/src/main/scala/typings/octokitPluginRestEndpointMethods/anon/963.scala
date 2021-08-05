package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetParticipationStatsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetParticipationStatsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `963` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposGetParticipationStatsEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposGetParticipationStatsResponseData]
}
object `963` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ReposGetParticipationStatsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetParticipationStatsResponseData]
  ): `963` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`963`]
  }
  
  extension [Self <: `963`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[ReposGetParticipationStatsEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposGetParticipationStatsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
