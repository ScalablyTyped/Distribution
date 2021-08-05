package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetContributorsStatsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetContributorsStatsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `955` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposGetContributorsStatsEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposGetContributorsStatsResponseData]
}
object `955` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ReposGetContributorsStatsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetContributorsStatsResponseData]
  ): `955` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`955`]
  }
  
  extension [Self <: `955`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[ReposGetContributorsStatsEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposGetContributorsStatsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
