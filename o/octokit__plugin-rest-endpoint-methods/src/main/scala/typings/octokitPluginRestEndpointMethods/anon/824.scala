package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ProjectsCreateForOrgEndpoint
import typings.octokitTypes.endpointsMod.ProjectsCreateForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `824` extends StObject {
  
  var parameters: RequestParameters & (Omit[ProjectsCreateForOrgEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ProjectsCreateForOrgResponseData]
}
object `824` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ProjectsCreateForOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ProjectsCreateForOrgResponseData]
  ): `824` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`824`]
  }
  
  extension [Self <: `824`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[ProjectsCreateForOrgEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ProjectsCreateForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
