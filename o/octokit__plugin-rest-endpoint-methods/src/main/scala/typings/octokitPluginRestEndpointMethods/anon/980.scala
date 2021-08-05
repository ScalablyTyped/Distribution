package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposListCommentsForCommitEndpoint
import typings.octokitTypes.endpointsMod.ReposListCommentsForCommitResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `980` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposListCommentsForCommitEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposListCommentsForCommitResponseData]
}
object `980` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ReposListCommentsForCommitEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListCommentsForCommitResponseData]
  ): `980` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`980`]
  }
  
  extension [Self <: `980`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[ReposListCommentsForCommitEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposListCommentsForCommitResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
