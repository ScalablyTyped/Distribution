package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetLatestPagesBuildEndpoint
import typings.octokitTypes.endpointsMod.ReposGetLatestPagesBuildResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `959` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposGetLatestPagesBuildEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposGetLatestPagesBuildResponseData]
}
object `959` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ReposGetLatestPagesBuildEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetLatestPagesBuildResponseData]
  ): `959` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`959`]
  }
  
  extension [Self <: `959`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[ReposGetLatestPagesBuildEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposGetLatestPagesBuildResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
