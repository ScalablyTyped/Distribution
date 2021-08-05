package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesGetEventEndpoint
import typings.octokitTypes.endpointsMod.IssuesGetEventResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `730` extends StObject {
  
  var parameters: RequestParameters & (Omit[IssuesGetEventEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[IssuesGetEventResponseData]
}
object `730` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[IssuesGetEventEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesGetEventResponseData]
  ): `730` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`730`]
  }
  
  extension [Self <: `730`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[IssuesGetEventEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[IssuesGetEventResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
