package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ProjectsCreateColumnEndpoint
import typings.octokitTypes.endpointsMod.ProjectsCreateColumnResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `822` extends StObject {
  
  var parameters: RequestParameters & (Omit[ProjectsCreateColumnEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ProjectsCreateColumnResponseData]
}
object `822` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ProjectsCreateColumnEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ProjectsCreateColumnResponseData]
  ): `822` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`822`]
  }
  
  extension [Self <: `822`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[ProjectsCreateColumnEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ProjectsCreateColumnResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
