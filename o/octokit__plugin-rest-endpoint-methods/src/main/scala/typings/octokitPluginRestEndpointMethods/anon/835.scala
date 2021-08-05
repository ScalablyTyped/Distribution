package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ProjectsListColumnsEndpoint
import typings.octokitTypes.endpointsMod.ProjectsListColumnsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `835` extends StObject {
  
  var parameters: RequestParameters & (Omit[ProjectsListColumnsEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ProjectsListColumnsResponseData]
}
object `835` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ProjectsListColumnsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ProjectsListColumnsResponseData]
  ): `835` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`835`]
  }
  
  extension [Self <: `835`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[ProjectsListColumnsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ProjectsListColumnsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
