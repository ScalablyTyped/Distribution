package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.GitCreateCommitEndpoint
import typings.octokitTypes.endpointsMod.GitCreateCommitResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `698` extends StObject {
  
  var parameters: RequestParameters & (Omit[GitCreateCommitEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[GitCreateCommitResponseData]
}
object `698` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[GitCreateCommitEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GitCreateCommitResponseData]
  ): `698` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`698`]
  }
  
  extension [Self <: `698`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[GitCreateCommitEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[GitCreateCommitResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
