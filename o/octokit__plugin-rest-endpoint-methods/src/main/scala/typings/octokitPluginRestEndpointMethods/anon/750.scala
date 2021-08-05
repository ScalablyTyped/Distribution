package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesRemoveLabelEndpoint
import typings.octokitTypes.endpointsMod.IssuesRemoveLabelResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `750` extends StObject {
  
  var parameters: RequestParameters & (Omit[IssuesRemoveLabelEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[IssuesRemoveLabelResponseData]
}
object `750` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[IssuesRemoveLabelEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesRemoveLabelResponseData]
  ): `750` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`750`]
  }
  
  extension [Self <: `750`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[IssuesRemoveLabelEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[IssuesRemoveLabelResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
