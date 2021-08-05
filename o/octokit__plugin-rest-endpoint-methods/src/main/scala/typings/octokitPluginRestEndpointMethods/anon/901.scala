package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposCreateCommitCommentEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateCommitCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `901` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposCreateCommitCommentEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposCreateCommitCommentResponseData]
}
object `901` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ReposCreateCommitCommentEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposCreateCommitCommentResponseData]
  ): `901` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`901`]
  }
  
  extension [Self <: `901`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[ReposCreateCommitCommentEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposCreateCommitCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
