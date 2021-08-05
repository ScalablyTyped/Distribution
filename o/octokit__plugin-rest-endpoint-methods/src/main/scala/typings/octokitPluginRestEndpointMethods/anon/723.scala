package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesCreateLabelEndpoint
import typings.octokitTypes.endpointsMod.IssuesCreateLabelResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `723` extends StObject {
  
  var parameters: RequestParameters & (Omit[IssuesCreateLabelEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[IssuesCreateLabelResponseData]
}
object `723` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[IssuesCreateLabelEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesCreateLabelResponseData]
  ): `723` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`723`]
  }
  
  extension [Self <: `723`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[IssuesCreateLabelEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[IssuesCreateLabelResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
