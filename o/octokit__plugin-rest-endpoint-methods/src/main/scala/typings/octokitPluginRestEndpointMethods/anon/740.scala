package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesListForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.IssuesListForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `740` extends StObject {
  
  var parameters: RequestParameters & (Omit[IssuesListForAuthenticatedUserEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[IssuesListForAuthenticatedUserResponseData]
}
object `740` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[IssuesListForAuthenticatedUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesListForAuthenticatedUserResponseData]
  ): `740` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`740`]
  }
  
  extension [Self <: `740`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[IssuesListForAuthenticatedUserEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[IssuesListForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
