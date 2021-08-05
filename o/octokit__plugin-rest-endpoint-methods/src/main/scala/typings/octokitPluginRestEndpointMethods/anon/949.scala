package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetCommitEndpoint
import typings.octokitTypes.endpointsMod.ReposGetCommitResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `949` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposGetCommitEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposGetCommitResponseData]
}
object `949` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ReposGetCommitEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetCommitResponseData]
  ): `949` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`949`]
  }
  
  extension [Self <: `949`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[ReposGetCommitEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposGetCommitResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
