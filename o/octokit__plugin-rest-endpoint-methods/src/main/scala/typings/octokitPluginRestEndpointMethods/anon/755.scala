package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesUpdateLabelEndpoint
import typings.octokitTypes.endpointsMod.IssuesUpdateLabelResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `755` extends StObject {
  
  var parameters: RequestParameters & (Omit[IssuesUpdateLabelEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[IssuesUpdateLabelResponseData]
}
object `755` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[IssuesUpdateLabelEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesUpdateLabelResponseData]
  ): `755` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`755`]
  }
  
  extension [Self <: `755`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[IssuesUpdateLabelEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[IssuesUpdateLabelResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
