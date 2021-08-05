package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.CodesOfConductGetForRepoEndpoint
import typings.octokitTypes.endpointsMod.CodesOfConductGetForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `675` extends StObject {
  
  var parameters: RequestParameters & (Omit[CodesOfConductGetForRepoEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[CodesOfConductGetForRepoResponseData]
}
object `675` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[CodesOfConductGetForRepoEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[CodesOfConductGetForRepoResponseData]
  ): `675` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`675`]
  }
  
  extension [Self <: `675`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[CodesOfConductGetForRepoEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[CodesOfConductGetForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
