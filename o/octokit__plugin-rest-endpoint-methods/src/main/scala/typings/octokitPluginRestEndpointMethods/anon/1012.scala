package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposRequestPagesBuildEndpoint
import typings.octokitTypes.endpointsMod.ReposRequestPagesBuildResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1012` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposRequestPagesBuildEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposRequestPagesBuildResponseData]
}
object `1012` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ReposRequestPagesBuildEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposRequestPagesBuildResponseData]
  ): `1012` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1012`]
  }
  
  extension [Self <: `1012`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[ReposRequestPagesBuildEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposRequestPagesBuildResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
